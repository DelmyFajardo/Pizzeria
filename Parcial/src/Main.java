import Pizzeria.*;
public class Main {
    public static void main(String[] args) {
        Sucursal sucursalNY = new Sucursal("Pizzería Nueva York", "cuarta calle zona 21");

        Empleado empleado1 = new Empleado("Alejandra ", "cocinera", 1500);
        Empleado empleado2 = new Empleado("carlos", "mesero", 3000);

        sucursalNY.agregarEmpleado(empleado1);
        sucursalNY.agregarEmpleado(empleado2);

        Masa masa = new Masa("Gruesa", 2);
        Salsa salsa = new Salsa("Tomate", 4);
        Queso queso = new Queso("Mozzarella", 2);

        sucursalNY.agregarIngrediente(masa);
        sucursalNY.agregarIngrediente(salsa);
        sucursalNY.agregarIngrediente(queso);

        Equipo horno = new Equipo("Horno", "Operativo");
        Equipo refrigerador = new Equipo("Refrigerador", "Operativo");

        sucursalNY.agregarEquipo(horno);
        sucursalNY.agregarEquipo(refrigerador);

        PizzaNuevaYork pizzaNY = new PizzaNuevaYork();
        pizzaNY.setNombre("Pizza Peperoni");
        pizzaNY.setTamaño("Grande");
        pizzaNY.setPrecio(60.00);
        pizzaNY.setEstiloCorte("Triangular ");

        PizzaChicago pizzaChicago = new PizzaChicago();
        pizzaChicago.setNombre("Pizza Chicago Especial");
        pizzaChicago.setTamaño("Mediana");
        pizzaChicago.setPrecio(18.99);
        pizzaChicago.setGrosorMasa("Gruesa");

        sucursalNY.agregarEspecialidad(pizzaNY);
        sucursalNY.agregarEspecialidad(pizzaChicago);

        empleado1.trabajar();
        empleado2.tomarOrden();

        pizzaNY.preparar();
        pizzaNY.hornear();
        pizzaNY.cortar();
        pizzaNY.empacar();

        pizzaChicago.preparar();
        pizzaChicago.hornear();
        pizzaChicago.cortar();
        pizzaChicago.empacar();

        System.out.println(sucursalNY);
        for (Empleado emp : sucursalNY.getEmpleados()) {
            System.out.println(emp);
        }
        for (Ingrediente ing : sucursalNY.getIngredientes()) {
            System.out.println("Ingrediente [Nombre: " + ing.obtenerNombre() + ", Cantidad: " + ing.obtenerCantidad() + "]");
        }
        for (Equipo eq : sucursalNY.getEquipos()) {
            System.out.println(eq);
        }
        for (Pizza pizza : sucursalNY.getEspecialidades()) {
            System.out.println(pizza);
        }
    }
}
