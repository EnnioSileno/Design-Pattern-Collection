package ch.ennio.sileno.creational.abstractfactory.ufocreation.factory;

import ch.ennio.sileno.creational.abstractfactory.ufocreation.engine.ESEngine;
import ch.ennio.sileno.creational.abstractfactory.ufocreation.weapon.ESWeapon;

public interface EnemyShipPartsFactory {

    public ESWeapon addESGun();
    public ESEngine addESEngine();
}
