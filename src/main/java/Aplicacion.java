import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacion {
    static void main() {
        Scanner sc= new Scanner(System.in);

        Empresa empresa= new Empresa("ModaStyle", "123", "Carrera 14");

        //Inventarios
        Inventario inventario1= new Inventario("579", 10);
        Inventario inventario2= new Inventario("124", 10);
        Inventario inventario3= new Inventario("457", 10);


        //Sucursales
        Sucursal sucursal1= new Sucursal("Mundo telas", "456", "Calle 48", "Armenia", inventario1);
        Sucursal sucursal2= new Sucursal("Tierra santa", "789", "Carrera 19", "Bogotá", inventario2);
        Sucursal sucursal3= new Sucursal("Mundo moda", "135", "Calle 50", "Medellín", inventario3);

        empresa.agregarSucursal(sucursal1);
        empresa.agregarSucursal(sucursal2);
        empresa.agregarSucursal(sucursal3);


        //Prendas
        Prenda prenda1= new Prenda("CM001","Camisa deportiva", "Nike", 65000,"Negro",50,Talla.L,CategoriaPrenda.CAMISETA);
        Prenda prenda11= new Prenda("CM002","Camisa polo", "Stars", 70000,"Azul rey",50,Talla.XL,CategoriaPrenda.CAMISETA);
        Prenda prenda2= new Prenda("PL001","Pantalon deportiva", "Nike", 65000,"Negro",50,Talla.XS,CategoriaPrenda.PANTALON);
        Prenda prenda22= new Prenda("PL002","Jean Straight", "Arturo calle", 100000,"Gris",50,Talla.M,CategoriaPrenda.PANTALON);
        Prenda prenda3= new Prenda("VS001","Vestido de gala", "Glamour", 150000,"Blanco",50,Talla.L,CategoriaPrenda.VESTIDO);
        Prenda prenda33= new Prenda("VS002","Vestido camisero", "Chevignon", 140000,"Verde",50,Talla.S,CategoriaPrenda.VESTIDO);
        Prenda prenda4= new Prenda("CH001","Chaqueta deportiva", "Adidas", 60000,"Rojo",50,Talla.L,CategoriaPrenda.CHAQUETA);
        Prenda prenda44= new Prenda("CH002","Chaqueta de cuero", "ZARA", 80000,"Negro",50,Talla.XS,CategoriaPrenda.CHAQUETA);
        Prenda prenda5= new Prenda("CL001","tenis deportivos", "Adidas", 90000,"Blanco",50,Talla.T36,CategoriaPrenda.CALZADO);
        Prenda prenda55= new Prenda("CL002","Converse", "Reebok", 170000,"Negro",50,Talla.T40,CategoriaPrenda.CALZADO);

        //INVENTARIO1: SUCURSAL "Mundo Telas" (Ropa Casual y deportiva)
        inventario1.getListaPrendas().add(prenda1);   // Camisa deportiva Nike
        inventario1.getListaPrendas().add(prenda11);  // Camisa polo Stars
        inventario1.getListaPrendas().add(prenda2);   // Pantalón deportivo Nike
        inventario1.getListaPrendas().add(prenda4);   // Chaqueta deportiva Adidas

        //INVENTARIO2: SUCURSAL "Tierra Santa" (Calzado y chaquetas)
        inventario2.getListaPrendas().add(prenda44);  // Chaqueta de cuero ZARA
        inventario2.getListaPrendas().add(prenda5);   // Tenis deportivos Adidas
        inventario2.getListaPrendas().add(prenda55);  // Converse Reebok

        //INVENTARIO3: SUCURSAL "Mundo Moda" (Elegante y formal)
        inventario3.getListaPrendas().add(prenda3);   // Vestido de gala Glamour
        inventario3.getListaPrendas().add(prenda33);  // Vestido camisero Chevignon
        inventario3.getListaPrendas().add(prenda22);  // Jean Straight Arturo Calle


        //Clientes
        Cliente cliente1= new Cliente(6767,"Felipe", "Felipe@gmail.com", "999", "1010",CategoriaCliente.ORO);
        Cliente cliente2= new Cliente(6868,"Luna", "Luna@gmail.com", "888", "2020",CategoriaCliente.BRONCE);

        empresa.agregarClientes(cliente1);
        empresa.agregarClientes(cliente2);


        //Vendedores
        Vendedor vendedor1= new Vendedor(5555,"Oscar","Oscar@empresa.com","666","0000", LocalDate.of(2024, 11, 3),2000000);
        Vendedor vendedor2= new Vendedor(6666,"Victor","Victor@empresa.com","777","0001", LocalDate.of(2024, 9, 15),2000000);
        Vendedor vendedor3= new Vendedor(7777,"Sofia","Sofia@empresa.com","888","0002", LocalDate.of(2023, 12, 20),2000000);

        sucursal1.getListaVendedores().add(vendedor1);
        sucursal2.getListaVendedores().add(vendedor2);
        sucursal3.getListaVendedores().add(vendedor3);

        int opcion;
        do {
            System.out.println("======= MODASTYLE =======");
            System.out.println("1. Registrar prenda.");
            System.out.println("2. Registrar cliente o vendedor.");
            System.out.println("3. Registrar inventario en sucursal.");
            System.out.println("4. Consultar prendas disponibles por sucursal.");
            System.out.println("5. Registrar venta.");
            System.out.println("6. Calcular precio unitario final.");
            System.out.println("7. Calcular valor total de una venta.");
            System.out.println("8. Consultar prendas agotadas.");
            System.out.println("9. Consultar ventas por vendedor.");
            System.out.println("10. Consultar compras por cliente.");
            System.out.println("11. Calcular ingresos totales por sucursal.");
            System.out.println("12. Consultar prenda más vendida.");
            System.out.println("13. Registrar sucursal.");
            System.out.println("0. Salir.");

            System.out.print("Ingrese una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("======= Registrar prenda =======");
                    break;
                case 2:
                    System.out.println("======= Registrar cliente o vendedor =======");
                    break;
                case 3:
                    System.out.println("======= Registrar inventario en sucursal =======");
                    break;
                case 4:
                    System.out.println("======= Consultar prendas disponibles por sucursal =======");
                    break;
                case 5:
                    System.out.println("======= Registrar venta =======");
                    break;
                case 6:
                    System.out.println("======= Calcular precio unitario final =======");
                    break;
                case 7:
                    System.out.println("======= Calcular valor total de una venta =======");
                    break;
                case 8:
                    System.out.println("======= Consultar prendas agotadas =======");
                    break;
















































































































































































































































































































































































































































































































































































































































































































































































































































































































                case 9:
                    System.out.println("======= Consultar ventas por vendedor =======");
                    System.out.print("Ingrese el código del vendedor: ");
                    String codigoVendedor = sc.nextLine();

                    boolean vendedorEncontrado = false;
                    Vendedor vendedorSeleccionado = null;

                    // Buscar el vendedor en las sucursales
                    for (Sucursal sucursal : empresa.getListaSucursales()) {
                        for (Vendedor vendedor : sucursal.getListaVendedores()) {
                            if (vendedor.getCodigo().equalsIgnoreCase(codigoVendedor)) {
                                vendedorEncontrado = true;
                                vendedorSeleccionado = vendedor;
                                break;
                            }
                        }
                        if (vendedorEncontrado) {
                            break;
                        }
                    }

                    if (vendedorEncontrado) {
                        System.out.println("Vendedor: " + vendedorSeleccionado.getNombre());

                        // Verificación manual de si la lista tiene elementos
                        boolean tieneVentas = false;
                        for (Venta venta : vendedorSeleccionado.getListaVendedorVentas()) {
                            tieneVentas = true;
                            break;
                        }

                        if (tieneVentas = true) {
                            System.out.println("Ventas realizadas:");
                            for (Venta venta : vendedorSeleccionado.getListaVendedorVentas()) {
                                System.out.println(venta);
                            }
                        } else {
                            System.out.println("El vendedor no tiene ventas registradas");
                        }
                    } else {
                        System.out.println("El Vendedor no existe");
                    }
                    break;


                case 10:
                    System.out.println("======= Consultar compras por cliente =======");
                    System.out.print("Ingrese el código del cliente: ");
                    String codigoCliente = sc.nextLine();

                    boolean clienteEncontrado = false;
                    Cliente clienteSeleccionado = null;

                    // Buscar cliente
                    for (Cliente cliente : empresa.getListaClientes()) {
                        if (cliente.getCodigo().equalsIgnoreCase(codigoCliente)) {
                            clienteEncontrado = true;
                            clienteSeleccionado = cliente;
                            break;
                        }
                    }

                    if (clienteEncontrado) {
                        System.out.println("Cliente: " + clienteSeleccionado.getNombre());

                        // Verificar si la lista tiewane elementos
                        boolean tieneCompras = false;
                        for (Venta venta : clienteSeleccionado.getListaCompras()) {
                            tieneCompras = true;
                            break;
                        }

                        if (tieneCompras) {
                            System.out.println("Historial de compras:");
                            for (Venta venta : clienteSeleccionado.getListaCompras()) {
                                System.out.println(venta);
                                System.out.println("Monto total: $" + venta.calcularValorTotal(clienteSeleccionado));
                            }
                        } else {
                            System.out.println("El cliente no ha realizado compras.");
                        }
                    } else {
                        System.out.println("El cliente no existe.");
                    }
                    break;


                case 11:
                    System.out.println("======= Calcular ingresos totales por sucursal =======");
                    System.out.print("Ingrese el código de la sucursal: ");
                    String codigoSucursal = sc.nextLine();

                    boolean sucursalEncontrada = false;
                    Sucursal sucursalSeleccionada = null;

                    // Buscar la sucursal
                    for (Sucursal sucursal : empresa.getListaSucursales()) {
                        if (sucursal.getCodigo().equalsIgnoreCase(codigoSucursal)) {
                            sucursalEncontrada = true;
                            sucursalSeleccionada = sucursal;
                            break;
                        }
                    }

                    if (sucursalEncontrada) {
                        double ingresosTotales = 0.0;

                        for (Venta venta : sucursalSeleccionada.getListaVentas()) {
                            boolean clienteCalculado = false;

                            // Buscar q cliente hizo esta venta para aplicar descuento
                            for (Cliente cliente : empresa.getListaClientes()) {
                                for (Venta compraCliente : cliente.getListaCompras()) {
                                    if (compraCliente.getCodigo().equalsIgnoreCase(venta.getCodigo())) {
                                        ingresosTotales += venta.calcularValorTotal(cliente);
                                        clienteCalculado = true;
                                        break;
                                    }
                                }
                                if (clienteCalculado) {
                                    break;
                                }
                            }

                            // Si la venta no pertenece a ningun cliente de la lista, sumar el valor base sin descuento
                            if (!clienteCalculado) {
                                for (DetalleVenta detalleVenta : venta.getListaDetallesVenta()) {
                                    for (Prenda prenda : detalleVenta.getItemInventario().getListaPrendas()) {
                                        double precioConRecargo = prenda.getPrecioUnitario() + prenda.calcularSobrecargo();
                                        ingresosTotales += precioConRecargo * detalleVenta.getCantidad();
                                    }
                                }
                            }
                        }

                        System.out.println("Sucursal: " + sucursalSeleccionada.getNombre());
                        System.out.println("Ingresos totales: $" + ingresosTotales);
                    } else {
                        System.out.println("La sucural no existe.");
                    }
                    break;


                case 12:
                    // 1. Obtener todas las prendas del sistema con una lista
                    List<Prenda> prendasExistentes = new ArrayList<>();

                    for (Sucursal sucursal : empresa.getListaSucursales()) {
                        for (Venta venta : sucursal.getListaVentas()) {
                            for (DetalleVenta detalleVenta : venta.getListaDetallesVenta()) {
                                for (Prenda prenda : detalleVenta.getItemInventario().getListaPrendas()) {

                                    // Verificar si la prenda ya está en la lista
                                    boolean yaExisteEnLista = false;
                                    for (Prenda registrada : prendasExistentes) {
                                        if (registrada.getCodigo().equalsIgnoreCase(prenda.getCodigo())) {
                                            yaExisteEnLista = true;
                                            break;
                                        }
                                    }

                                    // Si no está, se agrega
                                    if (!yaExisteEnLista) {
                                        prendasExistentes.add(prenda);
                                    }
                                }
                            }
                        }
                    }

                    // 2. Verificar si hay prwndas vendidas
                    boolean existenVentas = false;
                    for (Prenda prenda : prendasExistentes) {
                        existenVentas = true;
                        break;
                    }

                    if (existenVentas) {
                        Prenda prendaMasVendida = null;
                        int maxCantidad = -1;

                        // 3. Para cada prenda se suman las cantidades vendidas en todas las sucursales
                        for (Prenda prenda : prendasExistentes) {
                            int totalVentasPrendaActual = 0;

                            for (Sucursal sucursal : empresa.getListaSucursales()) {
                                for (Venta venta : sucursal.getListaVentas()) {
                                    for (DetalleVenta detalleVenta : venta.getListaDetallesVenta()) {
                                        for (Prenda prendaDetalle : detalleVenta.getItemInventario().getListaPrendas()) {
                                            if (prendaDetalle.getCodigo().equalsIgnoreCase(prenda.getCodigo())) {
                                                totalVentasPrendaActual += detalleVenta.getCantidad();
                                            }
                                        }
                                    }
                                }
                            }

                            // Comparar si esta prenda supera el récord máximo q ya hay
                            if (totalVentasPrendaActual > maxCantidad) {
                                maxCantidad = totalVentasPrendaActual;
                                prendaMasVendida = prenda;
                            }
                        }

                        System.out.println("Prenda más vendida: " + prendaMasVendida.getNombre() + ", Código: " + prendaMasVendida.getCodigo());
                        System.out.println("Unidades vendidas: " + maxCantidad);

                    } else {
                        System.out.println("No se han registrado ventas en el sistema.");
                    }
                    break;
                case 13:
                    System.out.println("======= Registrar sucursal =======");

                    System.out.print("Ingrese el nombre de la sucursal: ");
                    String nombreSucursal = sc.nextLine();

                    System.out.print("Ingrese el código de la sucursal: ");
                    String codSucursal = sc.nextLine();

                    System.out.print("Ingrese la dirección: ");
                    String direccionSucursal = sc.nextLine();

                    System.out.print("Ingrese la ciudad: ");
                    String ciudadSucursal = sc.nextLine();

                    System.out.print("Ingrese el código para el inventario: ");
                    String codigoInventario = sc.nextLine();

                    System.out.print("Ingrese la cantidad inicial del inventario: ");
                    int cantidadInventario = sc.nextInt();
                    sc.nextLine();

                    // Instanciar objetos
                    Inventario nuevoInventario = new Inventario(codigoInventario, cantidadInventario);
                    Sucursal nuevaSucursal = new Sucursal(nombreSucursal, codSucursal, direccionSucursal, ciudadSucursal, nuevoInventario);

                    boolean sucursalRegistrada = empresa.agregarSucursal(nuevaSucursal);

                    if (sucursalRegistrada) {
                        System.out.println("Sucursal registrada exitosamente.");
                    } else {
                        System.out.println("No se pudo registrar la sucursal (Código de sucursal yw existente)");
                    }
                    break;
                default:
                    System.out.println("Proceso finalizado, muchas gracias.");
                    break;
            }
        }while (opcion!=0);
    }
}
