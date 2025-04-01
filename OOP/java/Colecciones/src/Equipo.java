import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;// coleccion array list para guardar objetos de tipo jugadores

    public Equipo(String nombre){
        this.nombre=nombre;
        jugadores=new ArrayList<>();

    }
    public void addJugador(Jugador j){
        jugadores.add(j);
    }

    public void mostrarJugadoresTitulares(){
        jugadores.sort(null); // cuando es null busca el compare to te jugador por ende oordena por numero de camiseta

        for (Jugador Player: jugadores) {
            if (Player.isTitular()) {
                System.out.println(Player.toString());
            }

        }
    }


    public int getCantidadJugadoresLesionados(){
        int cont=0;
        for (Jugador Player :  jugadores) {
            if (Player.isLesionado() && Player.isTitular()){
                cont++;
            }
        }
        return cont;
    }






}
