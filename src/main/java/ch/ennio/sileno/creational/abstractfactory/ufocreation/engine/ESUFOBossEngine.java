package ch.ennio.sileno.creational.abstractfactory.ufocreation.engine;

import ch.ennio.sileno.creational.abstractfactory.ufocreation.weapon.ESUFOBossGun;

public class ESUFOBossEngine extends ESUFOBossGun implements ESEngine {

    @Override
    public String toString() {
        return "2000 kmh";
    }
}
