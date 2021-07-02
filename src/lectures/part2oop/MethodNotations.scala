package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, favouriteMovie: String, age: Int = 0) {
     def likes(movie: String): Boolean = movie == favouriteMovie
     def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
     def +(nickname: String): Person = new Person(s"$name ($nickname)", favouriteMovie)
     def unary_! : String = s"$name, what the heck?!"
     def unary_+ : Person = new Person(name, favouriteMovie, age + 1)
     def isAlive: Boolean = true
     def apply(): String = s"Hi my is $name and I like $favouriteMovie"
    def apply(n: Int): String = s"$name watched $favouriteMovie $n times"

    def learns(thing: String) = s"$name is learning $thing"
    def learnsScala = this learns "Scala"
  }

  val mary = new Person("Marry", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception")  // equivalent
  // infix notation = operator notation

  // "operators" in Scala

  val tom = new Person("Tom", "Fight Club")
  println(mary + tom)
  println(mary.+(tom))

  println(1 + 2)
  println(1.+(2))
  // ALL OPERATORS ARE METHODS

  //prefix notation
  val x = -1
  val y = 1.unary_-  // unary_ prefix works with + - ~ !
  println(x == y)

  println(!mary)
  println(mary.unary_!)

  // postfix notation
  println(mary.isAlive)
  println(mary isAlive)

  // apply
  println(mary.apply())
  println(mary()) // equivalent

  println((mary + "the Rockstar").apply())

  println(mary learnsScala)
  println(mary(10))
}
