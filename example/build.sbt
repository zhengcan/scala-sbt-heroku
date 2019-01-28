lazy val `example` = (project in file("."))
	.aggregate(`play-java-2.6`, `play-java-2.7`)

lazy val `play-java-2.6` = ProjectRef(file("./play-java-2.6"), "play-java-2.6")

lazy val `play-java-2.7` = ProjectRef(file("./play-java-2.7"), "play-java-2.7")
