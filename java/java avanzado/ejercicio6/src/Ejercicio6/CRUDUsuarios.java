package Ejercicio6;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class CRUDUsuarios implements CRUD {

    ArrayList<Usuario> usuarios;


    public CRUDUsuarios() {
        usuarios = new ArrayList();
    }


    @Override
    public ArrayList<Usuario> recuperarUsuarios (String ficheroDatos) {

        try {
            Scanner scanner = new Scanner(new File(ficheroDatos));

            while (scanner.hasNext()) {
                String usuarioActual = scanner.next();
                String []partes = usuarioActual.split(",");

                Usuario usuario = new Usuario()
                        .setNombreUsuario(partes[0])
                        .setNombre(partes[1])
                        .setApellidos(partes[2])
                        .setEmail(partes[3])
                        .setNivelAcceso(Integer.parseInt(partes[4]));
                usuarios.add(usuario);
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Error al leer archivo de usuarios");
        }

        return usuarios;

    }


    @Override
    public void eliminarUsuario(String nombre) {
        int index = 0;
        for (Usuario unUsuario: usuarios) {
            if (unUsuario.getNombre().equalsIgnoreCase(nombre)) {
                usuarios.remove(index);
                break;
            }
            index++;
        }
    }

    @Override
    public void anadirUsuario(Usuario usuario) {
        if (obtenerUsuario(usuario.getNombre()) == null) {
            usuarios.add(usuario);
        } else {
            System.out.println("Usuario ya existe");
        }

    }

    @Override
    public Usuario obtenerUsuario(String nombre) {
        for (Usuario unUsuario: usuarios) {
            if (unUsuario.getNombre().equalsIgnoreCase(nombre)) {
                return unUsuario;
            }
        }
        return null;
    }

    @Override
    public void guardarUsuarios(String ficheroDatos) {
        try {
            PrintStream printStream = new PrintStream(ficheroDatos);
            for (Usuario unUsuario: usuarios) {
                    printStream.println(unUsuario.getNombreUsuario() + ","
                            + unUsuario.getNombre() + ","
                            + unUsuario.getApellidos() + ","
                            + unUsuario.getEmail() + ","
                            + unUsuario.getNivelAcceso());
            }

        } catch (Exception e) {
            System.out.println("Error al guardar usuario en el archivo " + ficheroDatos);
        }
    }

    @Override
    public void showUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
}
