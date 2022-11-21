package ch.ennio.sileno.creational.builder.simplecar;

import ch.ennio.sileno.creational.builder.simplecar.model.Car;
import ch.ennio.sileno.creational.builder.simplecar.model.CarBuilder;

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
