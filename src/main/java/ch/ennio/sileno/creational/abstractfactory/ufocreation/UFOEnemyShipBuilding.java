package ch.ennio.sileno.creational.abstractfactory.ufocreation;


import ch.ennio.sileno.creational.abstractfactory.ufocreation.enemyship.EnemyShip;
import ch.ennio.sileno.creational.abstractfactory.ufocreation.enemyship.UFOBossEnemyShip;
import ch.ennio.sileno.creational.abstractfactory.ufocreation.enemyship.UFOEnemyShip;
import ch.ennio.sileno.creational.abstractfactory.ufocreation.factory.EnemyShipPartsFactory;
import ch.ennio.sileno.creational.abstractfactory.ufocreation.factory.UFOBossEnemyShipPartsFactory;
import ch.ennio.sileno.creational.abstractfactory.ufocreation.factory.UFOEnemyShipPartsFactory;

import static ch.ennio.sileno.creational.abstractfactory.ufocreation.EnemyShipType.*;

//Violets the open close principle
public class UFOEnemyShipBuilding extends EnemyShipBuilding {
    @Override
    protected EnemyShip makeEnemyShip(EnemyShipType enemyShipType) {
        EnemyShip enemyShip = null;

        if(enemyShipType == UFO) {
            EnemyShipPartsFactory shipPartsFactory = new UFOEnemyShipPartsFactory();
            enemyShip = new UFOEnemyShip(shipPartsFactory);
            enemyShip.setName("UFO Grunt Ship");
        } else if (enemyShipType == THE_BOSS) {
            EnemyShipPartsFactory shipPartsFactory = new UFOBossEnemyShipPartsFactory();
            enemyShip = new UFOBossEnemyShip(shipPartsFactory);
            enemyShip.setName("UFO Boss Ship");
        }
        return enemyShip;
    }
}
