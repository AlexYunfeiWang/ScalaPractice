object ScalaFunctions {

  def main (args: Array[String]): Unit = {
    println("Step 1: How to define and use a function which has no parameters and has a return type")
    def favoriteDonut(): String = {
      "Glazed Donut"
    }

    val myFavoriteDonut = favoriteDonut()
    println(s"My favorite donut is $myFavoriteDonut")

    println("\nStep 2: How to define and use a function with no parenthesis")
    def leastFavoriteDonut = "Plain Donut"
    println(s"My least favorite donut is $leastFavoriteDonut")

    println("\nStep 3: How to define and use a function with no return type")
    printDonutSalesReport()

    println("\nStep 4: Type Inference on defining and using a function with no return type")
    def printDonutSalesReportTypeInference = println("Printing donut sales report Type Inference... done!")
    printDonutSalesReportTypeInference

    println("\nStep 5: How to define function with parameters")
    def calculateDonutCost(donutName: String, quantity: Int): Double = {
      println(s"Calculating cost for $donutName, quantity = $quantity")

      // make some calculations ...
      2.50 * quantity
    }
    val totalCost = calculateDonutCost("Glazed Donut", 5)
    println(s"Total cost of donuts = $totalCost")

    println("\nStep 6: How to add default values to function parameters")
    def calculateDonutCost2(donutName: String, quantity: Int, couponCode: String = "NO CODE"): Double = {
      println(s"Calculating cost for $donutName, quantity = $quantity, couponCode = $couponCode")
      // make some calculations ...
      2.50 * quantity
    }
    val totalCostWithCoupon = calculateDonutCost2("Glazed Donut", 6, "COUPON_12345")
    val totalCostWithoutCoupon = calculateDonutCost2("Glazed Donut", 6)
    println(s"Total cost of donuts with coupon: $totalCostWithCoupon")
    println(s"Total cost of donuts without coupon: $totalCostWithoutCoupon")
  }

  def printDonutSalesReport(): Unit = {
    // lookup sales data in database and create some report
    println("Printing donut sales report... done!")
  }
}
