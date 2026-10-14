public enum CategoriaCliente {
    BRONCE(0.05),
    PLATA(0.1),
    ORO(0.15);
    private final double descuento;

    CategoriaCliente(double descuento) {
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }
}
