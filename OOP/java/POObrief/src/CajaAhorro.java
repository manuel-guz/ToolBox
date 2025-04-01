public class CajaAhorro extends Cuenta{
    public static final double INTERES_CAJA_AHORRO = 1.2;/*forma de escribir constante en java, va en mayuscula y cursiva
                                                         //  espaciada con _
                                                         //fiinal se usa para definir una constante y static paradefinir que es un atributo propio de la clase,
    por lo que todos los objetos instanciados van a tener este valor por defecto, asi es que esta propiedad no va a estar en el constructor. y puede ser usado en cualquier momento sin instanciar ya sea una peopiedad o un metodo.
                                                            */
    public static final double MAX_DEP_CAJA=500000.0;
    @Override
    public void extraer (double monto){
        if(informarSaldo()>=monto)
            setSaldo(informarSaldo() - monto);
    }

    public void cobrarIntereses()  {
        setSaldo(informarSaldo()* CajaAhorro.INTERES_CAJA_AHORRO);
    }

    @Override
    public void depositar(double monto) {
        if (monto<MAX_DEP_CAJA){
            setSaldo(informarSaldo()+monto);
        }
    }
}
