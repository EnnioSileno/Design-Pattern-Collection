package ch.ennio.sileno.creational.factorymethod.ufocreatoridiom.ship;

// Product
public abstract class EnemyShip {
    private String name;
    private double speed;

    private double damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "EnemyShip{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", damage=" + damage +
                '}';
    }
}
