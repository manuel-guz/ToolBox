public class EmpleadoFactory {
    private static EmpleadoFactory instance;

    private EmpleadoFactory() {

    }

    public static EmpleadoFactory getInstance() {   //singleton
        if (instance == null) {
            instance = new EmpleadoFactory();
        }
        return instance;
    }

// EN LA FABRICA SE AGREGAN LOS DIFERENTES EMPLEADOS O PUESTOS
    public Empleado crearEmpleado(String tipo){     // polimorfism
         Empleado resultado =null;
        switch (tipo) {
            case "EMP-INT":
                resultado = new EmpleadoRelacionDependencia();
                break;
            case "EMP-EXT":
                resultado = new EmpleadoContratado();
                break;
        }
        return resultado;
    }
}
