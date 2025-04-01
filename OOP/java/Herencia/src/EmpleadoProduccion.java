public class EmpleadoProduccion extends Empleado{
    private int tiempExperiencia;

    @Override
    public void trabajar() {
        System.out.println("Empleado de produccion"+getNombre()+"trabajando");

    }

    public EmpleadoProduccion(String nombre, String apellido, String dni, int tiempExperiencia) {
        super(nombre, apellido, dni);
        this.tiempExperiencia = tiempExperiencia;
    }
}
