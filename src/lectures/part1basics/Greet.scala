package lectures.part1basics

object Greet extends App {

 def greeting(name: String, age: Int): String =
  "Hi, my name is " + name + " and I am " + age + " years old."
   println(greeting("David", 1))

}
