package ch.ennio.sileno.structural.adapter;

// in this case the "Client interface".
public class RoundPeg {

    private final double radius;

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
