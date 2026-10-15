import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String nit;
    private String direccion;

    //Lista sucursales
    private List<Sucursales> listaSucursales;
    private List<Cliente> listaClientes;

    //Constructor
    public Empresa(String nombre, String nit, String direccion) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;

        listaSucursales = new ArrayList<>();
        listaClientes = new ArrayList<>();
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

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    //toString

    @Override
    public String toString() {
        return "Empresa\n" +
                "Nombre: " + nombre +
                ", NIT: " + nit +
                ", Dirección: " + direccion +
                ", Cantidad Sucursales: " + listaSucursales.size() +
                ", Cantidad Clientes: " + listaClientes.size();
    }

    //Metodos
    //verificarSucursal
    public boolean verificarSucursal(String codigo) {
        for (Sucursales sucursal : this.listaSucursales) {
            if (sucursal.getCodigo().equalsIgnoreCase(codigo)) {
                return true;
            }
        }
        return false;

    }

    //AgregarSucursal
    public boolean agregarSucursal(Sucursales nuevaSucursal) {
        if (!verificarSucursal(nuevaSucursal.getCodigo())) {
            this.listaSucursales.add(nuevaSucursal);
            return true;
        } else {
            System.out.println("Error: La sucursal con código " + nuevaSucursal.getCodigo() + " ya existe.");
            return false;
        }
    }
    //VerificarCliente
    public boolean verificarClientes(String codigoCliente) {
        for (Cliente cliente : this.listaClientes) {
            if (cliente.getCodigo().equalsIgnoreCase(codigoCliente)) {
                return true;
            }
        }
        return false;
    }
    //AgregarCliente
    public boolean agregarClientes(Cliente nuevoCliente) {
        if (!verificarClientes(nuevoCliente.getCodigo())) {
            this.listaClientes.add(nuevoCliente);
            return true;
        } else {
            System.out.println("Error: El cliente ya está registrado.");
            return false;
        }
    }
}