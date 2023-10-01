package Persistencia.ColaCircular;

import Logica.Pedidos.Pedidos;

public class ColaCircular {

    private Nodo frente;
    private Nodo atras;
    private int longitud;

    public ColaCircular() {
        frente = null;
        atras = null;
        longitud = 0;
    }

    public void insertar(Pedidos pedidos) {
        Nodo nuevoNodo = new Nodo(pedidos);
        if (estaVacia()) {
            frente = nuevoNodo;
            atras = nuevoNodo;
            atras.setSiguiente(frente);
        } else {
            atras.setSiguiente(nuevoNodo);
            atras = nuevoNodo;
            atras.setSiguiente(frente);
        }
        longitud++;
    }
    public Pedidos obtener(int indice) throws IndexOutOfBoundsException {
    if (indice < 0 || indice >= longitud) {
        throw new IndexOutOfBoundsException("Índice fuera de rango");
    }

    Nodo nodoActual = frente;
    for (int i = 0; i < indice; i++) {
        nodoActual = nodoActual.getSiguiente();
    }

    return nodoActual.getPedidos();
}

    public void eliminar() {
        if (!estaVacia()) {
            if (frente == atras) {
                frente = null;
                atras = null;
            } else {
                frente = frente.getSiguiente();
                atras.setSiguiente(frente);
            }
            longitud--;
        }
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public Nodo getFrente() throws NullPointerException {
        if (frente == null) {
            throw new NullPointerException("Frente no logra encontrar una referencia, revise si su cola está llena");
        }
        return frente;
    }

    public Nodo getAtras() throws NullPointerException {
        if (atras == null) {
            throw new NullPointerException("Atras no logra encontrar una referencia, revise el tamaño de la cola");
        }
        return atras;
    }

    public int getLongitud() {
        return longitud;
    }
}
