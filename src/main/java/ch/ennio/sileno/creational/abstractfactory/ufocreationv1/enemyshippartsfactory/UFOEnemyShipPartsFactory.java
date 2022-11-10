package ch.ennio.sileno.creational.abstractfactory.ufocreationv1.enemyshippartsfactory;

import ch.ennio.sileno.creational.abstractfactory.ufocreationv1.engine.ESEngine;
import ch.ennio.sileno.creational.abstractfactory.ufocreationv1.engine.ESUFOEngine;
import ch.ennio.sileno.creational.abstractfactory.ufocreationv1.weapon.ESUFOGun;
import ch.ennio.sileno.creational.abstractfactory.ufocreationv1.weapon.ESWeapon;

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
