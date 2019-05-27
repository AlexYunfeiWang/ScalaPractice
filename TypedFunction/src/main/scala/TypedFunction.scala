object TypedFunction {

  def main (args: Array[String]): Unit = {
    println("Step 1: define a function which takes a String parameter")


    println("\nStep 2: define a function which takes a parameter of type Double")

    println("\nStep 3: Calling applyDiscount function with String or Double parameter types")
    applyDiscount("COUPON_1234")
    applyDiscount(10)

    println("\nStep 4: How to define a generic typed function which will specify the type of its parameter")

    println("\nStep 5: How to call a function which has typed parameters")
    applyDiscount[String]("COUPON_123")
    applyDiscount[Double](10)
    applyDiscount[Int](12)

    println("\nStep 3: How to define a generic typed function which also has a generic return type")
    println("\nStep 4: How to call a generic typed function which also has a generic return type\n")
    print(s"Result of applyDiscountWithGenericReturnType with String parameter = " +
      s"${applyDiscountWithGenericReturnType[String]("COUPON_123")}")

    println("\n")
    print(s"Result of applyDiscountWithGenericReturnType with Double parameter = " +
      s"${applyDiscountWithGenericReturnType[Double](10.5)}")

    println("\n")
    print(s"Result of applyDiscountWithGenericReturnType with Char parameter = " +
      s"${applyDiscountWithGenericReturnType[Char]('U')}")

  }

  def applyDiscount(couponCode: String) {
    println(s"Lookup percentage discount in database for $couponCode")
  }

  def applyDiscount(percentageDiscount: Double) {
    println(s"$percentageDiscount discount will be applied")
  }

  def applyDiscount[T](discount: T): Unit = {
    discount match {
      case d: String => println(s"Lookup percentage discount in database for $d")
      case d: Double => println(s"$d discount will be applied")
      case _ => println("Unsupported discount type: " + discount.getClass().getSimpleName())
    }
  }

  def applyDiscountWithGenericReturnType[T](discount: T): List[T] = {
    discount match {
      case d: String =>
        println(s"Lookup percentage discount in database for $d")
        List[T](discount)

      case d: Double =>
        println(s"$d discount will be applied")
        List[T](discount)

      case d @ _ =>
        println("Unsupported discount type")
        List[T](discount)
    }
  }
}
