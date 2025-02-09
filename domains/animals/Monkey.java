package domains.animals;

import domains.Animal;
import interfaces.IAnimalType;

public class Monkey extends Animal {
    public Monkey(IAnimalType animalType, int food, int id) {
        super(animalType, food, id);
    }
}
