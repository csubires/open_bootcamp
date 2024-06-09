package Ejercicio6;

import java.util.ArrayList;

public interface CRUD {
    ArrayList<Usuario> usuarios = null;
    ArrayList<Usuario> recuperarUsuarios(String ficheroDatos);
    void eliminarUsuario(String nombre);
    void anadirUsuario(Usuario usuario);
    Usuario obtenerUsuario(String nombre);
    void guardarUsuarios(String ficheroDatos);
    void showUsuarios();
}
