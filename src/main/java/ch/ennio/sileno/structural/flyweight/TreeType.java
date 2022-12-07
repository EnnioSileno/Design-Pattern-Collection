package ch.ennio.sileno.structural.flyweight;

public class TreeType {
    private final String name;
    private final String color;
    private final int textureIndex;

    public TreeType(String name, String color, int textureIndex) {
        this.name = name;
        this.color = color;
        this.textureIndex = textureIndex;
    }

    public void draw(int xCoordinate, int yCoordinate) {
        System.out.println("Draw tree at x-Coordinate: " + xCoordinate + " and y-Coordinate: " + yCoordinate
         + " with this type: " + this);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getTextureIndex() {
        return textureIndex;
    }
}
