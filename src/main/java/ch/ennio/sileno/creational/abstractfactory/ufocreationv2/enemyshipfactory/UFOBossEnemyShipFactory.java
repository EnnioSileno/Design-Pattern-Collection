package ch.ennio.sileno.creational.abstractfactory.ufocreationv2.enemyshipfactory;

import ch.ennio.sileno.creational.abstractfactory.ufocreationv2.enemyship.EnemyShip;
import ch.ennio.sileno.creational.abstractfactory.ufocreationv2.enemyship.UFOBossEnemyShip;
import ch.ennio.sileno.creational.abstractfactory.ufocreationv2.enemyshippartsfactory.EnemyShipPartsFactory;
import ch.ennio.sileno.creational.abstractfactory.ufocreationv2.enemyshippartsfactory.UFOBossEnemyShipPartsFactory;

public class UFOBossEnemyShipFactory extends EnemyShipFactory {
    @Override
    protected EnemyShip makeEnemyShip() {
        EnemyShipPartsFactory shipPartsFactory = new UFOBossEnemyShipPartsFactory();
        EnemyShip enemyShip = new UFOBossEnemyShip(shipPartsFactory);
        enemyShip.setName("UFO Boss Ship");
        return enemyShip;
    }
}
