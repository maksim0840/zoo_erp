package erp;

import erp.domains.Herbo;
import erp.domains.Predator;
import erp.domains.animals.Monkey;
import erp.domains.animals.Rabbit;
import erp.domains.animals.Tiger;
import erp.domains.animals.Wolf;
import erp.services.VetClinic;
import erp.services.ZooAnimalService;
import erp.services.ZooAnimalStorage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZooErpApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZooErpApplication.class, args);

        // типы животных
        Predator predator = new Predator();
        Herbo herbo = new Herbo();

        // животные для зоопарка
        Monkey monkey1 = new Monkey(predator, 15, "monkey_name_1");
        Monkey monkey2 = new Monkey(predator, 17, "monkey_name_2");
        Rabbit  rabbit1 = new Rabbit(herbo, 4, "rabbit_name_1");
        Rabbit rabbit2 = new Rabbit(herbo, 2, "rabbit_name_2");
        Tiger tiger1 = new Tiger(predator, 74, "tiger_name_1");
        Tiger tiger2 = new Tiger(predator, 68, "tiger_name_2");
        Wolf wolf1 = new Wolf(predator, 36, "wolf_name_1");
        Wolf wolf2 = new Wolf(predator, 39, "wolf_name_2");

        //
        VetClinic vetClinic = new VetClinic();
        ZooAnimalStorage zooAnimalStorage = new ZooAnimalStorage(vetClinic);
        ZooAnimalService zooAnimalService = new ZooAnimalService(zooAnimalStorage);

        // добавляем животных
        zooAnimalStorage.addAnimal(monkey2, 20);
        zooAnimalStorage.addAnimal(tiger1, 78);
        zooAnimalStorage.addAnimal(wolf1, 2);
        System.out.println(zooAnimalService.getAnimalsIdentificationName());
    }
}
