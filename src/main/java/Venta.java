import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venta {
    private String codigo;
    private LocalDate fechaCompra;
    private List<DetalleVenta> listaDetallesVenta;

    public Venta(String codigo, LocalDate fechaCompra) {
        this.codigo = codigo;
        this.fechaCompra = fechaCompra;

        listaDetallesVenta= new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public List<DetalleVenta> getListaDetallesVenta() {
        return listaDetallesVenta;
    }

    public void setListaDetallesVenta(List<DetalleVenta> listaDetallesVenta) {
        this.listaDetallesVenta = listaDetallesVenta;
    }

    @Override
    public String toString() {
        return "Venta\n" +
                "Código:" + codigo +
                ",  Fecha compra:" + fechaCompra +
                ",  Detalles venta:" + listaDetallesVenta;
    }
}
