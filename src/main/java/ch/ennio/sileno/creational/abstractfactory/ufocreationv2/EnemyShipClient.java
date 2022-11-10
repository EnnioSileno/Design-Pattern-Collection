package ch.ennio.sileno.creational.abstractfactory.ufocreationv2;

import ch.ennio.sileno.creational.abstractfactory.ufocreationv2.enemyship.EnemyShip;
import ch.ennio.sileno.creational.abstractfactory.ufocreationv2.enemyshipfactory.EnemyShipFactory;
import ch.ennio.sileno.creational.abstractfactory.ufocreationv2.enemyshipfactory.UFOBossEnemyShipFactory;
import ch.ennio.sileno.creational.abstractfactory.ufocreationv2.enemyshipfactory.UFOEnemyShipFactory;

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
