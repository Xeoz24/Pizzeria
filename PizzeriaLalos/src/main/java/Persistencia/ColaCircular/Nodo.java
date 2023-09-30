package Persistencia.ColaCircular;

import Logica.Pedidos.Pedidos;

public class Nodo {

    private Pedidos Pedidos;
    private Nodo siguiente;

    public Nodo() {
    }
    public Nodo(Pedidos Pedidos) {
        this.Pedidos = Pedidos;
    }

    public Pedidos getPedidos() {
        return Pedidos;
    }

    public void setPedidos(Pedidos Pedidos) {
        this.Pedidos = Pedidos;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

   
}
