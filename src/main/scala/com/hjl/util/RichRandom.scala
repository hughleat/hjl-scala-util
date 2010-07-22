package com.hjl.util

import util.Random

class RichRandom( r : Random ) {
	def uniformChoice[ T ]( choices : T* ) = choices( r.nextInt( choices.size ))
	def weightedChoice[ T ]( choices : ( T, Double )* ) : T = {
		val sum = choices.map(_._2).sum
		var x = r.nextDouble * sum
		val choice = choices.find{ td => x -= td._2; x < 0 }
		choice.get._1
	}
	def weightedChoiceBy[ T ]( choices : T* )( weight : T => Double ) : T = weightedChoice( choices.map{ t => t -> weight( t ) } : _* )

	def bools : Stream[ Boolean ] = Stream.cons( r.nextBoolean, bools )
	def ints() : Stream[ Int ] = Stream.cons( r.nextInt, ints )
	def ints( n : Int ) : Stream[ Int ] = Stream.cons( r.nextInt( n ), ints( n ))
	def longs : Stream[ Long ] = Stream.cons( r.nextLong, longs )
	def floats : Stream[ Float ] = Stream.cons( r.nextFloat, floats )
	def doubles : Stream[ Double ] = Stream.cons( r.nextDouble, doubles )
	def gaussians : Stream[ Double ] = Stream.cons( r.nextGaussian, gaussians )
	def uniformChoices[ T ]( choices : T* ) : Stream[ T ] = Stream.cons( uniformChoice( choices : _* ), uniformChoices( choices : _* ))
	def weightedChoices[ T ]( choices : ( T, Double )* ) : Stream[ T ] = Stream.cons( weightedChoice( choices : _* ), weightedChoices( choices : _* ))
	def weightedChoicesBy[ T ]( choices : T* )( weight : T => Double ) : Stream[ T ] = Stream.cons( weightedChoiceBy( choices : _* )( weight ), weightedChoicesBy( choices : _* )( weight ))
}