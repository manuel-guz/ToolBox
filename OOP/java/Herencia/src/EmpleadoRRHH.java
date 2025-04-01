public class EmpleadoRRHH extends Empleado{
    private  int altasLogradas;

    @Override
    public void trabajar() {
        System.out.println("Empleado de recurso Humanos"+getNombre()+"trabajando");
    }

    public EmpleadoRRHH(String nombre, String apellido, String dni, int altasLogradas) {
        super(nombre, apellido, dni);
        this.altasLogradas = altasLogradas;
    }
}
