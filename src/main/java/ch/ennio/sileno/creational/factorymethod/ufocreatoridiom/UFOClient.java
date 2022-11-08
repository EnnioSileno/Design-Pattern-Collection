package ch.ennio.sileno.creational.factorymethod.ufocreatoridiom;

import ch.ennio.sileno.creational.factorymethod.ufocreatoridiom.ship.EnemyShip;

import java.util.Scanner;


// Client
public class UFOClient {
    private static final EnemyShipFactory SHIP_FACTORY = new EnemyShipFactory();

    public static void main(String[] args) {

        EnemyShip enemyShip = null;

        Scanner userInput = new Scanner(System.in);

        System.out.println("What type of ship? Enter: U / R / B");
        if(userInput.hasNext()) {
            String typeOfShip = userInput.nextLine();

            enemyShip = makeEnemyShip(typeOfShip);

            if(enemyShip != null) {
                System.out.println(enemyShip + " has been built.");
            } else {
                System.out.println("Type of ship not recognized.");
            }
        }
    }

    private static EnemyShip makeEnemyShip(String typeOfShip) {
        return SHIP_FACTORY.makeEnemyShip(typeOfShip);
    }
}
