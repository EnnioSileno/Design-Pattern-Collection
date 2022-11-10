package ch.ennio.sileno.creational.abstractfactory.ufocreationv1.enemyship;

import ch.ennio.sileno.creational.abstractfactory.ufocreationv1.enemyshippartsfactory.EnemyShipPartsFactory;

public class UFOEnemyShip extends EnemyShip {

    EnemyShipPartsFactory enemyShipPartsFactory;

    public UFOEnemyShip(EnemyShipPartsFactory enemyShipPartsFactory) {
        this.enemyShipPartsFactory = enemyShipPartsFactory;
    }

    @Override
    public void assembleShip() {
        System.out.println("Assembling enemy ship " + name);

        weapon = enemyShipPartsFactory.createESGun();
        engine = enemyShipPartsFactory.createESEngine();
    }
}
