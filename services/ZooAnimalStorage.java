package services;

import domains.Animal;
import interfaces.IAnimalStorage;
import interfaces.IApprover;

import java.util.*;

import static java.util.Arrays.stream;

public class ZooAnimalStorage implements IAnimalStorage {
    private final List<Animal> animals = new ArrayList<>();
    private IApprover approver = null;

    @Override
    public List<Animal> getAnimals() {
        return animals;
    }

    public ZooAnimalStorage(IApprover approver) {
        this.approver = approver;
    }

    @Override
    public boolean addAnimal(Animal animal) {
        if (Objects.nonNull(approver)) {
            return false;
        }
        animals.add(animal);
        return true;
    }

    public  boolean addAnimal(Animal animal, int param) {
        if (Objects.nonNull(approver) && !approver.isApproved(param)) {
            return false;
        }
        animals.add(animal);
        return true;
    }

    @Override
    public boolean takeAnimal(Animal animal) {
        return animals.stream().filter(animal -> ObjectComparator.deepEquals(animal.getIdentificationName(), identificationName).findFirst();
    }

    @Override
    public Optional<Animal> takeAnimal(String identificationName) {
        return animals.stream().filter(animal -> animal.getIdentificationName() == identificationName).findFirst();
    }
}
