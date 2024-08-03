package Pizzeria;

public class Salsa implements Ingrediente {
    private String sabor;
    private int cantidad;

    public Salsa(String sabor, int cantidad) {
        this.sabor = sabor;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return sabor;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }

    public String getSabor() { return sabor; }
    public void setSabor(String sabor) { this.sabor = sabor; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
}