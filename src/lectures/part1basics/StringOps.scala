package lectures.part1basics

object StringOps extends App {

  val str: String = "Hello, I am learning Scala"

  println(str.charAt(3))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hi"))
  println(str.replace("Hello", "Hi"))
  println(str.toUpperCase())
  println(str.length)

  // Scala utilities

  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2) *2)

  // Scala-specific: String interpolator

  // S-interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old"
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${ + 1} years old"
  println(anotherGreeting)

  // F interpolator
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute"
  println(myth)

  // raw interpolator
  println(raw"this is a \n newline")
  val escaped = "this is a \n newline"
  println(raw"$escaped")

}
