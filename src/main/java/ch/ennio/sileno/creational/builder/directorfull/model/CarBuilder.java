package ch.ennio.sileno.creational.builder.directorfull.model;

import ch.ennio.sileno.creational.builder.directorfull.carcomponent.Engine;

public class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        reset();
    }

    @Override
    public Builder reset() {
        this.car = new Car();
        return this;
    }

    @Override
    public Builder setNbrSeats(int nrbSeats) {
        car.setNbrSeats(nrbSeats);
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public Builder setTripComputer(boolean hasTripComputer) {
        car.setHasTripComputer(hasTripComputer);
        return this;
    }

    @Override
    public Builder setGPS(boolean hasGPS) {
        car.setHasGPS(hasGPS);
        return this;
    }

    public Car build() {
        Car product = new Car(car);
        reset();
        return product;
    }
}
