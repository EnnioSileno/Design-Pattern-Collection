package ch.ennio.sileno.creational.abstractfactory.computercomponents.gpu;

public class MsiGpu implements Gpu {

    @Override
    public void assemble() {
        System.out.println("MsiGpu assembled.");
    }
}
