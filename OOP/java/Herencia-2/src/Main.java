public class Main {
    public static void main(String[] args) {
        Socio s1= new Socio("A001","Rodolfo","Pesas",3500.0);
        SocioHabilitado s2 =  new SocioHabilitado("A002","Ezequiel","zumba",4000.0,1500.0);
        System.out.println("cuota de Rodolfo "+ s1.costoMensual() );
        System.out.println("cuota de Ezequiel"+ s2.costoMensual());
        s2.setHabilitado(true);
        System.out.println("cuota de Ezequiel como habilitdo "+ s2.costoMensual());
        System.out.println(s1.toString());




    }
}