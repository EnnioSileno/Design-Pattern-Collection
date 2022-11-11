package ch.ennio.sileno.creational.builder.directorfull.model;

import ch.ennio.sileno.creational.builder.directorfull.carcomponent.Engine;

public class CarManualBuilder implements Builder {
    CarManual carManual;

    public CarManualBuilder() {
        reset();
    }

    @Override
    public Builder reset() {
        carManual = new CarManual();
        return this;
    }

    @Override
    public Builder setNbrSeats(int nrbSeats) {
        carManual.setNbrSeats(nrbSeats);
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        carManual.setEngine(engine);
        return this;
    }

    @Override
    public Builder setTripComputer(boolean hasTripComputer) {
        carManual.setHasTripComputer(hasTripComputer);
        return this;
    }

    @Override
    public Builder setGPS(boolean hasGPS) {
        carManual.setHasGPS(hasGPS);
        return this;
    }
}
