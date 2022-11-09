package ch.ennio.sileno.creational.abstractfactory.computercomponents.manufacturer;

import ch.ennio.sileno.creational.abstractfactory.computercomponents.gpu.Gpu;
import ch.ennio.sileno.creational.abstractfactory.computercomponents.monitor.Monitor;

public abstract class Company {

    // business logic can be added here

    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();
}
