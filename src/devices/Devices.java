package devices;


public abstract class Devices {

     String  producer;
     String model;
     Integer yearOfProduction;

    public Devices(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public Devices(String color, Double value) {

    }

    abstract public void turnOn();
}
