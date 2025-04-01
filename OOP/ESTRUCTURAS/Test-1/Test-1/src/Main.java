
import javax.swing.plaf.basic.BasicBorders;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner lector;
        lector = new Scanner(System.in);
        String[] casa = new String[5];


       Chofer chofer;
       chofer = new Chofer("Juan", "Perez", new Auto("126abc", "Ford","Mondeo"));

       Auto auto;
       auto=new Auto("abc126", "ford", "mondeo");
        System.out.println(chofer.verPatente());
    }
}