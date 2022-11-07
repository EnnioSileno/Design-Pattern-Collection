package ch.ennio.sileno.creational.factorymethod.ufocreatoridiom;

import ch.ennio.sileno.creational.factorymethod.ufocreatoridiom.ship.BigUFOEnemyShip;
import ch.ennio.sileno.creational.factorymethod.ufocreatoridiom.ship.EnemyShip;
import ch.ennio.sileno.creational.factorymethod.ufocreatoridiom.ship.RocketEnemyShip;
import ch.ennio.sileno.creational.factorymethod.ufocreatoridiom.ship.UFOEnemyShip;

// Factory
public class EnemyShipFactory {
    public EnemyShip makeEnemyShip(String typeOfShip) {
        // violates the open close principle
        EnemyShip enemyShip = null;
        if("U".equals(typeOfShip)) {
            enemyShip = new UFOEnemyShip();
        } else if ("R".equals(typeOfShip)) {
            enemyShip = new RocketEnemyShip();
        } else if ("B".equals(typeOfShip)) {
            enemyShip = new BigUFOEnemyShip();
        }
        return enemyShip;
    }
}
