package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, favouriteMovie: String) {

     def likes(movie: String): Boolean = movie == favouriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
  }

  val mary = new Person("Marry", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception")  // equivalent
  // infix notation = operator notation

  // "operators" in Scala

  val tom = new Person("Tom", "Fight Club")
  println(mary + tom)
  println(mary.+(tom))




}
