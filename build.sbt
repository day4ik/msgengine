import com.typesafe.sbt.SbtScalariform
import com.typesafe.sbt.SbtScalariform.ScalariformKeys

import scalariform.formatter.preferences._

lazy val commonSettings = Seq(
  organization := "msgengine",
  version := "0.0.0-SNAPSHOT",
  scalaVersion := "2.12.4",
  resolvers ++= Seq(
    "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
  ),
  scalacOptions ++= Seq(
    "-target:jvm-1.8",
    "-deprecation",
    "-encoding", "UTF-8",
    "-feature",
    "-language:existentials",
    "-language:higherKinds",
    "-language:implicitConversions",
    "-language:experimental.macros",
    "-unchecked",
    "-Ywarn-unused-import",
    "-Ywarn-nullary-unit",
    "-Xfatal-warnings",
    "-Xlint",
    "-Ywarn-dead-code",
    "-Xfuture"),
  parallelExecution in Test := false
)


SbtScalariform.scalariformSettings
ScalariformKeys.preferences := ScalariformKeys.preferences.value
  .setPreference(AlignParameters, false)
  .setPreference(AlignSingleLineCaseStatements, true)
  .setPreference(DoubleIndentClassDeclaration, true)
  .setPreference(RewriteArrowSymbols, true)

lazy val domain = (project in file("./domain"))
  .settings(commonSettings)

lazy val engine = (project in file("./engine"))
  .settings(commonSettings)
  .enablePlugins(JavaAppPackaging, JavaAgent)
  .dependsOn(domain % "test->test;compile->compile")
