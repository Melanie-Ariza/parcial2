import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private String codigo;
    private int cantidad;

    //Listas
    private List<Prenda> listaPrendas;

    //Constructor
    public Inventario(String codigo, int cantidad) {
        this.codigo=codigo;
        this.cantidad = cantidad;
        listaPrendas = new ArrayList<>();

    }
    //GETSET

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {return cantidad;}

    public void setCantidad(int cantidad) {this.cantidad = cantidad;}


    public List<Prenda> getListaPrendas() {
        return listaPrendas;
    }

    public void setListaPrendas(List<Prenda> listaInventarioPrendas) {
        this.listaPrendas = listaInventarioPrendas;
    }

    //toString

    @Override
    public String toString() {
        return "Inventario\n" +
                "Lista prendas: " + listaPrendas+
                ", Cantidad: " + cantidad;
    }

    //Metodo mostrar nombres
    public List<String> getNombresPrendas() {
        List<String> nombres = new ArrayList<>();
        for (Prenda prenda : this.listaPrendas) {
            nombres.add(prenda.getNombre());
        }
        return nombres;
    }

    // Metodo para verificar si ya existe la combinación de prenda (referencia, talla y color)
    public boolean verificarCombinacionPrenda(String codigo, Talla talla, String color) {
        boolean existe = false;
        if (listaPrendas == null) {
            return existe;
        }

        for (Prenda prenda : listaPrendas) {
            boolean mismoCodigo = prenda.getCodigo().equalsIgnoreCase(codigo);
            boolean mismaTalla = prenda.getTalla() == talla;
            boolean mismoColor = prenda.getColor().equalsIgnoreCase(color);

            if (mismoCodigo && mismaTalla && mismoColor) {
                existe = true;
                break;
            }
        }

        return existe;
    }
    //Metodo Agregar Prenda
    public boolean agregarPrenda(Prenda prenda) {
        boolean prendaAgregada = false;
        boolean prendaVerificada = verificarCombinacionPrenda(prenda.getCodigo(), prenda.getTalla(), prenda.getColor());

        if (!prendaVerificada) {
            listaPrendas.add(prenda);
            prendaAgregada = true;
        }

        return prendaAgregada;
    }

    //Metodo para mostrar prenda por codigo
    public Prenda mostrarPrenda(String codigo) {
        Prenda prenda1 = null;
        for (Prenda prenda : listaPrendas) {
            if (prenda.getCodigo() == codigo) {
                prenda1 = prenda;
            }
        }
        return prenda1;
    }
}

