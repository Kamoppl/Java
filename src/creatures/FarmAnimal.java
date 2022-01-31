package creatures;

import com.company.Edible;

public class FarmAnimal extends Animal implements Edible {
    public FarmAnimal(String species, String name, Double weight, Integer age, Boolean alive) {
        super(species, name, weight, age, alive);
    }


    public void beEaten() {

    }
}
