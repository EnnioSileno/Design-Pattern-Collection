package ch.ennio.sileno.creational.abstractfactory.ufocreation;

import ch.ennio.sileno.creational.abstractfactory.ufocreation.enemyship.EnemyShip;

public abstract class EnemyShipBuilding {
    public EnemyShip orderTheShip(EnemyShipType enemyShipType) {
        EnemyShip enemyShip = makeEnemyShip(enemyShipType);

        enemyShip.assembleShip();
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
        return enemyShip;
    }

    protected abstract EnemyShip makeEnemyShip(EnemyShipType enemyShipType);
}
