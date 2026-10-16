import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Empresa empresa = new Empresa("ModaStyle", "123", "Carrera 14");

        // Inventarios
        Inventario inventario1 = new Inventario("579", 10);
        Inventario inventario2 = new Inventario("124", 10);
        Inventario inventario3 = new Inventario("457", 10);

        // Sucursales
        Sucursal sucursal1 = new Sucursal("Mundo telas", "456", "Calle 48", "Armenia", inventario1);
        Sucursal sucursal2 = new Sucursal("Tierra santa", "789", "Carrera 19", "Bogotá", inventario2);
        Sucursal sucursal3 = new Sucursal("Mundo moda", "135", "Calle 50", "Medellín", inventario3);

        empresa.agregarSucursal(sucursal1);
        empresa.agregarSucursal(sucursal2);
        empresa.agregarSucursal(sucursal3);

        // Prendas
        Prenda prenda1 = new Prenda("CM001", "Camisa deportiva", "Nike", 65000, "Negro", 50, Talla.L, CategoriaPrenda.CAMISETA);
        Prenda prenda11 = new Prenda("CM002", "Camisa polo", "Stars", 70000, "Azul rey", 50, Talla.XL, CategoriaPrenda.CAMISETA);
        Prenda prenda2 = new Prenda("PL001", "Pantalon deportiva", "Nike", 65000, "Negro", 50, Talla.XS, CategoriaPrenda.PANTALON);
        Prenda prenda22 = new Prenda("PL002", "Jean Straight", "Arturo calle", 100000, "Gris", 50, Talla.M, CategoriaPrenda.PANTALON);
        Prenda prenda3 = new Prenda("VS001", "Vestido de gala", "Glamour", 150000, "Blanco", 50, Talla.L, CategoriaPrenda.VESTIDO);
        Prenda prenda33 = new Prenda("VS002", "Vestido camisero", "Chevignon", 140000, "Verde", 50, Talla.S, CategoriaPrenda.VESTIDO);
        Prenda prenda4 = new Prenda("CH001", "Chaqueta deportiva", "Adidas", 60000, "Rojo", 50, Talla.L, CategoriaPrenda.CHAQUETA);
        Prenda prenda44 = new Prenda("CH002", "Chaqueta de cuero", "ZARA", 80000, "Negro", 50, Talla.XS, CategoriaPrenda.CHAQUETA);
        Prenda prenda5 = new Prenda("CL001", "tenis deportivos", "Adidas", 90000, "Blanco", 50, Talla.T36, CategoriaPrenda.CALZADO);
        Prenda prenda55 = new Prenda("CL002", "Converse", "Reebok", 170000, "Negro", 50, Talla.T40, CategoriaPrenda.CALZADO);

        // INVENTARIO1: SUCURSAL "Mundo Telas"
        inventario1.getListaPrendas().add(prenda1);
        inventario1.getListaPrendas().add(prenda11);
        inventario1.getListaPrendas().add(prenda2);
        inventario1.getListaPrendas().add(prenda4);

        // INVENTARIO2: SUCURSAL "Tierra Santa"
        inventario2.getListaPrendas().add(prenda44);
        inventario2.getListaPrendas().add(prenda5);
        inventario2.getListaPrendas().add(prenda55);

        // INVENTARIO3: SUCURSAL "Mundo Moda"
        inventario3.getListaPrendas().add(prenda3);
        inventario3.getListaPrendas().add(prenda33);
        inventario3.getListaPrendas().add(prenda22);

        // Clientes
        Cliente cliente1 = new Cliente(6767, "Felipe", "Felipe@gmail.com", "999", "1010", CategoriaCliente.ORO);
        Cliente cliente2 = new Cliente(6868, "Luna", "Luna@gmail.com", "888", "2020", CategoriaCliente.BRONCE);

        empresa.agregarClientes(cliente1);
        empresa.agregarClientes(cliente2);

        // Vendedores
        Vendedor vendedor1 = new Vendedor(5555, "Oscar", "Oscar@empresa.com", "666", "0000", LocalDate.of(2024, 11, 3), 2000000);
        Vendedor vendedor2 = new Vendedor(6666, "Victor", "Victor@empresa.com", "777", "0001", LocalDate.of(2024, 9, 15), 2000000);
        Vendedor vendedor3 = new Vendedor(7777, "Sofia", "Sofia@empresa.com", "888", "0002", LocalDate.of(2023, 12, 20), 2000000);

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
            System.out.println("5. Realizar compra.");
            System.out.println("6. Calcular precio unitario final.");
            System.out.println("7. Mostrar ventas por sucursal.");
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

            switch (opcion) {
                case 1: {
                    System.out.println("======= Registrar prenda =======");
                    System.out.print("Ingrese código de la prenda: ");
                    String codPrenda = sc.nextLine();

                    System.out.print("Ingrese nombre de la prenda: ");
                    String nomPrenda = sc.nextLine();

                    System.out.print("Ingrese marca: ");
                    String marcaPrenda = sc.nextLine();

                    System.out.print("Ingrese precio base unitario: ");
                    double precioPrenda = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Ingrese color: ");
                    String colorPrenda = sc.nextLine();

                    System.out.print("Ingrese cantidad de existencias: ");
                    int cantPrenda = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Seleccione Talla:");
                    System.out.println("1. XS | 2. S | 3. M | 4. L | 5. XL | 6. Calzado (T36) | 7. Calzado (T40)");
                    int opcTalla = sc.nextInt();
                    sc.nextLine();

                    Talla tallaSeleccionada = Talla.M;
                    if (opcTalla == 1) tallaSeleccionada = Talla.XS;
                    else if (opcTalla == 2) tallaSeleccionada = Talla.S;
                    else if (opcTalla == 3) tallaSeleccionada = Talla.M;
                    else if (opcTalla == 4) tallaSeleccionada = Talla.L;
                    else if (opcTalla == 5) tallaSeleccionada = Talla.XL;
                    else if (opcTalla == 6) tallaSeleccionada = Talla.T36;
                    else if (opcTalla == 7) tallaSeleccionada = Talla.T40;

                    System.out.println("Seleccione Categoría de la Prenda:");
                    System.out.println("1. Camiseta | 2. Pantalón | 3. Vestido | 4. Chaqueta | 5. Calzado");
                    int opcCateg = sc.nextInt();
                    sc.nextLine();

                    CategoriaPrenda categoriaPrenda = CategoriaPrenda.CAMISETA;
                    if (opcCateg == 2) categoriaPrenda = CategoriaPrenda.PANTALON;
                    else if (opcCateg == 3) categoriaPrenda = CategoriaPrenda.VESTIDO;
                    else if (opcCateg == 4) categoriaPrenda = CategoriaPrenda.CHAQUETA;
                    else if (opcCateg == 5) categoriaPrenda = CategoriaPrenda.CALZADO;

                    Prenda nuevaPrenda = new Prenda(codPrenda, nomPrenda, marcaPrenda, precioPrenda, colorPrenda, cantPrenda, tallaSeleccionada, categoriaPrenda);
                    System.out.println("Prenda " + nuevaPrenda.getNombre() + " registrada correctamente");
                    break;
                }

                case 2: {
                    System.out.println("======= Registrar cliente o vendedor =======");
                    System.out.println("1. Registrar Cliente");
                    System.out.println("2. Registrar Vendedor");
                    System.out.print("Seleccione opción: ");
                    int tipoReg = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Ingrese número de documento: ");
                    int doc = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Ingrese nombre completo: ");
                    String nom = sc.nextLine();

                    System.out.print("Ingrese correo electrónico: ");
                    String cor = sc.nextLine();

                    System.out.print("Ingrese teléfono: ");
                    String tel = sc.nextLine();

                    if (tipoReg == 1) {
                        System.out.print("Ingrese código de afiliación de cliente: ");
                        String codCli = sc.nextLine();

                        System.out.println("Categoría:\n1. Bronce (5% desc)\n2. Plata (10% desc)\n3. Oro (15% desc)");
                        System.out.print("Seleccione categoría: ");
                        int opcCat = sc.nextInt();
                        sc.nextLine();

                        CategoriaCliente cat = CategoriaCliente.BRONCE;
                        if (opcCat == 2) cat = CategoriaCliente.PLATA;
                        else if (opcCat == 3) cat = CategoriaCliente.ORO;

                        Cliente clienteNuevo = new Cliente(doc, nom, cor, tel, codCli, cat);
                        if (empresa.agregarClientes(clienteNuevo)) {
                            System.out.println("Cliente registrado correctamente");
                        } else {
                            System.out.println("Error: Ya existe un cliente con ese código.");
                        }

                    } else if (tipoReg == 2) {
                        System.out.print("Ingrese código de empleado vendedor: ");
                        String codVen = sc.nextLine();

                        System.out.print("Ingrese salario básico: ");
                        double salario = sc.nextDouble();
                        sc.nextLine();

                        Vendedor vendedorNuevo = new Vendedor(doc, nom, cor, tel, codVen, LocalDate.now(), salario);
                        System.out.println("Vendedor " + vendedorNuevo.getNombre() + " registrado con éxito");
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    break;
                }

                case 3: {
                    System.out.println("======= Registrar inventario en sucursal =======");
                    System.out.print("Ingrese el código de la sucursal (456, 789, 135): ");
                    String codSucInv = sc.nextLine();

                    boolean sucursalEncontrada = false;
                    for (Sucursal sucursal : empresa.getListaSucursales()) {
                        if (sucursal.getCodigo().equalsIgnoreCase(codSucInv)) {
                            sucursalEncontrada = true;

                            System.out.println("Sucursal seleccionada: " + sucursal.getNombre());
                            System.out.print("Ingrese la cantidad de stock a actualizar/sumar: ");
                            int nuevaCantidad = sc.nextInt();
                            sc.nextLine();

                            sucursal.getInventario().setCantidad(nuevaCantidad);
                            System.out.println(">> Stock del inventario actualizado con éxito a " + nuevaCantidad + " unidades.");
                        }
                    }

                    if (!sucursalEncontrada) {
                        System.out.println(">> Error: No existe ninguna sucursal con el código " + codSucInv);
                    }
                    break;
                }

                case 4: {
                    System.out.println("======= Consultar prendas disponibles por sucursal =======");
                    System.out.print("Ingrese el código de la sucursal a consultar (456, 789, 135): ");
                    String codSucConsulta = sc.nextLine();

                    boolean sucursalEncontrada = false;
                    for (Sucursal sucursal : empresa.getListaSucursales()) {
                        if (sucursal.getCodigo().equalsIgnoreCase(codSucConsulta)) {
                            sucursalEncontrada = true;

                            System.out.println("Prendas en la sucursal " + sucursal.getNombre() + " (" + sucursal.getCiudad() + "):");
                            Inventario inv = sucursal.getInventario();

                            System.out.println("Stock general de la sede: " + inv.getCantidad() + " unidades.");

                            if (inv.getListaPrendas().size() == 0) {
                                System.out.println(">> No hay prendas asociadas a este inventario.");
                            } else {
                                for (Prenda prenda : inv.getListaPrendas()) {
                                    System.out.println(" - " + prenda.getNombre() +
                                            " | Ref: " + prenda.getCodigo() +
                                            " | Marca: " + prenda.getMarca() +
                                            " | Cantidad: " + prenda.getCantidad() +
                                            " | Talla: " + prenda.getTalla() +
                                            " | Color: " + prenda.getColor() +
                                            " | Precio: $" + prenda.getPrecioUnitario());
                                }
                            }
                        }
                    }

                    if (!sucursalEncontrada) {
                        System.out.println("Error: No existe ninguna sucursal con el código " + codSucConsulta);
                    }
                    break;
                }

                case 5: {
                    System.out.println("======= Realizar compra =======");
                    System.out.print("Ingrese el documento del cliente: ");
                    int documento = sc.nextInt();
                    sc.nextLine();

                    boolean clienteEncontrado = false;
                    for (Cliente c : empresa.getListaClientes()) {
                        if (c.getDocumento() == documento) {
                            clienteEncontrado = true;
                            System.out.println("Cliente " + c.getNombre() + " listo para realizar la compra.");
                            break;
                        }
                    }

                    if (!clienteEncontrado) {
                        System.out.println("Cliente no encontrado. Debe registrarse antes de comprar.");
                    }
                    break;
                }

                case 6: {
                    System.out.println("======= Calcular precio unitario final =======");

                    System.out.print("Ingrese el documento del cliente: ");
                    int documentoCliente = sc.nextInt();
                    sc.nextLine();

                    boolean clienteEncontrado = false;
                    for (Cliente c : empresa.getListaClientes()) {
                        if (c.getDocumento() == documentoCliente) {
                            clienteEncontrado = true;

                            System.out.println("\nCatálogo de prendas disponibles:");
                            for (Sucursal sucursal : empresa.getListaSucursales()) {
                                for (Prenda prenda : sucursal.getInventario().getListaPrendas()) {
                                    System.out.println(" - [" + prenda.getCodigo() + "] " + prenda.getNombre() +
                                            " | Categoría: " + prenda.getCategoriaPrenda() +
                                            " | Precio Base: $" + prenda.getPrecioUnitario());
                                }
                            }

                            System.out.print("\nIngrese el código de la prenda: ");
                            String codigoPrenda = sc.nextLine();

                            boolean prendaEncontrada = false;
                            for (Sucursal sucursal : empresa.getListaSucursales()) {
                                Inventario inv = sucursal.getInventario();
                                for (Prenda p : inv.getListaPrendas()) {
                                    if (p.getCodigo().equalsIgnoreCase(codigoPrenda)) {
                                        prendaEncontrada = true;

                                        System.out.print("Ingrese la cantidad solicitada: ");
                                        int cantidadSolicitada = sc.nextInt();
                                        sc.nextLine();

                                        DetalleVenta detalleVenta = new DetalleVenta(cantidadSolicitada, inv);
                                        double valorUnitarioFinal = detalleVenta.calcularValorUnitarioFinal(c, p);

                                        System.out.println("\n================ RESUMEN DE CÁLCULO ================");
                                        System.out.println("Cliente: " + c.getNombre() + " (Categoría: " + c.getCategoria() + ")");
                                        System.out.println("Prenda: " + p.getNombre() + " (" + p.getCategoriaPrenda() + ")");
                                        System.out.println("Precio base: $" + p.getPrecioUnitario());
                                        System.out.println("Precio unitario final: $" + valorUnitarioFinal);
                                        System.out.println("Subtotal para " + cantidadSolicitada + " unidades: $" + (valorUnitarioFinal * cantidadSolicitada));
                                        System.out.println("====================================================");
                                        break;
                                    }
                                }
                                if (prendaEncontrada) {
                                    break;
                                }
                            }

                            if (!prendaEncontrada) {
                                System.out.println(">> Error: No se encontró ninguna prenda con el código " + codigoPrenda);
                            }
                            break;
                        }
                    }

                    if (!clienteEncontrado) {
                        System.out.println(">> Error: Cliente no encontrado con el documento " + documentoCliente);
                    }
                    break;
                }

                case 7: {
                    System.out.println("======= Mostrar ventas por sucursal =======");

                    System.out.print("Ingrese el código de la sucursal a consultar (456, 789, 135): ");
                    String codSucVentas = sc.nextLine();

                    boolean sucursalEncontrada = false;

                    for (Sucursal sucursal : empresa.getListaSucursales()) {
                        if (sucursal.getCodigo().equalsIgnoreCase(codSucVentas)) {
                            sucursalEncontrada = true;
                            System.out.println("\n--- Historial de Ventas en: " + sucursal.getNombre() + " (" + sucursal.getCiudad() + ") ---");

                            boolean hayVentasEnSucursal = false;

                            for (Vendedor vendedor : sucursal.getListaVendedores()) {
                                if (vendedor.getListaVendedorVentas().size() > 0) {
                                    hayVentasEnSucursal = true;
                                    System.out.println("Vendedor: " + vendedor.getNombre() + " (Código: " + vendedor.getCodigo() + ")");

                                    for (Venta venta : vendedor.getListaVendedorVentas()) {
                                        System.out.println("  - Código Venta: " + venta.getCodigo() +
                                                " | Fecha: " + venta.getFechaVenta() +
                                                " | Detalles: " + venta.getListaDetallesVenta().size() + " producto(s)");
                                    }
                                }
                            }

                            if (!hayVentasEnSucursal) {
                                System.out.println(">> Esta sucursal aún no tiene ventas registradas.");
                            }
                        }
                    }

                    if (!sucursalEncontrada) {
                        System.out.println(">> Error: Sucursal no encontrada con el código " + codSucVentas);
                    }
                    break;
                }

                case 8: {
                    System.out.println("======= Consultar prendas agotadas =======");

                    boolean hayAgotadas = false;
                    for (Sucursal sucursal : empresa.getListaSucursales()) {
                        for (Prenda prenda : sucursal.getInventario().getListaPrendas()) {
                            if (prenda.getCantidad() == 0) {
                                hayAgotadas = true;
                                System.out.println(" - " + prenda.getNombre() + " [" + prenda.getCodigo() + "] en " + sucursal.getNombre() + " | Stock: 0");
                            }
                        }
                    }

                    if (!hayAgotadas) {
                        System.out.println(">> No hay prendas agotadas en el sistema.");
                    }
                    break;
                }

                case 9: {
                    System.out.println("======= Consultar ventas por vendedor =======");
                    System.out.print("Ingrese el código del vendedor: ");
                    String codigoVendedor = sc.nextLine();

                    boolean vendedorEncontrado = false;

                    for (Sucursal sucursal : empresa.getListaSucursales()) {
                        for (Vendedor vendedor : sucursal.getListaVendedores()) {
                            if (vendedor.getCodigo().equalsIgnoreCase(codigoVendedor)) {
                                vendedorEncontrado = true;
                                System.out.println("Vendedor: " + vendedor.getNombre());

                                if (vendedor.getListaVendedorVentas().size() > 0) {
                                    System.out.println("Ventas realizadas:");
                                    for (Venta venta : vendedor.getListaVendedorVentas()) {
                                        System.out.println(venta);
                                    }
                                } else {
                                    System.out.println("El vendedor no tiene ventas registradas");
                                }
                                break;
                            }
                        }
                        if (vendedorEncontrado) {
                            break;
                        }
                    }

                    if (!vendedorEncontrado) {
                        System.out.println("El Vendedor no existe");
                    }
                    break;
                }

                case 10: {
                    System.out.println("======= Consultar compras por cliente =======");
                    System.out.print("Ingrese el código del cliente: ");
                    String codigoCliente = sc.nextLine();

                    boolean clienteEncontrado = false;

                    for (Cliente cliente : empresa.getListaClientes()) {
                        if (cliente.getCodigo().equalsIgnoreCase(codigoCliente)) {
                            clienteEncontrado = true;
                            System.out.println("Cliente: " + cliente.getNombre());

                            if (cliente.getListaCompras().size() > 0) {
                                System.out.println("Historial de compras:");
                                for (Venta venta : cliente.getListaCompras()) {
                                    System.out.println(venta);
                                    System.out.println("Monto total: $" + venta.calcularValorTotal(cliente));
                                }
                            } else {
                                System.out.println("El cliente no ha realizado compras.");
                            }
                            break;
                        }
                    }

                    if (!clienteEncontrado) {
                        System.out.println("El cliente no existe.");
                    }
                    break;
                }

                case 11: {
                    System.out.println("======= Calcular ingresos totales por sucursal =======");
                    System.out.print("Ingrese el código de la sucursal: ");
                    String codigoSucursal = sc.nextLine();

                    boolean sucursalEncontrada = false;

                    for (Sucursal sucursal : empresa.getListaSucursales()) {
                        if (sucursal.getCodigo().equalsIgnoreCase(codigoSucursal)) {
                            sucursalEncontrada = true;
                            double ingresosTotales = 0.0;

                            for (Vendedor vendedor : sucursal.getListaVendedores()) {
                                for (Venta venta : vendedor.getListaVendedorVentas()) {
                                    for (Cliente cliente : empresa.getListaClientes()) {
                                        for (Venta compraCliente : cliente.getListaCompras()) {
                                            if (compraCliente.getCodigo().equalsIgnoreCase(venta.getCodigo())) {
                                                ingresosTotales += venta.calcularValorTotal(cliente);
                                            }
                                        }
                                    }
                                }
                            }

                            System.out.println("Sucursal: " + sucursal.getNombre());
                            System.out.println("Ingresos totales: $" + ingresosTotales);
                            break;
                        }
                    }

                    if (!sucursalEncontrada) {
                        System.out.println("La sucursal no existe.");
                    }
                    break;
                }

                case 12: {
                    System.out.println("======= Consultar prenda más vendida =======");
                    System.out.println("Analizando ventas del sistema...");

                    boolean existenVentas = false;
                    for (Sucursal sucursal : empresa.getListaSucursales()) {
                        for (Vendedor vendedor : sucursal.getListaVendedores()) {
                            if (vendedor.getListaVendedorVentas().size() > 0) {
                                existenVentas = true;
                                break;
                            }
                        }
                    }

                    if (!existenVentas) {
                        System.out.println("No se han registrado ventas en el sistema.");
                    } else {
                        System.out.println("Consulta de prenda más vendida completada.");
                    }
                    break;
                }

                case 13: {
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

                    Inventario nuevoInventario = new Inventario(codigoInventario, cantidadInventario);
                    Sucursal nuevaSucursal = new Sucursal(nombreSucursal, codSucursal, direccionSucursal, ciudadSucursal, nuevoInventario);

                    if (empresa.agregarSucursal(nuevaSucursal)) {
                        System.out.println("Sucursal registrada exitosamente.");
                    } else {
                        System.out.println("No se pudo registrar la sucursal (Código de sucursal ya existente)");
                    }
                    break;
                }

                default:
                    System.out.println("Proceso finalizado, muchas gracias.");
                    break;
            }
        } while (opcion != 0);
    }
}