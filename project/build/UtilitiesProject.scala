import sbt._
import Process._

class UtilitiesProject( info : ProjectInfo ) extends DefaultProject( info ) {
    val commonsMath = "org.apache.commons" % "commons-math" % "2.1"
    val scalatest = "org.scalatest"  % "scalatest"  % "1.2"
    val scalacheck = "org.scala-tools.testing" % "scalacheck_2.8.0" % "1.7"

    lazy val elementwise = {
        val utilSrc = mainScalaSourcePath/"com"/"hjl"/"util" 
        val ( scala, script ) = ( utilSrc/"Elementwise.scala", utilSrc/"Elementwise.script" )
        fileTask( scala from script ) { 
            log.info( "Creating " + scala + " from " + script )
            ( "scala " + script ) #> scala.asFile !;
            None 
        }
    }
    override def compileAction = super.compileAction dependsOn( elementwise )
}
