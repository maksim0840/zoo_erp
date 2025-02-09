package domains.animals;

import domains.Animal;
import interfaces.IAnimalType;

public class Rabbit extends Animal {
    public Rabbit(IAnimalType animalType, int food, int id) {
        super(animalType, food, id);
    }
}
