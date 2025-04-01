public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}








/*

States: 1 presupuesto
2 reparacion
3 para envio
4 finalizado

cada reparacion tiene
un nombre de articulo
un costo o valor de presupuesto
y una direccion de entrega

Acciones:
cambiar direccion
dar valor del presupuesto ( ingresar valor basico del presupuesto)
agregar repuestos
pasar al siguiente paso (cambio de estado)


Los estados siguen el siguiente orden de secuencia y pueden conocer los metodos que se indican:

        presupuesto       reparacion         para envio         finalizado
            |                 |                   |
    valorPresupuesto       sumaRepuesto     cambiarDireccion

    TODOS LOS ESTADOS PUEDEN pasarSigPaso

Cada vez que se cambia de estado debe mostrar el nombre del producto, estasdo, presupuesto
y direccion del envio. Hay que tener en cuenta que el estado Presupuesto solamente permmite ingresar
 el valor del presupuesto, en reparacion solo agregar valores de repuestos y en paraEnvio solo cambiar
 la direccion. En cualquier caso de llamar a un metodo no permitido en ese estado debe informar el error

 se debe hacer una clase (con correspondiente  metodo main) que:

 1 cree una reparacion con un articulo "batidora"
 2 le asigne un presupuesto
 3 pase a reparacion
 4 se le agregue el importe de repuesto
 5 pase a envio
 6 se le cambie la direccion
 7 pase a finalizado


UML

                <<Interface>>                                                  Reparacion
                   Estado                                                   -articulo: String
                                                                            -presupuesto:double
            +cambiarDireccion(String direccion)                             -direccion: String
            +sumarRepuesto(double valor)                                    +cambiarDireccion(String direccion)
            +valorPresupuesto(double valor)                                 +sumarRepuesto(double valor)
            +pasarSigPaso()                                                 +pasarSigPaso()



      presupuesto                                                 reparacion                             paraEnvio                                     finalizado
    -r:Reparacion                                  -r:Reparacion                                -r:Reparacion


    +cambiarDireccion(String direccion)            +cambiarDireccion(String direccion)          +cambiarDireccion(String direccion)             +cambiarDireccion(String direccion)
    +sumarRepuesto(double valor)                    +sumarRepuesto(double valor)                +sumarRepuesto(double valor)                    +sumarRepuesto(double valor)
    +valorPresupuesto(double valor)                 +valorPresupuesto(double valor)             +valorPresupuesto(double valor)                 +valorPresupuesto(double valor)
    +pasarSigPaso()                                 +pasarSigPaso()                             +pasarSigPaso()                                 +pasarSigPaso()

















 */
