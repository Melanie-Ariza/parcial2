import java.util.Scanner;

public class Sucursales {
    private String nombre;
    private String codigo;
    private String direccion;
    private String ciudad;

    //Relacion sucursal inventario
    private Inventario inventario;

    //Constructor
    public Sucursales(String nombre, String codigo, String direccion, String ciudad, Inventario inventario) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.inventario = inventario;
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

    //tostring

    @Override
    public String toString() {
        return "Sucursales\n" +
                "Nombre: " + nombre +
                ", Código: " + codigo +
                ", Dirección: " + direccion +
                ", Ciudad: " + ciudad +
                ", Inventario: " + inventario;
    }

    //Metodo para verificar si existe un inventario en la sucursal
    public boolean verificarInventario(String codigo){
        boolean existe= false;
        if (inventario.getCodigo().equalsIgnoreCase(codigo)){
            existe= true;
        }
        return existe;
    }

    //Metodo para crear un inventario
    public void crearInventario(boolean existe){
        Scanner sc= new Scanner(System.in);
        boolean creado= false;
        if (!existe){
            System.out.print("Código nuevo inventario: ");
            String codigo= sc.nextLine();

            System.out.print("Cantidad nuevo inventario: ");
            int cantidad= sc.nextInt();
            sc.nextLine();

            Inventario inventario= new Inventario(codigo, cantidad);

            System.out.println("Inventario creado correctamente");
        }else {
            System.out.println("Inventario ya existente.");
        }
    }

}
