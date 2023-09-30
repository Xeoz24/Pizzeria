
package Logica;
 
public class Usuario {
    
    
    //Atributos de un usario
    
    private String nombres,apellidos,correo_electronico,numero_telefonico;
    private char [] password;
    private int ID;

    public Usuario(String nombres, String apellidos, String correo_electronico, String numero_telefonico, char [] password ,int ID) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo_electronico = correo_electronico;
        this.numero_telefonico = numero_telefonico;
        this.password = password;
        this.ID = ID;
    }

    public Usuario() {
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

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getNumero_telefonico() {
        return numero_telefonico;
    }

    public void setNumero_telefonico(String numero_telefonico) {
        this.numero_telefonico = numero_telefonico;
    }

    public String getPassword() {
        String passwordString = String.valueOf(password);
        return passwordString;
    }

    public void setPassword( char []password) {
        this.password = password;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
    
    
    
    
    
}
