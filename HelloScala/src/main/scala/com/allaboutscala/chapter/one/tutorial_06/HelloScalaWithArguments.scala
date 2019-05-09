package com.allaboutscala.chapter.one.tutorial_06

/*
This is to show how to use edit configuration to define
command line args in Scala
 */

object HelloScalaWithArguments extends App{
  println("Hello Scala With Arguments Scala Application!");

  //the args are: "1st Argument" 2nd Argument 3rdArgument
  println("Command line arguments are: ");

  //print 2nd and 3rd args
  println(args(1) + " " + args(2));

  //join args with comma, then print
  println(args.mkString(", "));
}
