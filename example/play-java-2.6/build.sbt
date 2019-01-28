lazy val `play-java-2.6` = (project in file("."))
	.enablePlugins(PlayJava, PlayEbean)
	.settings(
		libraryDependencies ++= Seq(
			guice,
			ehcache,
			"org.projectlombok" % "lombok" % "1.16.16"
		)
	)
