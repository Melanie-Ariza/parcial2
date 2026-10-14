import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    private String codigo;
    private CategoriaCliente categoria;

    private List<Venta> listaCompras;

    public Cliente(int documento, String nombre, String correo, String telefono, String codigo, CategoriaCliente categoria) {
        super(documento, nombre, correo, telefono);
        this.codigo = codigo;
        this.categoria = categoria;

        listaCompras= new ArrayList<>();
    }

    //GETSET
    public String getCodigo() {return codigo;}

    public void setCodigo(String codigo) {this.codigo = codigo;}

    public void setCategoria(CategoriaCliente categoria) {this.categoria = categoria;}

    public CategoriaCliente getCategoria() { return categoria; }

    public List<Venta> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(List<Venta> listaCompras) {
        this.listaCompras = listaCompras;
    }

//TOSTRING

    @Override
    public String toString() {
        // super.getNombre() para incluir los datos heredados de Persona y asi
        return "Cliente \n" +
                "Documento: " + getDocumento() +
                ", Nombre: " + getNombre() +
                ", Correo: " + getCorreo() +
                ", Telefono: " + getTelefono() +
                ", Codigo: " + codigo  +
                ", Categoria: " + categoria+
                ", Lista compras: "+ listaCompras;
    }
}

