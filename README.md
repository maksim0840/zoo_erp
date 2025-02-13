
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

[Uplo<?xml version="1.0" encoding="UTF-8"?><!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"><html xmlns="http://www.w3.org/1999/xhtml" lang="en"><head><meta http-equiv="Content-Type" content="text/html;charset=UTF-8"/><link rel="stylesheet" href="jacoco-resources/report.css" type="text/css"/><link rel="shortcut icon" href="jacoco-resources/report.gif" type="image/gif"/><title>zoo_erp</title><script type="text/javascript" src="jacoco-resources/sort.js"></script></head><body onload="initialSort(['breadcrumb', 'coveragetable'])"><div class="breadcrumb" id="breadcrumb"><span class="info"><a href="jacoco-sessions.html" class="el_session">Sessions</a></span><span class="el_report">zoo_erp</span></div><h1>zoo_erp</h1><table class="coverage" cellspacing="0" id="coveragetable"><thead><tr><td class="sortable" id="a" onclick="toggleSort(this)">Element</td><td class="down sortable bar" id="b" onclick="toggleSort(this)">Missed Instructions</td><td class="sortable ctr2" id="c" onclick="toggleSort(this)">Cov.</td><td class="sortable bar" id="d" onclick="toggleSort(this)">Missed Branches</td><td class="sortable ctr2" id="e" onclick="toggleSort(this)">Cov.</td><td class="sortable ctr1" id="f" onclick="toggleSort(this)">Missed</td><td class="sortable ctr2" id="g" onclick="toggleSort(this)">Cxty</td><td class="sortable ctr1" id="h" onclick="toggleSort(this)">Missed</td><td class="sortable ctr2" id="i" onclick="toggleSort(this)">Lines</td><td class="sortable ctr1" id="j" onclick="toggleSort(this)">Missed</td><td class="sortable ctr2" id="k" onclick="toggleSort(this)">Methods</td><td class="sortable ctr1" id="l" onclick="toggleSort(this)">Missed</td><td class="sortable ctr2" id="m" onclick="toggleSort(this)">Classes</td></tr></thead><tfoot><tr><td>Total</td><td class="bar">239 of 760</td><td class="ctr2">68%</td><td class="bar">35 of 47</td><td class="ctr2">25%</td><td class="ctr1">34</td><td class="ctr2">88</td><td class="ctr1">66</td><td class="ctr2">203</td><td class="ctr1">5</td><td class="ctr2">57</td><td class="ctr1">0</td><td class="ctr2">17</td></tr></tfoot><tbody><tr><td id="a1"><a href="erp.console/index.html" class="el_package">erp.console</a></td><td class="bar" id="b0"><img src="jacoco-resources/redbar.gif" width="61" height="10" title="221" alt="221"/><img src="jacoco-resources/greenbar.gif" width="58" height="10" title="207" alt="207"/></td><td class="ctr2" id="c4">48%</td><td class="bar" id="d0"><img src="jacoco-resources/redbar.gif" width="102" height="10" title="30" alt="30"/><img src="jacoco-resources/greenbar.gif" width="17" height="10" title="5" alt="5"/></td><td class="ctr2" id="e2">14%</td><td class="ctr1" id="f0">28</td><td class="ctr2" id="g0">40</td><td class="ctr1" id="h0">61</td><td class="ctr2" id="i0">114</td><td class="ctr1" id="j0">3</td><td class="ctr2" id="k1">15</td><td class="ctr1" id="l0">0</td><td class="ctr2" id="m4">1</td></tr><tr><td id="a5"><a href="erp.services/index.html" class="el_package">erp.services</a></td><td class="bar" id="b1"><img src="jacoco-resources/redbar.gif" width="2" height="10" title="10" alt="10"/><img src="jacoco-resources/greenbar.gif" width="64" height="10" title="230" alt="230"/></td><td class="ctr2" id="c3">95%</td><td class="bar" id="d1"><img src="jacoco-resources/redbar.gif" width="13" height="10" title="4" alt="4"/><img src="jacoco-resources/greenbar.gif" width="20" height="10" title="6" alt="6"/></td><td class="ctr2" id="e0">60%</td><td class="ctr1" id="f1">4</td><td class="ctr2" id="g1">29</td><td class="ctr1" id="h2">2</td><td class="ctr2" id="i1">59</td><td class="ctr1" id="j1">1</td><td class="ctr2" id="k0">24</td><td class="ctr1" id="l1">0</td><td class="ctr2" id="m0">5</td></tr><tr><td id="a0"><a href="erp/index.html" class="el_package">erp</a></td><td class="bar" id="b2"><img src="jacoco-resources/redbar.gif" width="1" height="10" title="7" alt="7"/></td><td class="ctr2" id="c5">30%</td><td class="bar" id="d3"/><td class="ctr2" id="e3">n/a</td><td class="ctr1" id="f2">1</td><td class="ctr2" id="g4">2</td><td class="ctr1" id="h1">3</td><td class="ctr2" id="i4">4</td><td class="ctr1" id="j2">1</td><td class="ctr2" id="k4">2</td><td class="ctr1" id="l2">0</td><td class="ctr2" id="m5">1</td></tr><tr><td id="a2"><a href="erp.domains/index.html" class="el_package">erp.domains</a></td><td class="bar" id="b3"><img src="jacoco-resources/greenbar.gif" width="13" height="10" title="49" alt="49"/></td><td class="ctr2" id="c2">98%</td><td class="bar" id="d2"><img src="jacoco-resources/redbar.gif" width="3" height="10" title="1" alt="1"/><img src="jacoco-resources/greenbar.gif" width="3" height="10" title="1" alt="1"/></td><td class="ctr2" id="e1">50%</td><td class="ctr1" id="f3">1</td><td class="ctr2" id="g2">11</td><td class="ctr1" id="h3">0</td><td class="ctr2" id="i2">16</td><td class="ctr1" id="j3">0</td><td class="ctr2" id="k2">10</td><td class="ctr1" id="l3">0</td><td class="ctr2" id="m1">4</td></tr><tr><td id="a3"><a href="erp.domains.animals/index.html" class="el_package">erp.domains.animals</a></td><td class="bar" id="b4"><img src="jacoco-resources/greenbar.gif" width="6" height="10" title="24" alt="24"/></td><td class="ctr2" id="c0">100%</td><td class="bar" id="d4"/><td class="ctr2" id="e4">n/a</td><td class="ctr1" id="f4">0</td><td class="ctr2" id="g3">4</td><td class="ctr1" id="h4">0</td><td class="ctr2" id="i3">8</td><td class="ctr1" id="j4">0</td><td class="ctr2" id="k3">4</td><td class="ctr1" id="l4">0</td><td class="ctr2" id="m2">4</td></tr><tr><td id="a4"><a href="erp.domains.things/index.html" class="el_package">erp.domains.things</a></td><td class="bar" id="b5"><img src="jacoco-resources/greenbar.gif" width="2" height="10" title="8" alt="8"/></td><td class="ctr2" id="c1">100%</td><td class="bar" id="d5"/><td class="ctr2" id="e5">n/a</td><td class="ctr1" id="f5">0</td><td class="ctr2" id="g5">2</td><td class="ctr1" id="h5">0</td><td class="ctr2" id="i5">2</td><td class="ctr1" id="j5">0</td><td class="ctr2" id="k5">2</td><td class="ctr1" id="l5">0</td><td class="ctr2" id="m3">2</td></tr></tbody></table><div class="footer"><span class="right">Created with <a href="http://www.jacoco.org/jacoco">JaCoCo</a> 0.8.12.202403310830</span></div></body></html>ading index.html…]()


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
    
- getThings - получить объекты всех предметов, содержащихся в коолекции зоопарка

- getAnimalsIdentificationName - получить имена всех животных, содержащихся в коолекции зоопарка

- getThingsNumber - получить номера всех предметов, содержащихся в коолекции зоопарка

- getTotalFood - получить количество потребляемой еды всеми животными в коллекции зоопарка

- getInteractiveAnimals - получить объекты животных, которые пригодны для контактактного зоопарка (доброта > 5) 

- getAnimalsNumber - получить количество животных в коллекции зоопарка

# Краткое описание основной структуры:

Основной класс Animal имеет композицию с типом животных (Predator / Herbo - дают доп. свойство определения уровня доброты животного). Зависимость классов происходит на уровне абстракции. Тип животного не создаётся внутри класса, а передаётся через конструктор. Все животные (Rabbit, Wolf, Tiger, Monkey) наследуются от класса Animal и перенимают его свойства.

Пример создания животного:
```
Herbo herbo = new Herbo(7); // травоядное животное с добротой 7
int food = 7;
String name = "rabbitName";

Rabbit rabbit = new Rabbit(herbo, food, name); // создание кролика
```

Класс ZooAnimalStorage хранит коллекцию любых животных (List\<Animal\>) и принимает только тех, кто подходит по здоровью. Решение о принятии животного выносит класс VetClinic, объект которого хранится в ZooAnimalStorage в виде агрегации.

Пример добавления животного в зоопарк: 
```
VetClinic vetClinic = new VetClinic();
ZooAnimalStorage animalStorage = new ZooAnimalStorage(vetClinic);

int health = 10;
animalStorage.addAnimal(rabbit, health); // добавляет животное в коллекцию
```

