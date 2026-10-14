public class Prenda {
    private String codigo;
    private String nombre;
    private String marca;
    private double precioUnitario;

    public Prenda(String codigo, String nombre, String marca, double precioUnitario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precioUnitario = precioUnitario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return "Prenda\n" +
                "Código: " + codigo +
                ", Nombre: " + nombre +
                ", Marca: " + marca +
                ", Precio unitario=" + precioUnitario;
    }
}
