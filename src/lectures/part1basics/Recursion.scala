package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)
      result
    }

//  println(factorial(10))

  def anotherFactorial(n: Int): BigInt = {
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator)

    factHelper(n, 1)
  }
    println(anotherFactorial(10000))

  // when you need loops use TAIL_RECURSION
  /*
    1. CONCATENATE A STRING N TIMES
    2. Is Prime function tail recursive
    3. Fibonacci function, tail recursive
   */
  @tailrec
  def concatenateTailrec(aString: String, n: Int, accumulator: String): String =
    if (n <= 0) accumulator
    else concatenateTailrec(aString, n-1, aString + accumulator)

  println(concatenateTailrec("hello", 3, ""))

  def fibonacci(n: Int): Int = {
   def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int =
     if(i >= n) last
     else fiboTailrec(i + 1, last + nextToLast, last)

  if (n <= 2 ) 1
  else fiboTailrec(2, 1, 1)
}
  println(fibonacci(8))

}
