package devices;

import com.company.Human;
import com.company.Main;

public class LPG extends Car  {

    public LPG(String producer, String model, Integer yearOfProduction, String color, Double value,String firstUserName) {
        super(producer, model, yearOfProduction, color, value);

    listOfOwners.add(firstUserName);
    }




    public void refuel() {

    }
}
