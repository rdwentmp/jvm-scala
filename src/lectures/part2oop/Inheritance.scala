package lectures.part2oop

object Inheritance extends App {
    class Animal {
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
    cat.eat

    // constructors
    class Person(name: String, age: Int) {
      def this(name: String) = this(name, 0)
    }
    class Adult(name: String, age: Int, idCard: String) extends Person(name)

    // overriding
    class Dog extends Animal {

    }
    }
