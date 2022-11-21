package ch.ennio.sileno.creational.prototype;

import ch.ennio.sileno.creational.prototype.vehicleprototype.Bus;
import ch.ennio.sileno.creational.prototype.vehicleprototype.Car;
import ch.ennio.sileno.creational.prototype.vehicleprototype.Vehicle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Prototype registry
public class VehicleCache {

    private final Map<String, Vehicle> cache = new HashMap<>();

    public VehicleCache() {
        Car car = new Car("Bugatti", "Chiron", "Blue", 400);
        Bus bus = new Bus("Mercedes", "Setra", "Silver", 48);

        cache.put("Bugatti Chiron" ,car);
        cache.put("Mercedes Setra" ,bus);
    }

    public Vehicle get(String key) {
        return cache.get(key);
    }

    public void put(List<Vehicle> vehicles) {
        vehicles.forEach(vehicle -> cache.put(vehicle.getBrand() + " " + vehicle.getModel(), vehicle));
    }
}
