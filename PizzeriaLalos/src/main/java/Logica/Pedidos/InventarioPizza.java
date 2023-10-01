package Logica.Pedidos;

import Logica.Pedidos.Pizza.TamanoDePizza;
import Logica.Pedidos.Pizza.TipoDePizza;
import Persistencia.Lista.ListaDoblementeEnlazada;

public class InventarioPizza {
    private static ListaDoblementeEnlazada <Pizza> inventario_pizzas;

    public InventarioPizza() {
      inventario_pizzas = new ListaDoblementeEnlazada<>();
    }
    public void agregarPizza(TipoDePizza tipo, TamanoDePizza tamaño) {
        Pizza pizza = new Pizza(tipo, tamaño);
        inventario_pizzas.insertar(pizza);
    }

    public void mostrarStock() {
        for (int i = 0; i < inventario_pizzas.longitud(); i++) {
            Pizza pizza = inventario_pizzas.obtener(i);
        }
    }
}
