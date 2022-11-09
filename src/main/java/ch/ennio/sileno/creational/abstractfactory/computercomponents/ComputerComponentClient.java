package ch.ennio.sileno.creational.abstractfactory.computercomponents;

import ch.ennio.sileno.creational.abstractfactory.computercomponents.gpu.Gpu;
import ch.ennio.sileno.creational.abstractfactory.computercomponents.manufacturer.AsusManufacturer;
import ch.ennio.sileno.creational.abstractfactory.computercomponents.manufacturer.Company;
import ch.ennio.sileno.creational.abstractfactory.computercomponents.manufacturer.MsiManufacturer;
import ch.ennio.sileno.creational.abstractfactory.computercomponents.monitor.Monitor;

public class ComputerComponentClient {
    public static void main(String[] args) {
        Company msi = new MsiManufacturer();
        Gpu msiGpu = msi.createGpu();
        Monitor msiMonitor = msi.createMonitor();

        Company asus = new AsusManufacturer();
        Gpu asusGpu = asus.createGpu();
        Monitor asusMonitor = asus.createMonitor();

        msiGpu.assemble();
        msiMonitor.assemble();

        asusGpu.assemble();
        asusGpu.assemble();
    }
}
