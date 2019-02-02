// Play
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.7.0")
// Akka gRPC
addSbtPlugin("com.lightbend.akka.grpc" % "sbt-akka-grpc" % "0.5.0")
addSbtPlugin("com.lightbend.sbt" % "sbt-javaagent" % "0.1.4") // ALPN agent
// Ebean
addSbtPlugin("com.typesafe.sbt" % "sbt-play-ebean" % "5.0.0")
// Protobuf
addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.19")
libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.8.4"
// Heroku
addSbtPlugin("com.heroku" % "sbt-heroku" % "2.1.2")
