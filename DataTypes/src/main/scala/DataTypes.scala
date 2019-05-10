object DataTypes extends App{
  //this creates a val of type Int, val type is immutable
  val immutableInt: Int = 5;

  //this will cause compilation error, because immutableInt is immutable
  //immutableInt = 10;

  //this creates a var of type Int, var type is mutable
  var mutableInt: Int = 10;

  //mutableInt becomes 11
  mutableInt += 1;

  //this is a mutable String
  var mutableStr: String = "This is a mutable String";

  println(immutableInt);
  println(mutableInt);
  println(mutableStr);

  //Lazy Initialization example
  //delay the initialization of a variable at the point where
  //it is consumed by your application
  //We have not specified the type of this variable, it's called type inference
  lazy val lazyInitStr = "This is a lazy initialization string";

  //different data types
  val thisIsTrue:Boolean = true;
  val thisIsFalse:Boolean = false;
  val bigInteger:Long = 100000000L;
  val smallInteger:Short = 1;
  val doubleValue:Double = 2.50;
  val floatValue:Float = 2.50f;
  val byteValue:Byte = 0x10;
  val charValue:Char = 'D';
  val void:Unit = ();

  println("This is void: " + void);
}