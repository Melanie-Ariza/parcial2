public class DetalleVenta {
    private Inventario itemInventario;
    private int cantidad;

    public DetalleVenta(Inventario itemInventario, int cantidad) {
        this.itemInventario = itemInventario;
        this.cantidad = cantidad;
    }
    //GETSET

    public Inventario getItemInventario() {return itemInventario;}

    public void setItemInventario(Inventario itemInventario) {this.itemInventario = itemInventario;}

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "DetalleVenta=" +
                "prenda: " + itemInventario.getNombresPrendas()+
                ", cantidad: " + cantidad;
    }

    //METODOS
    // 1. Calcular el valor unitario final aplicando el recargo de la prenda
    public double calcularValorUnitarioFinal(Cliente cliente, Prenda prenda) {
        double precioBase = prenda.getPrecioUnitario();
        double recargo = prenda.calcularSobrecargo();
        double precioConRecargo = precioBase + recargo;

        double descuentoCliente = cliente.getCategoria().getDescuento();

        return precioConRecargo * (1 - descuentoCliente);
    }

    // 2. Calcular el subtotal
    public double calcularSubtotal(Cliente cliente, Inventario itemInventario) {
        double subtotalAcumulado = 0.0;

        for (Prenda prenda : itemInventario.getListaPrendas()) {
            // En lugar de repetir toda la lógica, llamamos al método que ya la calcula
            double precioFinalUnitario = calcularValorUnitarioFinal(cliente, prenda);

            subtotalAcumulado += precioFinalUnitario * this.cantidad;
        }

        return subtotalAcumulado;
    }
}
