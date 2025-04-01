import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Articulo articulo = new Articulo("Articulo 1", 100, 11000.00);
        Camion miCamion = new Camion("FORD", "AB XXX CD");

        if (articulo.hayStock()){
            System.out.println("Hay stock disponible");
        }
        System.out.println("el precio de venta es: " + articulo.consultarPrecio());

        Camion.cambiarPrecioCombustible(98.50);
        System.out.println("gasto "  + miCamion.gastoCombustible(40));

    }
}


// System.out.println("Hello world!");
//        Scanner scanner;
//        scanner=new Scanner(System.in);
//        int edad;
//        String nombre;
//
//        String[] nombres= new String[5];
//
//
//        for (String name :   // for each structure
//                nombres) {
//            System.out.println(name);
//        }
//
//        System.out.println("ingrese su nombre");
//        nombre = scanner.nextLine();
//        System.out.println("ingrese su edad");
//        edad= scanner.nextInt();