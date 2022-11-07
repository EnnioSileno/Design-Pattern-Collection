package ch.ennio.sileno.creational.factorymethod.ufocreatoridiom.ship;

// Concrete Product
public class UFOEnemyShip extends EnemyShip {
    public UFOEnemyShip() {
        setName("UFO Enemy Ship");
        setDamage(20.0);
        setSpeed(20.0);
    }
}
