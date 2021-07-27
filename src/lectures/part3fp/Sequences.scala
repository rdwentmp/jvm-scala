package lectures.part3fp

object Sequences extends App {

  // Seq
  val aSequence = Seq(1,8,5,9,7,2,3,4)
  println(aSequence)
  println(aSequence.reverse)
  println(aSequence(2))
  println(aSequence ++ Seq(7,5,6))
  println(aSequence.sorted)

  // Ranges
  val aRange: Seq[Int] = 1 until 10
  aRange.foreach(println)

  (1 to 10).foreach(x => println("hello"))

  // lists
  val aList = List(1,2,3)
  val prepended = 42 +: aList :+ 45
  println(prepended)

  val apples5 = List.fill(5)("apple")
  println(apples5)
  println(aList.mkString("-|-"))
}
