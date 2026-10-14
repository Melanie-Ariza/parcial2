import java.time.LocalDate;

public class Vendedor extends Persona {
    private String codigo;
    private LocalDate fechaContrato;
    private double salario;

    public Vendedor(int documento, String nombre, String correo, String telefono, String codigo, LocalDate fechaContrato, double salario) {
        super(documento, nombre, correo, telefono);
        this.codigo = codigo;
        this.fechaContrato = fechaContrato;
        this.salario = salario;
    }

    //GETSET
    public String getCodigo() {return codigo;}

    public void setCodigo(String codigo) {this.codigo = codigo;}

    public LocalDate getFechaContrato() {return fechaContrato;}

    public void setFechaContrato(LocalDate fechaContrato) {this.fechaContrato = fechaContrato;}

    public double getSalario() {return salario;}

    public void setSalario(double salario) {this.salario = salario;}

    //TOSTRING
    @Override
    public String toString() {
        return "Vendedor=" +
                "documento: " + getDocumento() +
                ", nombre: " + getNombre() +
                ", codigo: " + codigo +
                ", fechaContrato: " + fechaContrato +
                ", salario: " + salario;

    }
}


