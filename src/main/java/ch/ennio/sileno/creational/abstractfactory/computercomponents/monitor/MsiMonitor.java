package ch.ennio.sileno.creational.abstractfactory.computercomponents.monitor;

public class MsiMonitor implements Monitor {

    @Override
    public void assemble() {
        System.out.println("MsiMonitor assembled.");
    }
}
