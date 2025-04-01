public class Nave extends Objeto {
    private double velocidad;
    private int vida;

    public Nave(int posx, int posy, char direccion, double velocidad){

      super(posx,posy,direccion);
      this.velocidad=velocidad;

    };

    public void girar(char direccion){
        setDireccion(direccion);
    };

    public void restarVida(int valor){
        if(vida-valor<0){
            vida=0;
        }else{
            vida=vida-valor;
        }
    };

    @Override
    public void irA(int x, int y, char direccion){
        if (this.getDireccion()!=direccion){
            girar(direccion);
        }
        setPosx(x);
        setPosy(y);
    }

    @Override
    public String toString(){
        return ("posx= "+ getPosx()+ "\n" + "posy= " + getPosy());
    }


}
