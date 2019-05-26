object Options {

  def main(args: Array[String]): Unit = {
    println("Step 1: How to use Option and Some - a basic example")
    val glazedDonutTaste: Option[String] = Some("Very Tasty")
    println(s"Glazed Donut taste = ${glazedDonutTaste.get}")

    println("\nStep 2: How to use Option and None - a basic example")
    val glazedDonutName: Option[String] = Some("Hahahahahha")
    println(s"Glazed Donut name = ${glazedDonutName.getOrElse("Glazed Donut")}")

    println("\nStep 3: How to use Pattern Matching with Option")
    glazedDonutName match {
      case Some(name) => println(s"Received donut name = $name")
      case None => println(s"No donut name was found!")

      //Same as above
      /*
      case None       => println(s"No donut name was found!")
      case _ => println(s"Received donut name = " + glazedDonutName.get)
      */

    }

    println("\nTip 1: Filter None using map function")
    glazedDonutTaste.map(taste => println(s"glazedDonutTaste = $taste"))
    glazedDonutName.map(name => println(s"glazedDonutName = $name"))

    println("\nUse isDefined example")
    val donutNumber: Option[Int] = Some(3)
    println(s"Donut Number is $donutNumber, now add 2")
    println("After adding: " + addTwoWithDefault(donutNumber))

    println("\nUse flatten as example")
    val optionList: List[Option[Int]] = List(Some(3), Some(5), None, Some(100), None, Some(98))
    println(s"Original option list: $optionList")
    println(s"After using optionList.flatten: " + optionList.flatten)
    println("Can also be done by using optionList.filter(_.isDefined).map(_.get): "
      + optionList.filter(_.isDefined).map(_.get))

    println("\nUse flatMap as example, add 2 to each option then sum up, skip None")
    println(s"Original option list: $optionList")
    println(s"After using optionList.flatten: " + optionList.flatMap(addTwo).sum)

  }

  def addTwoWithDefault(num: Option[Int]): Int = {
    if (num.isDefined) {
      num.get + 2
    }
    else {
      2
    }
  }

  def addTwo(num: Option[Int]): Option[Int] = {
    if (num.isDefined) {
      Some(num.get+2)
    }
    else {
      None
    }
  }
}
