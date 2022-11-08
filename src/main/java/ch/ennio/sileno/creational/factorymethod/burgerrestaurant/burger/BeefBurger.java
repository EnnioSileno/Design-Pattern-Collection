package ch.ennio.sileno.creational.factorymethod.burgerrestaurant.burger;

// Concrete Product
public class BeefBurger implements Burger {

    private boolean isPrepared = false;

    @Override
    public void prepare() {
        System.out.println("Prepare beef Burger");
        isPrepared = true;
    }

    @Override
    public boolean isPrepared() {
        return isPrepared;
    }
}
