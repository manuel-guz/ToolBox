public class Final extends Examen implements Comparable{
    private double notaOral;
    private String temaOral;

    public Final(String titiulo, String enunciado, double nota, Alumno alumno, double notaOral, String temaOral) {
        super(titiulo, enunciado, nota, alumno);
        this.notaOral = notaOral;
        this.temaOral = temaOral;
    }

    @Override
    public boolean estaAprobado(){
    return (getNota()>=4 && notaOral>=4);
    }



    @Override
    public int compareTo(Object o) {
      /*  Sin casteo, usando referencia comp en todoe el codigo

      Final comp = ((Final)o) ;

        double promedio = (notaOral+ getNota())/2;
        double promedio2= (comp.getNota()+ comp.notaOral)/2;
        if (promedio>promedio2){
            return 1;
        }
        if (promedio<promedio2) {
            return -1;
        }else
            return 0;

       */


        double promedio = (this.notaOral+ getNota())/2;
        double promedio2= (((Final)o).getNota()+ ((Final)o).notaOral)/2;
        if (promedio>promedio2){
            return 1;
        }
        if (promedio<promedio2) {
            return -1;
        }else
            return 0;

    }
}




// termine en 1:18:00