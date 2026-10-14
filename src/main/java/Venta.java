import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venta {
    private String codigo;
    private LocalDate fechaVenta;

    private List<DetalleVenta> listaDetallesVenta;

    //constructor
    public Venta(String codigo, LocalDate fechaVenta) {
        this.codigo = codigo;
        this.fechaVenta = fechaVenta;

        listaDetallesVenta= new ArrayList<>();
    }

    //get y set
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public List<DetalleVenta> getListaDetallesVenta() {
        return listaDetallesVenta;
    }

    public void setListaDetallesVenta(List<DetalleVenta> listaDetallesVenta) {
        this.listaDetallesVenta = listaDetallesVenta;
    }
    //toStrnig
    @Override
    public String toString() {
        return "Venta\n" +
                "Código: " + codigo +
                ", Fecha venta: " + fechaVenta +
                ", Lista detalles venta=" + listaDetallesVenta;
    }
}
