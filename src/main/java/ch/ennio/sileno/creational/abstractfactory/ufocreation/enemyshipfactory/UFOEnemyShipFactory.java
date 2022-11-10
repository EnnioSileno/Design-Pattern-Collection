package ch.ennio.sileno.creational.abstractfactory.ufocreation.enemyshipfactory;


import ch.ennio.sileno.creational.abstractfactory.ufocreation.enemyship.EnemyShip;
import ch.ennio.sileno.creational.abstractfactory.ufocreation.enemyship.UFOBossEnemyShip;
import ch.ennio.sileno.creational.abstractfactory.ufocreation.enemyship.UFOEnemyShip;
import ch.ennio.sileno.creational.abstractfactory.ufocreation.enemyshippartsfactory.EnemyShipPartsFactory;
import ch.ennio.sileno.creational.abstractfactory.ufocreation.enemyshippartsfactory.UFOBossEnemyShipPartsFactory;
import ch.ennio.sileno.creational.abstractfactory.ufocreation.enemyshippartsfactory.UFOEnemyShipPartsFactory;

//Violets the open close principle
public class UFOEnemyShipFactory extends EnemyShipFactory {
    @Override
    protected EnemyShip makeEnemyShip() {
        EnemyShipPartsFactory shipPartsFactory = new UFOEnemyShipPartsFactory();
        EnemyShip enemyShip = new UFOEnemyShip(shipPartsFactory);
        enemyShip.setName("UFO Grunt Ship");
        return enemyShip;
    }
}
