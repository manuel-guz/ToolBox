package interfaceComparable;

public class Persona implements Comparable{
    private int edad;

    public int getEdad(){
        return this.edad;

    }

    public void decirEdad(){
        System.out.println(this.edad);
    }
    @Override
    public int compareTo(Object o) {
        Persona p = (Persona) o;

        if (this.edad > p.getEdad()){
            return 1;
        }
        if (this.edad < p.getEdad()){
            return -1;
        }
        return 0;
    }
};


   // public int compareTo2(Object o) {
    //    return this.edad - ((Persona) o).getEdad(); };
