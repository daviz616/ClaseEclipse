
public class Profesor extends Trabajador {
    private int numAsignaturas;
    private boolean esTutor;

    public Profesor(String dni, String nombre, String apellidos, double salario, int numAsignaturas, boolean esTutor) {
        super(dni, nombre, apellidos, salario);
        this.numAsignaturas = numAsignaturas;
        this.esTutor = esTutor;
    }

    @Override
    public String toString() {
        return "Profesor:\n" + super.toString() + "\n" +
               "Nº Asignaturas: " + numAsignaturas + "\n" +
               "Es Tutor: " + (esTutor ? "Sí" : "No");
    }
}

