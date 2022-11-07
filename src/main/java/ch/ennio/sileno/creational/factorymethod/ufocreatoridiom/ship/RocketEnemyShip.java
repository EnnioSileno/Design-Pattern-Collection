package ch.ennio.sileno.creational.factorymethod.ufocreatoridiom.ship;

// Concrete Product
public class RocketEnemyShip extends EnemyShip {

    public RocketEnemyShip() {
        setName("Rocket Enemy Ship");
        setDamage(25.0);
        setSpeed(20.0);
    }
}
