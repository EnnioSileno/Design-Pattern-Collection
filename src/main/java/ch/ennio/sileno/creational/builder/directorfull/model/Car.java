package ch.ennio.sileno.creational.builder.directorfull.model;

import ch.ennio.sileno.creational.builder.directorfull.carcomponent.Engine;

public class Car {
    private int nbrSeats;
    private Engine engine;
    private boolean hasTripComputer;
    private boolean hasGPS;

    protected Car() {}

    protected Car(Car car) {
        this.nbrSeats = car.nbrSeats;
        this.engine = car.engine;
        this.hasTripComputer = car.hasTripComputer;
        this.hasGPS = car.hasGPS;
    }

    public int getNbrSeats() {
        return nbrSeats;
    }

    public void setNbrSeats(int nbrSeats) {
        this.nbrSeats = nbrSeats;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public boolean isHasTripComputer() {
        return hasTripComputer;
    }

    public void setHasTripComputer(boolean hasTripComputer) {
        this.hasTripComputer = hasTripComputer;
    }

    public boolean isHasGPS() {
        return hasGPS;
    }

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nbrSeats=" + nbrSeats +
                ", engine=" + engine +
                ", hasTripComputer=" + hasTripComputer +
                ", hasGPS=" + hasGPS +
                '}';
    }
}
