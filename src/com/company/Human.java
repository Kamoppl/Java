package com.company;

import creatures.Animal;
import devices.Car;
import devices.Phone;

import java.util.Arrays;

public class Human extends Animal{
    private final int Default_Garage_Size=3;
    String firstName;
    String lastName;
    Integer age;
    private Double salary;
    public Animal pet;
    public Double cash;
    public Phone phone;
    public Human human;
    public Car[] garage ;


    //kons człowieka
    public Human(String firstName, String lastName, Integer age, Double salary) {
        super("homo sapiens");

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.garage= new Car[Default_Garage_Size];

    }
    Human(Integer garageSize){

        super("homo sapiens");
        this.garage=new[garageSize];
    }

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
    public void setCar(Car car) {
        if (car.value > this.salary) {
            System.out.println("Kupiłeś samochód za gotówkę");
            this.car = car;
        } else if (car.value / 12.0 < this.salary) {
            System.out.println("Kupiłes auto na kredyt");
            this.car = car;
        } else {
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }

    }

    public void sale(Human seller, Human buyer, Double price) {
        System.out.println("Nie możesz kupic człowieka");
    }

}