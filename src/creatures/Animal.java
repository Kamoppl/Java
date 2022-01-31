
package creatures;

import com.company.Human;

public abstract class Animal implements Feedable {
    final String species;
    public String name;
    private Double weight;
    public Integer age;
    public Boolean alive;
    public Double DEFAULT_FOOD_WEIGHT = 1.0;

    //kostruktor zwierzecia
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
    //zwierze idzie na spacer
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


    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", alive=" + alive +
                '}';
    }



    //pokazuje zwierze
    public void introduceYourself() {
        System.out.println("I`m " + this.name);
    }

    //ustawiasz wage zwierząt
    Double getWeight() {
        return this.weight;
    }
    //ustawia wage
    public void setWeight(Double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("error");
        }
    }
    //pokazuje zwierze
    public boolean showAnimal() {
        System.out.println(this.species);
        System.out.println(this.name);
        System.out.println(this.weight);
        System.out.println(this.age);
        System.out.println("Żywy?");
        return this.alive;
    }

    public void sale(Human seller, Human buyer, Double price) {
        if (buyer.cash < price) {
            System.out.println("nie masz $");
        } else if (seller.pet == null) {
            System.out.println("nie maszzwierzęcia");
        } else if (seller.pet == this) {
            seller.cash += price;
            buyer.cash -= price;
            seller.pet = null;
            buyer.pet = this;
            System.out.println("kupiłeś zwirze");
        }
    }
    public void feed(){
            this.feed(DEFAULT_FOOD_WEIGHT);

    }
    public void feed(Double foodWeight){
        if (this.alive) {this.weight+=foodWeight;}

        else {
            System.out.println("Your animal is dead, how you want to feed him?");
        }
    }
}
