package Logica.Pedidos;

import Persistencia.ColaCircular.ColaCircular;


public class ColaPedidos {

    private static ColaCircular colaPedidos = new ColaCircular();
   static String status_cola;
    public Pedidos obtenerPedidos(int indice) {
        return colaPedidos.obtener(indice);
    }

    public int buscar(String nombreDeUsuario) {
        int n = -1;
        for (int i = 0; i < colaPedidos.getLongitud(); i++) {
            if (colaPedidos.obtener(i).getUsuario().getNombres().equals(nombreDeUsuario)) {
                n = i;
                break;
            }
        }
        return n;
    }
    public static void agregarCola(Pedidos pedido){
   
        colaPedidos.insertar(pedido);
    }
    public static void eliminarDeCola() {
         colaPedidos.eliminar();
        }
    public static int  getLongitud(){
    return colaPedidos.getLongitud();
    }
    }


