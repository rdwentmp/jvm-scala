package lectures.part2oop

object Exceptions extends App {

  val x: String = null
//  println(x.length)
//   this will crash with NPE
  // 1. throwing and caching exceptions

//  val aWeirdValue: String = throw new NullPointerException

  // throwable classes extend Throwable class
  // Exception and Error are the major Throwable subtypes

  // 2. how to catch exception
  def getInt(withExceptions: Boolean): Int =
    if (withExceptions) throw  new RuntimeException("No int for you")
    else 42

  try {
    // code that might fail
    getInt(true)
  } catch {
    case e: RuntimeException => println("caught a Runtime exception")
  } finally  {
    // code that will get executed no matter what
    println("finally")
  }


}
