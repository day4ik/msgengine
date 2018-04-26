import sbt._
import Keys._

object Dependencies {

  object Logging {
    lazy val logging = "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0"
    lazy val logback_core = "ch.qos.logback" % "logback-core" % "1.2.3"
    lazy val logback_classic = "ch.qos.logback" % "logback-classic" % "1.2.3"
    lazy val logback_elastic_search_appender = "com.internetitem" % "logback-elasticsearch-appender" % "1.6"
    def get = Seq(logback_core, logback_classic, logback_elastic_search_appender)
  }

  object Config {
    lazy val config = "com.typesafe" % "config" % "1.3.1"
    def get = Seq(config)
  }

  object Slick {
    lazy val slick_core = "com.typesafe.slick" %% "slick" % "3.2.0"
    lazy val slick_hikaricp = "com.typesafe.slick" %% "slick-hikaricp" % "3.2.0"
    lazy val slick_po = "com.github.tminglei" %% "slick-pg" % "0.15.0-RC"
    lazy val slick_repo = "com.byteslounge" %% "slick-repo" % "1.4.3"
    def get = Seq(slick_core, slick_hikaricp, slick_po, slick_repo)
  }

  object BCrypt {
    lazy val jbcrypt = "org.mindrot" % "jbcrypt" % "0.4"
    def get = Seq(jbcrypt)
  }

  object AsyncAwait {
    lazy val asyncawait = "org.scala-lang.modules" %% "scala-async" % "0.9.6"
    def get = Seq(asyncawait)
  }

  object GeoIp {
    lazy val geoIp2 = "com.maxmind.geoip2" % "geoip2" % "2.9.0"
    def get = Seq(geoIp2)
  }

  object Test {
    lazy val scalatest = "org.scalatest" %% "scalatest" % "3.0.0" % "test"
    lazy val scalacheck = "org.scalacheck" %% "scalacheck" % "1.13.4" % "test"
    lazy val scalamock = "org.scalamock" %% "scalamock-scalatest-support" % "3.6.0" % "test"
    def get = Seq(scalatest, scalacheck, scalamock)
  }

  object Circe {
    val version = "0.8.0"

    def get = Seq(
      "io.circe" %% "circe-core",
      "io.circe" %% "circe-generic",
      "io.circe" %% "circe-parser",
      "io.circe" %% "circe-java8"
    ).map(_ % version)
  }

  object DI {
    lazy val guice = "net.codingwell" %% "scala-guice" % "4.1.0"
    def get = Seq(guice)
  }

  object MailClient {
    lazy val sendGrid = "com.sendgrid" % "sendgrid-java" % "4.0.0"
    def get = Seq(sendGrid)
  }

  object Play {
    lazy val slickPlay = "com.typesafe.play" %% "play-slick" % "3.0.0-M3"
    lazy val scalatestPlay = "org.scalatestplus.play" %% "scalatestplus-play" % "3.0.0-M3" % "test"
    def get = Seq(slickPlay, scalatestPlay)
  }

  object Akka {
    val akkaVersion = "2.4.17"
    lazy val akkaActor = "com.typesafe.akka" %% "akka-actor" % akkaVersion
    lazy val akkaLogging = "com.typesafe.akka" %% "akka-slf4j" % akkaVersion
    lazy val akkaTestkit = "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test"
    def get = Seq(akkaActor, akkaLogging, akkaTestkit)
  }

  object AkkaHttp {
    val akkaHttpVersion = "10.0.6"
    lazy val akkaHttp = "com.typesafe.akka" %% "akka-http" % akkaHttpVersion
    lazy val circePlugin = "de.heikoseeberger" %% "akka-http-circe" % "1.16.1"
    def get = Seq(akkaHttp, circePlugin)
  }

  object Migrations {
    lazy val flyway = "org.flywaydb" % "flyway-core" % "4.1.2"
    def get = Seq(flyway)
  }
}
