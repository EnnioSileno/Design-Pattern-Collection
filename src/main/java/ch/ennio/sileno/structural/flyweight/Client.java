package ch.ennio.sileno.structural.flyweight;

public class Client {
    public static void main(String[] args) {
        Forest forest = new Forest();

        forest.plantTree(0,0, "Birch", "White", 1);
        forest.plantTree(2,2, "Birch", "White", 1);
        forest.plantTree(0,0, "Oak", "Brown", 1);

        forest.draw();
    }
}
