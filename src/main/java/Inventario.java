import java.util.List;

public class Inventario {
    private String color;
    private int cantidad;
    private Talla talla;

    //Listas
    private List<Prenda> listaPrendas;

    //Constructor
    public Inventario(String color, int cantidad, Talla talla) {
        this.color = color;
        this.cantidad = cantidad;
        this.talla= talla;
    }
    //GETSET
    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public int getCantidad() {return cantidad;}

    public void setCantidad(int cantidad) {this.cantidad = cantidad;}

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

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
                "Color: " + color +
                ", Cantidad: " + cantidad +
                ", Talla: " + talla +
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

