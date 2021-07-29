package lectures.part3fp

object TuplesAndMaps extends App {

  // tuples = finite ordered "lists"
  val aTuple = new Tuple2(2, "hello, Scala") // Tuple2[Int, String] = (Int, String)

  println(aTuple._1) // 2
  println(aTuple.copy(_2 = "goodbye Java"))
  println(aTuple.swap) // ("Hello, Scala", 2)

  // Maps - keys -> value
  val aMap: Map[String, Int] = Map()

  val phonebook = Map(("Jim", 555), "Mark" -> 698, ("JIM", 9000)).withDefaultValue(-1)
  // a -> b is sugar for (a,b)
  println(phonebook)

  // map ops
  println(phonebook.contains("Jim"))
  println(phonebook("Jim"))
  println(phonebook("Bla"))

  // add a pairing
  val newPairing = "Mary" -> 678234567
  val newPhonebook = phonebook + newPairing
  println(newPhonebook)

  // functionals on maps
  // map, flatMap, filter

  println(phonebook.map(pair => pair._1.toLowerCase -> pair._2))

  // filterKeys
  println(phonebook.filterKeys(x => x.startsWith("J")))
  // mapValues
  println(phonebook.mapValues(number => "+48 " + number))

  // conversions to other collections
  println(phonebook.toList)
  println(List(("Daniel", 555)).toMap)

  val namesList = List("Bob", "James", "Angela", "Mary", "Daniel", "Jim")
  val namesVector = Vector("Bob", "James", "Angela", "Mary", "Daniel", "Jim")
  println(namesList.groupBy(name => name.charAt(0)))

  /*
    1. What would happen if I had two original entries "Jim" -> 555 and "JIM" -> 900?
        !!! careful with mapping keys
    2. Overly simplified social network based on maps
       Person = String
       - add a person to the network
       - remove
       - friend (mutual)
       - unfriend (mutual)

       - number of friends of a person
       - person with most friends
       - how many people have no friends
       - if there is a social connection between two people (direct or not)
   */
  def add(network: Map[String, Set[String]], person: String): Map[String, Set[String]] =
    network + (person -> Set())

  def friend(network: Map[String, Set[String]], a: String, b: String): Map[String, Set[String]] = {
    val friendsA = network(a)
    val friendsB = network(b)

    network + (a -> (friendsA + b)) + (b -> (friendsB + a))
  }
  def unfriend(network: Map[String, Set[String]], a: String, b: String): Map[String, Set[String]] = {
    val friendsA = network(a)
    val friendsB = network(b)

    network + (a -> (friendsA - b)) + (b -> (friendsB - a))

}
