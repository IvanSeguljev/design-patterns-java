1. Simple Factory Pattern

Creates objects without exposing the instantiation logic to the client.

SimpleFactory simpleFactory = new SimpleFactory();
IAnimal dog = simpleFactory.CreateDog(); // Create dog
IAnimal tiger = simpleFactory.CreateTiger(); // Create tiger
enter image description here

2. Factory Method Pattern

Defines an interface for creating objects, but let subclasses to decide which class to instantiate.

AnimalFactory dogFactory = new DogFactory();
IAnimal dog = dogFactory.CreateAnimal(); // Create dog

AnimalFactory tigerFactory = new TigerFactory();
IAnimal tiger = tigerFactory.CreateAnimal(); // Create tiger
enter image description here

3. Abstract Factory pattern (factory of factories)

Abstract Factory offers the interface for creating a family of related objects, without explicitly specifying their classes

IAnimalFactory petAnimalFactory = FactoryProvider.GetAnimalFactory("pet");
IDog dog = petAnimalFactory.GetDog(); // Create pet dog
ITiger tiger = petAnimalFactory.GetTiger();  // Create pet tiger

IAnimalFactory wildAnimalFactory = FactoryProvider.GetAnimalFactory("wild");
IDog dog = wildAnimalFactory .GetDog(); // Create wild dog
ITiger tiger = wildAnimalFactory .GetTiger();  // Create wild tiger
enter image description here