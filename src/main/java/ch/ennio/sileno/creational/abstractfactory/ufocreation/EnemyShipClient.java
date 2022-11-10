package ch.ennio.sileno.creational.abstractfactory.ufocreation;

import ch.ennio.sileno.creational.abstractfactory.ufocreation.enemyship.EnemyShip;
import ch.ennio.sileno.creational.abstractfactory.ufocreation.enemyshipfactory.EnemyShipFactory;
import ch.ennio.sileno.creational.abstractfactory.ufocreation.enemyshipfactory.UFOBossEnemyShipFactory;
import ch.ennio.sileno.creational.abstractfactory.ufocreation.enemyshipfactory.UFOEnemyShipFactory;

import static ch.ennio.sileno.creational.abstractfactory.ufocreation.EnemyShipType.*;

public class EnemyShipClient {
    public static void main(String[] args) {
        EnemyShipFactory makeUFO = new UFOEnemyShipFactory();

        EnemyShip theGrunt = makeUFO.orderShip();
        System.out.println(theGrunt);

        EnemyShipFactory makeUFOBoss = new UFOBossEnemyShipFactory();
        EnemyShip theBoss = makeUFOBoss.orderShip();
        System.out.println(theBoss);
    }
}
