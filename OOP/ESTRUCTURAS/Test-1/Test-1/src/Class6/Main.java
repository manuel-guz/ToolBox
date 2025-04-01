package Class6;

public class Main {
    public static void main(String[] args) {
         Impresora impre1 = new Impresora("impreMAX", "wifi", "22-06-2005");
         Impresora impre2 = new Impresora("impreDig", "usb");

         impre1.imprimir("hoy es un dia nublado");
         impre1.cargarHojas(300);
         impre1.imprimir("ahora si hay hojas");
        System.out.println( "cantidad de hojas disponibles:  " + impre1.getHojasDisponibles());

    }
};
