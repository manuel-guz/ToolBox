public class Asteroide extends Objeto {
    private int lesion;

    public int getLesion(){
        return lesion;
    }
    public void setLesion(int lesion){
        this.lesion=lesion;
    }
    public Asteroide(int posx, int posy, char direccion, int lesion){
        super(posx,posy,direccion);
        this.lesion=lesion;
    }

    @Override
    public void irA(int posx, int posy, char direccion){// el asteroide viaja sin direccion, por eso no se usa
        setPosx(posx);
        setPosy(posy);
    }

    @Override
    public int hashCode(){
        int hash=31;
        hash=hash*Integer.hashCode(getPosx())*Integer.hashCode(getPosy())*Integer.hashCode(lesion);
        return hash;
    }

    @Override
    public boolean equals(Object obj){
        if (obj==null)
            return false;
        if(!(obj instanceof Asteroide))
            return false;
        else
            return getPosx()==((Asteroide)obj).getPosx()&&(getPosy()==((Asteroide)obj).getPosy());// En el casteo toma a al objeto obj del parametro que no se sabe que es, y fuerza a comportarse como un objeto asteroide en este caso para poder comparar la propiedad x e y. comoactua como un opbjeto asteroide se le puede pedir los geters de x e y. esto es posible porque previamente nos aseguramos de que no es null y que es una instancia de asteroide
    }

    @Override
    public String toString(){
        return "Soy un asteroide en x: " + getPosx() + ", y= " + getPosy() + " con lesion igual a " + lesion;
    }

}
