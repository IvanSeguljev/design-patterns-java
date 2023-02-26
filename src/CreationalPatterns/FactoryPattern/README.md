<h3>1. Simple Factory Pattern</h3>

<p>Creates objects without exposing the instantiation logic to the client.</p>

<b>
SimpleFactory simpleFactory = new SimpleFactory();
IAnimal dog = simpleFactory.CreateDog(); // Create dog
IAnimal tiger = simpleFactory.CreateTiger(); // Create tiger
enter image description here
</b>

<h3>2. Factory Method Pattern</h3>

<p>Defines an interface for creating objects, but let subclasses to decide which class to instantiate.</p>

<b>
AnimalFactory dogFactory = new DogFactory();
IAnimal dog = dogFactory.CreateAnimal(); // Create dog

AnimalFactory tigerFactory = new TigerFactory();
IAnimal tiger = tigerFactory.CreateAnimal(); // Create tiger
enter image description here
</b>

<h3>3. Abstract Factory pattern (factory of factories)</h3>

<p>Abstract Factory offers the interface for creating a family of related objects, without explicitly specifying their classes</p>

<b>
IAnimalFactory petAnimalFactory = FactoryProvider.GetAnimalFactory("pet");
IDog dog = petAnimalFactory.GetDog(); // Create pet dog
ITiger tiger = petAnimalFactory.GetTiger();  // Create pet tiger

IAnimalFactory wildAnimalFactory = FactoryProvider.GetAnimalFactory("wild");
IDog dog = wildAnimalFactory .GetDog(); // Create wild dog
ITiger tiger = wildAnimalFactory .GetTiger();  // Create wild tiger
</b>

<b>Note that in readme it is animals and in code shapes. I just found this explanation with animals and liked it a lot, 
so I copied it here.</b>