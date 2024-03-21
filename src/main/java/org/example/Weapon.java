package org.example;

public enum Weapon {
    SWORD(10, 1.5),
    SHIELD(5, 0.8),
    GUN(15, 2.0);

    private int damage;
    private double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
