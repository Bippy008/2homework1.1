package com.company;

public class Main {

    public static void main(String[] args) {

        Bird crow = new Bird("Crow", 10, 200, Colours.BLACK);
        Weapon weapon1 = new Weapon("Grogar", 100);
        Weapon weapon2 = new Weapon("Barbar", 50);
        Parrot cockatiel = new Parrot("Cockatiel", 7, 100,
                Colours.BLUE, weapon1, new String[]{"fly", "sing"});
        Parrot ara = new Parrot("Ara", 11, 150,
                Colours.GREEN, weapon2, new String[]{"sing", "fight"});
        System.out.println("______________________");
        System.out.println(crow.getInfo());
        System.out.println("______________________");
        System.out.println(cockatiel.getInfo());
        System.out.println("______________________");//также можно сделать в массив и вызвать через фор
        System.out.println(ara.getInfo());           // если планируется больше объектов
        System.out.println("______________________");

        crow.birdScream("Кар кар кар");
        cockatiel.birdScream();
        ara.birdScream("Чиииииииирик!!!!");
    }
}
