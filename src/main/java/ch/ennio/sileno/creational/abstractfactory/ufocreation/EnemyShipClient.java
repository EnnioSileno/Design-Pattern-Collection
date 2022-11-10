package ch.ennio.sileno.creational.abstractfactory.ufocreation;

import ch.ennio.sileno.creational.abstractfactory.ufocreation.enemyship.EnemyShip;

import static ch.ennio.sileno.creational.abstractfactory.ufocreation.EnemyShipType.*;

public class EnemyShipClient {
    public static void main(String[] args) {
        EnemyShipBuilding makeUFOs = new UFOEnemyShipBuilding();

        EnemyShip theGrunt = makeUFOs.orderTheShip(UFO);
        System.out.println(theGrunt);

        EnemyShip theBoss = makeUFOs.orderTheShip(THE_BOSS);
        System.out.println(theBoss);
    }
}
