package ch.ennio.sileno.creational.abstractfactory.ufocreation.enemyshipfactory;

import ch.ennio.sileno.creational.abstractfactory.ufocreation.enemyship.EnemyShip;

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
