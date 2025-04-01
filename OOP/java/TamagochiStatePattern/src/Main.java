public class Main {
    public static void main(String[] args) {


        Tamagochi pou = new Tamagochi();
        pou.recibirMimos();
        pou.comer();
        pou.comer();
        pou.beber();
        pou.recibirMimos();



    }
}

/*Siempre se debe especificar los estados y las acciones o estimulos y un efecto final

cada estado tiene un una clase

implementa una interfaz con metodos necesarios para resolver los comportamientos


Estimulos --> metodos

Estados --- > clases que implementan esta interfaz


Cada clase estado tiene un atributo un objeto de tipo tamagochi




Clase 20


        Tamagochi
        -Estado:Estado
        +beber()
        +comer()
        +recibirMimos()
                |
                |
                |
                |
           <<Interface>>
             Estado
             +beber()
             +comer
             +recibirMimos()

                |------------------------implement--------------------------------------------
                |------------------------implement--------------------                       |
                |----------implement---------                        |                       |
             Implement                      |                        |                       |
                |                           |                        |                       |
              Feliz                     Triste                  Hambriento              Sediento
              -t:Tamagochi              -t:Tamagochi            -t:Tamagochi            -t:Tamagochi
              +beber()                  +beber()                +beber()                +beber()
              +comer()                  +comer()                +comer()                +comer()
              +recibirMimos()           +recibirMimos()         +recibirMimos()         +recibirMimos()

 */