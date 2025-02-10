package services;

import domains.Animal;
import interfaces.IAnimalStorage;

import java.util.List;

public class ZooAnimalService {
    IAnimalStorage animalStorage;

    public ZooAnimalService(IAnimalStorage animalStorage) {
        this.animalStorage = animalStorage;
    }

    public int getTotalFood() {

    }

    public List<Animal> getInteractiveAnimals() {

    }

    public List<Animal> getAnimalsNumber() {
        return this.animalStorage.getAnimals().size();
    }
}
