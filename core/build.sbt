ThisBuild / version      := "0.1.0"
ThisBuild / scalaVersion := "2.12.6"
ThisBuild / organization := "com.example"

val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"
val gigahorse = "com.eed3si9n" %% "gigahorse-okhttp" % "0.3.1"
val playJson  = "com.typesafe.play" %% "play-json" % "2.6.9"

lazy val board = (project in file("."))
  .aggregate(boardCore)
  .dependsOn(boardCore)
  .enablePlugins(JavaAppPackaging)
  .settings(
    name := "board",
    libraryDependencies += scalaTest % Test,
  )

lazy val boardCore = (project in file("core"))
  .settings(
    name := "Board Core",
    libraryDependencies ++= Seq(gigahorse, playJson),
    libraryDependencies += scalaTest % Test,
  )
