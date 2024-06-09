package Ejercicio6;

public class Usuario {
    private String nombreUsuario;
    private String nombre;
    private String apellidos;
    private String email = "";
    private int nivelAcceso;

    public String getNombreUsuario() {
        return this.nombreUsuario;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public String getEmail() {
        return this.email;
    }

    public int getNivelAcceso() {
        return this.nivelAcceso;
    }

    public Usuario setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        return this;
    }

    public Usuario setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Usuario setApellidos(String apellidos) {
        this.apellidos = apellidos;
        return this;
    }

    public Usuario setEmail(String email) {
        this.email = email;
        return this;
    }

    public Usuario setNivelAcceso(int nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
        return this;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", nivelAcceso=" + nivelAcceso +
                '}';
    }
}
