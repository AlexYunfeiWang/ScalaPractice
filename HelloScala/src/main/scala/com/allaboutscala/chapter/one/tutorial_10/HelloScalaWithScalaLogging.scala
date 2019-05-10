package com.allaboutscala.chapter.one.tutorial_10

import com.typesafe.scalalogging.LazyLogging

/*
IntelliJ Import Dependencies -
Getting Started With build.sbt

We add dependencies in build.sbt for scala applications

As an example, this application will import the
Scala Logging library to allow us to log statements
from out Scala application
 */

object HelloScalaWithScalaLogging extends App with LazyLogging {
  logger.info("Hello Scala from Scala Logging");
}
