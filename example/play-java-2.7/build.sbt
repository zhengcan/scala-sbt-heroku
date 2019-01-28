

lazy val `play-java-2_7` = (project in file("."))
	.enablePlugins(PlayJava, PlayEbean)
	.settings(
		scalaVersion := "2.12.8",
		crossScalaVersions := Seq("2.12.7", "2.12.8"),
		libraryDependencies ++= Seq(
			guice,
			caffeine,
			"org.projectlombok" % "lombok" % "1.16.16",
			"com.google.protobuf" % "protobuf-java" % "3.6.0" % "compile,protobuf",
			"com.thesamet.scalapb" %% "scalapb-runtime" % "0.8.2" % "compile,protobuf",
			"com.google.protobuf" % "protobuf-java" % "3.6.0"
		)
	)
