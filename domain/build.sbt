import Dependencies.{ Test, _ }

name := """common"""
organization := "msgengine"

libraryDependencies ++=
  Logging.get ++
    Config.get ++
    Slick.get ++
    BCrypt.get ++
    AsyncAwait.get ++
    Circe.get ++
    Test.get

scalacOptions := scalacOptions.value diff List("-Yinline-warnings")