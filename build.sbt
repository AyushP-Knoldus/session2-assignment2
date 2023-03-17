ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "session2-assignment2",
    idePackagePrefix := Some("com.knoldus")
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % "test"