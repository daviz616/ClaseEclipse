package Tema3;

import java.sql.*;
import java.util.Scanner;

public class Practica1 {

    // Datos de conexión
    static String url = "jdbc:mysql://localhost:3306/nba";
    static String usuario = "root";
    static String password = "cfgs";

    public static void main(String[] args) {

        Practica1 app = new Practica1();

        // Llamadas directas, puedes comentar/descomentar según quieras probar
        app.ejercicio1();          // Buscar jugadores por letra
        // app.borrarJugador();     // Borrar un jugador
        // app.ficharJugador();     // Fichar jugador en un equipo
        // app.insertarPartido();   // Insertar partido
        // app.estadisticasEquipo(); // Ver estadísticas de un equipo
    }

    // ========================
    // 1. Buscar jugadores
    // ========================
    public void ejercicio1() {
        Scanner sc = new Scanner(System.in);

        try (Connection conexion = DriverManager.getConnection(url, usuario, password)) {

            System.out.print("Introduce la letra: ");
            String letra = sc.nextLine() + "%";

            String sql = "SELECT * FROM jugadores WHERE nombre LIKE ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, letra);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(
                        "Código: " + rs.getInt("codigo") +
                        ", Nombre: " + rs.getString("nombre") +
                        ", Altura: " + rs.getString("altura") +
                        ", Peso: " + rs.getInt("peso") +
                        ", Posición: " + rs.getString("posicion") +
                        ", Equipo: " + rs.getString("Nombre_equipo")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ========================
    // 2. Borrar jugador
    // ========================
    public void borrarJugador() {
        Scanner sc = new Scanner(System.in);

        try (Connection conexion = DriverManager.getConnection(url, usuario, password)) {

            System.out.print("Código del jugador a borrar: ");
            int codigo = sc.nextInt();

            String sql = "DELETE FROM jugadores WHERE codigo = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, codigo);

            int filas = ps.executeUpdate();
            System.out.println(filas > 0 ? "Jugador borrado." : "No existe.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ========================
    // 3. Fichar jugador
    // ========================
    public void ficharJugador() {
        Scanner sc = new Scanner(System.in);

        try (Connection conexion = DriverManager.getConnection(url, usuario, password)) {

            // Mostrar equipos
            ResultSet eq = conexion.prepareStatement("SELECT codigo, nombre FROM equipos").executeQuery();
            System.out.println("Equipos disponibles:");
            while (eq.next()) {
                System.out.println(eq.getInt("codigo") + " - " + eq.getString("nombre"));
            }

            System.out.print("Elige equipo: ");
            int codEquipo = sc.nextInt();

            System.out.print("Código del jugador a fichar: ");
            int codJugador = sc.nextInt();

            String sql = "UPDATE jugadores SET Nombre_equipo = ? WHERE codigo = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, codEquipo);
            ps.setInt(2, codJugador);

            ps.executeUpdate();
            System.out.println("Jugador fichado.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ========================
    // 4. Insertar partido
    // ========================
    public void insertarPartido() {
        Scanner sc = new Scanner(System.in);

        try (Connection conexion = DriverManager.getConnection(url, usuario, password)) {

            // Mostrar equipos
            ResultSet eq = conexion.prepareStatement("SELECT codigo, nombre FROM equipos").executeQuery();
            System.out.println("Equipos disponibles:");
            while (eq.next()) {
                System.out.println(eq.getInt("codigo") + " - " + eq.getString("nombre"));
            }

            System.out.print("Equipo local: ");
            int local = sc.nextInt();

            System.out.print("Equipo visitante: ");
            int visitante = sc.nextInt();

            System.out.print("Puntos local: ");
            int pl = sc.nextInt();

            System.out.print("Puntos visitante: ");
            int pv = sc.nextInt();

            System.out.print("Fecha (AAAA-MM-DD): ");
            String fecha = sc.next();

            String sql = "INSERT INTO partidos (equipo_local, equipo_visitante, puntos_local, puntos_visitante, fecha) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, local);
            ps.setInt(2, visitante);
            ps.setInt(3, pl);
            ps.setInt(4, pv);
            ps.setDate(5, Date.valueOf(fecha));

            ps.executeUpdate();
            System.out.println("Partido insertado.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ========================
    // 5. Estadísticas equipo
    // ========================
    public void estadisticasEquipo() {
        Scanner sc = new Scanner(System.in);

        try (Connection conexion = DriverManager.getConnection(url, usuario, password)) {

            System.out.print("Código del equipo: ");
            int codigo = sc.nextInt();

            String sql = "SELECT nombre, altura, peso, posicion FROM jugadores WHERE Nombre_equipo = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, codigo);

            ResultSet rs = ps.executeQuery();
            System.out.println("Estadísticas del equipo:");
            while (rs.next()) {
                System.out.println(
                        rs.getString("nombre") + " - " +
                        rs.getString("posicion") + " - " +
                        rs.getString("altura") + " - " +
                        rs.getInt("peso") + " kg"
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

