package ch.ennio.sileno.creational.builder.simplecar.model;

public class Car {
    private int id;
    private String brand;
    private String model;
    private String color;
    private int nbrDoors;
    private String ScreenType;
    private double weight;
    private double height;

    // Not public to enforce the user to use the builder.
    Car(int id, String brand, String model, String color, int nbrDoors, String screenType, double weight, double height) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.nbrDoors = nbrDoors;
        ScreenType = screenType;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", nbrDoors=" + nbrDoors +
                ", ScreenType='" + ScreenType + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
