import java.util.List;

public class Inventario {
    private int cantidad;

    //Listas
    private List<Prenda> listaPrendas;

    //Constructor
    public Inventario( int cantidad) {
        this.cantidad = cantidad;

    }
    //GETSET
    public int getCantidad() {return cantidad;}

    public void setCantidad(int cantidad) {this.cantidad = cantidad;}


    public List<Prenda> getListaPrendas() {
        return listaPrendas;
    }

    public void setListaPrendas(List<Prenda> listaPrendas) {
        this.listaPrendas = listaPrendas;
    }

    //toString

    @Override
    public String toString() {
        return "Inventario\n" +
                "Cantidad: " + cantidad +
                ", Lista prendas: " + listaPrendas;
    }

    /** // METODOSTOCK
    public boolean hayStockSuficiente(int cantidadSolicitada) {
        return this.cantidad >= cantidadSolicitada;
    }

    public void descontarStock(int cantidadVendida) {
        this.cantidad -= cantidadVendida;
    } **/

}

