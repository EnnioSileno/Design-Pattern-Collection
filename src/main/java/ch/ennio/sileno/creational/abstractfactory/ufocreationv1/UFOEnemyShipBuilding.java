package ch.ennio.sileno.creational.abstractfactory.ufocreationv1;


import ch.ennio.sileno.creational.abstractfactory.ufocreationv1.enemyship.EnemyShip;
import ch.ennio.sileno.creational.abstractfactory.ufocreationv1.enemyship.UFOBossEnemyShip;
import ch.ennio.sileno.creational.abstractfactory.ufocreationv1.enemyship.UFOEnemyShip;
import ch.ennio.sileno.creational.abstractfactory.ufocreationv1.enemyshippartsfactory.EnemyShipPartsFactory;
import ch.ennio.sileno.creational.abstractfactory.ufocreationv1.enemyshippartsfactory.UFOBossEnemyShipPartsFactory;
import ch.ennio.sileno.creational.abstractfactory.ufocreationv1.enemyshippartsfactory.UFOEnemyShipPartsFactory;

//Violets the open close principle
public class UFOEnemyShipBuilding extends EnemyShipBuilding {
    @Override
    protected EnemyShip makeEnemyShip(EnemyShipType enemyShipType) {
        return switch (enemyShipType) {
            case UFO -> makeUFOEnemyShip();
            case THE_BOSS -> makeUFOBossEnemyShip();
        };
    }

    private EnemyShip makeUFOEnemyShip() {
        EnemyShipPartsFactory shipPartsFactory = new UFOEnemyShipPartsFactory();
        EnemyShip enemyShip = new UFOEnemyShip(shipPartsFactory);
        enemyShip.setName("UFO Grunt Ship");
        return enemyShip;
    }

    private EnemyShip makeUFOBossEnemyShip() {
        EnemyShipPartsFactory shipPartsFactory = new UFOBossEnemyShipPartsFactory();
        EnemyShip enemyShip = new UFOBossEnemyShip(shipPartsFactory);
        enemyShip.setName("UFO Boss Ship");
        return enemyShip;
    }
}
