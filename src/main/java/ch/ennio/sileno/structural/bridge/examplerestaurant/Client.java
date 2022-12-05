package ch.ennio.sileno.structural.bridge.examplerestaurant;

import ch.ennio.sileno.structural.bridge.examplerestaurant.abstraction.AmericanRestaurant;
import ch.ennio.sileno.structural.bridge.examplerestaurant.abstraction.ItalianRestaurant;
import ch.ennio.sileno.structural.bridge.examplerestaurant.abstraction.Restaurant;
import ch.ennio.sileno.structural.bridge.examplerestaurant.implementation.PepperoniPizza;
import ch.ennio.sileno.structural.bridge.examplerestaurant.implementation.VeggiePizza;

public class Client {
    public static void main(String[] args) {
        Restaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();

        System.out.println("-------------");

        Restaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.deliver();
    }
}
