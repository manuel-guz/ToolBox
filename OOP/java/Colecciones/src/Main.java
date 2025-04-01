public class Main {
    public static void main(String[] args) {

            Equipo e= new Equipo("Digital");
            Jugador j1= new Jugador(9, "Pedro", true, true);
        Jugador j2= new Jugador(8, "Juan", true, true);
        Jugador j3= new Jugador(7, "Aldo", false, true);
        Jugador j4= new Jugador(6, "Pablo", false, false);


//cargando el array list
        e.addJugador(j1);
        e.addJugador(j2);
        e.addJugador(j3);
        e.addJugador(j4);

        e.mostrarJugadoresTitulares();

        System.out.println("Lesionados: " + e.getCantidadJugadoresLesionados());


    }
}