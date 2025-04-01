package Class5;

public class Programa {
    public static void main(String[] args) {

        Cliente rodolfo = new Cliente(1548,"rodolfo");
        Cliente ezequiel = new Cliente(54852,"ezequiel");
        rodolfo.incrementarDeuda(550.80);
        System.out.println("Deuda de " + rodolfo.getNombre() + "es: " + rodolfo.getDeuda());


    }
}
