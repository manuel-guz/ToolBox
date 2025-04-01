public class Articulo {




    private String description ;
    private double price ;
    private int stock;

        public Articulo(String description, int cantidad, double precio){   //El constructor es un metodo que no tiene tiene tipo de dato y se llama igual que la clase, recibe como parametros los valores quee se desea asignar inicialmente a los atributos, (los inicializa)

            this.description=description;
            price=precio;
            stock=cantidad;

        }
        public boolean hayStock(){

            return stock>0;
        };
        public double consultarPrecio(){

            return price;
        };


//------- Getter metoths
    public String getDescription() {
        return description;
    };

    public double getPrice() {
        return price;
    };

    public int getStock() {
        return stock;
    };

//------- Setters metoths

    public void setDescription(String description) {
        this.description = description;
    };

    public void setPrice(double price) {
        this.price = price;
    };

    public void setStock(int stock) {
        this.stock = stock;
    };


}
