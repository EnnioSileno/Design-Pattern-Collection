package ch.ennio.sileno.structural.composite;

public class Dot implements Graphic {

    protected int xCoordinate, yCoordinate;

    public Dot(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    @Override
    public void move(int xCoordinate, int yCoordinate) {
        this.xCoordinate += xCoordinate;
        this.yCoordinate += yCoordinate;
    }

    @Override
    public void draw() {
        System.out.println("Draw a dot at x: " + xCoordinate +
                " and y: " + yCoordinate);
    }
}
