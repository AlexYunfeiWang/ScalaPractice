object EscapeCharacter extends App {
  println("\nStep 1 Using backslash to escape quotes")
  val donutJson1: String = "{\"donut_name\":\"Glazed Donut\",\"taste_level\":\"Very Tasty\",\"price\":2.50}"
  println(s"donutJson1 = $donutJson1")

  println("\nStep 2: Using triple quotes to escape quotes")
  val donutJson2: String ="""{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}""";
  println(f"donutJson2 = $donutJson2")

  println("\nStep 3: Create multi-line String using stripMargin")
  val donutJson3: String =
    """
      |{
      |"donut_name":"Glazed Donut",
      |"taste_level":"Very Tasty",
      |"price":2.50
      |}
    """
      .stripMargin
  println(s"donutJson3 = $donutJson3")

  println("\nTip: stripMargin using a different character")
  val donutJson4: String =
    """
      #{
      #"donut_name":"Glazed Donut",
      #"taste_level":"Very Tasty",
      #"price":2.50
      #}
    """
      .stripMargin('#')
  println(s"donutJson4 = $donutJson4")

  println("\nTip: stripMargin without using any character: it's gonna show the string the way we write")
  val donutJson5: String =
    """
    {
      "donut_name":"Glazed Donut",
      "taste_level":"Very Tasty",
      "price":2.50
    }
    """
      .stripMargin
  println(s"donutJson5 = $donutJson5")
}
