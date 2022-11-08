package ch.ennio.sileno.creational.factorymethod.burgerrestaurant.restaurant;

import ch.ennio.sileno.creational.factorymethod.burgerrestaurant.burger.BeefBurger;
import ch.ennio.sileno.creational.factorymethod.burgerrestaurant.burger.Burger;

// Concrete Creator
public class BeefBurgerRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}
