ThisBuild / organization := "com.example"
ThisBuild / scalaVersion := "2.13.10"

val natchezVersion = "0.1.6"
val http4sVersion = "0.23.12"
lazy val root = (project in file("."))
  .enablePlugins(LambdaJSPlugin)
  .settings(
    name := "ferallambda",

    libraryDependencies ++= Seq(
      // JVM setup
      "org.typelevel" %% "feral-lambda" % "0.1.0-M13",

      // Optional, specialized integrations, available for both JS and JVM
      "org.typelevel" %%% "feral-lambda-http4s" % "0.1.0-M13",
      "org.typelevel" %%% "feral-lambda-cloudformation-custom-resource" % "0.1.0-M13",

      // For the example
      "org.tpolecat" %%% "natchez-xray" % natchezVersion,
      "org.tpolecat" %%% "natchez-http4s" % "0.3.2",
      "org.tpolecat" %%% "skunk-core" % "0.3.2",
      "org.http4s" %%% "http4s-server" % http4sVersion,
      "org.http4s" %%% "http4s-dsl" % http4sVersion,
      "org.http4s" %%% "http4s-ember-client" % http4sVersion
    ),
  )
