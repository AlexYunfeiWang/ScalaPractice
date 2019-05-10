name := "HelloScala"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies ++= Seq (
  /*
  Group id / organization: com.typesafe.scala-logging
  Artifact id / name: scala-logging
  Latest version is 3.9.2
   */
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
  
  /*
  A compatible logging backend is Logback, 
  add it to your sbt build definition:
  
  Logback is a logging framework for Java applications, it 
  is a successor to the log4j project
   */
  "ch.qos.logback" % "logback-classic" % "1.2.3"
)