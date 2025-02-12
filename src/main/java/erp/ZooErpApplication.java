import erp.domains.Animal;
import erp.domains.Herbo;
import erp.domains.Predator;
import erp.domains.Thing;
import erp.domains.animals.Monkey;
import erp.domains.animals.Rabbit;
import erp.domains.animals.Tiger;
import erp.domains.animals.Wolf;
import erp.domains.things.Computer;
import erp.domains.things.Table;
import erp.interfaces.IAnimalStorage;
import erp.interfaces.IAnimalType;
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
                case "gettotalfood" -> gettotalfood(animalService);
                case "getinteractiveanimals" -> getinteractiveanimals(animalService);
                case "getanimalsnumber" -> getanimalsnumber(animalService);
                case "getanimalsidentificationname" -> getanimalsidentificationname(animalService);
                // ZooAnimalStorage
                case "addanimal" -> addanimal(scanner, animalStorage);
                case "takeanimal" -> takeanimal(scanner, animalStorage);
                case "getanimals" -> getanimals(animalStorage);
                // ZooThingService
                case "getthingsnumber" -> getthingsnumber(thingService);
                // ZooThingStorage
                case "addthing" -> addthing(scanner, thingStorage);
                case "takething" -> takething(scanner, thingStorage);
                case "getthings" -> getthings(thingStorage);
                default -> System.out.println("Ошибка: неизвестная команда");
            }
            System.out.println("-----------");
        }

    }

    // ZooAnimalService
    static void gettotalfood(ZooAnimalService animalService) {
        System.out.println(animalService.getTotalFood());
    }
    static void getinteractiveanimals(ZooAnimalService animalService) {
        animalService.getInteractiveAnimals().stream().map(Animal::toString).forEach(System.out::println);
    }
    static void getanimalsnumber(ZooAnimalService animalService) {
        System.out.println(animalService.getAnimalsNumber());
    }
    static void getanimalsidentificationname(ZooAnimalService animalService) {
        animalService.getAnimalsIdentificationName().stream().forEach(System.out::println);
    }

    // ZooAnimalStorage
    static void addanimal(Scanner scanner, ZooAnimalStorage animalStorage) {
        System.out.print("(type): ");
        String inputType = scanner.nextLine().trim();
        IAnimalType type = null;

        switch (inputType.toLowerCase()) {
            case "Predator" -> type = new Predator();
            case "Herbo" -> {
                System.out.print("(kindness): ");
                int inputKindness = scanner.nextInt();
                scanner.nextLine();
                type = new Herbo(inputKindness);
            }
            default -> {
                System.out.println("Ошибка: неизвестный тип животного");
                return;
            }
        }

        System.out.print("(food): ");
        int food = scanner.nextInt();
        scanner.nextLine();

        System.out.print("(name): ");
        String name = scanner.nextLine().trim();

        System.out.print("(health): ");
        int health = scanner.nextInt();
        scanner.nextLine();

        String inputAnimal = scanner.nextLine().trim();
        Animal animal = null;

        switch (inputAnimal.toLowerCase()) {
            case "monkey" -> animal = new Monkey(type, food, name);
            case "rabbit" -> animal = new Rabbit(type, food, name);
            case "tiger" -> animal = new Tiger(type, food, name);
            case "wolf" -> animal = new Wolf(type, food, name);
            default -> {
                System.out.println("Ошибка: неизвестное животное");
                return;
            }
        }

        boolean wasAdded = animalStorage.addAnimal(animal, health);
        if (wasAdded) {
            System.out.println("Животное успешно добавлено в зоопарк");
            return;
        }
        System.out.println("Животное не было добавлено из-за низкого здоровья!!!");
    }
    static void takeanimal(Scanner scanner, ZooAnimalStorage animalStorage) {
        System.out.print("(name): ");
        String name = scanner.nextLine().trim();
        Animal animal = animalStorage.takeAnimal(name);

        if (animal == null) {
            System.out.println("Животное с таким именем не найдено!!!");
            return;
        }
        System.out.println(animal.toString());
    }
    static void getanimals(ZooAnimalStorage animalStorage) {
        animalStorage.getAnimals().stream().map(Animal::toString).forEach(System.out::println);
    }

    // ZooThingService
    static void getthingsnumber(ZooThingService thingService) {
        thingService.getThingsNumber().stream().forEach(System.out::println);
    }

    // ZooThingStorage
    static void addthing(Scanner scanner, ZooThingStorage thingStorage) {
        System.out.print("(number): ");
        int number = scanner.nextInt();
        scanner.nextLine();

        String inputThing = scanner.nextLine().trim();
        Thing thing = null;

        switch (inputThing.toLowerCase()) {
            case "computer" -> thing = new Computer(number);
            case "table" -> thing = new Table(number);
            default -> {
                System.out.println("Ошибка: неизвестная вещь");
                return;
            }
        }

        boolean wasAdded = thingStorage.addThing(thing);
        if (wasAdded) {
            System.out.println("Вещь успешна добавлена в зоопарк");
            return;
        }
        System.out.println("Вещь не была добавлена!!!");
    }
    static void takething(Scanner scanner, ZooThingStorage thingStorage) {
        System.out.print("(number): ");
        int number = scanner.nextInt();
        scanner.nextLine();

        Thing thing = thingStorage.takeThing(number);

        if (thing == null) {
            System.out.println("Вещь с таким номером не найдена!!!");
            return;
        }
        System.out.println(thing.toString());
    }
    static void getthings(ZooThingStorage animalStorage) {
        animalStorage.getThings().stream().map(Thing::toString).forEach(System.out::println);
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
