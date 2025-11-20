package Tema3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Practica2 {

    public static Scanner entrada = new Scanner(System.in);

   
    public static Connection ConexionBD(String url, String usuario, String password)
            throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, usuario, password);
    }
    
    
    
    private static void eliminarJugador(Connection conexion) {

        try {
            System.out.println("Se ha conectado correctamente a la base de datos");

            String consulta = "SELECT * FROM jugadores";
            PreparedStatement sentencia = conexion.prepareStatement(consulta);
            ResultSet resultado = sentencia.executeQuery();

            System.out.printf("%-15s %-20s %-20s %-10s %-10s %-10s %-20s%n",
                    "Codigo", "Nombre", "Procedencia", "Altura", "Peso", "Posicion", "Nombre equipo");

            System.out.println(
                    "------------------------------------------------------------------------------------------------------------------------------");

            while (resultado.next()) {

                int codigo = resultado.getInt("codigo");
                String nombre = resultado.getString("Nombre");
                String procedencia = resultado.getString("Procedencia");
                String altura = resultado.getString("Altura");
                int peso = resultado.getInt("Peso");
                String posicion = resultado.getString("Posicion");
                String nombreEquipo = resultado.getString("Nombre_equipo");

                System.out.printf("%-15d %-20s %-20s %-10s %-10d %-10s %-20s%n",
                        codigo, nombre, procedencia, altura, peso, posicion, nombreEquipo);
            }

            System.out.println("\nIngrese el código del jugador a eliminar:");
            int codigoAEliminar = entrada.nextInt();
            entrada.nextLine();

            String consulta2 = "DELETE FROM jugadores WHERE codigo = ?";
            PreparedStatement sentencia2 = conexion.prepareStatement(consulta2);
            sentencia2.setInt(1, codigoAEliminar);

            int resultado2 = sentencia2.executeUpdate();

            if (resultado2 > 0) {
                System.out.println("Jugador eliminado correctamente.");
            } else {
                System.out.println("No se encontró un jugador con ese código.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/nba";
        String usuario = "root";
        String password = "cfgs";

        int opcion;

        do {
            System.out.println("------------------------------------MENU------------------------------------");
            System.out.println("1. Borrar jugadores.");
            System.out.println("2. Fichar jugador.");
            System.out.println("3. Insertar partido.");
            System.out.println("4. Mostrar estadísticas jugadores de un equipo");
            System.out.println("5. Salir");

            opcion = entrada.nextInt();
            entrada.nextLine();

        } while (opcion < 1 || opcion > 5);

        switch (opcion) {

        case 1:
            try (Connection conexion = ConexionBD(url, usuario, password)) {
                eliminarJugador(conexion);
            } catch (Exception e) {
                e.printStackTrace();
            }
            break;

        case 2:
            System.out.println("Función no implementada.");
            break;

        case 3:
            System.out.println("Función no implementada.");
            break;

        case 4:
            System.out.println("Función no implementada.");
            break;

        case 5:
            System.out.println("Saliendo del programa...");
            break;
        }
    }
}
