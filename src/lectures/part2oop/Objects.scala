package lectures.part2oop

object Objects extends App {

  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ('static')
  object Person { // type + its only instance
  // "static" class - level functionality
    val N_EYES = 2
    def canFly: Boolean = false

    // factory method
    def apply(mother: Person, father: Person): Person = new Person("Alex")
  }
  class Person(val name: String) {
    // instance level functionality
  }
  //COMPANIONS
  println(Person.N_EYES)
  println(Person.canFly)
  // Scala Objects = SINGLETON INSTANCE
  val mary = new Person("Marry")
  val john = new Person("John")
  println(mary == john)

  val alex = Person.apply(mary, john)


  // Scala applications = Scala Objects with
  // def main(args: Array:[String]): Unit


}
