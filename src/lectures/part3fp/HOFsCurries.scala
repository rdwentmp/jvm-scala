package lectures.part3fp

object HOFsCurries extends App {
  // higher order function HOF
  val superFunction: (Int, (String, Int => Boolean) => Int) => Int => Int = null

  // map, flatMap, filter in MyList
  // function that applies a function n times over a value x
  // nTimes(f,n,x)
  // nTimes(f,n,x) = f(f(f(x)))
  def nTimes(f: Int => Int, n: Int, x: Int): Int =
    if (n <= 0) x
    else nTimes(f, n-1, f(x))

  val plusOne = (x: Int) => x+1
  println(nTimes(plusOne, 10, 1))

  // increment10 = ntb(plusOne, 10)
  // ntb (f,n) = x => f(f(f...(x))) = x => plusOne(plusOne...(x))
  // val y = increment
  def nTimesBetter(f: Int => Int, n: Int): (Int => Int) =
    if (n <= 0 ) (x: Int) => x
    else (x: Int) => nTimesBetter(f, n -1) (f(x))

  val plus10 = nTimesBetter(plusOne, 10)
  println(plus10(1))





}
