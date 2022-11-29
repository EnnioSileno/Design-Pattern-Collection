package ch.ennio.sileno.structural.adapter;

//Service
public record RoundHole(int radius) {

    public boolean fits(RoundPeg peg) {
        return peg.getRadius() <= radius;
    }
}
