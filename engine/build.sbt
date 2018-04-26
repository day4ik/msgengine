import Dependencies._

name := "engine"
organization := "msgengine"

libraryDependencies ++= Akka.get ++ AkkaHttp.get ++ Migrations.get ++ Logging.get