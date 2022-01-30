
package com.company;

public class Animal {
    final String species;
    String name;
    private Double weight;
    Integer age;
    Boolean alive;

    public Animal(String species, String name, Double weight, Integer age, Boolean alive) {
        this.species = species;
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.alive = alive;


    }

    //stworzenie zwierząt
    public Animal(String species) {
        this.species = species;
        this.alive = true;
        if (species == "canis")
            this.weight = 10.0;
        if (species == "felis")
            this.weight = 2.0;
        else
            this.weight = 1.0;
    }

    public void takeForWalk() {
        if (this.alive) {
            weight = weight - 1.0;
            if (weight <= 0.0) {
                System.out.print("Your animal has died");
                this.alive = false;
            }
        } else {
            System.out.println("Your anima is dead, how you want to take him for a walk. Unless you are necromancer");
        }
    }

    public void feed() {
        if (this.alive) weight = weight + 1.0;

        else {
            System.out.println("Your animal is dead, how you want to feed him?");
        }

    }

    public void introduceYourself() {
        System.out.println("I`m " + this.name);
    }

    //ustawiasz wage zwierząt
    Double getWeight() {
        return this.weight;
    }

    public void setWeight(Double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("error");
        }
    }
    public boolean showAnimal() {
        System.out.println(this.species);
        System.out.println(this.name);
        System.out.println(this.weight);
        System.out.println(this.age);
        System.out.println("Żywy?");
        return this.alive;
    }
}
