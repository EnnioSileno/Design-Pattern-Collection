package ch.ennio.sileno.creational.abstractfactory.ufocreationv2.enemyship;

import ch.ennio.sileno.creational.abstractfactory.ufocreationv2.enemyshippartsfactory.EnemyShipPartsFactory;

public class UFOBossEnemyShip extends EnemyShip {

    EnemyShipPartsFactory enemyShipPartsFactory;
    public UFOBossEnemyShip(EnemyShipPartsFactory enemyShipPartsFactory) {
        this.enemyShipPartsFactory = enemyShipPartsFactory;
    }

    @Override
    public void assembleShip() {
        System.out.println("Assembling enemy ship " + name);

        weapon = enemyShipPartsFactory.createESGun();
        engine = enemyShipPartsFactory.createESEngine();
    }
}
