object TypeInference extends App {
  /*
  val <Name of our variable> : <Scala type> = <Some literal>
   */

  //immutable variable
  println("Step 1: Immutable variable")
  val donutsToBuy:Int = 5

  /*
  through type inference, Scala compiler is smart enough to figure out that the literal 5 is actually  an Integer.
   */
  val donutsBought = 5

  /*
  Use type inference for the following types
   */
  println("\nStep 2: Scala Types")
  val donutsBoughtToday = 5 //Int
  val bigNumberOfDonuts = 100000000L //Long
  val smallNumberOfDonuts = 1 //Short
  val priceOfDonut = 2.50 //Double
  val donutPrice = 2.50f //Float
  val donutStoreName = "Allaboutscala Donut Store" //String
  val donutByte = 0xa //byte
  val donutFirstLetter = 'D' //Char
  val nothing = () //Unit

  println("\nStep 3: Using Scala compiler to convert from one data type to another")
  val numberOfDonuts: Short = 1
  val minimumDonutsToBuy: Int = numberOfDonuts

  println("\nStep 4: User driven conversion from one data type to another ")
  // NB: You cannot convert from an Int to a String
  // val minimumDonutsToSell: String = numberOfDonuts
  val minimumDonutsToSell:String = numberOfDonuts.toString()
  println(s"$minimumDonutsToSell")
}
