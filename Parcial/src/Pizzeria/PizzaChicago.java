package Pizzeria;

public class PizzaChicago extends Pizza {
    private String grosorMasa;

    public PizzaChicago() {
        this.nombre = "Pizza Chicago";
        this.grosorMasa = "Gruesa";
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pizza estilo Chicago...");
    }

    @Override
    public void hornear() {
        System.out.println("su pizza se esta horneando");
    }

    @Override
    public void cortar() {
        System.out.println("cortando pizza");
    }

    @Override
    public void empacar() {
        System.out.println("La orden esta empacandose ");
    }

    public String getGrosorMasa() { return grosorMasa; }
    public void setGrosorMasa(String grosorMasa) { this.grosorMasa = grosorMasa; }

    @Override
    public String toString() {
        return super.toString() + ", Grosor de Masa: " + grosorMasa;
    }
}
