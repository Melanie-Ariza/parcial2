public class Inventario {
    private Prenda prenda;
    private String color;
    private String talla;
    private int cantidad;

    public Inventario(Prenda prenda, String color, String talla, int cantidad) {
        this.prenda = prenda;
        this.color = color;
        this.talla = talla;
        this.cantidad = cantidad;
    }
    //GETSET
    public Prenda getPrenda() {return prenda;}
    public void setPrenda(Prenda prenda) {this.prenda = prenda;}

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public String getTalla() {return talla;}

    public void setTalla(String talla) {this.talla = talla;}

    public int getCantidad() {return cantidad;}

    public void setCantidad(int cantidad) {this.cantidad = cantidad;}

    @Override
    public String toString() {
        return "Inventario{" +
                "prenda=" + prenda.getNombre() +
                ", color: " + color +
                ", talla: " + talla +
                ", cantidad: " + cantidad;


    }
    // METODOSTOCK
    public boolean hayStockSuficiente(int cantidadSolicitada) {
        return this.cantidad >= cantidadSolicitada;
    }

    public void descontarStock(int cantidadVendida) {
        this.cantidad -= cantidadVendida;
    }
}

