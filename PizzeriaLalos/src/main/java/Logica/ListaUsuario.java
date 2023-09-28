
package Logica;

import Persistencia.Lista.ListaDoblementeEnlazada;


public class ListaUsuario {
    
   private ListaDoblementeEnlazada cuentas_existentes;
    public ListaUsuario(){
     cuentas_existentes = new ListaDoblementeEnlazada();
    }
    
    public boolean insertar (Usuario usuario){
        if (cuentas_existentes.getUsuario(usuario.getID()) == cuentas_existentes.getUsuario(0)) {
        
        }
    return true ;
    }
    
   
    
    
}
