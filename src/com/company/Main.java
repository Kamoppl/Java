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
        Human me = new Human("0", "Gierszewski", 21, 3600.0, 10000000000.0);
        Human Human1 = new Human("1", "Kowal", 21, 5000.0, 50.0);
        Human Human2 = new Human("2", "Młotek", 21, 11000.0, 20000000000.0);
        //tworzenie zwierzęcia

        // System.out.println(me.pet.showAnimal());
        //tworzenie 2 samochodów
        Car myCar = new LPG("red", "volvo", 2000, "red", 20000.0, "ABC");
        Car notMyCar = new LPG("blue", "bmw", 2000, "grey", 20000.0, "CBA");
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

        Human1.garage[0] = new LPG("nievolvo", "szybki", 1000, "red", 20000.0, Human1.ownerName());
        Human2.garage[0] = new LPG("volvo", "wolny", 2000, "grey", 20000.0, Human2.ownerName());

        System.out.println(Human2.garage[0]);

        System.out.println(Human1.garage[0]);
        System.out.println(Human2.garage[0].howManyTransactions()+"tyle razy sprzedano");
        System.out.println(Human2.garage[0]);
        System.out.println("Czy on już był ownerem" + Human2.garage[0].checkIfHumanWasOwner(me));




/*
        me.garage[0].checkIfHumanASoldCarToHumanB(Human2,me);*/
        Human2.garage[0].sell(Human2, me, 2000.0, 0);


        System.out.println(me.garage[0].checkIfHumanASoldCarToHumanB(Human1,me)+"to skomplikowane a czy sprzedało   b");
        System.out.println(me.garage[0].checkIfHumanASoldCarToHumanB(Human2,me)+"to skomplikowane a czy sprzedało   b");




        System.out.println("Czy on już był ownerem" + me.garage[0].checkIfHumanWasOwner(Human1));
        System.out.println("Czy on już był ownerem" + me.garage[0].checkIfHumanWasOwner(Human2));

        System.out.println(Human2.garage[0]);
        System.out.println(Human1.garage[0]);
        System.out.println(me.garage[0].listOfOwners);

        System.out.println(me.garage[0].howManyTransactions()+"tyle razy sprzedano");


/*

        Human2.garage[2].sell(Human2,Human1,2000.0,2);
        Human1.garage[0].sell(Human1,me,2000.0,0);
        me.garage[0].sell(me,Human1,2000.0,0);
        Human1.garage[0].sell(Human1,me,2000.0,0);
*/




/*
        System.out.println(Human1.garage[0]);
        System.out.println(Human1.garage[1]);
        System.out.println(Human1.garage[2]);
        System.out.println(Human2.garage[0]+"bbbbbbbbb");
        System.out.println(Human2.garage[1]);
        System.out.println(Human1.garage[0]);
        System.out.println(Human1.garage[1]);
        System.out.println(Human1.garage[2]);
        System.out.println(Human2.garage[0]+"aaaaa");
        System.out.println(Human2.garage[1]);
        System.out.println(Human2.garage[2]);

*/


    }
}