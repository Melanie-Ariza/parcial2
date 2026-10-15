public class DetalleVenta {
    private int cantidad;
    private Inventario itemInventario;

    public DetalleVenta(int cantidad, Inventario itemInventario) {
        this.cantidad = cantidad;
        this.itemInventario = itemInventario;
    }
    //GETSET
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Inventario getItemInventario() {return itemInventario;}

    public void setItemInventario(Inventario itemInventario) {this.itemInventario = itemInventario;}

    @Override
    public String toString() {
        return "DetalleVenta\n" +
                "Cantidad: " + cantidad+
                ", Prenda: " + itemInventario.getNombresPrendas();
    }

    //METODOS
    // Calcular el valor unitario final aplicando el recargo de la prenda
    public double calcularValorUnitarioFinal(Cliente cliente, Prenda prenda) {
        double precioBase = prenda.getPrecioUnitario();
        double recargo = prenda.calcularSobrecargo();
        double precioConRecargo = precioBase + recargo;

        double descuentoCliente = cliente.getCategoria().getDescuento();
        return precioConRecargo * (1 - descuentoCliente);
    }

    // Calcular el subtotal
    public double calcularSubtotal(Cliente cliente) {
        double subtotalAcumulado = 0.0;
        for (Prenda prenda : itemInventario.getListaPrendas()) {
            double precioFinalUnitario = calcularValorUnitarioFinal(cliente, prenda);

            subtotalAcumulado += precioFinalUnitario * this.cantidad;
        }

        return subtotalAcumulado;
    }

}
