package ch.ennio.sileno.structural.bridge.examplerestaurant.abstraction;

import ch.ennio.sileno.structural.bridge.examplerestaurant.implementation.Pizza;

public abstract class Restaurant {
    protected Pizza pizza;

    protected Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }

    abstract void addSauce();
    abstract void addToppings();
    abstract void makeCrust();

    public void deliver() {
        makeCrust();
        addSauce();
        addToppings();
        pizza.assemble();
        pizza.qualityCheck();
        System.out.println("Order in progress");
    }
}
