/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author fwscg
 */
public class CuentaLogic {

    private static final CuentaBancariaUsers cuentasUsers = new CuentaBancariaUsers();

    public static boolean autentificar(String usuario, String password) {
        if (obtener(usuario) != null) {
            CuentaBancaria cuentaConsulta = obtener(usuario);
            if (cuentaConsulta.getUsuario().equals(usuario) && cuentaConsulta.getPassword().equals(password)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean insertar(CuentaBancaria usuario) {
        return cuentasUsers.insert(usuario);
    }

    public static boolean modificar(CuentaBancaria usuario) {
        return cuentasUsers.modificar(usuario);
    }

    public static boolean eliminar(String usuario) {
        return cuentasUsers.eliminar(usuario);
    }

    public static CuentaBancaria obtener(String usuario) {
        return cuentasUsers.obtener(usuario);
    }

}
