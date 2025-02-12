
# Сборка и запуск

Сборка
```
./gradlew clean build
```

Запуск
```
java -jar build/libs/zoo_erp-1.0.0.jar
```
- или через функцию main класса Main

# Покрытие тестов:

```
./gradlew clean test jacocoTestReport
```
- результат покрытия будет лежать в /build/reports/jacoco/test/html/index.html

# Команды:

- addAnimal - добавить животное в коллекцию зоопарка
    Дополнительно запрашиваемые параметры:
    - (type): "Predator" или "Herbo" - тип животного
    - (kindness): int - уровень доброты (только для типа Herbo) (должен быть > 5, чтобы считаться добрым)
    - (food): int - количество потребляемой еды
    - (name): string - имя животного
    - (animal): "Monkey" или "Rabbit" или "Tiger" или "Wolf" - доступные животные
    - (health): int - уровень здоровья животного (должен быть > 5, чтобы попасть в зоопарк)

- addThing - добавить предмет в коллекцию зоопарка
    Дополнительно запрашиваемые параметры:
    - (number): int - номер предмета
    - (thing): "Computer" или "Table" - доступные предметы

- takeAnimal - получить животное и удалить его из коллекции зоопарка
    Дополнительно запрашиваемые параметры:
    - (name): string - имя
    
- takeThing - получить предмет и удалить его из коллекции зоопарка
    Дополнительно запрашиваемые параметры:
    - (number): int - номер предмета
    
- getAnimals - получить объекты всех животных, содержащихся в коолекции зоопарка
    
- getThings - получить объекты всех животных, содержащихся в коолекции зоопарка

- getAnimalsIdentificationName - получить имена всех животных, содержащихся в коолекции зоопарка

- getThingsNumber - получить номера всех предметов, содержащихся в коолекции зоопарка

- getTotalFood - получить количество потребляемой еды всеми животными в коллекции зоопарка

- getInteractiveAnimals - получить объекты животных, которые пригодны для контактактного зоопарка (доброта > 5) 

- getAnimalsNumber - получить количество животных в коллекции зоопарка


