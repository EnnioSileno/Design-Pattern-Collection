package ch.ennio.sileno.creational.builder.directorfull;

import ch.ennio.sileno.creational.builder.directorfull.model.Car;
import ch.ennio.sileno.creational.builder.directorfull.model.CarBuilder;

public class Application {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.configureSportsCar(builder);

        Car car = builder.build();
        System.out.println(car);
    }
}
