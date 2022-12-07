package ch.ennio.sileno.structural.flyweight;

import java.util.LinkedList;
import java.util.List;

public class Forest {
    private TreeFactory treeFactory = TreeFactory.getInstance();
    private List<Tree> trees = new LinkedList<>();

    public void plantTree(int xCoordinate, int yCoordinate, String name, String color, int textureIndex) {
        TreeType treeType = treeFactory.getTreeType(name, color, textureIndex);
        Tree tree = new Tree(xCoordinate, yCoordinate, treeType);
        trees.add(tree);
    }

    public void draw() {
        trees.forEach(Tree::draw);
    }
}
