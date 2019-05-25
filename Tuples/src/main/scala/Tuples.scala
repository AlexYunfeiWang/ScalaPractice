object Tuples {
  def main (args: Array[String]): Unit = {
    println("Step 1: Using Tuple2 to store 2 data points")
    val glazedDonutTuple = Tuple2("Glazed Donut", "Very Tasty")
    println(s"Glazed Donut with 2 data points = $glazedDonutTuple")

    println("\nStep 2: Access each element in tuple")
    var donutType = glazedDonutTuple._1
    var donutTasteLevel = glazedDonutTuple._2
    println(s"$donutType taste level is $donutTasteLevel")

    //swap the 1st and 2nd attribute
    println("\nSwap the 1st and 2nd attribute of Tuple2")
    val swappedGlazedDonutTuple = glazedDonutTuple.swap

    donutType = swappedGlazedDonutTuple._1
    donutTasteLevel = swappedGlazedDonutTuple._2
    println(s"$donutType taste level is $donutTasteLevel")

    println("\nStep 3: Using TupleN classes to store more than 2 data points, up to Tuple22")
    val glazedDonut = Tuple3("Glazed Donut", "Very Tasty", 2.50)
    println(s"${glazedDonut._1} taste level is ${glazedDonut._2} and it's price is ${glazedDonut._3}")

    println("\nStep 4: How to use pattern matching on Tuples")
    val strawberryDonut = Tuple3("Strawberry Donut", "Very Tasty", 2.50)
    val plainDonut = Tuple3("Plain Donut", "Tasty", 2)
    val donutList = List(strawberryDonut, glazedDonut, plainDonut)
    val priceOfDonut = donutList.foreach{
      tuple => {
        tuple match {
          case ("Plain Donut", taste, price) => println(s"Donut type = Plain Donut, price = $price, taste = $taste")
          case g if (g._1 == "Glazed Donut") => println(s"Donut type = ${g._1}, price = ${g._3}, taste = ${g._2}")
          case _ => None
        }
      }
    }

    println("\nStep 5: Shortcut for creating Tuples")
    val chocolateDonut = ("Chocolate Donut", "Very Tasty", 3.0)
    println(s"Chocolate donut taste level = ${chocolateDonut._2}, price = ${chocolateDonut._3}")
  }

}
