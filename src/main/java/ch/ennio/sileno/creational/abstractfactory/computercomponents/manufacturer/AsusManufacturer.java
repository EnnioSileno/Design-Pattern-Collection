package ch.ennio.sileno.creational.abstractfactory.computercomponents.manufacturer;

import ch.ennio.sileno.creational.abstractfactory.computercomponents.gpu.AsusGpu;
import ch.ennio.sileno.creational.abstractfactory.computercomponents.gpu.Gpu;
import ch.ennio.sileno.creational.abstractfactory.computercomponents.monitor.AsusMonitor;
import ch.ennio.sileno.creational.abstractfactory.computercomponents.monitor.Monitor;

public class AsusManufacturer extends Company {
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
