package ch.ennio.sileno.creational.abstractfactory.computercomponents.gpu;

public class AsusGpu implements Gpu {

    @Override
    public void assemble() {
        System.out.println("AsusGpu assembled.");
    }
}
