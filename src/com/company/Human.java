package com.company;

import devices.Car;
import devices.Phone;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    private Double salary;
    public Animal pet;
    public Double cash;
    public Phone phone;
    private Car car;
    public Human human;

    //kons człowieka
    public Human(String firstName, String lastName, Integer age, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String toString() {
        return firstName + " " + lastName + " " + age + " " + salary + " " + pet;

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
}