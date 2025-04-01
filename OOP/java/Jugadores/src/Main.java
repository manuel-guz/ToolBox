import java.util.ArrayList;

public class Main {
    public static void main(String[] args)  {

            Seleccion seleccion = new Seleccion("Argentina");
            seleccion.addJugador(new Jugador("pumpito",1, "ARQUERO"));
        seleccion.addJugador(new Jugador("pumpito1",2, "MEDIOCAMPISTA"));
        seleccion.addJugador(new Jugador("pumpito2",3, "DELANTERO"));
        seleccion.addJugador(new Jugador("pumpito3",4, "MEDIOCAMPISTA"));
        seleccion.addJugador(new Jugador("pumpito4",5, "DEFENSOR"));
        seleccion.addJugador(new Jugador("pumpito5",6, "DELANTERO"));
        seleccion.addJugador(new Jugador("pumpito6",7, "MEDIOCAMPISTA"));
        seleccion.addJugador(new Jugador("pumpito7",8, "DELANTERO"));
        seleccion.addJugador(new Jugador("pumpito8",9, "DELANTERO"));
        seleccion.addJugador(new Jugador("pumpito9",10, "MEDIOCAMPISTA"));
        seleccion.addJugador(new Jugador("pumpito10",11, "DEFENSOR"));
        seleccion.addJugador(new Jugador("pumpito11",12, "ARQUERO"));
        seleccion.addJugador(new Jugador("pumpito12",13, "DEFENSOR"));
        seleccion.addJugador(new Jugador("pumpito13",14, "MEDIOCAMPISTA"));
        seleccion.addJugador(new Jugador("pumpito14",15, "DEFENSOR"));
        seleccion.addJugador(new Jugador("pumpito15",16, "MEDIOCAMPISTA"));
        seleccion.addJugador(new Jugador("pumpito16",17, "DEFENSOR"));
        seleccion.addJugador(new Jugador("pumpito17",18, "DEFENSOR"));
        seleccion.addJugador(new Jugador("pumpito18",19, "DEFENSOR"));
        seleccion.addJugador(new Jugador("pumpito19",20, "DEFENSOR"));
        seleccion.addJugador(new Jugador("pumpito20",21, "MEDIOCAMPISTA"));
        seleccion.addJugador(new Jugador("pumpito21",22, "ARQUERO"));
        seleccion.addJugador(new Jugador("pumpito22",23, "ARQUERO"));




        ArrayList<Jugador> jugadoresReserva = seleccion.obtenerReservas();

        System.out.println("jugador en reserva");


        for (Jugador j:jugadoresReserva) {
            System.out.println(j.toString());
        }

        //cantidad de defensores:
        try{
            System.out.println("Cantidad de defensores: " + seleccion.cantJugadores("DEFENSOR"));
        }
    catch(Exception e){
            e.printStackTrace();
        }

        try{
            System.out.println("Cantidad de DELANTERO: " + seleccion.cantJugadores("DELANTERO"));
        }
        catch(Exception e){
            e.printStackTrace();
        }

        try{
            System.out.println("Cantidad de ARQUERO: " + seleccion.cantJugadores("ARQUERO"));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        try{
            System.out.println("Cantidad de MEDIOCAMPISTA: " + seleccion.cantJugadores("MEDIOCAMPISTA"));
        }
        catch(Exception e){
            e.printStackTrace();
        }

        try {
            System.out.println("Cantidad de DT: " + seleccion.cantJugadores("DT")); // grnero un error buscando algo que no esta en la lista
        }catch (Exception e){
            e.printStackTrace();
        }
}}




/*


            Seleccion                                             Jugador
            nombre                                               posicion
                                                                 apellido
                                                                 nroCamiseta

            +addJugaador(jugador:Jugador)
            +obtenerReservas():ArrayList<Jugador
            +cantJugadores(posicion:Str):int


 */