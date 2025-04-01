import java.util.ArrayList;
import java.util.List;

public class Seleccion {

    private String nombre;
    private List<Jugador> jugadores;


    public Seleccion (String nombre){
        this.nombre= nombre;
        jugadores= new ArrayList<>();

    }

    public void addJugador (Jugador jugador){
        jugadores.add(jugador);

    }

    public int cantJugadores(String p) throws Exception{
        int resp=0;
        if (p.equals("ARQUERO")||p.equals("DEFENSOR")||p.equals("MEDIOCAMPISTA")||p.equals("DELANTERO")){

            for (Jugador jug:jugadores) {

                if (jug.getPosicion().equals(p)){
                    resp++;
                }
            }

        } else{
            throw new Exception("Error en la posicion ingresada no es valida");
        }
        return resp;
    }


        public ArrayList<Jugador> obtenerReservas(){
        ArrayList<Jugador> reservas = new ArrayList<>();

        for (int i=jugadores.size()-5; i<=jugadores.size()-1; i++){
            reservas.add(jugadores.get(i));
        }


        return reservas;

    }

}
