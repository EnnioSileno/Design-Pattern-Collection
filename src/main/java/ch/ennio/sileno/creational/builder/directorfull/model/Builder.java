package ch.ennio.sileno.creational.builder.directorfull.model;

import ch.ennio.sileno.creational.builder.directorfull.carcomponent.Engine;

public interface Builder {
    Builder reset();
    Builder setNbrSeats(int nrbSeats);
    Builder setEngine(Engine engine);
    Builder setTripComputer(boolean hasTripComputer);
    Builder setGPS(boolean hasGPS);
}
