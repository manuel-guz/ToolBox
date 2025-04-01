public class Parcial extends Examen {
    private int unidad;
    private int nroDeIntentos;

    public Parcial(String titiulo, String enunciado, double nota, Alumno alumno, int unidad, int nroDeIntentos) {
        super(titiulo, enunciado, nota, alumno);
        this.unidad = unidad;
        this.nroDeIntentos = nroDeIntentos;
    }

    public boolean sePuedeRecuperar() {
        if (unidad <= 3) {
            return nroDeIntentos < 3;
        } else {
            return nroDeIntentos < 2;
        }
    }
}
