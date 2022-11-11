package ch.ennio.sileno.creational.builder.simpleCar1;

import ch.ennio.sileno.creational.builder.simpleCar1.model.Car;
import ch.ennio.sileno.creational.builder.simpleCar1.model.CarBuilder;

public class SimpleBuilderClient {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        builder.id(2122)
                .brand("Bugatti")
                .model("Chiron")
                .color("Blue");
        Car car = builder.build();
        System.out.println(car);
    }
}
