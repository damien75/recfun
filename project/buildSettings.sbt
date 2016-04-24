resolvers += "Spray Repository" at "http://repo.spray.io"

libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.1"

scalacOptions ++= Seq("-deprecation", "-feature")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.5.0")