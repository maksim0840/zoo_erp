package erp;

import erp.domains.Animal;
import erp.domains.Herbo;
import erp.domains.Predator;
import erp.domains.animals.Monkey;
import erp.domains.animals.Rabbit;
import erp.domains.animals.Tiger;
import erp.domains.animals.Wolf;
import erp.domains.things.Computer;
import erp.interfaces.IAnimalStorage;
import erp.services.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@SpringBootApplication
public class ZooErpApplication {
    public static void main(String[] args) {
        VetClinic vetClinic = new VetClinic();

        Wolf wolf = new Wolf(new Predator(), 199, "wolfName");
        Rabbit rabbit = new Rabbit(new Herbo(10), 30, "rabbitName");
        Tiger tiger = new Tiger(new Predator(), 575, "tigerName");
        Monkey monkey = new Monkey(new Predator(), 100, "monkeyName");

        ZooAnimalStorage animalStorage = new ZooAnimalStorage(vetClinic);
        animalStorage.addAnimal(wolf, 10);
        animalStorage.addAnimal(rabbit, 20);
        animalStorage.addAnimal(tiger, 30);
        animalStorage.addAnimal(monkey, 40);
        ZooAnimalService animalService = new ZooAnimalService(animalStorage);

        ZooThingStorage thingStorage = new ZooThingStorage();
        ZooThingService thingService = new ZooThingService(thingStorage);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите команду: ");
            String command = scanner.nextLine().trim();

            switch (command.toLowerCase()) {
                // ZooAnimalService
                case "gettotalfood" -> System.out.println(animalService.getTotalFood());
                case "getinteractiveanimals" -> animalService.getInteractiveAnimals().stream()
                            .map(Animal::toString).forEach(System.out::println);
                case "getanimalsnumber" -> System.out.println(animalService.getAnimalsNumber());
                case "getanimalsidentificationname" -> animalService.getAnimalsIdentificationName().stream()
                        .forEach(System.out::println);
                // ZooAnimalStorage
                case "addanimal" -> {
                    System.out.println("(type):");
                    ...............................
                    System.out.println("(food):");
                    System.out.println("(name):");
                }
            }
            System.out.println("-----------");
        }

    }
}
/*
getTotalFood
getInteractiveAnimals
getAnimalsNumber
getAnimalsIdentificationName

addAnimal
takeAnimal
 */
