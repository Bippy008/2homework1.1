package com.company;

import java.util.Arrays;

public final class Parrot extends Bird{
    private Weapon parrotsWeapon;
    private String[] commands;

    public Parrot(String name, int age, int flyHeight, Colours colour, Weapon parrotsWeapon, String[] commands) {
        super(name, age, flyHeight, colour);
        this.parrotsWeapon = parrotsWeapon;
        this.commands = commands;
    }

    public Weapon getParrotsWeapon() {
        return parrotsWeapon;
    }

    public String[] getCommands() {
        return commands;
    }

    @Override
    public void birdScream() {
        System.out.println("АААААА"); // попугаи кричат
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nWeapon name: " + this.parrotsWeapon.getName() +
                "\nWeapon strength: " + this.parrotsWeapon.getStrength() +
                "\nCommands: " + Arrays.toString(this.commands);
    }
}
