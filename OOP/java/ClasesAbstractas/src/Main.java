public class Main {
    public static void main(String[] args) {

            Animal animal = new Perro("coco", 5);

            animal = new Gato("budin",6);// Por polimorfismo le reasigno a animal gato y ahora responde como gato


            animal.hacerRuido();

    }
}