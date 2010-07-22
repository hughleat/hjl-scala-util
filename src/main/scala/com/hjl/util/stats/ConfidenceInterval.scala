package com.hjl.util.stats

import math._
import org.apache.commons.math.distribution._
import org.apache.commons.math.stat.descriptive._
import org.apache.commons.math.stat.inference.TestUtils._

case class ConfidenceInterval( level : Double, mean : Double, width : Double ) {
    def min = mean - width / 2
    def max = mean + width / 2
    def ratio = width / mean
}
object ConfidenceInterval {
    def apply( level : Double, stats : StatisticalSummary ) = {
        val n = stats.getN
        if( n < 2 ) error( "Too few observations in sample" )
        val standardError = stats.getStandardDeviation / math.sqrt( n )
        val degreesOfFreedom = n - 1
        val distribution = new TDistributionImpl( degreesOfFreedom );
        val q = distribution.inverseCumulativeProbability( level );
        val width = q * standardError
        
        new ConfidenceInterval( level, stats.getMean, width )
    }
}

