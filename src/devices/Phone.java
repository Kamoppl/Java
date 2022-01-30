package devices;

import com.company.Human;

public class Phone extends Devices  {
    public Phone(String producer, String model, Integer yearOfProduction, Double screenSize, String os) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.os = os;
    }

    Double screenSize;
    String os;


    public void turnOn() {
        System.out.println("wciśni guzik");
    }


    public void sale(Human seller, Human buyer, Double price) {
        if (buyer.cash < price) {
            System.out.println("nie masz $");
        } else if (seller.phone == null) {
            System.out.println("nie telefon");
        } else if (seller.phone == this) {
            seller.cash += price;
            buyer.cash -= price;
            seller.phone = null;
            buyer.phone = this;
            System.out.println("kupiłeś telefon");
        }
    }
}

