package ch.ennio.sileno.structural.composite;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CompoundGraphic implements Graphic {

    private List<Graphic> children = new LinkedList<>();

    public CompoundGraphic(Graphic... graphics) {
        children.addAll(Arrays.asList(graphics));
    }

    @Override
    public void move(int xCoordinate, int yCoordinate) {
        children.forEach( child -> child.move(xCoordinate, yCoordinate));
    }

    @Override
    public void draw() {
        children.forEach( child -> {
            child.draw();
            System.out.println("Update bounding coordinates of: " + child);
        });
        System.out.println("Draw dashed rectangle using the bounding coordinates");
    }
}
