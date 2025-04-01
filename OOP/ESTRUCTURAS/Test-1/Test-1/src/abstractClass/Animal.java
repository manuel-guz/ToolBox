package abstractClass;

public abstract class Animal {
    private String nombre;
    private Integer edad;

    public Animal(String nombre, Integer edad){
        this.edad=edad;
        this.nombre=nombre;
    };

    public abstract void hacerRuido();


}