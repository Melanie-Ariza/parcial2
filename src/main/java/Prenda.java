public class Prenda {
    private String codigo;
    private String nombre;
    private String marca;
    private double precioUnitario;
    private String color;
    private Talla talla;

    public Prenda(String codigo, String nombre, String marca, double precioUnitario, String color, Talla talla) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precioUnitario = precioUnitario;
        this.color= color;
        this.talla= talla;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
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
