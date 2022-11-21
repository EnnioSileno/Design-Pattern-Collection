package ch.ennio.sileno.creational.builder.directorfull;

import ch.ennio.sileno.creational.builder.directorfull.carcomponent.CarEngine;
import ch.ennio.sileno.creational.builder.directorfull.carcomponent.SportEngine;
import ch.ennio.sileno.creational.builder.directorfull.model.Builder;

public class Director {
    public void configureSportsCar(Builder builder) {
        builder.reset()
                .setNbrSeats(2)
                .setEngine(new SportEngine())
                .setTripComputer(true)
                .setGPS(true);
    }

    public void configureSUV(Builder builder) {
        builder.reset()
                .setNbrSeats(4)
                .setEngine(new CarEngine())
                .setTripComputer(true)
                .setGPS(true);
    }
}
