package lectures.part2oop

object Generics extends App {

  class MyList[+A] {
    // use the type A
    def add[B >: A] (element: B): MyList[B] = ???
    /*
    A = Cat
    B = Animal
     */
  }
  class MyMap[Key, Value]
  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  // generic methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }
  val emptyListOfIntegers = MyList.empty[Int]

  // variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // 1. yes List[Cat] extends List[Animal] = COVARIANCE
  class Covariantlist[+A]
  val animal: Animal = new Cat
  val animalList: Covariantlist[Animal] = new Covariantlist[Cat]
  // animalList.add(new Dog) ??? HARD QUESTION => we return a list of animals

  // 2. NO = INVARIANCE
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

   // 3. Hell, no! CONTRAVARIANCE
  class Trainer[-A]
  val contravariantList: Trainer[Cat] = new Trainer[Animal]

  // bounded types
  class Cage[A <: Animal] (animal: A)
  val cage = new  Cage(new Dog)

  class Car
  // generic type needs proper bounced type
  //  val newCage = new Cage(new Car)

  // expand MyList to be generic

}
