package ch.ennio.sileno.structural.flyweight;

// Context
public class Tree {
    private int xCoordinate, yCoordinate;
    private TreeType treeType;

    public Tree(int xCoordinate, int yCoordinate, TreeType treeType) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.treeType = treeType;
    }

    public void draw() {
        treeType.draw(xCoordinate, yCoordinate);
    }
}
