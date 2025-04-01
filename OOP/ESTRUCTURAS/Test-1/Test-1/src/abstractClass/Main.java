package abstractClass;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Perro("firulais", 5); // Polimorfismo 1

         animal = new Gato("Garfield", 6); //Polimorfismo 2



        animal.hacerRuido();

    }
}
