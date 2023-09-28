package Logica;

import Persistencia.Lista.ListaDoblementeEnlazada;

public class Login {

    private static final ListaUsuario lista_usuarios = new ListaUsuario();
    private String nombres, apellidos, correo_electronico, num_telofonico, password;

    public Login() {
    }

    public Login(String nombres, String apellidos, String correo_electronico, String num_telofonico, String password) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo_electronico = correo_electronico;
        this.num_telofonico = num_telofonico;
        this.password = password;
    }

    public String iniciarSesion(String metodo_registro, String password) {
        String mensaje_autenticacion = " ";
        //Autenticacion correo_electronico
        if (metodo_registro.equals(correo_electronico)) {
            if (password.equals(password)) {

            } else {
                mensaje_autenticacion = "Contraseña incorrecta";
            }

        } else {
            mensaje_autenticacion = "Correo electronico no encontrado";
        }
        // Autenticacion num_telefonico
        if (metodo_registro.equals(num_telofonico)) {
            if (password.equals(password)) {

            } else {
                mensaje_autenticacion = "Contraseña incorrecta";
            }

        } else {
            mensaje_autenticacion = "Numero de telefono  no encontrado";
        }
        return mensaje_autenticacion;
    }

    

}
