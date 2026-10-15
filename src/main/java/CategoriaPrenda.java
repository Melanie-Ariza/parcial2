public enum CategoriaPrenda {
    CAMISETA(0.0),
    PANTALON(0.0),
    VESTIDO(0.10),
    CHAQUETA(0.15),
    CALZADO(0.05);

    private double sobrcargo;

    CategoriaPrenda(double sobrcargo) {
        this.sobrcargo= sobrcargo;
    }

    public double getSobrecargo() {return sobrcargo;}
}
