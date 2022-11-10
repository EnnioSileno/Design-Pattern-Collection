package ch.ennio.sileno.creational.abstractfactory.ufocreationv1.enemyshippartsfactory;

import ch.ennio.sileno.creational.abstractfactory.ufocreationv1.engine.ESEngine;
import ch.ennio.sileno.creational.abstractfactory.ufocreationv1.engine.ESUFOBossEngine;
import ch.ennio.sileno.creational.abstractfactory.ufocreationv1.weapon.ESUFOBossGun;
import ch.ennio.sileno.creational.abstractfactory.ufocreationv1.weapon.ESWeapon;

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
