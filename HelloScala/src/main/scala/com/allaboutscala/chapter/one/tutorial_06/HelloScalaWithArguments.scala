package com.allaboutscala.chapter.one.tutorial_06

/*
This is to show how to use edit configuration to define
command line args in Scala
 */

object HelloScalaWithArguments extends App{
  println("Hello Scala With Arguments Scala Application!");

  println("Command line arguments are: ");
  println(args.mkString(": "));
}
