package lectures.part4pm

object PatternsEverywhere extends App {

  // big idea #1

  try {
    //code
  } catch {
    case e: RuntimeException => "runtime"
    case npe: NullPointerException => "npe"
    case _ => "something else"
  }

//  catches are actually matches
  /*

   */

  val list = List(1,2,3,4)
  val evenOnes = for {
    x <- list if x % 2 == 0 // // ?!
  } yield 10 * x
  // generators are based on pattern matching
  val tuples = List((1, 2), (3, 4))
  val filterTuples = for {
    (first, second) <- tuples
  } yield first * second
  // case classes, :: operators, ...

  // big idea #3
  val tuple = (1,2,3)
  val (a,b,c) = tuple
  println(b)

  val head :: tail = list
  println(head)
  println(tail)

}
