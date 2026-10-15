import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Persona {
    private String codigo;
    private LocalDate fechaContrato;
    private double salario;

    private List<Venta> listaVendedorVentas;

    public Vendedor(int documento, String nombre, String correo, String telefono, String codigo, LocalDate fechaContrato, double salario) {
        super(documento, nombre, correo, telefono);
        this.codigo = codigo;
        this.fechaContrato = fechaContrato;
        this.salario = salario;

        listaVendedorVentas= new ArrayList<>();
    }

    //GETSET
    public String getCodigo() {return codigo;}

    public void setCodigo(String codigo) {this.codigo = codigo;}

    public LocalDate getFechaContrato() {return fechaContrato;}

    public void setFechaContrato(LocalDate fechaContrato) {this.fechaContrato = fechaContrato;}

    public double getSalario() {return salario;}

    public void setSalario(double salario) {this.salario = salario;}

    public List<Venta> getListaVendedorVentas() {
        return listaVendedorVentas;
    }

    public void setListaVendedorVentas(List<Venta> listaVendedorVentas) {
        this.listaVendedorVentas = listaVendedorVentas;
    }

    //TOSTRING
    @Override
    public String toString() {
        return "Vendedor: " + super.toString() +
                ", documento: " + getDocumento() +
                ", nombre: " + getNombre() +
                ", codigo: " + codigo +
                ", fechaContrato: " + fechaContrato +
                ", salario: " + salario+
                ", Lista ventas: "+ listaVendedorVentas;

    }

    //Metodos
    // 1. Verificar Venta
    public boolean verificarVenta(String codigo) {
        boolean verificado = false;
        for (Venta venta : listaVendedorVentas) {
            if (venta.getCodigo().equalsIgnoreCase(codigo)) {
                verificado = true;
                break;
            }
        }
        return verificado;
    }

    // 2. Crear Venta
    public boolean crearVenta(Venta venta) {
        boolean ventaCreada = false;
        boolean ventaVerificada = verificarVenta(venta.getCodigo());

        if (!ventaVerificada) {
            listaVendedorVentas.add(venta);
            ventaCreada = true;
        }

        return ventaCreada;
    }
}


