package com.hjl.util
import java.awt.Color

object Test {
	def testR = {
		val r = R()
		import r._
		val x = 1 to 1000
		//fn( "foo", 'type -> Color.red, 'foo -> "flop", 2, true, null, 'a4, "f" -> null, Array( 1.2 ), Seq( 2 ), Array( 1 ), Array( "hello" ), Seq( "hello" ))
		pdf( 'file -> "~/temp/foo.pdf", 'paper -> "a4" )
		plot( x, x, 'type -> "p", 'col -> Color.red )
		dev.off
		close
		println( "done" )
		exit
	}
	def testRandomStream = {
		import Implicits._
		import math._
		val r = util.Random
		
		println( "Random ints" ) 
		for( i <- r.ints take 10 ) println( i )
		println( "Clipped ints" )
		for( i <- r.ints( n = 10 ).take( 10 )) println( i )
		println( "Gaussians" )
		for( d <- r.gaussians.take( 10 )) println( d )
		println( "Uniform choices" )
		for( d <- r.uniformChoices( true, false ).take( 10 )) println( d )
		println( "Weighted choices" )
		for( d <- r.weightedChoices( true -> 1.0, false -> 10 ).take( 10 )) println( d )
		println( "Weighted choices by" )
		for( d <- r.weightedChoicesBy( 1, 2, 3, 4 )( _.toDouble ).take( 10 )) println( d )
	}
	def main( args : Array[ String ] ) : Unit = {
		testRandomStream
	}
}
