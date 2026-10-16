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
    public void comenzarCompra(Cliente cliente) {
        Scanner sc = new Scanner(System.in);

        if (listaSucursales.isEmpty()) {
            System.out.println("No hay sucursales registradas.");
            return;
        }

        // 1. Seleccionar la sucursal donde se realiza la compra
        System.out.println("--- Seleccione la Sucursal ---");
        for (int i = 0; i < listaSucursales.size(); i++) {
            Sucursal suc = listaSucursales.get(i);
            System.out.println((i + 1) + ". " + suc.getNombre() + " (" + suc.getCiudad() + ")");
        }
        System.out.print("Ingrese el número de la sucursal: ");
        int opcionSucursal = sc.nextInt();
        sc.nextLine();

        if (opcionSucursal < 1 || opcionSucursal > listaSucursales.size()) {
            System.out.println("Opción de sucursal inválida.");
            return;
        }

        Sucursal sucursalSeleccionada = listaSucursales.get(opcionSucursal - 1);
        Inventario inventarioSucursal = sucursalSeleccionada.getInventario();

        // 2. Registrar/Validar el Vendedor atendiendo la compra
        if (sucursalSeleccionada.getListaVendedores().isEmpty()) {
            System.out.println("Error: Esta sucursal no tiene vendedores registrados.");
            return;
        }

        System.out.println("\n--- Vendedores Disponibles en la Sucursal ---");
        for (Vendedor v : sucursalSeleccionada.getListaVendedores()) {
            System.out.println(" - " + v.getNombre() + " (Código: " + v.getCodigo() + ")");
        }

        System.out.print("Ingrese el código del vendedor que atiende la compra: ");
        String codigoVendedor = sc.nextLine();

        Vendedor vendedorAtendiendo = null;
        for (Vendedor v : sucursalSeleccionada.getListaVendedores()) {
            if (v.getCodigo().equalsIgnoreCase(codigoVendedor)) {
                vendedorAtendiendo = v;
                break;
            }
        }

        if (vendedorAtendiendo == null) {
            System.out.println("Error: El vendedor con código '" + codigoVendedor + "' no pertenece a esta sucursal.");
            return;
        }

        // 3. Pedir el código de compra e instanciar la Venta
        System.out.print("Ingrese el código para la nueva compra: ");
        String codigoVenta = sc.nextLine();

        Venta nuevaVenta = new Venta(codigoVenta, LocalDate.now());
        nuevaVenta.setVendedor(vendedorAtendiendo); // Asociar vendedor a la venta

        int opcion = 1;

        do {
            System.out.println("\n--- Catálogo de Prendas Disponibles ---");
            for (Prenda prenda : inventarioSucursal.getListaPrendas()) {
                System.out.println(prenda);
            }

            System.out.print("\nIngrese el código de prenda que desea comprar: ");
            String codigoPrenda = sc.nextLine();

            Prenda prendaEncontrada = null;
            for (Prenda prenda : inventarioSucursal.getListaPrendas()) {
                if (prenda.getCodigo().equalsIgnoreCase(codigoPrenda)) {
                    prendaEncontrada = prenda;
                    break;
                }
            }

            if (prendaEncontrada != null) {
                System.out.print("¿Qué cantidad desea?: ");
                int cantidad = sc.nextInt();
                sc.nextLine();

                if (prendaEncontrada.validarStock(cantidad)) {
                    prendaEncontrada.reducirStock(cantidad);

                    DetalleVenta nuevoDetalle = new DetalleVenta(cantidad, inventarioSucursal);
                    nuevaVenta.getListaDetallesVenta().add(nuevoDetalle);

                    System.out.println(">> Producto añadido al carrito correctamente.");
                } else {
                    System.out.println(">> No hay suficiente stock disponible.");
                }
            } else {
                System.out.println(">> El código de prenda ingresado no existe en esta sucursal.");
            }

            System.out.print("\n¿Desea continuar comprando? (1: Sí / 2: No): ");
            opcion = sc.nextInt();
            sc.nextLine();

        } while (opcion != 2);

        // 4. Finalizar venta y registrar en Sucursal, Cliente y Vendedor
        if (!nuevaVenta.getListaDetallesVenta().isEmpty()) {
            double valorTotal = nuevaVenta.calcularValorTotal(cliente);
            System.out.println("\n=================================");
            System.out.println("Compra realizada con éxito.");
            System.out.println("Cliente: " + cliente.getNombre());
            System.out.println("Vendedor: " + vendedorAtendiendo.getNombre());
            System.out.println("Valor Total a Pagar: $" + valorTotal);
            System.out.println("=================================");

            // Guardar la venta en las 3 referencias clave:
            sucursalSeleccionada.agregarVenta(nuevaVenta);
            cliente.agregarCompra(nuevaVenta);
            vendedorAtendiendo.getListaVendedorVentas().add(nuevaVenta); // Habilita el caso 9
        } else {
            System.out.println("No se agregaron productos. Compra cancelada.");
        }
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
//sasa