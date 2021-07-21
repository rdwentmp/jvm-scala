package lectures.part3fp

object AnonymousFunctions extends App {

 // anonymous function (LAMBDA)
  val doubler: Int => Int = (x: Int) => x * 2

  // multiple params in a lambda
  val adder: (Int, Int) => Int = (a: Int, b: Int) => a + b

 // no params
 val justDoSomething: () => Int = () => 3

 println(justDoSomething) // function itself
 println(justDoSomething()) // call

 // curly braces with lambdas
 val stringTo = { (str: String) =>
   str.toInt
 }

}
