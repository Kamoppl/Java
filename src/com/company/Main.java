package com.company;

public class Main {

    public static void main(String[] args) {
        //tworzy zwierzęta
        Animal dog = new Animal("canis");
        Animal cat = new Animal("felis");
        dog.name = "Burek";
        dog.setWeight(50.0);
        dog.age = 10;
        cat.name = "Mruczek";
        cat.setWeight(4.0);
        cat.age = 6;


        // zwierzęta się przedstawiaja
        if (dog.alive) {
            dog.introduceYourself();
        }
        if (cat.alive) {
            cat.introduceYourself();
        }
        //spacer,karmienie petów
        cat.takeForWalk();
        cat.feed();
        //tworzenie ludzi
        Human me = new Human("Kamil", "Gierszewski", 21, 3600.0);
        Human Human1 = new Human("Andrzej", "Kowal", 21, 5000.0);
        Human Human2 = new Human("Andrzej", "Młotek", 21, 11000.0);
        //tworzenie zwierzęcia
        me.pet = new Animal("Chameleon", "Pimpek", 0.5, 2, true);
        System.out.println(me.pet.showAnimal());
        //tworzenie 2 samochodów
        Car myCar = new Car("red", 200000.0);
        Car notMyCar = new Car("red", 200000.0);
        if (myCar.hashCode() == notMyCar.hashCode()) {
            System.out.println("Tak");

        } else System.out.println("nie");

        //test wszystkiego

        me.setSalary(5000.0);
        me.setCar(myCar);
        System.out.println(me.toString());
        System.out.println(myCar.toString());
        System.out.println(cat.toString());
        me.setSalary(6000.0);
        System.out.println(dog);
        System.out.println(myCar);
        System.out.println(notMyCar);
        System.out.println("llllllllllllllllllll");
        System.out.println(myCar.hashCode());
        System.out.println(myCar);
    }
}