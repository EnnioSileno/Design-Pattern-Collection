package ch.ennio.sileno.structural.adapter;

public class SquarePegAdapter extends RoundPeg {
    private final SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        // it is better to work with interfaces
        super(0);
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        return squarePeg.width() * Math.sqrt(2.0) / 2;
    }
}
