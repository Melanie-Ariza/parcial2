import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private int cantidad;

    //Listas
    private List<Prenda> listaPrendas;

    //Constructor
    public Inventario( int cantidad) {
        this.cantidad = cantidad;
        listaPrendas = new ArrayList<>();

    }
    //GETSET
    public int getCantidad() {return cantidad;}

    public void setCantidad(int cantidad) {this.cantidad = cantidad;}


    public List<Prenda> getListaPrendas() {
        return listaPrendas;
    }

    public void setListaInventarioPrendas(List<Prenda> listaInventarioPrendas) {
        this.listaPrendas = listaInventarioPrendas;
    }

    //toString

    @Override
    public String toString() {
        return "Inventario\n" +
                "Cantidad: " + cantidad +
                ", Lista prendas: " + listaPrendas;
    }

    //Metodo mostrar nombres
    public List<String> getNombresPrendas() {
        List<String> nombres = new ArrayList<>();
        for (Prenda prenda : this.listaPrendas) {
            nombres.add(prenda.getNombre());
        }
        return nombres;
    }
    // Método para verificar si ya existe la combinación de prenda (referencia, talla y color)
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
    //Método Agregar Prenda

    public boolean agregarPrenda(Prenda prenda) {
        boolean prendaAgregada = false;
        boolean prendaVerificada = verificarCombinacionPrenda(prenda.getCodigo(), prenda.getTalla(), prenda.getColor());

        if (!prendaVerificada) {
            listaPrendas.add(prenda);
            prendaAgregada = true;
        }

        return prendaAgregada;
    }

    //Validar Stock
    public boolean validarStock(int cantidadSolicitada) {
        boolean stockValido = false;

        if (cantidad >= cantidadSolicitada) {
            stockValido = true;
        }

        return stockValido;
    }

}

