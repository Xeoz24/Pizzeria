package Logica;

public class Login {

    private static final ListaUsuario lista_usuarios = new ListaUsuario();
    private static String mensaje_autenticacion = " ";

    public Login() {

    }

    public boolean iniciarSesion(String metodo_registro, String password) {
        boolean autenticacion = false;   
        int IDaux = lista_usuarios.buscar(metodo_registro);
        if (IDaux == -1) {
//Autenticacion correo_electronico
            if (obtenerUsuario(IDaux).getCorreo_electronico().equals(metodo_registro)) {
                if (obtenerUsuario(IDaux).getPassword().equals(password)) {
                    autenticacion = true;
                } else {
                    mensaje_autenticacion = "Contraseña incorrecta";
                }
            } else {
                mensaje_autenticacion = "Correo electronico no encontrado";
            }
// Autenticacion num_telefonico
            if (obtenerUsuario(IDaux).getNumero_telefonico().equals(metodo_registro)) {
                if (obtenerUsuario(IDaux).getPassword().equals(password)) {
                    autenticacion = true;
                } else {
                    mensaje_autenticacion = "Contraseña incorrecta";
                }

            } else {
                mensaje_autenticacion = "Numero de telefono  no encontrado";
            }

        } else {
            mensaje_autenticacion = "No se encuentra registrado, por favor registrece";
        }
        return autenticacion;
    }

    public boolean agregar(Usuario usuario) {
        return lista_usuarios.agregarUsuario(usuario);
        
    }

    public int buscarUsuario(String metodo_ini) {
        return lista_usuarios.buscar(metodo_ini);
    }

    public static String getMensaje_autenticacion() {
        return mensaje_autenticacion;
    }

    public Usuario obtenerUsuario(int indice) {
        return lista_usuarios.obtenerUsuario(indice);
    }
    public  String getMensajeAdmin(){
      return ListaUsuario.getMensajes_de_administrador();
    }
    public static void setMensaje_autenticacion(String mensaje_autenticacion) {
        Login.mensaje_autenticacion = mensaje_autenticacion;
    }

}
