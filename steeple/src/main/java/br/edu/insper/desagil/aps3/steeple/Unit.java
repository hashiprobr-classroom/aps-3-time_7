package br.edu.insper.desagil.aps3.steeple;

public abstract class Unit extends Element {
    private int power;
    private int health;

    public Unit(int x, int y, int power, int health) {
        super(x, y, 1, 1);
        this.power = power;
        this.health = health;
    }

    @Override
    public void setX(int x) {
        super.setX(x);
    }

    @Override
    public void setY(int y) {
        super.setY(y);
    }

    public int getPower() {
        return power;
    }

    public int getHealth() {
        return health;
    }

    public void increaseHealth(int gain) {
        health += gain;
    }

    public void decreaseHealth(int loss) {
        health -= loss;
    }
}
