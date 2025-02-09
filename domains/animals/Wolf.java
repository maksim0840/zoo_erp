package domains.animals;

import domains.Animal;
import interfaces.IAnimalType;

public class Wolf extends Animal {
    public Wolf(IAnimalType animalType, int food, int id) {
        super(animalType, food, id);
    }
}
