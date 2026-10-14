import java.util.List;

public class Inventario {
    private String color;
    private int cantidad;
    private TallaCalzado tallaCalzado;
    private TallaPrenda tallaPrenda;

    //Listas
    private List<Prenda> listaPrendas;

    //Constructor
    public Inventario(String color, int cantidad, TallaCalzado tallaCalzado, TallaPrenda tallaPrenda) {
        this.color = color;
        this.cantidad = cantidad;
        this.tallaCalzado= tallaCalzado;
        this.tallaPrenda= tallaPrenda;
    }
    //GETSET
    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public int getCantidad() {return cantidad;}

    public void setCantidad(int cantidad) {this.cantidad = cantidad;}

    public TallaCalzado getTallaCalzado() {
        return tallaCalzado;
    }

    public void setTallaCalzado(TallaCalzado tallaCalzado) {
        this.tallaCalzado = tallaCalzado;
    }

    public TallaPrenda getTallaPrenda() {
        return tallaPrenda;
    }

    public void setTallaPrenda(TallaPrenda tallaPrenda) {
        this.tallaPrenda = tallaPrenda;
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
                ", Talla calzado: " + tallaCalzado +
                ", Talla Prenda: " + tallaPrenda +
                ", Lista prendas=" + listaPrendas;
    }

    // METODOSTOCK
    public boolean hayStockSuficiente(int cantidadSolicitada) {
        return this.cantidad >= cantidadSolicitada;
    }

    public void descontarStock(int cantidadVendida) {
        this.cantidad -= cantidadVendida;
    }

    //
    
}

