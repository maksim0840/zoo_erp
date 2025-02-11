package erp.services;

import erp.domains.Animal;
import erp.interfaces.IAnimalStorage;

import java.util.List;
import java.util.stream.Collectors;

public class ZooAnimalService {
    IAnimalStorage animalStorage;

    public ZooAnimalService(IAnimalStorage animalStorage) {
        this.animalStorage = animalStorage;
    }

    public int getTotalFood() {
        return this.animalStorage.getAnimals().stream()
                .mapToInt(Animal::getFood).sum();
    }

    public List<Animal> getInteractiveAnimals() {
        return this.animalStorage.getAnimals().stream()
                .filter(Animal::isInteractiveAllowed)
                .collect(Collectors.toList());
    }

    public int getAnimalsNumber() {
        return this.animalStorage.getAnimals().size();
    }

    public List<String> getAnimalsIdentificationName() {
        return this.animalStorage.getAnimals().stream()
                .map(Animal::getIdentificationName)
                .collect(Collectors.toList());
    }
}
