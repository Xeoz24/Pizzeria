package Logica;

import Persistencia.Lista.ListaDoblementeEnlazada;

public class Login {

    private ListaDoblementeEnlazada lista_usuarios;
    private String nombres, apellidos, correo_electronico, num_telofonico, password;

    public Login() {
    }

    public Login(String nombres, String apellidos, String correo_electronico, String num_telofonico, String password) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo_electronico = correo_electronico;
        this.num_telofonico = num_telofonico;
        this.password = password;
        lista_usuarios = new ListaDoblementeEnlazada();
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

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNum_telofonico() {
        return num_telofonico;
    }

    public void setNum_telofonico(String num_telofonico) {
        this.num_telofonico = num_telofonico;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

}
