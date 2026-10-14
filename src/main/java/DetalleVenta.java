public class DetalleVenta {
    private int cantidad;

    public DetalleVenta(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "DetalleVenta\n" +
                "Cantidad:" + cantidad;
    }
}
