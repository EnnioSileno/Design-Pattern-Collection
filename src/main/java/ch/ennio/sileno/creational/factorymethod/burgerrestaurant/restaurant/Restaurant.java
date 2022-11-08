package ch.ennio.sileno.creational.factorymethod.burgerrestaurant.restaurant;

import ch.ennio.sileno.creational.factorymethod.burgerrestaurant.burger.Burger;

// Creator
public abstract class Restaurant {

    public Burger orderBurger() {
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

    protected abstract Burger createBurger();
}
