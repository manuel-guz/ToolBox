package Class10;

public class SocioHabilitado extends Socio{
    private Double costoPileta;
    private Boolean habilitado;

    public SocioHabilitado(String numero, String nombre, String actividad, Double cuota, Double costoIngreso){
        super(numeroSocio, nombre, cuotaMensual, actividad);
    }
}
