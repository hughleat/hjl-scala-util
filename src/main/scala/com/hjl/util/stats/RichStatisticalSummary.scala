package com.hjl.util.stats

import org.apache.commons.math.stat.descriptive._

class RichStatisticalSummary( summary : StatisticalSummary ) {
    def stats = this
    def n = summary.getN
    def size = n
    def length = n
    def min = summary.getMin
    def max = summary.getMax
    def mean = summary.getMean
    def standardDeviation = summary.getStandardDeviation
    def sd = standardDeviation
    def sum = summary.getSum
    def variance = summary.getVariance
    
    def confidenceInterval( level : Double ) = ConfidenceInterval( level, summary )
    def ci( level : Double ) = confidenceInterval( level )
}
object RichStatisticalSummary {
    def apply( summary : StatisticalSummary ) : RichStatisticalSummary = new RichStatisticalSummary( summary )
    def apply[ T, B >: T ]( traversable : Traversable[ T ] )( implicit num : Numeric[ B ] ) : RichStatisticalSummary = 
        apply( { val stats = new SummaryStatistics; for( t <- traversable ) stats.addValue( num.toDouble( t )); stats } )
    def apply[ T, B >: T ]( array : Array[ T ] )( implicit num : Numeric[ B ] ) : RichStatisticalSummary = 
        apply( { val stats = new SummaryStatistics; for( t <- array ) stats.addValue( num.toDouble( t )); stats } )
}
