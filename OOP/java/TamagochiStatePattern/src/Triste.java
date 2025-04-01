public class Triste implements Estado{
    private Tamagochi t;

    public Triste (Tamagochi t){
        this.t = t;
        System.out.println("Triste");
    }
    @Override
    public void beber() {
        System.out.println("bip bipp titilar");
    }

    @Override
    public void comer() {
        System.out.println("bip bip vomitar");
    }

    @Override
    public void recibirMimos() {
     t.setEstado(new Feliz(t));
    }
}
