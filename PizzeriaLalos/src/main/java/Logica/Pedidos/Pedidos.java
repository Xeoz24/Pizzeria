package Logica.Pedidos;

public class Pedidos {

    private String tipo_pizza;
    private String tamano_pizza;
    private String cantidad;

    public Pedidos(String tipo_pizza, String tamano_pizza, String cantidad) {
        this.tipo_pizza = tipo_pizza;
        this.tamano_pizza = tamano_pizza;
        this.cantidad = cantidad;
    }

    public String getTipo_pizza() {
        return tipo_pizza;
    }

    public void setTipo_pizza(String tipo_pizza) {
        this.tipo_pizza = tipo_pizza;
    }

    public String getTamano_pizza() {
        return tamano_pizza;
    }

    public void setTamano_pizza(String tamano_pizza) {
        this.tamano_pizza = tamano_pizza;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

}
