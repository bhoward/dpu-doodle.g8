scalaVersion := "2.12.3"
name := "dpu-doodle"
organization := "edu.depauw"
resolvers += Resolver.bintrayRepo("underscoreio", "training")
libraryDependencies += "underscoreio" %% "doodle" % "0.8.2"
initialCommands in console := """
  |import doodle.core._
  |import doodle.core.Image._
  |import doodle.random._
  |import doodle.syntax._
  |import doodle.jvm.FileFrame._
  |import doodle.jvm.Java2DFrame._
  |import doodle.backend.StandardInterpreter._
  |import doodle.backend.Formats._
  |import doodle.examples._
""".trim.stripMargin
cleanupCommands in console := """
  |doodle.jvm.quit()
""".trim.stripMargin
