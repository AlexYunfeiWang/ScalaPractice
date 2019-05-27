object ScalaFunctionWithOption {

  def main(args: Array[String]): Unit = {
    println("Step 1: How to define an Option in a function parameter")

    println("Total Cost with coupon: " + calculateDonutCost("Glazed Donut", 8, Some("COUPON_12345")))
    println("Total Cost without coupon: " + calculateDonutCost("Glazed Donut", 8, None))


    println("\nStep 2: How to assign a default value to an Option parameter")
    println("Total Cost with coupon: " +
      calculateDonutCostWithDefaultOptionValue("Glazed Donut", 8, Some("COUPON_12345")))
    println("Total Cost without coupon: " +
      calculateDonutCostWithDefaultOptionValue("Glazed Donut", 8))

    println(s"\nTip 1: Use the map function to extract a valid Option value")
    val favoriteDonut: Option[String] = Some("Glazed Donut")
    favoriteDonut.map(d => println(s"Favorite donut = $d"))

    val leastFavoriteDonut: Option[String] = None
    leastFavoriteDonut.map(d => println(s"Least Favorite donut = $d"))
  }

  def calculateDonutCost(donutName: String, quantity: Int, couponCode: Option[String]): Double = {
    println(s"Calculating cost for $donutName, quantity = $quantity")

    couponCode match {
      case Some(coupon) => {
        val discount = 0.1 //10% discount
        val totalCost = 2.50 * quantity * (1 - discount)
        totalCost
      }
      case None => 2.50 * quantity
    }
  }

  def calculateDonutCostWithDefaultOptionValue(donutName: String, quantity: Int, couponCode: Option[String] = None): Double = {
    println(s"Calculating cost for $donutName, quantity = $quantity")

    couponCode match {
      case Some(coupon) => {
        val discount = 0.1 //10% discount
        val totalCost = 2.50 * quantity * (1 - discount)
        totalCost
      }
      case _ => 2.50 * quantity
    }
  }
}
