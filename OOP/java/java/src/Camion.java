public class Camion {
    private String marca;
    private String patente;
    static private double valorCombustible; // valor que va a ser igual en todos los objetos u instancias

    public Camion (String marca, String patente){
        this.marca = marca;
        this.patente=patente;
    }

    public double gastoCombustible(int litros){
        return  litros*Camion.valorCombustible;
    };

    static public void cambiarPrecioCombustible(double precio){
        Camion.valorCombustible=precio;
    };

}
