object HigherOrderFunction {

  def main (args: Array[String]): Unit = {

    println("\nStep 2: How to define a higher order function which takes another function as parameter")
    def totalCostWithDiscountFunctionParameter(donutType: String)(quantity: Int)(f: Double => Double): Double = {
      println(s"Calculating total cost for $quantity $donutType")
      val totalCost = 2.50 * quantity
      f(totalCost)
    }

    println("\nStep 3: How to call higher order function and pass an anonymous function as parameter")
    val totalCostOf5Donuts = totalCostWithDiscountFunctionParameter("Glazed Donut")(5){totalCost =>
      val discount = 2 // assume you fetch discount from database
      totalCost - discount
    }
    println(s"Total cost of 5 Glazed Donuts with anonymous discount function = $totalCostOf5Donuts")

    println("\nStep 4: How to define and pass a function to a higher order function")

    println(s"Total cost of 5 Glazed Donuts with discount function = " +
      s"${totalCostWithDiscountFunctionParameter("Glazed Donut")(5)(applyDiscount(_))}")
  }

  def applyDiscount(totalCost: Double): Double = {
    val discount = 2 // assume you fetch discount from database
    totalCost - discount
  }
}
