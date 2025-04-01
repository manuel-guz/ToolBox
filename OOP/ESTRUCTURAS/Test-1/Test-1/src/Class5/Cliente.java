package Class5;

public class Cliente {
    private Integer numeroCliente;
    private String nombre;
    private Double deuda;

        public Cliente (Integer numeroCliente, String nombre){
            this.numeroCliente=numeroCliente;
            this.nombre=nombre;
            deuda=0.0;

        }
        public void incrementarDeuda(Double valor){
            deuda+= valor;
        }

    public Integer getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(Integer numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getDeuda() {
        return deuda;
    }

}
