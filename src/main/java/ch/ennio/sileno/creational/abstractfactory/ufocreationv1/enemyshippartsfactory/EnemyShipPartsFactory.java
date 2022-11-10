package ch.ennio.sileno.creational.abstractfactory.ufocreationv1.enemyshippartsfactory;

import ch.ennio.sileno.creational.abstractfactory.ufocreationv1.engine.ESEngine;
import ch.ennio.sileno.creational.abstractfactory.ufocreationv1.weapon.ESWeapon;

public interface EnemyShipPartsFactory {

    public ESWeapon createESGun();
    public ESEngine createESEngine();
}
