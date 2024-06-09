

// MODIFICACIÓN DEL EJERCICIO INICIAL PROPUESTO PARA LIMPIEZA

import Ejercicio6.CRUDUsuarios;
import Ejercicio6.Usuario;



public class Main {
    public static void main(String []args) {
        String FICHERO_DATOS = "usuarios.txt";

        if (args.length > 0)
            FICHERO_DATOS = args[0] + ".txt";

        Usuario usuario1 = new Usuario()
                .setNombreUsuario("openbootcamp")
                .setNombre("Open")
                .setApellidos("Bootcamp")
                .setEmail("ejemplos@open-bootcamp.com")
                .setNivelAcceso(10);

        Usuario usuario2 = new Usuario()
                .setNombreUsuario("openbootcamp2")
                .setNombre("Open2")
                .setApellidos("Bootcamp2")
                .setEmail("ejemplos2@open-bootcamp.com")
                .setNivelAcceso(30);

        Usuario usuario3 = new Usuario()
                .setNombreUsuario("openbootcamp3")
                .setNombre("Open3")
                .setApellidos("Bootcamp3")
                .setEmail("ejemplos3@open-bootcamp.com")
                .setNivelAcceso(20);


        CRUDUsuarios crudUser = new CRUDUsuarios();

        crudUser.recuperarUsuarios(FICHERO_DATOS);
        crudUser.anadirUsuario(usuario1);
        crudUser.anadirUsuario(usuario2);
        crudUser.anadirUsuario(usuario3);
        crudUser.showUsuarios();
        Usuario usuario = crudUser.obtenerUsuario(usuario1.getNombre());
        System.out.println(usuario);
        crudUser.eliminarUsuario(usuario2.getNombre());
        crudUser.showUsuarios();
        crudUser.guardarUsuarios(FICHERO_DATOS);

    }
}
