package ch.ennio.sileno.creational.factorymethod.ufocreatoridiom.ship;

// Concrete Product
public class BigUFOEnemyShip extends EnemyShip {
    public BigUFOEnemyShip() {
        setName("Big UFO Enemy Ship");
        setDamage(40.0);
        setSpeed(10.0);
    }
}
