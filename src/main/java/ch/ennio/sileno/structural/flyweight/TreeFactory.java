package ch.ennio.sileno.structural.flyweight;

import java.util.LinkedList;
import java.util.List;


// Flyweight Factory
public class TreeFactory {

    private static TreeFactory INSTANCE;

    List<TreeType> treeTypes = new LinkedList<>();

    private TreeFactory() {}

    public static TreeFactory getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new TreeFactory();
        }
        return INSTANCE;
    }

    public TreeType getTreeType(String name, String color, int textureIndex) {
        TreeType treeType = findExistingTreeType(name, color, textureIndex);
        if(treeType == null) {
            treeType = new TreeType(name, color, textureIndex);
            treeTypes.add(treeType);
        }
        return treeType;
    }

    private TreeType findExistingTreeType(String name, String color, int textureIndex) {
        TreeType found = null;
        for (TreeType treeType : treeTypes) {
            if(treeType.getName().equals(name) &&
                    treeType.getColor().equals(color) &&
                    treeType.getTextureIndex() == textureIndex) {

                found = treeType;
                break;
            }
        }
        return found;
    }
}
