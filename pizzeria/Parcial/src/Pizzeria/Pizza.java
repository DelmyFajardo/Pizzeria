package Pizzeria;

public abstract class Pizza {
    protected String nombre;
    protected String tamano;
    protected double precio;

    public abstract void preparar();

    public  abstract void hornear();


    public abstract void cortar();

    public  abstract void empacar();

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTamano() { return tamano; }
    public void setTamaño(String tamano) { this.tamano = tamano; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    @Override
    public String toString() {
        return "Pizza [Nombre: " + nombre + ", Tamano: " + tamano + ", Precio: $" + precio + "]";
    }
}


