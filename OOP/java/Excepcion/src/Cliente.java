public class Cliente {
    private String nombre;
    private String apellido;
    private String DNI;
    private double saldoEnCuenta;
    private double limite;


    public Cliente(String nombre, String apellido, String DNI, double limite) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.limite = limite;
        saldoEnCuenta=0;
    }


    //comprar
    public void comprar(double importe) throws ClienteExcepcion {

        if ((limite-saldoEnCuenta)>=importe){
            saldoEnCuenta+=importe ;
        }else{

            //Esto dispara la eexcepcion instanciando la clase que extiende heredado la clase exception
            // los throws en la funcion y en el codigo hacen funcionar la excepcion
            throw new ClienteExcepcion("Error: No puede conprar por exceso del limite del comercio");

        }



    }

    //saldarCuenta

    public void setSaldoEnCuenta(double importe) throws ClienteExcepcion{
        if (importe<= saldoEnCuenta) {
            saldoEnCuenta -= importe;
        }else{
            throw new ClienteExcepcion("El monto es mayor a la deuda");
        }
    }

}
