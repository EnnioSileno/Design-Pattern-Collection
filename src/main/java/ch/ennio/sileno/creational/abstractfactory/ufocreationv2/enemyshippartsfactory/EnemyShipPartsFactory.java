package ch.ennio.sileno.creational.abstractfactory.ufocreationv2.enemyshippartsfactory;

import ch.ennio.sileno.creational.abstractfactory.ufocreationv2.engine.ESEngine;
import ch.ennio.sileno.creational.abstractfactory.ufocreationv2.weapon.ESWeapon;

public interface EnemyShipPartsFactory {

    public ESWeapon createESGun();
    public ESEngine createESEngine();
}
