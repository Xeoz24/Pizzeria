package Persistencia.Lista;

public class ListaDoblementeEnlazada<T> {
    
    private Nodo<T> primerNodo;
    private Nodo<T> ultimoNodo;
    private int longitud;

    public ListaDoblementeEnlazada() {
        this.primerNodo = null;
        this.ultimoNodo = null;
        this.longitud = 0;
    }

    public void insertar(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        if (primerNodo == null) {
            primerNodo = nuevoNodo;
            ultimoNodo = nuevoNodo;
        } else {
            nuevoNodo.setAnterior(ultimoNodo);
            ultimoNodo.setSiguiente(nuevoNodo);
            ultimoNodo = nuevoNodo;
        }
        longitud++;
    }

        public T obtener(int indice) {
        if (indice < 0 || indice >= longitud) {
            System.err.println("Índice fuera de rango");
            return null;
        }
        Nodo<T> nodoActual;
        if (indice <= longitud / 2) {
            nodoActual = primerNodo;
            for (int i = 0; i < indice; i++) {
                nodoActual = nodoActual.getSiguiente();
            }
        } else {
            nodoActual = ultimoNodo;
            for (int i = longitud - 1; i > indice; i--) {
                nodoActual = nodoActual.getAnterior();
            }
        }
        return nodoActual.getElemento();
    }

    public void eliminar(int indice) {
        if (indice < 0 || indice >= longitud) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        Nodo<T> nodoEliminar;
        if (indice == 0) {
            nodoEliminar = primerNodo;
            primerNodo = primerNodo.getSiguiente();
        } else if (indice == longitud - 1) {
            nodoEliminar = ultimoNodo;
            ultimoNodo = ultimoNodo.getAnterior();
            ultimoNodo.setSiguiente(null);
        } else {
            Nodo<T> nodoActual;
            if (indice < longitud / 2) {
                nodoActual = primerNodo;
                for (int i = 0; i < indice; i++) {
                    nodoActual = nodoActual.getSiguiente();
                }
            } else {
                nodoActual = ultimoNodo;
                for (int i = longitud - 1; i > indice; i--) {
                    nodoActual = nodoActual.getAnterior();
                }
            }
            nodoEliminar = nodoActual;
            nodoActual.getAnterior().setSiguiente(nodoActual.getSiguiente());
            nodoActual.getSiguiente().setAnterior(nodoActual.getAnterior());
        }
        nodoEliminar.setAnterior(null);
        nodoEliminar.setSiguiente(null);
        longitud--;
    }

    public int longitud() {
        return longitud;
    }
}