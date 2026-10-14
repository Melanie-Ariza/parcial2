public class Cliente extends Persona {
    private String codigo;
    private CategoriaCliente categoria;

    public Cliente(int documento, String nombre, String correo, String telefono, String codigo, CategoriaCliente categoria) {
        super(documento, nombre, correo, telefono);
        this.codigo = codigo;
        this.categoria = categoria;
    }

    //GETSET
    public String getCodigo() {return codigo;}

    public void setCodigo(String codigo) {this.codigo = codigo;}

    public void setCategoria(CategoriaCliente categoria) {this.categoria = categoria;}

    public CategoriaCliente getCategoria() { return categoria; }

    //TOSTRING

    @Override
    public String toString() {
        // super.getNombre() para incluir los datos heredados de Persona y asi
        return "Cliente=" +
                "documento: " + getDocumento() +
                ", nombre: " + getNombre() +
                ", correo: " + getCorreo() +
                ", telefono: " + getTelefono() +
                ", codigo: " + codigo  +
                ", categoria: " + categoria;
    }
}

