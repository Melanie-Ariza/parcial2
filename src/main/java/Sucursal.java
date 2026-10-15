import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sucursal {
    private String nombre;
    private String codigo;
    private String direccion;
    private String ciudad;

    //Relacion  inventario
    private Inventario inventario;
    private List<Vendedor> listaVendedores;
    private List<Venta> listaVentas;

    //Constructor
    public Sucursal(String nombre, String codigo, String direccion, String ciudad, Inventario inventario) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.inventario = inventario;

        listaVendedores= new ArrayList<>();
        listaVentas= new ArrayList<>();
    }
    //get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public List<Vendedor> getListaVendedores() {
        return listaVendedores;
    }

    public void setListaVendedores(List<Vendedor> listaVendedores) {
        this.listaVendedores = listaVendedores;
    }

    public List<Venta> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(List<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

//tostring

    @Override
    public String toString() {
        return "Sucursales\n" +
                "Nombre: " + nombre +
                ", Código: " + codigo +
                ", Dirección: " + direccion +
                ", Ciudad: " + ciudad +
                ", Inventario: " + inventario+
                ", Lista vendedores: " + listaVendedores+
                ", Lista ventas: " + listaVentas;
    }

    //Metodo para verificar si existe un inventario en la sucursal
    public boolean verificarInventario(String codigoInventario){
        boolean existeInventario= false;
        if (inventario.getCodigo().equalsIgnoreCase(codigoInventario)){
            existeInventario= true;
        }
        return existeInventario;
    }

    //Metodo para crear un inventario
    public void crearInventario(boolean existeInventario, Inventario inventario){
        Scanner sc= new Scanner(System.in);
        boolean creado= false;
        if (!existeInventario){
            System.out.print("Código nuevo inventario: ");
            String codigo= sc.nextLine();

            System.out.print("Cantidad nuevo inventario: ");
            int cantidad= sc.nextInt();
            sc.nextLine();

            inventario= new Inventario(codigo, cantidad);


            System.out.println("Inventario creado correctamente");
        }else {
            System.out.println("Inventario ya existente.");
        }
    }

    //Metodo para verificar vendedor
    public boolean verificarVendedor(String codigoVendedor){
        boolean existeVendedor= false;
        for (Vendedor vendedor: listaVendedores){
            if (vendedor.getCodigo().equalsIgnoreCase(codigoVendedor)){
                existeVendedor= true;
            }
        }
        return existeVendedor;
    }

    //Metodo agregar vendedor
    public boolean agregarVendedor(Vendedor vendedor){
        boolean vendedorAgregado= false;
        boolean vendedorVerificado= verificarVendedor(vendedor.getCodigo());
        if (!vendedorVerificado){
            listaVendedores.add(vendedor);
            vendedorAgregado= true;
        }
        return vendedorAgregado;
    }

    //Metodo verificar venta
    public boolean verificarVenta(String codigoVenta){
        boolean existeVenta= false;
        for (Venta venta: listaVentas){
            if (venta.getCodigo().equalsIgnoreCase(codigoVenta)){
                existeVenta= true;
            }
        }
        return existeVenta;
    }

    //Metodo agregar venta
    public boolean agregarVenta(Venta venta){
        boolean ventaAgregada= false;
        boolean ventaVerificada= verificarVenta(venta.getCodigo());
        if (!ventaVerificada){
            listaVentas.add(venta);
            ventaAgregada= true;
        }
        return ventaAgregada;
    }

}
