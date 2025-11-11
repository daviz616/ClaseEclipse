package Conexion;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;




public class Main {
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mydb";
		String usuario = "root";
		String password = "cfgs";
		try {
			//1.Cargar drive de la BD
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.Crear conexión
			Connection conexion = DriverManager.getConnection(url,usuario,password);
			System.out.println("Se ha conectado a la base de datos");
			
			//3.1Crear statement
			//Statement sentencia = conexion.createStatement();
			//String consulta = "select*from usuario";
			//ResultSet resultado = sentencia.executeQuery(consulta);
			
			//3.2 Crear un Preparared Statement
			String consulta = "Select * from usuario where idUSUARIO=?";
			PreparedStatement sentencia = conexion.prepareStatement(consulta);
			sentencia.setInt(1, 1);
			sentencia.setString(2, "Leo");
			
		
			ResultSet resultado = sentencia.executeQuery();
			
			/*// Si es la opcion del uptate
			 * int  resultado = sentencia.executeUpdate();
			 * System.out.println("Numero de lineas afectadas: "+resultado);
			 */
			
			
			while(resultado.next()) {
				int idUSUARIO = resultado.getInt("idUSUARIO");
				String nombre = resultado.getString("USUARIOcol");
				Date FechaNacimiento =resultado.getDate("FechaNacimiento");
				String genero = resultado.getString("genero");
				System.out.println("idUSUARIO : "+idUSUARIO+" Nombre: "+ nombre +" Fecha Nacimiento: "+FechaNacimiento+" genero: "+genero);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
