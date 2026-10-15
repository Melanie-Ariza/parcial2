import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private int cantidad;

    //Listas
    private List<Prenda> listaInventarioPrendas;

    //Constructor
    public Inventario( int cantidad) {
        this.cantidad = cantidad;
        listaInventarioPrendas = new ArrayList<>();

    }
    //GETSET
    public int getCantidad() {return cantidad;}

    public void setCantidad(int cantidad) {this.cantidad = cantidad;}


    public List<Prenda> getListaInventarioPrendas() {
        return listaInventarioPrendas;
    }

    public void setListaInventarioPrendas(List<Prenda> listaInventarioPrendas) {
        this.listaInventarioPrendas = listaInventarioPrendas;
    }

    //toString

    @Override
    public String toString() {
        return "Inventario\n" +
                "Cantidad: " + cantidad +
                ", Lista prendas: " + listaInventarioPrendas;
    }

    //Metodo mostrar nombres
    public List<String> getNombresPrendas() {
        List<String> nombres = new ArrayList<>();
        for (Prenda prenda : this.listaInventarioPrendas) {
            nombres.add(prenda.getNombre());
        }
        return nombres;
    }
    // Método para verificar si ya existe la combinación de prenda (referencia, talla y color)
    public boolean verificarCombinacionPrenda(String codigo, Talla talla, String color) {
        boolean existe = false;
        if (listaInventarioPrendas == null) {
            return existe;
        }

        for (Prenda prenda : listaInventarioPrendas) {
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
            listaInventarioPrendas.add(prenda);
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

