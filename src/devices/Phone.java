package devices;

import com.company.Human;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Devices {
    private static final String DEFAULT_APP_VERSION = "latest-stable";
    private static final String DEFAULT_SERVER_NAME = "wsb.apps";
    private static final String DEFAULT_URL = "https://wsb.pl";


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

    public void installAnApp(String appName) {
        System.out.println("instalowanie aplikacji" + appName);
        this.installAnApp(appName, DEFAULT_APP_VERSION);
    }

    public void installAnApp(String appName, String version) {
        System.out.println("instalowanie aplikacji" + appName + "w wersji" + version);
        this.installAnApp(appName, DEFAULT_SERVER_NAME);
    }

    public void installAnApp(String appName, String version, String server) {
        try {
            URL url = new URL("https", server, 443, appName + "-" + version);
            this.installAnApp(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        this.installAnApp(appName, DEFAULT_APP_VERSION);
    }
    public void installAnApp(URL URL) {
        System.out.println("Zapisano logi");
        System.out.println("Posiadasz wystaraczająco miejsca na instalacje");
        System.out.println("Instalacja jest płatna");
        System.out.println("Pobierania aplikacji");
        System.out.println("Rozpakowywanie");
        System.out.println("Instalacja");
    }

    public void installAnApp(List<String> appNames) {
        for (String appName : appNames) {
            this.installAnApp(appName);
        }
    }


}

