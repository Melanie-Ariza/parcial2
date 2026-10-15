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
        listaCompras = new ArrayList<Venta>();
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
        return "Cliente: " + super.toString() +
                ", Codigo" + codigo +
                ", Categoria: " + categoria +
                ", Lista compras: " + listaCompras;
    }

    //Metodos

    //Verificar Compra
    public boolean verificarCompra(String codigo){
        boolean verificado = false;
        for(Venta venta : listaCompras){
            if(venta.getCodigo().equalsIgnoreCase(codigo)){
                verificado = true;
                break;
            }
        }
        return verificado;
    }

    //Agregar Compra
    public boolean agregarCompra(Venta venta){
        boolean compraAgregada = false;
        boolean compraVerificada = verificarCompra(venta.getCodigo());
        if(!compraVerificada){
            listaCompras.add(venta);
            compraAgregada = true;
        }
        return compraAgregada;
    }


}

