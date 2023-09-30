package Logica;
import Persistencia.Lista.ListaDoblementeEnlazada;


public class ListaUsuario {

    private static ListaDoblementeEnlazada<Usuario> lista_usuarios;
    private static String mensajes_de_administrador;

    public ListaUsuario() {
        lista_usuarios = new ListaDoblementeEnlazada();
        mensajes_de_administrador = "";
    }

    public int buscar(String metodo_de_busqueda){//puede ser correo electronico o num telefonico
        int n = -1;
        for (int i = 0; i < lista_usuarios.longitud(); i++) {
            if (lista_usuarios.obtener(i).getNumero_telefonico().equals(metodo_de_busqueda)|| lista_usuarios.obtener(i).getCorreo_electronico().equals(metodo_de_busqueda)) {
                n = i;
                break;
            }
        }
        return n;
    }
    public Usuario obtenerUsuario(int indice){
     return lista_usuarios.obtener(indice);
    }

    public boolean agregarUsuario(Usuario usuario) {
        //indice -1 significa que no se encontro en nuestra lista de usuario, por lo que se agrega automaticamente 
        if (lista_usuarios.longitud() != 0) {
            if (buscar(usuario.getNumero_telefonico()) == -1) {
                lista_usuarios.insertar(usuario);
                mensajes_de_administrador = "Usuario nuevo agregado con ID :" + usuario.getID();
                return true;
            } else {
                mensajes_de_administrador = "Intento de registro de un usuario con el ID: " + buscar(usuario.getNumero_telefonico());
                return false;
            }
        } else {
            lista_usuarios.insertar(usuario);
            mensajes_de_administrador = "Usuario nuevo agregado con ID :" + usuario.getID();
            return true;
        }

    }

    public static String getMensajes_de_administrador() {
        return mensajes_de_administrador;
    }

    public static void setMensajes_de_administrador(String mensajes_de_administrador) {
        ListaUsuario.mensajes_de_administrador = mensajes_de_administrador;
    }


}
