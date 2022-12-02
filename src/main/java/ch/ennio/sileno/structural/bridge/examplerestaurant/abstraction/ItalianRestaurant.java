package ch.ennio.sileno.structural.bridge.examplerestaurant.abstraction;

import ch.ennio.sileno.structural.bridge.examplerestaurant.implementation.Pizza;

public class ItalianRestaurant extends Restaurant {
    public ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSauce() {
        pizza.setToppings("-");
    }

    @Override
    void addToppings() {
        pizza.setSauce("Oil");
    }

    @Override
    void makeCrust() {
        pizza.setCrust("Thin");
    }
}
