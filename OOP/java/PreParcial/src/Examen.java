public abstract class Examen {
    private String titiulo;
    private String enunciado;
    private double nota;
    private Alumno alumno;

    public Examen(String titiulo, String enunciado, double nota, Alumno alumno) {
        this.titiulo = titiulo;
        this.enunciado = enunciado;
        this.nota = nota;
        this.alumno = alumno;
    }

    public boolean estaAprobado(){
        return nota>4;
    }

    public String getTitiulo() {
        return titiulo;
    }

    public void setTitiulo(String titiulo) {
        this.titiulo = titiulo;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
}
