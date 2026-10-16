import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {
    private String nombre;
    private String nit;
    private String direccion;

    //Lista sucursales
    private List<Sucursal> listaSucursales;
    private List<Cliente> listaClientes;
    private List<Inventario> listaInventarios;

    //Constructor
    public Empresa(String nombre, String nit, String direccion) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;

        listaSucursales = new ArrayList<>();
        listaClientes = new ArrayList<>();
        listaInventarios = new ArrayList<>();
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

    public List<Sucursal> getListaSucursales() {
        return listaSucursales;
    }

    public void setListaSucursales(List<Sucursal> listaSucursales) {
        this.listaSucursales = listaSucursales;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Inventario> getListaInventarios() {
        return listaInventarios;
    }

    public void setListaInventarios(List<Inventario> listaInventarios) {
        this.listaInventarios = listaInventarios;
    }

//toString

    @Override
    public String toString() {
        return "Empresa\n" +
                "Nombre: " + nombre +
                ", NIT: " + nit +
                ", Dirección: " + direccion +
                ", Lista Sucursales: " + listaSucursales.size() +
                ", Lista Clientes: " + listaClientes.size()+
                ", Lista inventarios: "+ listaInventarios;
    }

    //Metodos
    //verificarSucursal
    public boolean verificarSucursal(String codigo) {
        for (Sucursal sucursal : this.listaSucursales) {
            if (sucursal.getCodigo().equalsIgnoreCase(codigo)) {
                return true;
            }
        }
        return false;

    }

    //AgregarSucursal
    public boolean agregarSucursal(Sucursal nuevaSucursal) {
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

    //Mostrar cliente por documento
    public Cliente mostrarCliente(int documento) {
        Cliente cliente1 = null;
        for (Cliente cliente : listaClientes) {
            if (cliente.getDocumento() == documento) {
                cliente1 = cliente;
            }
        }
        return cliente1;
    }

    //Registrar una venta
    public void comenzarCompra (Cliente cliente){
        Scanner sc= new Scanner(System.in);
        int opcion=1;
        Venta venta1= null;

        do {
            for (Inventario inventario: listaInventarios){
                for (Prenda prenda: inventario.getListaPrendas()) {
                    System.out.println(prenda);
                }
            }

            System.out.print("Ingrese el código de prenda que desea: ");
            String codigoPrenda= sc.nextLine();

            for (Inventario inventario: listaInventarios) {

                for (Prenda prenda : inventario.getListaPrendas()) {
                    int i=0;
                    if (prenda.getCodigo().equalsIgnoreCase(codigoPrenda)) {

                        System.out.print("¿Qué cantidad desea?: ");
                        int cantidad = sc.nextInt();
                        sc.nextLine();

                        //Uso de stock
                        if (prenda.validarStock(cantidad)) {
                            //reducir stock
                            prenda.reducirStock(cantidad);

                            DetalleVenta nuevoDetalle = new DetalleVenta(cantidad, inventario);

                            for (Sucursal sucursal: listaSucursales){
                                for (Venta venta: sucursal.getListaVentas()){
                                    venta.getListaDetallesVenta().add(nuevoDetalle);
                                    venta1= venta;
                                }
                            }
                            System.out.println("Hecho");
                        }else {
                            System.out.println("No hay suficiente stock disponible.");
                        }
                        break;
                    }
                }
            }
            System.out.println("¿Desea continuar comprando? (1: Sí / 2: No)");
            opcion = sc.nextInt();
        }while (opcion!=2);
        double valorTotal= venta1.calcularValorTotal(cliente);
        System.out.println("Valor total: " + valorTotal);

        System.out.print("Ingrese nuevo código compra: ");
        String codigo= sc.nextLine();

        LocalDate fechaCompra = LocalDate.now();

        Venta nuevaVenta= new Venta(codigo, fechaCompra);
    }

    //Metodo para mostrar sucursal por codigo
    public Sucursal mostrarSucursal(String codigo) {
        Sucursal sucursal1 = null;
        for (Sucursal sucursal : listaSucursales) {
            if (sucursal.getCodigo().equalsIgnoreCase(codigo)) {
                sucursal1 = sucursal;
            }
        }
        return sucursal1;
    }

    //Metodo para consultar prendas agotadas de toda la sucursal
    public List<Prenda> consultarPrendasAgotadas() {
        List<Prenda> prendasAgotadas = new ArrayList<>();
        for (Inventario inventario : listaInventarios) {
            for (Prenda prenda: inventario.getListaPrendas()) {
                if (prenda.getCantidad() == 0) {
                    prendasAgotadas.add(prenda);
                }
            }
        }
        return prendasAgotadas;
    }

}