package lectures.part2oop

object OOBasics extends App {

  val person = new Person("David", 27)
  println(person.age)

}
// Constructor
class Person(name: String, val age: Int) {
  // body
   val x = 2

  println(x + 2)
}

