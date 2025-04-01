public class Feliz implements Estado{

    private Tamagochi t;

    public Feliz (Tamagochi t){
        this.t = t;
        System.out.println("Feliz");
    }
    @Override
    public void beber() {
        System.out.println(" bip bip bip bip bip");
    }

    @Override
    public void comer() {

    }

    @Override
    public void recibirMimos() {

    }

}
