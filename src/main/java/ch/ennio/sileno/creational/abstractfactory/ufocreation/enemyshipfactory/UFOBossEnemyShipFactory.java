package ch.ennio.sileno.creational.abstractfactory.ufocreation.enemyshipfactory;

import ch.ennio.sileno.creational.abstractfactory.ufocreation.enemyship.EnemyShip;
import ch.ennio.sileno.creational.abstractfactory.ufocreation.enemyship.UFOBossEnemyShip;
import ch.ennio.sileno.creational.abstractfactory.ufocreation.enemyshippartsfactory.EnemyShipPartsFactory;
import ch.ennio.sileno.creational.abstractfactory.ufocreation.enemyshippartsfactory.UFOBossEnemyShipPartsFactory;

public class UFOBossEnemyShipFactory extends EnemyShipFactory {
    @Override
    protected EnemyShip makeEnemyShip() {
        EnemyShipPartsFactory shipPartsFactory = new UFOBossEnemyShipPartsFactory();
        EnemyShip enemyShip = new UFOBossEnemyShip(shipPartsFactory);
        enemyShip.setName("UFO Boss Ship");
        return enemyShip;
    }
}
