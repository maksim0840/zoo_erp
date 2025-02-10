package interfaces;

import domains.Animal;

import java.util.List;
import java.util.Optional;

public interface IAnimalStorage {
    public List<Animal> getAnimals();
    public boolean addAnimal(Animal animal);
    public boolean takeAnimal(Animal animal);
    public Optional<Animal> takeAnimal(String identificationName);
}
