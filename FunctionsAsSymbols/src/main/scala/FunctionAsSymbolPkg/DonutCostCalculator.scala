package FunctionAsSymbolPkg

class DonutCostCalculator {

  val totalCost = 100

  def minusDiscount(discount: Double): Double = {
    totalCost - discount
  }

  //Step 3: How to define function whose name is just the symbol minus -
  //We've defined a function called - where the name of function is simply the symbol - itself.
  def -(discount: Double): Double = {
    totalCost - discount
  }

  // Step 6: How to define function whose name is just the symbols +++
  def +++(taxAmount: Double): Double = {
    totalCost + taxAmount
  }
}
