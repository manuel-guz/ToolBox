
public class Main {
    public static void main(String[] args) {

        Chofer chofer;
        chofer= new Chofer("Huan","Perez", new Auto("abc123", "Ford", "Mondeo"));
        System.out.println("Patente auto asignado:" + chofer.verPatente());
    }
}