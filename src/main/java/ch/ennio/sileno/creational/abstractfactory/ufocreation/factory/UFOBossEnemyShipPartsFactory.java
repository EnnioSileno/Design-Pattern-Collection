package ch.ennio.sileno.creational.abstractfactory.ufocreation.factory;

import ch.ennio.sileno.creational.abstractfactory.ufocreation.engine.ESEngine;
import ch.ennio.sileno.creational.abstractfactory.ufocreation.engine.ESUFOBossEngine;
import ch.ennio.sileno.creational.abstractfactory.ufocreation.weapon.ESUFOBossGun;
import ch.ennio.sileno.creational.abstractfactory.ufocreation.weapon.ESWeapon;

public class UFOBossEnemyShipPartsFactory implements EnemyShipPartsFactory {
    @Override
    public ESWeapon addESGun() {
        return new ESUFOBossGun();
    }

    @Override
    public ESEngine addESEngine() {
        return new ESUFOBossEngine();
    }
}
