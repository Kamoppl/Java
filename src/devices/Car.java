package devices;


abstract public class Car extends Devices {
    String color;
    public Double value;

    public Car(String producer, String model, Integer yearOfProduction, String color, Double value) {
        super(producer, model, yearOfProduction);
        this.color = color;
        this.value = value;
    }

    public Car(String color, Double value) {
        super(color, value);
    }


    //pokazuje samochód
    public String toString() {
        return producer + " " + model + " " + color + " " + yearOfProduction + " " + value;
    }

    //konstruktor samochodu
    //  public Car(String color, Double value) {
    //    super("Poland", "BMW", 2000);
    //  this.color = color;
    //this.value = value;
    //}
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
}