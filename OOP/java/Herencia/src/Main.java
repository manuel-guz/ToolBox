




public class Main {
    public static void main(String[] args) {

       EmpleadoMarketing emp1 = new EmpleadoMarketing("Pedro", "Sanches", "1234","redes sociales");
       emp1.trabajar();
       emp1.trabajar(4);
    }
}


/*






                        --------STATIC------
        *Variables de Clase (atributos que guardan valores comunes a todos

         los objetos, va subrayado en UML)--->         static private double valorCombustible;



        * Metodo de clase se puede  utilizar sin instanciasr o crear un objeto, directamente con la

         clase (subrayado en UML)--->            static public void cambiarPrecioCombustible(double precio){};



                                       --------UML---------
               Empleado
              -nombre:string
              -apellido:String
              -dni:string
                  +trabajar():void
                  +descanso():void
                  +toString():String
      |                      |                                                    |
  extends                 extends                                              extends
      |                       |                                                   |
EmpleadoRRHH              EmpleadoMarketing                                   EmpleadoProduccion
  -altasLoradas: int          -area:String                                        -tiempoExperiencia:int
  +trabajar(): void           +trabajar():void                                    +trabajar():void
                              +trabajar(int horasExtras):void



Sobrescritura  ---> @overide
                       misma firma diferente codigo

sobrecarga     ----> diferente firma, codigo modificado


Todas las clases derivan de la clase Object, por eso cada clase que creamos hereda ciertos metodos:


-String toString()    ---> Necesita ser sobreescribido para funcionar correctamente y mostrar solo lainformacon que deseamos mostrar y dandole a la cadena de salida el formato mas adecuado:
                           Este intenra representar con texto el objeto.
                           Es importante no cambiar la firma del metodo, sino estaremos sobrecargando.

                 public class Empleado{
                   private String nombre;
                   private String legajo;
                   protected double sueldo;
                   protected souble descuentos;

                   @Override
                        public String toString(){
                        return "nombre=" + nombre + '\'' +
                               "legajo=" + legajo;}

                      }

        --->en el main:         Empleado nuevoEmpleado= new Empleado("Juan", "1111");
                                System.out.println(nuevoEmpleado.toString());



                                Salida: Nombre: Juan
                                        Legajo: 1111

- boolean equals(Object o)
- int hashCode()



*/