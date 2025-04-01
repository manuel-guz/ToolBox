public class Socio {
    private String numeroSocio;
    private String nombre;
    private Double cuotaMensual;
    private String actividad;

    public Socio (String numero, String nombre, String actividad, Double cuota){
        numeroSocio = numero;
        this.nombre= nombre;
        this.actividad=actividad;
        cuotaMensual= cuota;
    };
    public Double costoMensual(){
        return cuotaMensual;

    }

    public Double getCuotaMensual() {
        return cuotaMensual;
    }
    @Override
    public String toString(){
        return "Numero de socio: "+ numeroSocio+ " nombre: " + nombre;
    }
}
