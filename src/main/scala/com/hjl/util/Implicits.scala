package com.hjl.util

import stats._

import org.apache.commons.math.stat.descriptive._

object Implicits {
	implicit def random2rich( r : util.Random ) = new RichRandom( r )
	
	implicit def traversable2richStatisticalSummary[ T, B >: T ]( traversable : Traversable[ T ] )( implicit num : Numeric[ B ] ) = RichStatisticalSummary[ T, B ]( traversable )( num )
    implicit def array2richTraversable[ T, B >: T ]( array : Array[ T ] )( implicit num : Numeric[ B ] ) = RichStatisticalSummary[ T, B ]( array )( num )
    implicit def statisticalSummary2rich( stats : StatisticalSummary ) = new RichStatisticalSummary( stats )

    implicit def closeable2rich[ T <% java.io.Closeable ]( t : T ) = new RichCloseable( t )
}
