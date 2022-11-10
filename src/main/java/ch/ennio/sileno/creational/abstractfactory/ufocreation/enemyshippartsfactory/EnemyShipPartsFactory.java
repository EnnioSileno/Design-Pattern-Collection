package ch.ennio.sileno.creational.abstractfactory.ufocreation.enemyshippartsfactory;

import ch.ennio.sileno.creational.abstractfactory.ufocreation.engine.ESEngine;
import ch.ennio.sileno.creational.abstractfactory.ufocreation.weapon.ESWeapon;

public interface EnemyShipPartsFactory {

    public ESWeapon createESGun();
    public ESEngine createESEngine();
}
