package lectures.part2oop

object Inheritance extends App {
    sealed class Animal {
      val creatureType = "wild"
      def eat = println("ohomomo")
    }
    // Single class inheritance
    class Cat extends Animal {
      def crunch = {
        eat
        println("crunch crunch")
      }
    }
    val cat = new Cat
    cat.crunch

    // constructors
    class Person(name: String, age: Int) {
      def this(name: String) = this(name, 0)
    }
    class Adult(name: String, age: Int, idCard: String) extends Person(name)

    // overriding
    class Dog(override val creatureType: String) extends Animal {

      override def eat = {
        super.eat
        println("crunch crunch")
      }
    }
     val dog = new Dog("k9")
    dog.eat
    println(dog.creatureType)

    //type substitution (broad: polymorphism)
  val unknownAnimal: Animal = new Dog("k9")
  unknownAnimal.eat

  // overriding vs overloading

  // super

  // Preventing override
  // 1 use final on member
  // 2 use final on a class
  // 3 seal the class = extends classes in this file, prevent extension in other files

    }
