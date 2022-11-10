package ch.ennio.sileno.creational.abstractfactory.computercomponents.monitor;

public class AsusMonitor implements Monitor {

    @Override
    public void assemble() {
        System.out.println("AsusMonitor assembled.");
    }
}
