package Generics;

public class Balde <T> {
    private T contenido;

    public Balde (){

    };

    public void llenar (T contenido){
        this.contenido = contenido;
    }

    public T obtenerContenido(){
        return this.contenido;
    }
};
