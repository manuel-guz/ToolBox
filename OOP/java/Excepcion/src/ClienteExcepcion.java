public class ClienteExcepcion   extends Exception{
    public ClienteExcepcion(String mensaje){
        super(mensaje);

    }


    public ClienteExcepcion(){
        super();
    }

    @Override
    public String toString(){
        return "Se priodujo la siguiente excepcion: " + getMessage();

    }

}
