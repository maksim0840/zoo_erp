package domains.animals;

import domains.Animal;
import interfaces.IAnimalType;

public class Tiger extends Animal {
    public Tiger(IAnimalType animalType, int food, int id) {
        super(animalType, food, id);
    }
}
