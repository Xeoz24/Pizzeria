/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Eduardo
 */
public class Login {

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

    public void iniciarSesion(String correo_electronico, String num_telofonico, String password) {
        if(correo_electronico.equals(correo_electronico)&& password.equals(password)){
            
        }if(correo_electronico.)
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
