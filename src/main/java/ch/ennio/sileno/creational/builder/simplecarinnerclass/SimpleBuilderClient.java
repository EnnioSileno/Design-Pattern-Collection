package ch.ennio.sileno.creational.builder.simplecarinnerclass;


import ch.ennio.sileno.creational.builder.simplecarinnerclass.model.Car;

public class SimpleBuilderClient {
    public static void main(String[] args) {
        Car.CarBuilder builder = new Car.CarBuilder();
        builder.id(2122)
                .brand("Bugatti")
                .model("Chiron")
                .color("Blue");
        Car car = builder.build();
        System.out.println(car);
    }
}
