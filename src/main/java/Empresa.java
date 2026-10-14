import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String nit;
    private String direccion;

    //Lista sucursales
    private List<Sucursales> listaSucursales;

    //Constructor
    public Empresa(String nombre, String nit, String direccion) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;

        listaSucursales= new ArrayList<>();
    }

    //Get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Sucursales> getListaSucursales() {
        return listaSucursales;
    }

    public void setListaSucursales(List<Sucursales> listaSucursales) {
        this.listaSucursales = listaSucursales;
    }

    //toString

    @Override
    public String toString() {
        return "Empresa\n" +
                "Nombre: " + nombre +
                ", NIT: " + nit +
                ", Dirección: " + direccion +
                ", Lista sucursales: " + listaSucursales;
    }
}
