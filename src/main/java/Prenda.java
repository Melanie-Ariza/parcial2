public class Prenda {
    private String codigo;
    private String nombre;
    private String marca;
    private double precioUnitario;
    private String color;
    private int cantidad;
    //Enums
    private Talla talla;
    private CategoriaPrenda categoriaPrenda;

    public Prenda(String codigo, String nombre, String marca, double precioUnitario, String color, int cantidad, Talla talla, CategoriaPrenda categoriaPrenda) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precioUnitario = precioUnitario;
        this.color = color;
        this.cantidad = cantidad;
        this.talla = talla;
        this.categoriaPrenda = categoriaPrenda;
    }

    public CategoriaPrenda getCategoriaPrenda() {
        return categoriaPrenda;
    }

    public void setCategoriaPrenda(CategoriaPrenda categoriaPrenda) {
        this.categoriaPrenda = categoriaPrenda;
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

    public int getCantidad() {return cantidad;}

    public void setCantidad(int cantidad) {this.cantidad = cantidad;}

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Prenda " +
                "codigo: " + codigo +
                ", nombre: " + nombre +
                ", marca: " + marca +
                ", precioUnitario: " + precioUnitario +
                ", color: " + color +
                ", cantidad: " + cantidad +
                ", talla: " + talla +
                ", categoriaPrenda " + categoriaPrenda;
    }
//Metodo calcular sobrecargo
public double calcularSobrecargo() {
    if (this.categoriaPrenda == null) {
        return 0.0;
    }
    return precioUnitario * categoriaPrenda.getSobrecargo();
}

}


