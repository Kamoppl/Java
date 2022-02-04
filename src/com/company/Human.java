package com.company;

import creatures.Animal;
import devices.Car;
import devices.Phone;

import java.util.Arrays;

public class Human extends Animal {
    private final int Default_Garage_Size = 3;
    String firstName;
    String lastName;
    Integer age;
    private Double salary;
    public Animal pet;
    public Double cash;
    public Phone phone;
    public Human human;
    public Car[] garage;


    //kons człowieka
    public Human(String firstName, String lastName, Integer age, Double salary, Double cash) {
        super("homo sapiens");

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.garage = new Car[Default_Garage_Size];
        this.cash = cash;
    }

 /*   Human(Integer garageSize) {

        super("homo sapiens");
        this.garage = new Car[garageSize];
    }*/

    @Override
    public String toString() {
        return "Human{" +
                "Default_Garage_Size=" + Default_Garage_Size +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", pet=" + pet +
                ", cash=" + cash +
                ", phone=" + phone +
                ", human=" + human +
                ", garage=" + Arrays.toString(garage) +
                '}';
    }

    //ustawia nowe wynagrodzenie
    void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Błąd");
        }
        if (salary > 0) {
            System.out.println("Księga została zaktualizowana");
            System.out.println("Prosze odebrać umowe od Pani Halinki");
            System.out.println("Zus i US wie o zmianie wypłaty");
            this.salary = salary;
        }

    }

    //ustawia wynagrodzenie
    Double getSalary() {
        System.out.println("wynagrodzenie:" + this.salary);
        System.out.println(java.time.LocalDate.now());
        System.out.println("wynagrodzenie:");
        return this.salary;
    }

    //Kupuje samochoód
    public void setCar(Car car, Integer parkingLotNumber) {
        if (car.value > this.salary) {
            System.out.println("Kupiłeś samochód za gotówkę");
            this.garage[parkingLotNumber] = car;
        } else if (car.value / 12.0 < this.salary) {
            System.out.println("Kupiłes auto na kredyt");
            this.garage[parkingLotNumber] = car;
        } else {
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }

    }

    public Car getCar(Integer parkingLotNumber) {
        return this.garage[parkingLotNumber];
    }

    public Integer countCars() {
        int CountedCars = 0;
        if (this.garage != null) {

            for (Car Car : this.garage) {

                CountedCars++;
            }


        }
        return CountedCars;
    }

    public void sortCars() {

        Arrays.sort(this.garage);

    }

    public void sale(Human seller, Human buyer, Double price) {
        System.out.println("Nie możesz kupic człowieka");
    }


    public boolean hasCar(Car car) {
        for (int i = 0; i + 1 <= this.garage.length; i++) {
            if (this.garage[i] == car) {

                return false;
            }

        }
        return true;
    }

    public boolean hasFreeParkingLot(Human buyer) {
        for (int i = 0; i < this.garage.length; i++)
            if (buyer.garage[i] == null) {
                return false;
            }
        return true;
    }

    public int fineNextFree() {

        int parkNr = 0;
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                return parkNr;
            } else {
                parkNr++;
            }

        }
        return 0;
    }


    public void addCar(Human seller, Human buyer, Car car) {

        int parkingNr = fineNextFree();
        System.out.println(parkingNr);

        buyer.garage[parkingNr] = seller.garage[parkingNr];


    }


    public void removeCar(Human seller, Car car) {
        int numberCar = Arrays.asList(car).indexOf(car);
        seller.garage[numberCar] = null;
    }
}