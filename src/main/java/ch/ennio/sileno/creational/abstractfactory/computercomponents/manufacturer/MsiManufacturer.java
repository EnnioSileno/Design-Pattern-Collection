package ch.ennio.sileno.creational.abstractfactory.computercomponents.manufacturer;

import ch.ennio.sileno.creational.abstractfactory.computercomponents.gpu.Gpu;
import ch.ennio.sileno.creational.abstractfactory.computercomponents.gpu.MsiGpu;
import ch.ennio.sileno.creational.abstractfactory.computercomponents.monitor.Monitor;
import ch.ennio.sileno.creational.abstractfactory.computercomponents.monitor.MsiMonitor;

public class MsiManufacturer extends Company {
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
