public class PrincipalMain {
    public static void main(String[] args) {
        /*CajaAhorro ca = new CajaAhorro();
        ca.setSaldo(100);
        ca.cobrarIntereses();

        System.out.println(ca.informarSaldo());
        */

        //POLIMORFISMO

        Cuenta ca =new CajaAhorro(); ///creo ca

        Cuenta auxca = ca;// guardo referencia de ca

        ca.depositar(100.0);// deposito 100 en ca
        ca.extraer(10.0);//extraigo 10
        System.out.println("saldo CA: "+ca.informarSaldo());

        ca=new CuentaCorriente();// reasigno  ca a un nuevo objeto de tipo Cuenta corriente
        System.out.println("saldo CA: "+ca.informarSaldo());

        Cuenta ca2=new CuentaCorriente();// creo una nueva variable de CA
        System.out.println("saldo CA2: "+ca2.informarSaldo());


        System.out.println("saldo Auxca: "+auxca.informarSaldo());// vuelvo a mostrar lo que tenia el objeto que guardo CA
         ca = auxca;
        System.out.println("monto original de ca: " + ca.informarSaldo());


        auxca.extraer(50.0);

        System.out.println(" monto de ca luego de restaer 50 a auxca :"+ ca.informarSaldo() + "   saldo auxca: "+ auxca.informarSaldo());



        ((CajaAhorro)ca).cobrarIntereses();// casteo para acceder a caja de ahorro porque esta declarado como objeto de tipoi cuenta y fue apuntado a un objeto de tipo caja ahorro en la primera linea.
        System.out.println("nuevo valor de ca luego de castear para cobrar el interes: " + ca.informarSaldo());

        if (ca instanceof CajaAhorro){
            ((CajaAhorro)ca).cobrarIntereses();
        }

        Cuenta cuentaComitente1 = new CuentaComitente();
        System.out.println("Saldo CComitente recien creada: "+ cuentaComitente1.informarSaldo());
        ((CuentaComitente)cuentaComitente1).setClave("BGF");
        cuentaComitente1.depositar(1000);
        System.out.println("Saldo CComitente + 1k: "+ cuentaComitente1.informarSaldo());
        ((CuentaComitente)cuentaComitente1).extraer(800, "BGF");

        System.out.println("Saldo CComitente - 800: "+ cuentaComitente1.informarSaldo());
        System.out.println("la clave es:" + ((CuentaComitente) cuentaComitente1).getClave());





    }
}