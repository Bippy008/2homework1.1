package com.company;

public class Weapon {
    private String name;
    private int strength;

    public Weapon(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public void weaponInfo() {
        System.out.println("Имя оружия - " + this.name +
                "; Сила оружия - " + this.strength);
    }
}
