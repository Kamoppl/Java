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



    }


}
