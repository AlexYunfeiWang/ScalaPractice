object ScalaFunctionReturnType {

  def main (args: Array[String]): Unit = {
    println(s"Step 1: Define a function which returns an Option of type String")
    println("daily coupon code is: " + dailyCouponCode().getOrElse("No Coupon today"))

    println(s"\nStep 2: Call function with Option return type using pattern matching")
    dailyCouponCode() match {
      case Some(couponCode) => println(s"Today's coupon code = $couponCode")
      case None => println(s"Sorry there is no coupon code today!")
    }

    println(s"\nStep 4: If you only care about the valid results, Call function with Option return type using map")
    dailyCouponCode().map(couponCode => println(s"Today's coupon code = $couponCode"))


    println("\nStep 5: Review function from previous tutorial which has an Option parameter")
    def calculateDonutCost(donutName: String, quantity: Int, couponCode: Option[String]): Double = {
      println(s"Calculating cost for $donutName, quantity = $quantity")

      couponCode match {
        case Some(coupon) =>
          val discount = 0.1 // Let's simulate a 10% discount
        val totalCost = 2.50 * quantity * (1 - discount)
          totalCost

        case None => 2.50 * quantity
      }
    }
    // apply daily coupon code if we have one
    println(
      s"Total cost with daily coupon code = ${calculateDonutCost("Glazed Donut", 5, dailyCouponCode())}")
  }

  def dailyCouponCode(): Option[String] = {
    /*
    We are also lifting the couponFromDb value into an Option which will perform a null check.
    We then remove any empty strings using the filter() function.
    */
    val couponFromDB = "COUPON_1234"
    Option(couponFromDB).filter(_.nonEmpty)
  }
}
