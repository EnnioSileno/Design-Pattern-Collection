package ch.ennio.sileno.structural.composite;


public class ImageEditorClient {
    public static void main(String[] args) {
        CompoundGraphic root;

        //load all
        root = new CompoundGraphic(
                new Dot(1,2),
                new Circle(5,3,10),
                new CompoundGraphic(
                        new Dot(5,10),
                        new Dot(5, 11)
                )
        );

        root.draw();
    }
}
