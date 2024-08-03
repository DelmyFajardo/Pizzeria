package Pizzeria;

public class PizzaNuevaYork extends Pizza {
    private String estiloCorte;

    public PizzaNuevaYork() {
        this.nombre = "Pizza Nueva York";
        this.estiloCorte = "Triangular";
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pizza estilo Nueva York...");
    }

    @Override
    public void hornear() {
        System.out.println("Su pizza esta siendo horneada");
    }

    @Override
    public void cortar() {
        System.out.println("cortando en triangulos ");
    }

    @Override
    public void empacar() {
        System.out.println("su orden esta siendo empacada ");
    }

    public String getEstiloCorte() { return estiloCorte; }
    public void setEstiloCorte(String estiloCorte) { this.estiloCorte = estiloCorte; }

    @Override
    public String toString() {
        return super.toString() + ", Estilo de Corte: " + estiloCorte;
    }
}