package ch.ennio.sileno.structural.bridge.examplerestaurant.abstraction;

import ch.ennio.sileno.structural.bridge.examplerestaurant.implementation.Pizza;

public class AmericanRestaurant extends Restaurant {
    public AmericanRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSauce() {
        pizza.setToppings("Everything");
    }

    @Override
    void addToppings() {
        pizza.setSauce("Super Secret Recipe");
    }

    @Override
    void makeCrust() {
        pizza.setCrust("Thick");
    }
}
