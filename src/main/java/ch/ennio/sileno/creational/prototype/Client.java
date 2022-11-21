package ch.ennio.sileno.creational.prototype;

import ch.ennio.sileno.creational.prototype.vehicleprototype.Bus;
import ch.ennio.sileno.creational.prototype.vehicleprototype.Car;
import ch.ennio.sileno.creational.prototype.vehicleprototype.Vehicle;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Vehicle> vehicles = List.of(
          new Car("car_brand", "car_model", "car_color", 300),
          new Bus("bus_brand", "bus_model", "bus_color", 8)
        );

        List<Vehicle> copyOfVehicles = vehicles.stream().map(Vehicle::clone).toList();
        copyOfVehicles.forEach(System.out::println);

        System.out.println("=================");

        VehicleCache registry = new VehicleCache();
        registry.put(vehicles);
        System.out.println(registry.get("car_brand car_model"));
    }
}
