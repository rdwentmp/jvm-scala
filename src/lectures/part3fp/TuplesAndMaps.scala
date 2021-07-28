package lectures.part3fp

object TuplesAndMaps extends App {

  // tuples = finite ordered "lists"
  val aTuple = new Tuple2(2, "hello, Scala") // Tuple2[Int, String] = (Int, String)

  println(aTuple._1) // 2
  println(aTuple.copy(_2 = "goodbye Java"))
  println(aTuple.swap) // ("Hello, Scala", 2)

  // Maps - keys -> value
  val aMap: Map[String, Int] = Map()

  val phonebook = Map(("Jim", 555), "Mark" -> 698)
  // a -> b is sugar for (a,b)
  println(phonebook)

}
