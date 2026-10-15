import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    private String codigo;
    private CategoriaCliente categoria;
    private List<Venta> listaClienteVentas;

    public Cliente(int documento, String nombre, String correo, String telefono, String codigo, CategoriaCliente categoria) {
        super(documento, nombre, correo, telefono);
        this.codigo = codigo;
        this.categoria = categoria;
        listaClienteVentas = new ArrayList<Venta>();
    }

    //GETSET
    public String getCodigo() {return codigo;}

    public void setCodigo(String codigo) {this.codigo = codigo;}

    public void setCategoria(CategoriaCliente categoria) {this.categoria = categoria;}

    public CategoriaCliente getCategoria() { return categoria; }


    public List<Venta> getListaClienteVentas() {
        return listaClienteVentas;
    }

    public void setListaClienteVentas(List<Venta> listaClienteVentas) {
        this.listaClienteVentas = listaClienteVentas;
    }

//TOSTRING


    @Override
    public String toString() {
        return "Cliente: " + super.toString() +
                ", codigo" + codigo +
                ", categoria: " + categoria +
                ", listaVentas: " + listaClienteVentas;
    }

    //Metodos

    //Verificar Compra
    public boolean verificarCompra(String codigo){
        boolean verificado = false;
        for(Venta venta : listaClienteVentas){
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
            listaClienteVentas.add(venta);
            compraAgregada = true;
        }
        return compraAgregada;
    }


}

