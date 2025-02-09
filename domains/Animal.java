package domains;

import interfaces.IAlive;
import interfaces.IAnimalType;

public class Animal implements IAlive {
    private final IAnimalType animalType;
    private int food;
    private final int id;

    @Override
    public int getFood() {
        return this.food;
    }

    public Animal(IAnimalType animalType, int food, int id) {
        this.animalType = animalType;
        this.food = food;
        this.id = id;
    }

    public boolean isInteractiveAllowed() {
        return animalType.isInteractiveAllowed();
    }
}
