package lectures.part2oop

object OOBasics extends App {

  val person = new Person("John", 27)
  println(person.x)
  person.greet("Daniel")
  person.greet()

  val author = new Writer("Charles", "Dickens", 1812)
  val imposter = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(imposter))

  val counter = new Counter
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print
}
// Constructor
class Person(name: String, val age: Int = 0) {
  // body
   val x = 2
  println(x + 2)

  // method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")
}

/*
  Novel and a Writer

  Writer: first name, surname, year
   - method fullname

   Novel: name, year of release, author
   - authorAge
   - isWrittenBy (author)
   - copy (new year of release) = new instance of Novel
*/
class Writer(firstName: String, surname: String, val year: Int) {
  def fullName: String = firstName + " " + surname
  }

class Novel(name: String, year: Int, author: Writer) {
  def authorAge = year - author.year
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)

}
/*
   Counter class
   - recives an int value
   - method to increment/ decrement => new Counter
   - overload ind dec to recieve an amount
*/
class Counter(val count: Int = 0) {
  def inc = {
    println("incrementing")
    new Counter(count + 1) // immutability
    }
  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }
  def inc(n: Int): Counter = {
    if (n <= 0 ) this
    else inc.inc(n - 1)
  }
  def dec(n: Int): Counter = {
  if (n <= 0) this
  else dec.dec(n - 1)
  }

  def print = println(count)

}

// class parameters are not fields

