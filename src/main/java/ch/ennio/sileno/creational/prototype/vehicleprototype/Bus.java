package ch.ennio.sileno.creational.prototype.vehicleprototype;

// Concrete Prototype
public class Bus extends Vehicle {

    private final int seats;

    public Bus(String brand, String model, String color, int seats) {
        super(brand, model, color);
        this.seats = seats;

    }

    // the private constructor will be called by the clone method below
    private Bus(Bus bus) {
        super(bus);
        this.seats = bus.seats;
    }

    @Override
    public Vehicle clone() {
        return null;
    }
}
