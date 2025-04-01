public class ImpresoraCannon extends Impresora{


    @Override
    public String imprimir() {
        return "imprimiendo en canon";
    }

    @Override
    public boolean necesitaTinta(){
        return getPorcentajeTinta()<15;

    }
}
