package ch.ennio.sileno.creational.abstractfactory.ufocreationv1;

import ch.ennio.sileno.creational.abstractfactory.ufocreationv1.enemyship.EnemyShip;

import static ch.ennio.sileno.creational.abstractfactory.ufocreationv1.EnemyShipType.*;

public class EnemyShipClient {
    public static void main(String[] args) {
        EnemyShipBuilding makeUFOs = new UFOEnemyShipBuilding();

        EnemyShip theGrunt = makeUFOs.orderTheShip(UFO);
        System.out.println(theGrunt);

        EnemyShip theBoss = makeUFOs.orderTheShip(THE_BOSS);
        System.out.println(theBoss);
    }
}
