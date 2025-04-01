public class Persona implements Comparable{

        private int edad;

    public int getEdad() {
        return edad;
    }

    @Override
    public int compareTo(Object o) {
       /* Persona p = (Persona) o;
        return this.getEdad()- p.getEdad();
        */

    return this.edad - ((Persona)o).getEdad(); //casteo o en persona y lo comparo con el objeto.
    }
}
