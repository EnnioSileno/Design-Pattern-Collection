package ch.ennio.sileno.creational.factorymethod.burgerrestaurant;

import ch.ennio.sileno.creational.factorymethod.burgerrestaurant.burger.Burger;
import ch.ennio.sileno.creational.factorymethod.burgerrestaurant.restaurant.BeefBurgerRestaurant;
import ch.ennio.sileno.creational.factorymethod.burgerrestaurant.restaurant.Restaurant;
import ch.ennio.sileno.creational.factorymethod.burgerrestaurant.restaurant.VeggieBurgerRestaurant;

public class RestaurantClient {
    public static void main(String[] args) {
        Restaurant beefBurgerRestaurant = new BeefBurgerRestaurant();
        Burger beefBurger = beefBurgerRestaurant.orderBurger();

        Restaurant veggieBurgerRestaurant = new VeggieBurgerRestaurant();
        Burger veggieBurger = veggieBurgerRestaurant.orderBurger();

        System.out.println("Beef burger is prepared: " + beefBurger.isPrepared());
        System.out.println("Veggie burger is prepared: " + veggieBurger.isPrepared());
    }
}
