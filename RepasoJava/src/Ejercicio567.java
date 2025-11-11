 
import java.util.ArrayList;

public class Ejercicio567 {
    public static void main(String[] args) {
        // Crear 2 profesores
        Profesor prof1 = new Profesor("11111111A", "Laura", "Gómez", 2100.0, 5, true);
        Profesor prof2 = new Profesor("22222222B", "Manuel", "Pérez", 1950.0, 3, false);

        // Crear 2 administrativos
        Administracion admin1 = new Administracion("33333333C", "Sara", "Muñoz", 1600.0, "Grado Medio", 4);
        Administracion admin2 = new Administracion("44444444D", "Iván", "Díaz", 1750.0, "Grado Superior", 6);

        // Crear 2 directivos
        Directivo dir1 = new Directivo("55555555E", "Lucía", "Ramírez", 2600.0, true, "Mañana");
        Directivo dir2 = new Directivo("66666666F", "Carlos", "Santos", 2450.0, false, "Tarde");
        
        //Crear 3 modulos
        Modulo[] arrayMod = new Modulo[2];
        
        arrayMod[0] = new Modulo("Mates",300, prof1, false);
        arrayMod[1] = new Modulo("Ingles", 300, prof2, true);
        
        ArrayList<Trabajador>  trabajadores = new ArrayList<>();
        
        trabajadores.add(prof1);
        trabajadores.add(prof2);
        trabajadores.add(admin1);
        trabajadores.add(admin2);
        trabajadores.add(dir1);
        trabajadores.add(dir2);
        
        trabajadores.sort(null);
        System.out.println(trabajadores.get(trabajadores.size()-1));
        
        //Crear alumnos
        Alumno al1 = new Alumno("11111111A","Marcos", "Escamilla","2 Noviembre 2006", "Masculino",false,arrayMod);
        Alumno al2 = new Alumno("22222222B","Lucas", "Mediavilla","3 Octubre 2006", "Masculino",true,arrayMod);
        
        // Mostrar información
       /* System.out.println(prof1);
        System.out.println(prof2);
        System.out.println(admin1);
        System.out.println(admin2);
        System.out.println(dir1);
        System.out.println(dir2);*/
        System.out.println(al1);
        System.out.println(al2);
    }
}

