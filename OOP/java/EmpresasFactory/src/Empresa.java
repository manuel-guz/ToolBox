import java.util.ArrayList ;
import java.util.List;

public class Empresa {
    private String razonSocial;
    private List<Empleado> empleados;

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Empresa(String razonSocial){
        this.razonSocial=razonSocial;
        empleados= new ArrayList<>();


        //se castea porque EmpleadoFactory.getInstance().crearEmpleado("EMP-INT") devuelve un objeto empleado pero por polimorfismo sabemos que es un EmpleadoRelacionDependencia (resultado = new EmpleadoRelacionDependencia();)  como emopleado es el padre no puede ser igualado a EmpleadoRelacionDependencia por lo que se castea para que lo tome, Emp1 esta esperando un EmpleadoRelacionDependencia como resultado y esta recibiendo un empleado que contiene un EmpleadoRelacionDependencia.
        EmpleadoRelacionDependencia emp1 = (EmpleadoRelacionDependencia)  EmpleadoFactory.getInstance().crearEmpleado("EMP-INT");
        emp1.setNombre("Juan");
        emp1.setApellido("Gonzales");
        emp1.setSueldoMensual(10000);

        EmpleadoContratado emp2 = (EmpleadoContratado) EmpleadoFactory.getInstance().crearEmpleado("EMP-EXT");
        emp2.setNombre("Pedro");
        emp2.setApellido("Rodriguez");
        emp2.setImportePorHora(500);
        emp2.setRetencionImpuesto(0.1);

        empleados.add(emp1);
        empleados.add(emp2);


    }


        public double calcularSueldoTotal(int dias){
        double total=0;

            for (Empleado emp:empleados) {
                total+= emp.calcularSueldo(dias);
            }
        return total;
        }




}
