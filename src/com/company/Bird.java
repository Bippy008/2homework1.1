package com.company;

public class Bird extends Animal{
    private int flyHeight; // высота полета в метрах
    private Colours colour;

    public Bird(String name, int age, int flyHeight, Colours colour) {
        super(name, age);
        this.flyHeight = flyHeight;
        this.colour = colour;
    }

    public int getFlyHeight() {
        return flyHeight;
    }

    public Colours getColour() {
        return colour;
    }

    public void birdScream() {
        System.out.println("Пилик");
    }

    public final void birdScream(String scream) {
        System.out.println(scream);
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nFly height: " + this.flyHeight +
                "\nColour: " + this.colour;
    }
}
