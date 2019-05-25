object ForComprehension extends App {
  println("Step 1: A simple for loop from 1 to 5 inclusive")
  for (numberOfDonuts <- 1 to 5) {
    println(s"Number of donuts to buy = $numberOfDonuts")
  }

  println("\nStep 2: A simple for loop from 1 to 5, 5 exclusive")
  for (numberOfDonuts <- 1 until 5) {
    println(s"Number of donuts to buy = $numberOfDonuts")
  }

  println("\nStep 3: Filter values using if conditions in for loop")
  val donutIngredients = List("Flour", "cinnamon", "egg yolks", "sugar", "syrup")
  for (ingredient <- donutIngredients if ingredient == "sugar") {
    println(s"Found sweetening ingredient = $ingredient")
  }

  println("\nStep 4: Filter values using if conditions in for loop and return the result back using the yield keyword")
  val sweeteningIngredients =
    for (ingredient <- donutIngredients
         if (ingredient == "sugar" || ingredient == "syrup")) yield ingredient
  println(s"Sweetening ingredients = $sweeteningIngredients")

  println("\nUsing for comprehension to loop through 2-Dimensional array")
  val twoDimensionalArray = Array.ofDim[String](2,2)
  twoDimensionalArray(0)(0) = "flour"
  twoDimensionalArray(0)(1) = "sugar"
  twoDimensionalArray(1)(0) = "egg"
  twoDimensionalArray(1)(1) = "syrup"
  for (row <- 0 until twoDimensionalArray.length;
       col <- 0 until twoDimensionalArray(0).length) {
    println(s"Donut ingredient at index ${(row,col)} = ${twoDimensionalArray(row)(col)}")
  }

  println()

  for (row <- 0 until twoDimensionalArray.length) {
    for (col <- 0 until twoDimensionalArray(0).length) {
      println(s"Donut ingredient at index ${(row,col)} = ${twoDimensionalArray(row)(col)}")
    }
  }
}
