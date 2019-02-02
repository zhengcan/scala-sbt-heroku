lazy val `play-java-2_6` = (project in file("."))
	.enablePlugins(PlayJava, PlayEbean)
	.settings(
		scalaVersion := "2.12.8",
		crossScalaVersions := Seq("2.12.8"),
		libraryDependencies ++= Seq(
			guice,
			ehcache,
			"org.projectlombok" % "lombok" % "1.18.4"
		)
	)
