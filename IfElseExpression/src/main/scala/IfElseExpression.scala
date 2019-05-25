object IfElseExpression {

  def main(args: Array[String]): Unit = {
    println("Using if-else if-else statements")
    val numberOfPeople = 2
    val donutsPerPerson = 2
    if(numberOfPeople > 10) {
      println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")
    } else if (numberOfPeople == 0) {
      println("Number of people is zero.")
      println("No need to buy donuts.")
    } else {
      val defaultDonutsToBuy = numberOfPeople * donutsPerPerson
      println(s"Number of donuts to buy = $defaultDonutsToBuy")
    }

    val defaultDonutsToBuy:Int = 5
    println("\nStep 4: Using if and else clause as expression")
    val numberOfDonutsToBuy = if(numberOfPeople > 10) (numberOfPeople * donutsPerPerson) else defaultDonutsToBuy
    println(s"Number of donuts to buy = $numberOfDonutsToBuy")
  }

}
