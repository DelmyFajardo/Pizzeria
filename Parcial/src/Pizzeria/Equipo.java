package Pizzeria;

public class Equipo {
    private String tipo;
    private String estado;

    public Equipo(String tipo, String estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    public void encender() {
        System.out.println("el  equipo se esta encendiendo : " + tipo);
    }

    public void apagar() {
        System.out.println("El equipo se siendo apagado: " + tipo);
    }

    public void reparar() {
        System.out.println("Reparando el equipo de pizzeria: " + tipo);
    }

    // Getters y Setters
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    @Override
    public String toString() {
        return "Equipo{" +
                "tipo='" + tipo + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
