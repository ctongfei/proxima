name := "proxima"
organization := "me.tongfei"
version := "0.1.0-SNAPSHOT"
isSnapshot := true
scalaVersion := "2.11.7"

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies += "me.tongfei" %% "poly-algebra" % "0.2.15-SNAPSHOT"
