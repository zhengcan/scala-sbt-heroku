lazy val `play-java-2.7` = (project in file("."))
	.enablePlugins(PlayJava, PlayEbean)
	.settings(
		libraryDependencies ++= Seq(
			guice,
			caffeine,
			"org.projectlombok" % "lombok" % "1.16.16"
		)
	)
