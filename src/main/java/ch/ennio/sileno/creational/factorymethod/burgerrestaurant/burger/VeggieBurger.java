package ch.ennio.sileno.creational.factorymethod.burgerrestaurant.burger;

// Concrete Product
public class VeggieBurger implements Burger {

    private boolean isPrepared = false;

    @Override
    public void prepare() {
        System.out.println("Prepare veggie burger");
        isPrepared = true;
    }

    @Override
    public boolean isPrepared() {
        return isPrepared;
    }
}
