package devices;


public abstract class Devices {

    final String  producer;
    final String model;
    final Integer yearOfProduction;

    public Devices(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }
    abstract public void turnOn();
}
