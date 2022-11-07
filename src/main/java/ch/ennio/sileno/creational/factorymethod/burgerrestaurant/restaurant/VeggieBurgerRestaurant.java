package ch.ennio.sileno.creational.factorymethod.burgerrestaurant.restaurant;

import ch.ennio.sileno.creational.factorymethod.burgerrestaurant.burger.Burger;
import ch.ennio.sileno.creational.factorymethod.burgerrestaurant.burger.VeggieBurger;

// Concrete Creator
public class VeggieBurgerRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}
