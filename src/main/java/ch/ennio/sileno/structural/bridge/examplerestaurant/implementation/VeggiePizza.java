package ch.ennio.sileno.structural.bridge.examplerestaurant.implementation;

public class VeggiePizza extends Pizza {
    @Override
    public void assemble() {
        System.out.println("Adding Sauce: " + sauce);
        System.out.println("Adding Topping: " + toppings);
        System.out.println("Adding Cheese");
    }

    @Override
    public void qualityCheck() {
        System.out.println("Crust is: " + crust);
    }
}
