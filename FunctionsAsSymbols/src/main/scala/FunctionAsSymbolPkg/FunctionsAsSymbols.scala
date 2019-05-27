package FunctionAsSymbolPkg

object FunctionsAsSymbols {

  def main (args: Array[String]): Unit = {
    println("Step 1: How to create and instantiate a class")
    val donutCostCalculator = new DonutCostCalculator()

    println("\nStep 2: How to call a function from an instantiated class")
    println(s"Calling function minusDiscount() = ${donutCostCalculator.minusDiscount(10.5)}")

    println("\nStep 4: How to call function whose name is just the symbol -")
    println(s"Calling function - = ${donutCostCalculator.-(10.5)}")

    println("\nStep 5: How to call a function using the operator style notation")
    println("To me it looks like Operator Overloading")
    println(s"Calling function - with operator style notation = ${donutCostCalculator - 10.5}")

    println("\nCalling function +++ to add $5 tax to Donut cost: " + {donutCostCalculator +++ 5})
  }
}
