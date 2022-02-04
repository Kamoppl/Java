package com.company;

import creatures.Animal;
import creatures.Feedable;
import devices.Car;
import devices.LPG;

import javax.swing.event.HyperlinkEvent;

public class Main implements Feedable {

    public static void main(String[] args) {
        //tworzy zwierzęta
        //  Animal dog = new Animal("canis");
        //Animal cat = new Animal("felis");
        //dog.name = "Burek";
        //dog.setWeight(50.0);
        //dog.age = 10;
        //cat.name = "Mruczek";
        //cat.setWeight(4.0);
        //cat.age = 6;


        // zwierzęta się przedstawiaja
        // if (dog.alive) {
        //    dog.introduceYourself();
        // }
        // if (cat.alive) {
        // cat.introduceYourself();
        //}
        //spacer,karmienie petów
        //cat.takeForWalk();
        //cat.feed();
        //tworzenie ludzi
        Human me = new Human("Kamil", "Gierszewski", 21, 3600.0,10000000000.0);
        Human Human1 = new Human("Andrzej", "Kowal", 21, 5000.0,50.0);
        Human Human2 = new Human("Andrzej", "Młotek", 21, 11000.0,20000000000.0);
        //tworzenie zwierzęcia

        // System.out.println(me.pet.showAnimal());
        //tworzenie 2 samochodów
        Car myCar = new LPG("red", "volvo",2000,"red",20000.0);
        Car notMyCar = new LPG("blue", "bmw",2000,"grey",20000.0);
        // if (myCar.hashCode() == notMyCar.hashCode()) {
        //    System.out.println("Tak");
        // } else System.out.println("nie");
        //  //porównuje samochody
        if (myCar.hashCode() == notMyCar.hashCode()) {
            System.out.println("Tak");
            //
            // } else System.out.println("nie");
            // LPG Szybki = new LPG("red",20.0);
            // Szybki.refuel();
            // Szybki.turnOn();
            // Szybki.toString();
        }
        Human1.garage[0]=new LPG("volvo", "wolny",2000,"grey",20000.0);
        Human1.garage[1]=new LPG("volvo", "wolny",2000,"grey",20000.0);
        Human1.garage[2]=new LPG("volvo", "wolny",2000,"grey",20000.0);
        Human2.garage[0]=new LPG("bmw", "szybki",2000,"grey",20000.0);
        Human2.garage[1]=new LPG("bmw", "szybki",2000,"grey",20000.0);



        System.out.println(Human1.garage[0]);
        System.out.println(Human1.garage[1]);
        System.out.println(Human1.garage[2]);
        System.out.println(Human2.garage[0]+"bbbbbbbbb");
        System.out.println(Human2.garage[1]);
        System.out.println(Human2.garage[2]);

        Human1.garage[0].sell(Human1,Human2,2000.0);
        System.out.println(Human1.garage[0]);
        System.out.println(Human1.garage[1]);
        System.out.println(Human1.garage[2]);
        System.out.println(Human2.garage[0]+"aaaaa");
        System.out.println(Human2.garage[1]);
        System.out.println(Human2.garage[2]);




    }
}