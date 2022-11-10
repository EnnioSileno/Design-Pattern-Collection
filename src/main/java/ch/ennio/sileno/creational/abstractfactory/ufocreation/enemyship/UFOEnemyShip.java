package ch.ennio.sileno.creational.abstractfactory.ufocreation.enemyship;

import ch.ennio.sileno.creational.abstractfactory.ufocreation.factory.EnemyShipPartsFactory;

public class UFOEnemyShip extends EnemyShip {

    EnemyShipPartsFactory enemyShipPartsFactory;

    public UFOEnemyShip(EnemyShipPartsFactory enemyShipPartsFactory) {
        this.enemyShipPartsFactory = enemyShipPartsFactory;
    }

    @Override
    public void assembleShip() {
        System.out.println("Assembling enemy ship " + name);

        weapon = enemyShipPartsFactory.addESGun();
        engine = enemyShipPartsFactory.addESEngine();
    }
}
