public class Main {
    public static void main(String[] args) {

        ImpresoraEpson i1 = new ImpresoraEpson();
        System.out.println(i1.imprimir());

        ImpresoraCannon i2 = new ImpresoraCannon();
        System.out.println(i2.imprimir());



        Impresora i3 = new ImpresoraEpson();
        System.out.println(i3.imprimir());

        ((ImpresoraEpson)i3).soloEpson();//Asignacion dinamica y polimorfismo. casting .
    }
}