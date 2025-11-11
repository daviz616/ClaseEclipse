package Clases;

import java.util.Scanner;

public class Probar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Profesor profesor = null;
		Administracion admin = null;
		Directivos directivo = null;
		Modulo modulo = null;
		Alumno alumno = null;

		int opcion;

		do {
			System.out.println("\n Menú ");
			System.out.println("1. Añadir Profesor");
			System.out.println("2. Añadir Administrativo");
			System.out.println("3. Añadir Directivo");
			System.out.println("4. Añadir Módulo");
			System.out.println("5. Añadir Alumno");
			System.out.println("6. Mostrar Datos");
			System.out.println("7. Salir");
			System.out.print("Elige opción: ");
			opcion = sc.nextInt();
			sc.nextLine(); 

			switch (opcion) {
				case 1:
					profesor = añadirProfesor(sc);
					break;
				case 2:
					admin = añadirAdmin(sc);
					break;
				case 3:
					directivo = añadirDirectivo(sc);
					break;
				case 4:
					modulo = añadirModulo(sc, profesor); 
					break;
				case 5:
					alumno = añadirAlumno(sc, modulo); 
					break;
				case 6:
					System.out.println("\n DATOS DEL SISTEMA ");
					if (profesor != null) {
						System.out.println("Profesor: " + profesor);
						}
					if (admin != null) { 
						System.out.println("Administrativo: " + admin);
					}
					if (directivo != null) {
						System.out.println("Directivo: " + directivo);
					}
					if (modulo != null) {
						System.out.println("Módulo: " + modulo);
					}
					if (alumno != null) {
						System.out.println("Alumno: " + alumno);
					}
					if (profesor == null && admin == null && directivo == null && modulo == null && alumno == null)
						System.out.println("No hay datos aún.");
					break;
				case 7:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Opción inválida.");
			}
		} while (opcion != 7);

		sc.close();
	}

	private static Persona leerDatosPersona(Scanner sc) {
		System.out.print("DNI: ");
		String dni = sc.nextLine();
		System.out.print("Nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Apellido: ");
		String apellido = sc.nextLine();
		System.out.print("Salario: ");
		double salario = sc.nextDouble();
		sc.nextLine(); 
		return new Persona(dni, nombre, apellido, salario);
	}

	private static Profesor añadirProfesor(Scanner sc) {
		System.out.println("\n Añadir Profesor");
		Persona persona = leerDatosPersona(sc);
		
		System.out.print("Nº de asignaturas: ");
		int numAsig = sc.nextInt();
		System.out.print("¿Es tutor? (true/false): ");
		boolean tutor = sc.nextBoolean();
		sc.nextLine(); 

		Profesor profe = new Profesor(
			persona.getDni(),
			persona.getNombre(),
			persona.getApellidos(),
			persona.getSalario(),
			numAsig,
			tutor
		);
		System.out.println("Profesor creado.");
		return profe;
	}

	private static Administracion añadirAdmin(Scanner sc) {
		System.out.println("\n Añadir Administrativo ");
		Persona persona = leerDatosPersona(sc);

		System.out.print("Estudios: ");
		String est = sc.nextLine();
		System.out.print("Antigüedad: ");
		String ant = sc.nextLine();

		Administracion admin = new Administracion(
				persona.getDni(),
				persona.getNombre(),
				persona.getApellidos(),
				persona.getSalario(),
				est,
				ant
			);
		return admin;
	}

	private static Directivos añadirDirectivo(Scanner sc) {
		System.out.println("\n Añadir Directivo");
		Persona persona = leerDatosPersona(sc);

		System.out.print("¿Es salesiano? (true/false): ");
		boolean salesiano = sc.nextBoolean();
		sc.nextLine();
		System.out.print("Turno (MAÑANA/TARDE): ");
		String turno = sc.nextLine();

		Directivos directivo = new Directivos(
				persona.getDni(),
				persona.getNombre(),
				persona.getApellidos(),
				persona.getSalario(),
				salesiano,
				Turnos.valueOf(turno.toUpperCase())
				);
		System.out.println("Directivo creado.");
		return directivo;
	}

	private static Modulo añadirModulo(Scanner sc, Profesor profesorAsig) {
		System.out.println("\nAñadir Módulo");
		System.out.print("Nombre del módulo: ");
		String nombre = sc.nextLine();
		System.out.print("Horas del módulo: ");
		int horas = sc.nextInt();
		System.out.print("¿Es convalidable? (true/false): ");
		boolean convalidable= sc.nextBoolean();
		sc.nextLine();

		if (profesorAsig == null) {
			System.out.println("Crea un profesor primero.");
			return null;
		}

		Modulo modular = new Modulo(nombre, horas, profesorAsig, convalidable);
		System.out.println("Módulo creado.");
		return modular;
	}

	private static Alumno añadirAlumno(Scanner sc, Modulo modular) {
		System.out.println("\nAñadir Alumno ");
		System.out.print("DNI: ");
		String dni = sc.nextLine();
		System.out.print("Nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Apellido: ");
		String apellido = sc.nextLine();
		System.out.print("Fecha Nacimiento: ");
		String fecha = sc.nextLine();
		System.out.print("Sexo: ");
		int sexo = sc.nextInt();
		System.out.print("¿Es repetidor? (true/false): ");
		boolean repite = sc.nextBoolean();
		sc.nextLine();

		if (modular == null) {
			System.out.println("Crea un módulo primero.");
			return null;
		}

		Modulo[] modulosAlumno = {modular}; 
		Alumno alumno = new Alumno(dni, nombre, apellido, fecha, sexo, repite, modulosAlumno);
		System.out.println("Alumno creado.");
		return alumno;
	}
}
