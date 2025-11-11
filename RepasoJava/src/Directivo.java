
public class Directivo extends Trabajador {
    private boolean esSalesiano;
    private String turno;

    public Directivo(String dni, String nombre, String apellidos, double salario, boolean esSalesiano, String turno) {
        super(dni, nombre, apellidos, salario);
        this.esSalesiano = esSalesiano;
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Directivo:\n" + super.toString() + "\n" +
               "Es Salesiano: " + (esSalesiano ? "Sí" : "No") + "\n" +
               "Turno: " + turno;
    }
}

