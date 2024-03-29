enablePlugins(ScalaJSPlugin)
name := "Gene-Mining"

version := "0.1"
import org.scalajs.core.tools.linker.standard._

scalaVersion := "2.12.8"
scalaJSLinkerConfig ~= { _.withOutputMode(OutputMode.ECMAScript2015) }

scalaJSUseMainModuleInitializer := true
mainClass := Some("my.Main")
jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()
resolvers ++= Seq("jitpack" at "https://jitpack.io", Resolver.sonatypeRepo("releases") )


libraryDependencies ++= {
  val procVer = "7.4.2"

  Seq(
    "org.clulab" %% "processors-main" % procVer,
    "org.clulab" %% "processors-corenlp" % procVer,
    "org.clulab" %% "processors-odin" % procVer,
    "org.clulab" %% "processors-modelsmain" % procVer,
    "org.clulab" %% "processors-modelscorenlp" % procVer,
    "org.scala-js" %%% "scalajs-dom" % "0.9.6",
    "com.github.fdietze" % "scala-js-d3v4" % "master-SNAPSHOT",
    "com.lihaoyi" %%% "upickle" % "0.7.1",
    "com.lihaoyi" %%% "scalatags" % "0.6.7",
    "com.lihaoyi" %% "requests" % "0.1.7",
    "io.scalajs" %%% "core" % "0.4.2",
   // "io.scalajs.npm" %%% "eclairjs" % "0.4.2"
  //  "fr.hmil" %%% "roshttp" % "2.2.4"
  )
}

scalacOptions += "-P:scalajs:sjsDefinedByDefault"
//dependencyOverrides += "org.scala-lang" % "scala-compiler" % scalaVersion.value

//Resolver.bintrayIvyRepo("hmil", "maven")


lazy val root = project.
  enablePlugins(ScalaJSPlugin)

