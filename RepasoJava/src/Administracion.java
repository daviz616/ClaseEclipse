
public class Administracion extends Trabajador {
    private String estudios;
    private int antiguedad;

    public Administracion(String dni, String nombre, String apellidos, double salario, String estudios, int antiguedad) {
        super(dni, nombre, apellidos, salario);
        this.estudios = estudios;
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Administración:\n" + super.toString() + "\n" +
               "Estudios: " + estudios + "\n" +
               "Antigüedad: " + antiguedad;
    }
}

