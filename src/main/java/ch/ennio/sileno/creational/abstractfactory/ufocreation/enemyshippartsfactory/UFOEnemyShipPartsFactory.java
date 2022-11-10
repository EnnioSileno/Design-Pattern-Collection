package ch.ennio.sileno.creational.abstractfactory.ufocreation.enemyshippartsfactory;

import ch.ennio.sileno.creational.abstractfactory.ufocreation.engine.ESEngine;
import ch.ennio.sileno.creational.abstractfactory.ufocreation.engine.ESUFOEngine;
import ch.ennio.sileno.creational.abstractfactory.ufocreation.weapon.ESUFOGun;
import ch.ennio.sileno.creational.abstractfactory.ufocreation.weapon.ESWeapon;

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
