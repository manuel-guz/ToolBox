package Class6;

public class Impresora {
    private String modelo;
    private String tipoConexion;
    private String fechaFabricacion;
    private int hojasDisponibles;

    public Impresora (String modelo, String tipoConexion, String fechaFabricaciona){

        this.modelo=modelo;
        this.tipoConexion=tipoConexion;
        this.fechaFabricacion=fechaFabricaciona;
        hojasDisponibles=0;
    }


    public Impresora(String modelo, String tipoConexion){
        this.modelo=modelo;
        this.tipoConexion= tipoConexion;
        hojasDisponibles=0;
    }

    private boolean tienePapel(){
        return hojasDisponibles>0;
    }

    public void imprimir(String texto){
        if (tienePapel()){
            System.out.println("la impresora:" + modelo + "esta imprimiendo");
            hojasDisponibles--;
        }else{
            System.out.println("cargar hojas a la impresora modelo: " + modelo);
        }

    }


    public void cargarHojas(int cantidadHojas){
        hojasDisponibles+= cantidadHojas;

    }

    public int getHojasDisponibles(){
        return hojasDisponibles;
    }
     public String getFechaFabricacion(){
        return fechaFabricacion;
     }

    public String getModelo(){
        return modelo;
    }
}
