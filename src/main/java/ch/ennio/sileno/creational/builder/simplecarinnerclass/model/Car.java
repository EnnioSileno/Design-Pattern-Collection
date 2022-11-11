package ch.ennio.sileno.creational.builder.simplecarinnerclass.model;

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

    public static class CarBuilder {
        private int id;
        private String brand;
        private String model;
        private String color;
        private int nbrDoors;
        private String screenType;
        private double weight;
        private double height;

        public CarBuilder id(int id) {
            this.id = id;
            return this;
        }

        public CarBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder model(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder nbrDoors(int nbrDoors) {
            this.nbrDoors = nbrDoors;
            return this;
        }

        public CarBuilder screenType(String screenType) {
            this.screenType = screenType;
            return this;
        }

        public CarBuilder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public CarBuilder height(double height) {
            this.height = height;
            return this;
        }

        public Car build() {
            return new Car(id, brand, model, color, nbrDoors, screenType, weight, height);
        }
    }
}
