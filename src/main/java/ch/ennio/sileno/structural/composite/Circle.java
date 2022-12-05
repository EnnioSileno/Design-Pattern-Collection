package ch.ennio.sileno.structural.composite;

public class Circle extends Dot {

    protected int radius;

    public Circle(int xCoordinate, int yCoordinate, int radius) {
        super(xCoordinate, yCoordinate);

        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw a circle with radius: " + radius +
                " at x: " + xCoordinate +
                " and y: " + yCoordinate);
    }
}
