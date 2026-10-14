public class Prenda {
    private String codigo;
    private String nombre;
    private String marca;
    private double precioUnitario;
    private CategoriaPrenda categoria;

    // Constructor
    public Prenda(String codigo, String nombre, String marca, double precioUnitario, CategoriaPrenda categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precioUnitario = precioUnitario;
        this.categoria = categoria;
    }
    // GETSET

    public String getCodigo() {return codigo;}

    public void setCodigo(String codigo) {this.codigo = codigo;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getMarca() {return marca;}

    public void setMarca(String marca) {this.marca = marca;}

    public double getPrecioUnitario() {return precioUnitario;}

    public void setPrecioUnitario(double precioUnitario) {this.precioUnitario = precioUnitario;}

    public CategoriaPrenda getCategoria() {return categoria;}

    public void setCategoria(CategoriaPrenda categoria) {this.categoria = categoria;}

    @Override
    public String toString() {
        return "Prenda{" +
                "codigo: " + codigo +
                ", nombre: " + nombre +
                ", marca: " + marca +
                ", precioUnitario: " + precioUnitario +
                ", categoria: " + categoria;
    }

}
