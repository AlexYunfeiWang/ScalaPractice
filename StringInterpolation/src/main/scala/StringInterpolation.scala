object StringInterpolation extends App {
  println("hello world!");
  println("Step 1: Using String interpolation to print a variable");
  val favoriteDonut: String = "Glazed Donut";

  /*
  We've prefixed the s at the beginning of our println statement.
  We also used the dollar sign $ to refer to our variable.
   */
  println(s"My favorite donut = $favoriteDonut");

  /*
  "Java" way
   */
  println("My favorite donut = " + favoriteDonut);

  /*
  The use of "case class" in Scala, here Donut is an object that has 2 properties:
  1. name
  2. tasteLevel
  we can create this case class object then print its properties
   */
  println("\nStep 2: Using String interpolation on object properties");
  case class Donut(name: String, tasteLevel: String);
  val donutObj: Donut = Donut("Glazed Donut", "Very Tasty");
  println(s"My favorite donut name = ${donutObj.name}, tasteLevel = ${donutObj.tasteLevel}");

  /*
  Use String interpolation to evaluate expressions
   */
  println("\nStep 3: Using String interpolation to evaluate expressions");
  val qtyDonutsToBuy: Int = 10;
  println(f"Are we buying 10 donuts = ${qtyDonutsToBuy == 10}");

  /*
  Using String interpolation for formatting text
  this example prepends 20 spaces in front of Vanilla Donut
   */
  println("\nStep 4: Using String interpolation for formatting text");
  val donutName: String = "Vanilla Donut";
  val donutTasteLevel: String = "Tasty";
  println(f"$donutName%20s $donutTasteLevel%s");

  /*
  use "f" interpolation to format number of decimal digits
   */
  println("\nStep 5: Using f interpolation to format numbers");
  val donutPrice: Double = 2.50;
  println(s"Donut price = $donutPrice");
  println(s"Unformatted donut price = $donutPrice")
  println(f"Formatted donut price = $donutPrice%.2f");

  /*
  The use of "raw" interpolation
   */
  println("\nStep 6: Using raw interpolation");
  println(raw"Favorite donut\t$donutName");
  println(f"Favorite donut\t$donutName");
}
