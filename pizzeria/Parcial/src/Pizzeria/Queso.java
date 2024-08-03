package Pizzeria;

public class Queso implements Ingrediente {
    private String tipo;
    private int cantidad;

    public Queso(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }


    @Override
    public String obtenerNombre() {
        return tipo;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
}