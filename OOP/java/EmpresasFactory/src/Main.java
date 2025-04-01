public class Main {
    public static void main(String[] args) {

            Empresa empresa = new Empresa("Mascotas");

        System.out.println(" total de sueldos a pagar: " + empresa.calcularSueldoTotal(20));

        EmpleadoContratado emp3 = (EmpleadoContratado) EmpleadoFactory.getInstance().crearEmpleado("EMP-EXT");
        emp3.setNombre("Pablo");
        emp3.setApellido("Rodrigo");
        emp3.setImportePorHora(600);
        emp3.setRetencionImpuesto(0.2);


        empresa.getEmpleados().add(emp3);



    }
}


/*
                    EmpleadoFactory      (Usa patron singleton para generar solo una sola fabrica)
                    -instance:EmpleadoFactory
            ----->  -EmpleadoFactory()
            |       +<<Static>>getInstance():EmpleadoFactory          ------------------------->
            |       +crearEmpleado(eipo String): Empleado                           |
          use                                                                       |
            |                                                                       use
            |                                                                        |
        Empresa                                                                      |
        -razonSocial:String
        +calcularSueldosTotal(dias:int): double  -1------------------------N--> <<abstrac1t>>
                                                                                Empleado
                                                                                -nombre: String
                                                                                -apellido: String
                                                                         |-->   -legajo: int
                                                                         |      +abstract calcularSueldo(dias: int): double
                                                                         |                   |
                                                                         |                   |
                                                                         |               extends
                                                                     extends                 |
                                                                         |                   |
                                                                         |       EmpleadoContratado
                                                                         |       -importePorHora:double
                                                                         |       -retencionImpuesto:double
                                                                         |       +calcularSueldo(dias:int):double

                                                            EmpleadoRelacionDependencia
                                                            -sueldosMensuales:double
                                                            +calcularSueldo(dias:int):double


 */