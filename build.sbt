name := """lightbend-emojr"""

version := "1.1.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.typesafe" %% "emoji" % "1.1.1",
  "com.netaporter" %% "scala-uri" % "0.4.6",
  "com.adrianhurt" %% "play-bootstrap3" % "0.4"
)

TwirlKeys.templateImports ++= Seq(
  "com.typesafe.emoji.Emoji.Implicits._",
  "com.typesafe.emoji.ShortCodes.Implicits._"
)