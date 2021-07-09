package lectures.part2oop

import playground.Cindrela
import java.util.Date
import java.sql.{Date => SqlDate}

object PackagingAndImports extends App {

  // package members are accesible by their simple name
  val writer = new Writer("Daniel", "Rock the JVM", 2018)

  // import the package
  val princess = new Cindrela

  // packages are in hierarchy
  // matching folder structure.

  // package object
  sayHello
  println(SPEED_OF_LIGHT)

  // imports
//  val prince = new PrinceCharming

  // 1. use FQ names
  val date = new Date
  val sqlDate = new  SqlDate(2018, 5, 4)

  // default imports
  // java.lang = String, Object, Exception
  // scala - Int, Nothing, Function
  // scala.Predef - println,  ???
}
