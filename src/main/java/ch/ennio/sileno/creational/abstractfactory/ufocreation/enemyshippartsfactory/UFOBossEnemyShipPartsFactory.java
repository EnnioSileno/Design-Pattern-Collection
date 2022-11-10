package ch.ennio.sileno.creational.abstractfactory.ufocreation.enemyshippartsfactory;

import ch.ennio.sileno.creational.abstractfactory.ufocreation.engine.ESEngine;
import ch.ennio.sileno.creational.abstractfactory.ufocreation.engine.ESUFOBossEngine;
import ch.ennio.sileno.creational.abstractfactory.ufocreation.weapon.ESUFOBossGun;
import ch.ennio.sileno.creational.abstractfactory.ufocreation.weapon.ESWeapon;

public class UFOBossEnemyShipPartsFactory implements EnemyShipPartsFactory {
    @Override
    public ESWeapon createESGun() {
        return new ESUFOBossGun();
    }

    @Override
    public ESEngine createESEngine() {
        return new ESUFOBossEngine();
    }
}
