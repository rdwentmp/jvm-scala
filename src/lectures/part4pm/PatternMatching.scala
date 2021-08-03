package lectures.part4pm

import scala.util.Random

object PatternMatching extends App {

  // switch on steroids
  val random = new Random()
  val x = random.nextInt(10)

  val description = x match {
    case 1 => "the ONE"
    case 2 => "double or nothing"
    case 3 => "third time is the charm"
    case _ => "something else " // _ - WILDCARD - will match anything
  }
  println(x)
  println(description)

  // 1. Decompose values
  case class Person(name: String, age: Int)
  val bob = Person("Bob", 20)

  val greeting = bob match {
    case Person(n, a) if a < 21 => s"Hi, my name is $n and I'm $a years old"
    case Person(n, a) => s"Hi, my name is $n and I'm $a years old"
    case _ => "I don't know who I am"
  }
  println(greeting)
  /*
    1. Cases are matched in order
    2. What if no cases match? MatchError
    3. What is the type of PM expression? unified type of all the types in all the cases
    4. PM works really well with case classes
   */

  // PM on sealed hierarchies
  sealed class Animal
  case class Dog(breed: String) extends Animal
  case class Parrot(greeting: String) extends Animal

  val animal: Animal = new Dog("Terra Nova")
  animal match {
    case Dog(someBreed) => println(s"Matched a dog of the $someBreed breed")
  }

  // match everything
  val isEven = x match {
    case n if n % 2 == 0 => true
    case _ => false
  }
  // WHY?!
  val isEvenCond = if(x % 2 == 0)true else false // /!
  val isEvenNormal = x % 2 == 0


}
