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
    //MetodoCalcularSubtotal
    public double calcularSubtotal(Cliente cliente) {
        double subtotalAcumulado = 0.0;

        for (Prenda prenda : itemInventario.getListaPrendas()) {
            double precioBase = prenda.getPrecioUnitario();
            double recargoPrenda = prenda.getCategoriaPrenda().getCalcularSobreCargo();
            double precioConRecargo = precioBase * (1 + recargoPrenda);

            double descuentoCliente = cliente.getCategoria().getDescuento();
            double precioFinalUnitario = precioConRecargo * (1 - descuentoCliente);

            subtotalAcumulado += precioFinalUnitario * cantidad;
        }

        return subtotalAcumulado;
    }
        // Aplicar descuento según categoría del cliente
        double descuentoCliente = cliente.getCategoria().getDescuento();
        double precioFinalUnitario = precioConRecargo * (1 - descuentoCliente);

        return precioFinalUnitario * cantidad;
    }
}
