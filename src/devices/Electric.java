package devices;

public class Electric extends Car{


    public Electric(String producer, String model, Integer yearOfProduction, String color, Double value,String firstUserName) {
        super(producer, model, yearOfProduction, color, value);

        listOfOwners.add(firstUserName);
    }

    public void refuel() {

    }
}
