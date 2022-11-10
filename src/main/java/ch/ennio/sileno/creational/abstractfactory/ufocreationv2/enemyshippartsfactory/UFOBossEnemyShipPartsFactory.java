package ch.ennio.sileno.creational.abstractfactory.ufocreationv2.enemyshippartsfactory;

import ch.ennio.sileno.creational.abstractfactory.ufocreationv2.engine.ESEngine;
import ch.ennio.sileno.creational.abstractfactory.ufocreationv2.engine.ESUFOBossEngine;
import ch.ennio.sileno.creational.abstractfactory.ufocreationv2.weapon.ESUFOBossGun;
import ch.ennio.sileno.creational.abstractfactory.ufocreationv2.weapon.ESWeapon;

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
