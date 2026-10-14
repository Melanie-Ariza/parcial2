public abstract class Persona {
    private int documento;
    private String nombre;
    private String correo;
    private String telefono;

    //Constructor
    public Persona(int documento, String nombre, String correo, String telefono) {
        this.documento = documento;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    //GETSET
    public int getDocumento() {return documento;}

    public void setDocumento(int documento) {this.documento = documento;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getCorreo() {return correo;}

    public void setCorreo(String correo) {this.correo = correo;}

    public String getTelefono() {return telefono;}

    public void setTelefono(String telefono) {this.telefono = telefono;}

    //TOSTRING

    @Override
    public String toString() {
        return documento +
                ", nombre: " + nombre +
                ", correo: " + correo +
                ", telefono: " + telefono +
                "";
    }
}

