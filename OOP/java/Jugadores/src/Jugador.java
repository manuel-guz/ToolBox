public class Jugador {
    private String posicion;
    private String apellido;
    private int nroCamiseta;

    public Jugador(String apellido, int nroCamiseta, String posicion) {
        this.posicion = posicion;
        this.apellido = apellido;
        this.nroCamiseta = nroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNroCamiseta() {
        return nroCamiseta;
    }

    public void setNroCamiseta(int nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }



    @Override
    public String toString (){
        return "Apellido: " + apellido + "Nro: " + nroCamiseta + "Posicion" + posicion;

    }


}
