package ch.ennio.sileno.creational.abstractfactory.ufocreation.enemyship;

import ch.ennio.sileno.creational.abstractfactory.ufocreation.engine.ESEngine;
import ch.ennio.sileno.creational.abstractfactory.ufocreation.weapon.ESWeapon;

public abstract class EnemyShip {

    protected String name;
    protected ESWeapon weapon;
    protected ESEngine engine;

    public abstract void assembleShip();

    public void displayEnemyShip() {
        System.out.println(name + " is on the screen");
    }

    public void followHeroShip() {
        System.out.println(name + " is following the hero at: " + engine);
    }

    public void enemyShipShoots() {
        System.out.println(name + " attacks and does: " + weapon);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "The " + name + " has a top speed of: " + engine + " " +
                "and an attack power of: " + weapon;
    }
}
