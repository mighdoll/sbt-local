import sbt._
import sbt.Keys._

object MyBuild extends Build {
  lazy val proj = Project(id = "proj", base = file("."))
    .dependsOn(RootProject(file("../sparkle")))

}
