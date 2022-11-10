package ch.ennio.sileno.creational.abstractfactory.ufocreationv2.enemyshippartsfactory;

import ch.ennio.sileno.creational.abstractfactory.ufocreationv2.engine.ESEngine;
import ch.ennio.sileno.creational.abstractfactory.ufocreationv2.engine.ESUFOEngine;
import ch.ennio.sileno.creational.abstractfactory.ufocreationv2.weapon.ESUFOGun;
import ch.ennio.sileno.creational.abstractfactory.ufocreationv2.weapon.ESWeapon;

public class UFOEnemyShipPartsFactory implements EnemyShipPartsFactory {

    @Override
    public ESWeapon createESGun() {
        return new ESUFOGun();
    }

    @Override
    public ESEngine createESEngine() {
        return new ESUFOEngine();
    }
}
