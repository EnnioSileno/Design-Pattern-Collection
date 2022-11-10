package ch.ennio.sileno.creational.abstractfactory.ufocreationv2.enemyshipfactory;


import ch.ennio.sileno.creational.abstractfactory.ufocreationv2.enemyship.EnemyShip;
import ch.ennio.sileno.creational.abstractfactory.ufocreationv2.enemyship.UFOEnemyShip;
import ch.ennio.sileno.creational.abstractfactory.ufocreationv2.enemyshippartsfactory.EnemyShipPartsFactory;
import ch.ennio.sileno.creational.abstractfactory.ufocreationv2.enemyshippartsfactory.UFOEnemyShipPartsFactory;

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
