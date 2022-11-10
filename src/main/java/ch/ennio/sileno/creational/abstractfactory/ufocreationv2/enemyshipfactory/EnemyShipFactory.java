package ch.ennio.sileno.creational.abstractfactory.ufocreationv2.enemyshipfactory;

import ch.ennio.sileno.creational.abstractfactory.ufocreationv2.enemyship.EnemyShip;

public abstract class EnemyShipFactory {
    public EnemyShip orderShip() {
        EnemyShip enemyShip = makeEnemyShip();

        enemyShip.assembleShip();
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
        return enemyShip;
    }

    protected abstract EnemyShip makeEnemyShip();
}
