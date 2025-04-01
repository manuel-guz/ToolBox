import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws ClienteExcepcion {


        Cliente rodolfo = new Cliente ("Rodolfo", "Baspibneiro", "37140434", 5000);



        try{
            rodolfo.comprar(4000.0);

        }

        catch (ClienteExcepcion e){
            System.out.println(e.getMessage());
        }try{
            rodolfo.comprar(4000.0);

        }

        catch (ClienteExcepcion e){
            System.out.println(e.getMessage());
        }





    }
}