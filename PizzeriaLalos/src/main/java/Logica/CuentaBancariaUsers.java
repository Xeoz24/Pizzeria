/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fwscg
 */
public class CuentaBancariaUsers {

    private List<CuentaBancaria> cuentas;

    public CuentaBancariaUsers() {
        cuentas = new ArrayList();
    }

    public int find(String usuario) {
        int n = -1;
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getUsuario().equals(usuario)) {
                n = i;
                break;
            }
        }
        return n;
    }

    public boolean insert(CuentaBancaria usuario) {
        if (find(usuario.getUsuario()) == -1) {//logra que al no buscar el indice -1 insertar el nuevo usuario pasado por el parametro
            cuentas.add(usuario);
            return true;
        } else {
            return false;
        }
    }
        public boolean modificar(CuentaBancaria usuario) {
        if (find(usuario.getUsuario()) != -1) {//si el usuario ha sido creado en cualquiera de las posiciones del arreglo, este se modifica
            CuentaBancaria cuentaAux = obtener(usuario.getUsuario());
            cuentaAux.setPassword(usuario.getPassword());
            cuentaAux.setCliente(usuario.getCliente());
            cuentaAux.setCorreo(usuario.getCorreo());
            return true;
        } else {
            return false;
        }
    }
        public boolean eliminar(String usuario){
         if (find(usuario) != -1) {//cuando encuentre el nombre del usuario lo borra de nuestra Array List
             cuentas.remove(find(usuario));
            return true;
        } else {
            return false;
        }
        }
        public CuentaBancaria obtener(String usuario){
        if(find(usuario) != -1){//obtiene el indice del usuario para poder saber si existe en el array
            return cuentas.get(find(usuario));
        }else{//en caso de no encontrarse retorna un objeto de cuenta bancaria nulo 
            return null;
        }
    }
    
}

