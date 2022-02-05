package devices;


import com.company.Human;

import java.util.ArrayList;
import java.util.List;

abstract public class Car extends Devices {
    String color;
    public Double value;
    public ArrayList<String> listOfOwners = new ArrayList<String>();

    public Car(String producer, String model, Integer yearOfProduction, String color, Double value) {
        super(producer, model, yearOfProduction);
        this.color = color;
        this.value = value;

    }


    //konstruktor samochodu
    public Car(String color, Double value) {
        super("Poland", "BMW", 2000);
        this.color = color;
        this.value = value;
    }

    public boolean showCar() {
        //pokazanie samochodu
        System.out.println("My car is " + this.model);
        System.out.println("My car was made in  " + this.producer);
        System.out.println("It was made in " + this.yearOfProduction);
        System.out.println("Color of my car is " + this.color);
        System.out.println("Year of production of my car is " + this.yearOfProduction);
        System.out.println("Total value of my Car is " + this.value);
        return true;
    }

    //odpala samochód
    public void turnOn() {
        System.out.println("przekreć kluczyk");
    }

    abstract public void refuel();

    public void sell(Human seller, Human buyer, Double price, Integer parkingSellerNumber) {
        if (buyer.cash < price) {
            System.out.println("kupujący ma za mało kasy");

        } else if (seller.ownerName() != this.listOfOwners.get(listOfOwners.size() - 1)) {
            System.out.println("sprzedający nie ma auta");
        } else if (buyer.hasFreeParkingLot(buyer)) {
            System.out.println("kupujący nie ma miejsca");
        } else {
            System.out.println(seller.ownerName());

            System.out.println(this.listOfOwners);
            System.out.println(this.listOfOwners.get(listOfOwners.size() - 1));

            seller.cash += price;
            buyer.cash -= price;

            buyer.addCar(seller, buyer, parkingSellerNumber);
            this.listOfOwners.add(buyer.ownerName());


            System.out.println("Transakcja się powiodła");
        }

    }


    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", value=" + value +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public boolean checkIfHumanWasOwner(Human human) {
        for (int i = 0; i < listOfOwners.size(); i++)
            if (human.ownerName() == this.listOfOwners.get(i)) {
                System.out.println(human.ownerName());
                System.out.println(this.listOfOwners.get(i));
                return true;
            }
        return false;
    }

    public boolean checkIfHumanASoldCarToHumanB(Human a, Human b) {
        for (int i = 0; i < listOfOwners.size(); i++) {
            if (this.listOfOwners.get(i) == a.getFirstName() && this.listOfOwners.get(i + 1) == b.getFirstName()) {
                return true;
            }

        }

        return false;
    }

    public Integer howManyTransactions() {
        return this.listOfOwners.size() - 1;
    }
}