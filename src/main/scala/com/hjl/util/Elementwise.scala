
// This file has been automatically produced by Elementwise.script.
package com.hjl.util

object Elementwise {

    def combine[ A1, A2, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ] )( f : ( A1, A2 ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2 ) = ( a1.iterator, a2.iterator )
        while( i1.hasNext && i2.hasNext ) {
            builder += f( i1.next, i2.next ) 
        }
        builder.result
    }
    def combineWithIndex[ A1, A2, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ] )( f : ( A1, A2, Int ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2 ) = ( a1.iterator, a2.iterator )
        var i = 0
        while( i1.hasNext && i2.hasNext ) {
            builder += f( i1.next, i2.next, i )
            i += 1 
        }
        builder.result
    }
    def combineAll[ A1, A2, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ] )( _a1 : A1, _a2 : A2 )( f : ( A1, A2 ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2 ) = ( a1.iterator, a2.iterator )
        while( i1.hasNext || i2.hasNext ) {
            builder += f( if( i1.hasNext ) i1.next else _a1, if( i2.hasNext ) i2.next else _a2 ) 
        }
        builder.result
    }
    def combineAllWithIndex[ A1, A2, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ] )( _a1 : A1, _a2 : A2 )( f : ( A1, A2, Int ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2 ) = ( a1.iterator, a2.iterator )
        var i = 0
        while( i1.hasNext || i2.hasNext ) {
            builder += f( if( i1.hasNext ) i1.next else _a1, if( i2.hasNext ) i2.next else _a2, i )
            i += 1 
        }
        builder.result
    }

    def combine[ A1, A2, A3, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ] )( f : ( A1, A2, A3 ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3 ) = ( a1.iterator, a2.iterator, a3.iterator )
        while( i1.hasNext && i2.hasNext && i3.hasNext ) {
            builder += f( i1.next, i2.next, i3.next ) 
        }
        builder.result
    }
    def combineWithIndex[ A1, A2, A3, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ] )( f : ( A1, A2, A3, Int ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3 ) = ( a1.iterator, a2.iterator, a3.iterator )
        var i = 0
        while( i1.hasNext && i2.hasNext && i3.hasNext ) {
            builder += f( i1.next, i2.next, i3.next, i )
            i += 1 
        }
        builder.result
    }
    def combineAll[ A1, A2, A3, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ] )( _a1 : A1, _a2 : A2, _a3 : A3 )( f : ( A1, A2, A3 ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3 ) = ( a1.iterator, a2.iterator, a3.iterator )
        while( i1.hasNext || i2.hasNext || i3.hasNext ) {
            builder += f( if( i1.hasNext ) i1.next else _a1, if( i2.hasNext ) i2.next else _a2, if( i3.hasNext ) i3.next else _a3 ) 
        }
        builder.result
    }
    def combineAllWithIndex[ A1, A2, A3, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ] )( _a1 : A1, _a2 : A2, _a3 : A3 )( f : ( A1, A2, A3, Int ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3 ) = ( a1.iterator, a2.iterator, a3.iterator )
        var i = 0
        while( i1.hasNext || i2.hasNext || i3.hasNext ) {
            builder += f( if( i1.hasNext ) i1.next else _a1, if( i2.hasNext ) i2.next else _a2, if( i3.hasNext ) i3.next else _a3, i )
            i += 1 
        }
        builder.result
    }

    def combine[ A1, A2, A3, A4, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ] )( f : ( A1, A2, A3, A4 ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator )
        while( i1.hasNext && i2.hasNext && i3.hasNext && i4.hasNext ) {
            builder += f( i1.next, i2.next, i3.next, i4.next ) 
        }
        builder.result
    }
    def combineWithIndex[ A1, A2, A3, A4, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ] )( f : ( A1, A2, A3, A4, Int ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator )
        var i = 0
        while( i1.hasNext && i2.hasNext && i3.hasNext && i4.hasNext ) {
            builder += f( i1.next, i2.next, i3.next, i4.next, i )
            i += 1 
        }
        builder.result
    }
    def combineAll[ A1, A2, A3, A4, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ] )( _a1 : A1, _a2 : A2, _a3 : A3, _a4 : A4 )( f : ( A1, A2, A3, A4 ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator )
        while( i1.hasNext || i2.hasNext || i3.hasNext || i4.hasNext ) {
            builder += f( if( i1.hasNext ) i1.next else _a1, if( i2.hasNext ) i2.next else _a2, if( i3.hasNext ) i3.next else _a3, if( i4.hasNext ) i4.next else _a4 ) 
        }
        builder.result
    }
    def combineAllWithIndex[ A1, A2, A3, A4, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ] )( _a1 : A1, _a2 : A2, _a3 : A3, _a4 : A4 )( f : ( A1, A2, A3, A4, Int ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator )
        var i = 0
        while( i1.hasNext || i2.hasNext || i3.hasNext || i4.hasNext ) {
            builder += f( if( i1.hasNext ) i1.next else _a1, if( i2.hasNext ) i2.next else _a2, if( i3.hasNext ) i3.next else _a3, if( i4.hasNext ) i4.next else _a4, i )
            i += 1 
        }
        builder.result
    }

    def combine[ A1, A2, A3, A4, A5, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ] )( f : ( A1, A2, A3, A4, A5 ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator )
        while( i1.hasNext && i2.hasNext && i3.hasNext && i4.hasNext && i5.hasNext ) {
            builder += f( i1.next, i2.next, i3.next, i4.next, i5.next ) 
        }
        builder.result
    }
    def combineWithIndex[ A1, A2, A3, A4, A5, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ] )( f : ( A1, A2, A3, A4, A5, Int ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator )
        var i = 0
        while( i1.hasNext && i2.hasNext && i3.hasNext && i4.hasNext && i5.hasNext ) {
            builder += f( i1.next, i2.next, i3.next, i4.next, i5.next, i )
            i += 1 
        }
        builder.result
    }
    def combineAll[ A1, A2, A3, A4, A5, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ] )( _a1 : A1, _a2 : A2, _a3 : A3, _a4 : A4, _a5 : A5 )( f : ( A1, A2, A3, A4, A5 ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator )
        while( i1.hasNext || i2.hasNext || i3.hasNext || i4.hasNext || i5.hasNext ) {
            builder += f( if( i1.hasNext ) i1.next else _a1, if( i2.hasNext ) i2.next else _a2, if( i3.hasNext ) i3.next else _a3, if( i4.hasNext ) i4.next else _a4, if( i5.hasNext ) i5.next else _a5 ) 
        }
        builder.result
    }
    def combineAllWithIndex[ A1, A2, A3, A4, A5, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ] )( _a1 : A1, _a2 : A2, _a3 : A3, _a4 : A4, _a5 : A5 )( f : ( A1, A2, A3, A4, A5, Int ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator )
        var i = 0
        while( i1.hasNext || i2.hasNext || i3.hasNext || i4.hasNext || i5.hasNext ) {
            builder += f( if( i1.hasNext ) i1.next else _a1, if( i2.hasNext ) i2.next else _a2, if( i3.hasNext ) i3.next else _a3, if( i4.hasNext ) i4.next else _a4, if( i5.hasNext ) i5.next else _a5, i )
            i += 1 
        }
        builder.result
    }

    def combine[ A1, A2, A3, A4, A5, A6, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ] )( f : ( A1, A2, A3, A4, A5, A6 ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator )
        while( i1.hasNext && i2.hasNext && i3.hasNext && i4.hasNext && i5.hasNext && i6.hasNext ) {
            builder += f( i1.next, i2.next, i3.next, i4.next, i5.next, i6.next ) 
        }
        builder.result
    }
    def combineWithIndex[ A1, A2, A3, A4, A5, A6, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ] )( f : ( A1, A2, A3, A4, A5, A6, Int ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator )
        var i = 0
        while( i1.hasNext && i2.hasNext && i3.hasNext && i4.hasNext && i5.hasNext && i6.hasNext ) {
            builder += f( i1.next, i2.next, i3.next, i4.next, i5.next, i6.next, i )
            i += 1 
        }
        builder.result
    }
    def combineAll[ A1, A2, A3, A4, A5, A6, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ] )( _a1 : A1, _a2 : A2, _a3 : A3, _a4 : A4, _a5 : A5, _a6 : A6 )( f : ( A1, A2, A3, A4, A5, A6 ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator )
        while( i1.hasNext || i2.hasNext || i3.hasNext || i4.hasNext || i5.hasNext || i6.hasNext ) {
            builder += f( if( i1.hasNext ) i1.next else _a1, if( i2.hasNext ) i2.next else _a2, if( i3.hasNext ) i3.next else _a3, if( i4.hasNext ) i4.next else _a4, if( i5.hasNext ) i5.next else _a5, if( i6.hasNext ) i6.next else _a6 ) 
        }
        builder.result
    }
    def combineAllWithIndex[ A1, A2, A3, A4, A5, A6, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ] )( _a1 : A1, _a2 : A2, _a3 : A3, _a4 : A4, _a5 : A5, _a6 : A6 )( f : ( A1, A2, A3, A4, A5, A6, Int ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator )
        var i = 0
        while( i1.hasNext || i2.hasNext || i3.hasNext || i4.hasNext || i5.hasNext || i6.hasNext ) {
            builder += f( if( i1.hasNext ) i1.next else _a1, if( i2.hasNext ) i2.next else _a2, if( i3.hasNext ) i3.next else _a3, if( i4.hasNext ) i4.next else _a4, if( i5.hasNext ) i5.next else _a5, if( i6.hasNext ) i6.next else _a6, i )
            i += 1 
        }
        builder.result
    }

    def combine[ A1, A2, A3, A4, A5, A6, A7, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ] )( f : ( A1, A2, A3, A4, A5, A6, A7 ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator )
        while( i1.hasNext && i2.hasNext && i3.hasNext && i4.hasNext && i5.hasNext && i6.hasNext && i7.hasNext ) {
            builder += f( i1.next, i2.next, i3.next, i4.next, i5.next, i6.next, i7.next ) 
        }
        builder.result
    }
    def combineWithIndex[ A1, A2, A3, A4, A5, A6, A7, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ] )( f : ( A1, A2, A3, A4, A5, A6, A7, Int ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator )
        var i = 0
        while( i1.hasNext && i2.hasNext && i3.hasNext && i4.hasNext && i5.hasNext && i6.hasNext && i7.hasNext ) {
            builder += f( i1.next, i2.next, i3.next, i4.next, i5.next, i6.next, i7.next, i )
            i += 1 
        }
        builder.result
    }
    def combineAll[ A1, A2, A3, A4, A5, A6, A7, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ] )( _a1 : A1, _a2 : A2, _a3 : A3, _a4 : A4, _a5 : A5, _a6 : A6, _a7 : A7 )( f : ( A1, A2, A3, A4, A5, A6, A7 ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator )
        while( i1.hasNext || i2.hasNext || i3.hasNext || i4.hasNext || i5.hasNext || i6.hasNext || i7.hasNext ) {
            builder += f( if( i1.hasNext ) i1.next else _a1, if( i2.hasNext ) i2.next else _a2, if( i3.hasNext ) i3.next else _a3, if( i4.hasNext ) i4.next else _a4, if( i5.hasNext ) i5.next else _a5, if( i6.hasNext ) i6.next else _a6, if( i7.hasNext ) i7.next else _a7 ) 
        }
        builder.result
    }
    def combineAllWithIndex[ A1, A2, A3, A4, A5, A6, A7, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ] )( _a1 : A1, _a2 : A2, _a3 : A3, _a4 : A4, _a5 : A5, _a6 : A6, _a7 : A7 )( f : ( A1, A2, A3, A4, A5, A6, A7, Int ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator )
        var i = 0
        while( i1.hasNext || i2.hasNext || i3.hasNext || i4.hasNext || i5.hasNext || i6.hasNext || i7.hasNext ) {
            builder += f( if( i1.hasNext ) i1.next else _a1, if( i2.hasNext ) i2.next else _a2, if( i3.hasNext ) i3.next else _a3, if( i4.hasNext ) i4.next else _a4, if( i5.hasNext ) i5.next else _a5, if( i6.hasNext ) i6.next else _a6, if( i7.hasNext ) i7.next else _a7, i )
            i += 1 
        }
        builder.result
    }

    def combine[ A1, A2, A3, A4, A5, A6, A7, A8, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ], a8 : Iterable[ A8 ] )( f : ( A1, A2, A3, A4, A5, A6, A7, A8 ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7, i8 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator, a8.iterator )
        while( i1.hasNext && i2.hasNext && i3.hasNext && i4.hasNext && i5.hasNext && i6.hasNext && i7.hasNext && i8.hasNext ) {
            builder += f( i1.next, i2.next, i3.next, i4.next, i5.next, i6.next, i7.next, i8.next ) 
        }
        builder.result
    }
    def combineWithIndex[ A1, A2, A3, A4, A5, A6, A7, A8, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ], a8 : Iterable[ A8 ] )( f : ( A1, A2, A3, A4, A5, A6, A7, A8, Int ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7, i8 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator, a8.iterator )
        var i = 0
        while( i1.hasNext && i2.hasNext && i3.hasNext && i4.hasNext && i5.hasNext && i6.hasNext && i7.hasNext && i8.hasNext ) {
            builder += f( i1.next, i2.next, i3.next, i4.next, i5.next, i6.next, i7.next, i8.next, i )
            i += 1 
        }
        builder.result
    }
    def combineAll[ A1, A2, A3, A4, A5, A6, A7, A8, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ], a8 : Iterable[ A8 ] )( _a1 : A1, _a2 : A2, _a3 : A3, _a4 : A4, _a5 : A5, _a6 : A6, _a7 : A7, _a8 : A8 )( f : ( A1, A2, A3, A4, A5, A6, A7, A8 ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7, i8 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator, a8.iterator )
        while( i1.hasNext || i2.hasNext || i3.hasNext || i4.hasNext || i5.hasNext || i6.hasNext || i7.hasNext || i8.hasNext ) {
            builder += f( if( i1.hasNext ) i1.next else _a1, if( i2.hasNext ) i2.next else _a2, if( i3.hasNext ) i3.next else _a3, if( i4.hasNext ) i4.next else _a4, if( i5.hasNext ) i5.next else _a5, if( i6.hasNext ) i6.next else _a6, if( i7.hasNext ) i7.next else _a7, if( i8.hasNext ) i8.next else _a8 ) 
        }
        builder.result
    }
    def combineAllWithIndex[ A1, A2, A3, A4, A5, A6, A7, A8, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ], a8 : Iterable[ A8 ] )( _a1 : A1, _a2 : A2, _a3 : A3, _a4 : A4, _a5 : A5, _a6 : A6, _a7 : A7, _a8 : A8 )( f : ( A1, A2, A3, A4, A5, A6, A7, A8, Int ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7, i8 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator, a8.iterator )
        var i = 0
        while( i1.hasNext || i2.hasNext || i3.hasNext || i4.hasNext || i5.hasNext || i6.hasNext || i7.hasNext || i8.hasNext ) {
            builder += f( if( i1.hasNext ) i1.next else _a1, if( i2.hasNext ) i2.next else _a2, if( i3.hasNext ) i3.next else _a3, if( i4.hasNext ) i4.next else _a4, if( i5.hasNext ) i5.next else _a5, if( i6.hasNext ) i6.next else _a6, if( i7.hasNext ) i7.next else _a7, if( i8.hasNext ) i8.next else _a8, i )
            i += 1 
        }
        builder.result
    }

    def combine[ A1, A2, A3, A4, A5, A6, A7, A8, A9, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ], a8 : Iterable[ A8 ], a9 : Iterable[ A9 ] )( f : ( A1, A2, A3, A4, A5, A6, A7, A8, A9 ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7, i8, i9 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator, a8.iterator, a9.iterator )
        while( i1.hasNext && i2.hasNext && i3.hasNext && i4.hasNext && i5.hasNext && i6.hasNext && i7.hasNext && i8.hasNext && i9.hasNext ) {
            builder += f( i1.next, i2.next, i3.next, i4.next, i5.next, i6.next, i7.next, i8.next, i9.next ) 
        }
        builder.result
    }
    def combineWithIndex[ A1, A2, A3, A4, A5, A6, A7, A8, A9, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ], a8 : Iterable[ A8 ], a9 : Iterable[ A9 ] )( f : ( A1, A2, A3, A4, A5, A6, A7, A8, A9, Int ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7, i8, i9 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator, a8.iterator, a9.iterator )
        var i = 0
        while( i1.hasNext && i2.hasNext && i3.hasNext && i4.hasNext && i5.hasNext && i6.hasNext && i7.hasNext && i8.hasNext && i9.hasNext ) {
            builder += f( i1.next, i2.next, i3.next, i4.next, i5.next, i6.next, i7.next, i8.next, i9.next, i )
            i += 1 
        }
        builder.result
    }
    def combineAll[ A1, A2, A3, A4, A5, A6, A7, A8, A9, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ], a8 : Iterable[ A8 ], a9 : Iterable[ A9 ] )( _a1 : A1, _a2 : A2, _a3 : A3, _a4 : A4, _a5 : A5, _a6 : A6, _a7 : A7, _a8 : A8, _a9 : A9 )( f : ( A1, A2, A3, A4, A5, A6, A7, A8, A9 ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7, i8, i9 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator, a8.iterator, a9.iterator )
        while( i1.hasNext || i2.hasNext || i3.hasNext || i4.hasNext || i5.hasNext || i6.hasNext || i7.hasNext || i8.hasNext || i9.hasNext ) {
            builder += f( if( i1.hasNext ) i1.next else _a1, if( i2.hasNext ) i2.next else _a2, if( i3.hasNext ) i3.next else _a3, if( i4.hasNext ) i4.next else _a4, if( i5.hasNext ) i5.next else _a5, if( i6.hasNext ) i6.next else _a6, if( i7.hasNext ) i7.next else _a7, if( i8.hasNext ) i8.next else _a8, if( i9.hasNext ) i9.next else _a9 ) 
        }
        builder.result
    }
    def combineAllWithIndex[ A1, A2, A3, A4, A5, A6, A7, A8, A9, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ], a8 : Iterable[ A8 ], a9 : Iterable[ A9 ] )( _a1 : A1, _a2 : A2, _a3 : A3, _a4 : A4, _a5 : A5, _a6 : A6, _a7 : A7, _a8 : A8, _a9 : A9 )( f : ( A1, A2, A3, A4, A5, A6, A7, A8, A9, Int ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7, i8, i9 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator, a8.iterator, a9.iterator )
        var i = 0
        while( i1.hasNext || i2.hasNext || i3.hasNext || i4.hasNext || i5.hasNext || i6.hasNext || i7.hasNext || i8.hasNext || i9.hasNext ) {
            builder += f( if( i1.hasNext ) i1.next else _a1, if( i2.hasNext ) i2.next else _a2, if( i3.hasNext ) i3.next else _a3, if( i4.hasNext ) i4.next else _a4, if( i5.hasNext ) i5.next else _a5, if( i6.hasNext ) i6.next else _a6, if( i7.hasNext ) i7.next else _a7, if( i8.hasNext ) i8.next else _a8, if( i9.hasNext ) i9.next else _a9, i )
            i += 1 
        }
        builder.result
    }

    def combine[ A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ], a8 : Iterable[ A8 ], a9 : Iterable[ A9 ], a10 : Iterable[ A10 ] )( f : ( A1, A2, A3, A4, A5, A6, A7, A8, A9, A10 ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7, i8, i9, i10 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator, a8.iterator, a9.iterator, a10.iterator )
        while( i1.hasNext && i2.hasNext && i3.hasNext && i4.hasNext && i5.hasNext && i6.hasNext && i7.hasNext && i8.hasNext && i9.hasNext && i10.hasNext ) {
            builder += f( i1.next, i2.next, i3.next, i4.next, i5.next, i6.next, i7.next, i8.next, i9.next, i10.next ) 
        }
        builder.result
    }
    def combineWithIndex[ A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ], a8 : Iterable[ A8 ], a9 : Iterable[ A9 ], a10 : Iterable[ A10 ] )( f : ( A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, Int ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7, i8, i9, i10 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator, a8.iterator, a9.iterator, a10.iterator )
        var i = 0
        while( i1.hasNext && i2.hasNext && i3.hasNext && i4.hasNext && i5.hasNext && i6.hasNext && i7.hasNext && i8.hasNext && i9.hasNext && i10.hasNext ) {
            builder += f( i1.next, i2.next, i3.next, i4.next, i5.next, i6.next, i7.next, i8.next, i9.next, i10.next, i )
            i += 1 
        }
        builder.result
    }
    def combineAll[ A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ], a8 : Iterable[ A8 ], a9 : Iterable[ A9 ], a10 : Iterable[ A10 ] )( _a1 : A1, _a2 : A2, _a3 : A3, _a4 : A4, _a5 : A5, _a6 : A6, _a7 : A7, _a8 : A8, _a9 : A9, _a10 : A10 )( f : ( A1, A2, A3, A4, A5, A6, A7, A8, A9, A10 ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7, i8, i9, i10 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator, a8.iterator, a9.iterator, a10.iterator )
        while( i1.hasNext || i2.hasNext || i3.hasNext || i4.hasNext || i5.hasNext || i6.hasNext || i7.hasNext || i8.hasNext || i9.hasNext || i10.hasNext ) {
            builder += f( if( i1.hasNext ) i1.next else _a1, if( i2.hasNext ) i2.next else _a2, if( i3.hasNext ) i3.next else _a3, if( i4.hasNext ) i4.next else _a4, if( i5.hasNext ) i5.next else _a5, if( i6.hasNext ) i6.next else _a6, if( i7.hasNext ) i7.next else _a7, if( i8.hasNext ) i8.next else _a8, if( i9.hasNext ) i9.next else _a9, if( i10.hasNext ) i10.next else _a10 ) 
        }
        builder.result
    }
    def combineAllWithIndex[ A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ], a8 : Iterable[ A8 ], a9 : Iterable[ A9 ], a10 : Iterable[ A10 ] )( _a1 : A1, _a2 : A2, _a3 : A3, _a4 : A4, _a5 : A5, _a6 : A6, _a7 : A7, _a8 : A8, _a9 : A9, _a10 : A10 )( f : ( A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, Int ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7, i8, i9, i10 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator, a8.iterator, a9.iterator, a10.iterator )
        var i = 0
        while( i1.hasNext || i2.hasNext || i3.hasNext || i4.hasNext || i5.hasNext || i6.hasNext || i7.hasNext || i8.hasNext || i9.hasNext || i10.hasNext ) {
            builder += f( if( i1.hasNext ) i1.next else _a1, if( i2.hasNext ) i2.next else _a2, if( i3.hasNext ) i3.next else _a3, if( i4.hasNext ) i4.next else _a4, if( i5.hasNext ) i5.next else _a5, if( i6.hasNext ) i6.next else _a6, if( i7.hasNext ) i7.next else _a7, if( i8.hasNext ) i8.next else _a8, if( i9.hasNext ) i9.next else _a9, if( i10.hasNext ) i10.next else _a10, i )
            i += 1 
        }
        builder.result
    }

    def combine[ A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ], a8 : Iterable[ A8 ], a9 : Iterable[ A9 ], a10 : Iterable[ A10 ], a11 : Iterable[ A11 ] )( f : ( A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11 ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator, a8.iterator, a9.iterator, a10.iterator, a11.iterator )
        while( i1.hasNext && i2.hasNext && i3.hasNext && i4.hasNext && i5.hasNext && i6.hasNext && i7.hasNext && i8.hasNext && i9.hasNext && i10.hasNext && i11.hasNext ) {
            builder += f( i1.next, i2.next, i3.next, i4.next, i5.next, i6.next, i7.next, i8.next, i9.next, i10.next, i11.next ) 
        }
        builder.result
    }
    def combineWithIndex[ A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ], a8 : Iterable[ A8 ], a9 : Iterable[ A9 ], a10 : Iterable[ A10 ], a11 : Iterable[ A11 ] )( f : ( A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, Int ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator, a8.iterator, a9.iterator, a10.iterator, a11.iterator )
        var i = 0
        while( i1.hasNext && i2.hasNext && i3.hasNext && i4.hasNext && i5.hasNext && i6.hasNext && i7.hasNext && i8.hasNext && i9.hasNext && i10.hasNext && i11.hasNext ) {
            builder += f( i1.next, i2.next, i3.next, i4.next, i5.next, i6.next, i7.next, i8.next, i9.next, i10.next, i11.next, i )
            i += 1 
        }
        builder.result
    }
    def combineAll[ A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ], a8 : Iterable[ A8 ], a9 : Iterable[ A9 ], a10 : Iterable[ A10 ], a11 : Iterable[ A11 ] )( _a1 : A1, _a2 : A2, _a3 : A3, _a4 : A4, _a5 : A5, _a6 : A6, _a7 : A7, _a8 : A8, _a9 : A9, _a10 : A10, _a11 : A11 )( f : ( A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11 ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator, a8.iterator, a9.iterator, a10.iterator, a11.iterator )
        while( i1.hasNext || i2.hasNext || i3.hasNext || i4.hasNext || i5.hasNext || i6.hasNext || i7.hasNext || i8.hasNext || i9.hasNext || i10.hasNext || i11.hasNext ) {
            builder += f( if( i1.hasNext ) i1.next else _a1, if( i2.hasNext ) i2.next else _a2, if( i3.hasNext ) i3.next else _a3, if( i4.hasNext ) i4.next else _a4, if( i5.hasNext ) i5.next else _a5, if( i6.hasNext ) i6.next else _a6, if( i7.hasNext ) i7.next else _a7, if( i8.hasNext ) i8.next else _a8, if( i9.hasNext ) i9.next else _a9, if( i10.hasNext ) i10.next else _a10, if( i11.hasNext ) i11.next else _a11 ) 
        }
        builder.result
    }
    def combineAllWithIndex[ A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ], a8 : Iterable[ A8 ], a9 : Iterable[ A9 ], a10 : Iterable[ A10 ], a11 : Iterable[ A11 ] )( _a1 : A1, _a2 : A2, _a3 : A3, _a4 : A4, _a5 : A5, _a6 : A6, _a7 : A7, _a8 : A8, _a9 : A9, _a10 : A10, _a11 : A11 )( f : ( A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, Int ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator, a8.iterator, a9.iterator, a10.iterator, a11.iterator )
        var i = 0
        while( i1.hasNext || i2.hasNext || i3.hasNext || i4.hasNext || i5.hasNext || i6.hasNext || i7.hasNext || i8.hasNext || i9.hasNext || i10.hasNext || i11.hasNext ) {
            builder += f( if( i1.hasNext ) i1.next else _a1, if( i2.hasNext ) i2.next else _a2, if( i3.hasNext ) i3.next else _a3, if( i4.hasNext ) i4.next else _a4, if( i5.hasNext ) i5.next else _a5, if( i6.hasNext ) i6.next else _a6, if( i7.hasNext ) i7.next else _a7, if( i8.hasNext ) i8.next else _a8, if( i9.hasNext ) i9.next else _a9, if( i10.hasNext ) i10.next else _a10, if( i11.hasNext ) i11.next else _a11, i )
            i += 1 
        }
        builder.result
    }

    def combine[ A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ], a8 : Iterable[ A8 ], a9 : Iterable[ A9 ], a10 : Iterable[ A10 ], a11 : Iterable[ A11 ], a12 : Iterable[ A12 ] )( f : ( A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12 ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator, a8.iterator, a9.iterator, a10.iterator, a11.iterator, a12.iterator )
        while( i1.hasNext && i2.hasNext && i3.hasNext && i4.hasNext && i5.hasNext && i6.hasNext && i7.hasNext && i8.hasNext && i9.hasNext && i10.hasNext && i11.hasNext && i12.hasNext ) {
            builder += f( i1.next, i2.next, i3.next, i4.next, i5.next, i6.next, i7.next, i8.next, i9.next, i10.next, i11.next, i12.next ) 
        }
        builder.result
    }
    def combineWithIndex[ A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ], a8 : Iterable[ A8 ], a9 : Iterable[ A9 ], a10 : Iterable[ A10 ], a11 : Iterable[ A11 ], a12 : Iterable[ A12 ] )( f : ( A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, Int ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator, a8.iterator, a9.iterator, a10.iterator, a11.iterator, a12.iterator )
        var i = 0
        while( i1.hasNext && i2.hasNext && i3.hasNext && i4.hasNext && i5.hasNext && i6.hasNext && i7.hasNext && i8.hasNext && i9.hasNext && i10.hasNext && i11.hasNext && i12.hasNext ) {
            builder += f( i1.next, i2.next, i3.next, i4.next, i5.next, i6.next, i7.next, i8.next, i9.next, i10.next, i11.next, i12.next, i )
            i += 1 
        }
        builder.result
    }
    def combineAll[ A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ], a8 : Iterable[ A8 ], a9 : Iterable[ A9 ], a10 : Iterable[ A10 ], a11 : Iterable[ A11 ], a12 : Iterable[ A12 ] )( _a1 : A1, _a2 : A2, _a3 : A3, _a4 : A4, _a5 : A5, _a6 : A6, _a7 : A7, _a8 : A8, _a9 : A9, _a10 : A10, _a11 : A11, _a12 : A12 )( f : ( A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12 ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator, a8.iterator, a9.iterator, a10.iterator, a11.iterator, a12.iterator )
        while( i1.hasNext || i2.hasNext || i3.hasNext || i4.hasNext || i5.hasNext || i6.hasNext || i7.hasNext || i8.hasNext || i9.hasNext || i10.hasNext || i11.hasNext || i12.hasNext ) {
            builder += f( if( i1.hasNext ) i1.next else _a1, if( i2.hasNext ) i2.next else _a2, if( i3.hasNext ) i3.next else _a3, if( i4.hasNext ) i4.next else _a4, if( i5.hasNext ) i5.next else _a5, if( i6.hasNext ) i6.next else _a6, if( i7.hasNext ) i7.next else _a7, if( i8.hasNext ) i8.next else _a8, if( i9.hasNext ) i9.next else _a9, if( i10.hasNext ) i10.next else _a10, if( i11.hasNext ) i11.next else _a11, if( i12.hasNext ) i12.next else _a12 ) 
        }
        builder.result
    }
    def combineAllWithIndex[ A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ], a8 : Iterable[ A8 ], a9 : Iterable[ A9 ], a10 : Iterable[ A10 ], a11 : Iterable[ A11 ], a12 : Iterable[ A12 ] )( _a1 : A1, _a2 : A2, _a3 : A3, _a4 : A4, _a5 : A5, _a6 : A6, _a7 : A7, _a8 : A8, _a9 : A9, _a10 : A10, _a11 : A11, _a12 : A12 )( f : ( A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, Int ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator, a8.iterator, a9.iterator, a10.iterator, a11.iterator, a12.iterator )
        var i = 0
        while( i1.hasNext || i2.hasNext || i3.hasNext || i4.hasNext || i5.hasNext || i6.hasNext || i7.hasNext || i8.hasNext || i9.hasNext || i10.hasNext || i11.hasNext || i12.hasNext ) {
            builder += f( if( i1.hasNext ) i1.next else _a1, if( i2.hasNext ) i2.next else _a2, if( i3.hasNext ) i3.next else _a3, if( i4.hasNext ) i4.next else _a4, if( i5.hasNext ) i5.next else _a5, if( i6.hasNext ) i6.next else _a6, if( i7.hasNext ) i7.next else _a7, if( i8.hasNext ) i8.next else _a8, if( i9.hasNext ) i9.next else _a9, if( i10.hasNext ) i10.next else _a10, if( i11.hasNext ) i11.next else _a11, if( i12.hasNext ) i12.next else _a12, i )
            i += 1 
        }
        builder.result
    }

    def combine[ A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ], a8 : Iterable[ A8 ], a9 : Iterable[ A9 ], a10 : Iterable[ A10 ], a11 : Iterable[ A11 ], a12 : Iterable[ A12 ], a13 : Iterable[ A13 ] )( f : ( A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13 ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator, a8.iterator, a9.iterator, a10.iterator, a11.iterator, a12.iterator, a13.iterator )
        while( i1.hasNext && i2.hasNext && i3.hasNext && i4.hasNext && i5.hasNext && i6.hasNext && i7.hasNext && i8.hasNext && i9.hasNext && i10.hasNext && i11.hasNext && i12.hasNext && i13.hasNext ) {
            builder += f( i1.next, i2.next, i3.next, i4.next, i5.next, i6.next, i7.next, i8.next, i9.next, i10.next, i11.next, i12.next, i13.next ) 
        }
        builder.result
    }
    def combineWithIndex[ A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ], a8 : Iterable[ A8 ], a9 : Iterable[ A9 ], a10 : Iterable[ A10 ], a11 : Iterable[ A11 ], a12 : Iterable[ A12 ], a13 : Iterable[ A13 ] )( f : ( A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, Int ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator, a8.iterator, a9.iterator, a10.iterator, a11.iterator, a12.iterator, a13.iterator )
        var i = 0
        while( i1.hasNext && i2.hasNext && i3.hasNext && i4.hasNext && i5.hasNext && i6.hasNext && i7.hasNext && i8.hasNext && i9.hasNext && i10.hasNext && i11.hasNext && i12.hasNext && i13.hasNext ) {
            builder += f( i1.next, i2.next, i3.next, i4.next, i5.next, i6.next, i7.next, i8.next, i9.next, i10.next, i11.next, i12.next, i13.next, i )
            i += 1 
        }
        builder.result
    }
    def combineAll[ A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ], a8 : Iterable[ A8 ], a9 : Iterable[ A9 ], a10 : Iterable[ A10 ], a11 : Iterable[ A11 ], a12 : Iterable[ A12 ], a13 : Iterable[ A13 ] )( _a1 : A1, _a2 : A2, _a3 : A3, _a4 : A4, _a5 : A5, _a6 : A6, _a7 : A7, _a8 : A8, _a9 : A9, _a10 : A10, _a11 : A11, _a12 : A12, _a13 : A13 )( f : ( A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13 ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator, a8.iterator, a9.iterator, a10.iterator, a11.iterator, a12.iterator, a13.iterator )
        while( i1.hasNext || i2.hasNext || i3.hasNext || i4.hasNext || i5.hasNext || i6.hasNext || i7.hasNext || i8.hasNext || i9.hasNext || i10.hasNext || i11.hasNext || i12.hasNext || i13.hasNext ) {
            builder += f( if( i1.hasNext ) i1.next else _a1, if( i2.hasNext ) i2.next else _a2, if( i3.hasNext ) i3.next else _a3, if( i4.hasNext ) i4.next else _a4, if( i5.hasNext ) i5.next else _a5, if( i6.hasNext ) i6.next else _a6, if( i7.hasNext ) i7.next else _a7, if( i8.hasNext ) i8.next else _a8, if( i9.hasNext ) i9.next else _a9, if( i10.hasNext ) i10.next else _a10, if( i11.hasNext ) i11.next else _a11, if( i12.hasNext ) i12.next else _a12, if( i13.hasNext ) i13.next else _a13 ) 
        }
        builder.result
    }
    def combineAllWithIndex[ A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ], a8 : Iterable[ A8 ], a9 : Iterable[ A9 ], a10 : Iterable[ A10 ], a11 : Iterable[ A11 ], a12 : Iterable[ A12 ], a13 : Iterable[ A13 ] )( _a1 : A1, _a2 : A2, _a3 : A3, _a4 : A4, _a5 : A5, _a6 : A6, _a7 : A7, _a8 : A8, _a9 : A9, _a10 : A10, _a11 : A11, _a12 : A12, _a13 : A13 )( f : ( A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, Int ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator, a8.iterator, a9.iterator, a10.iterator, a11.iterator, a12.iterator, a13.iterator )
        var i = 0
        while( i1.hasNext || i2.hasNext || i3.hasNext || i4.hasNext || i5.hasNext || i6.hasNext || i7.hasNext || i8.hasNext || i9.hasNext || i10.hasNext || i11.hasNext || i12.hasNext || i13.hasNext ) {
            builder += f( if( i1.hasNext ) i1.next else _a1, if( i2.hasNext ) i2.next else _a2, if( i3.hasNext ) i3.next else _a3, if( i4.hasNext ) i4.next else _a4, if( i5.hasNext ) i5.next else _a5, if( i6.hasNext ) i6.next else _a6, if( i7.hasNext ) i7.next else _a7, if( i8.hasNext ) i8.next else _a8, if( i9.hasNext ) i9.next else _a9, if( i10.hasNext ) i10.next else _a10, if( i11.hasNext ) i11.next else _a11, if( i12.hasNext ) i12.next else _a12, if( i13.hasNext ) i13.next else _a13, i )
            i += 1 
        }
        builder.result
    }

    def combine[ A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ], a8 : Iterable[ A8 ], a9 : Iterable[ A9 ], a10 : Iterable[ A10 ], a11 : Iterable[ A11 ], a12 : Iterable[ A12 ], a13 : Iterable[ A13 ], a14 : Iterable[ A14 ] )( f : ( A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14 ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator, a8.iterator, a9.iterator, a10.iterator, a11.iterator, a12.iterator, a13.iterator, a14.iterator )
        while( i1.hasNext && i2.hasNext && i3.hasNext && i4.hasNext && i5.hasNext && i6.hasNext && i7.hasNext && i8.hasNext && i9.hasNext && i10.hasNext && i11.hasNext && i12.hasNext && i13.hasNext && i14.hasNext ) {
            builder += f( i1.next, i2.next, i3.next, i4.next, i5.next, i6.next, i7.next, i8.next, i9.next, i10.next, i11.next, i12.next, i13.next, i14.next ) 
        }
        builder.result
    }
    def combineWithIndex[ A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ], a8 : Iterable[ A8 ], a9 : Iterable[ A9 ], a10 : Iterable[ A10 ], a11 : Iterable[ A11 ], a12 : Iterable[ A12 ], a13 : Iterable[ A13 ], a14 : Iterable[ A14 ] )( f : ( A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, Int ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator, a8.iterator, a9.iterator, a10.iterator, a11.iterator, a12.iterator, a13.iterator, a14.iterator )
        var i = 0
        while( i1.hasNext && i2.hasNext && i3.hasNext && i4.hasNext && i5.hasNext && i6.hasNext && i7.hasNext && i8.hasNext && i9.hasNext && i10.hasNext && i11.hasNext && i12.hasNext && i13.hasNext && i14.hasNext ) {
            builder += f( i1.next, i2.next, i3.next, i4.next, i5.next, i6.next, i7.next, i8.next, i9.next, i10.next, i11.next, i12.next, i13.next, i14.next, i )
            i += 1 
        }
        builder.result
    }
    def combineAll[ A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ], a8 : Iterable[ A8 ], a9 : Iterable[ A9 ], a10 : Iterable[ A10 ], a11 : Iterable[ A11 ], a12 : Iterable[ A12 ], a13 : Iterable[ A13 ], a14 : Iterable[ A14 ] )( _a1 : A1, _a2 : A2, _a3 : A3, _a4 : A4, _a5 : A5, _a6 : A6, _a7 : A7, _a8 : A8, _a9 : A9, _a10 : A10, _a11 : A11, _a12 : A12, _a13 : A13, _a14 : A14 )( f : ( A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14 ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator, a8.iterator, a9.iterator, a10.iterator, a11.iterator, a12.iterator, a13.iterator, a14.iterator )
        while( i1.hasNext || i2.hasNext || i3.hasNext || i4.hasNext || i5.hasNext || i6.hasNext || i7.hasNext || i8.hasNext || i9.hasNext || i10.hasNext || i11.hasNext || i12.hasNext || i13.hasNext || i14.hasNext ) {
            builder += f( if( i1.hasNext ) i1.next else _a1, if( i2.hasNext ) i2.next else _a2, if( i3.hasNext ) i3.next else _a3, if( i4.hasNext ) i4.next else _a4, if( i5.hasNext ) i5.next else _a5, if( i6.hasNext ) i6.next else _a6, if( i7.hasNext ) i7.next else _a7, if( i8.hasNext ) i8.next else _a8, if( i9.hasNext ) i9.next else _a9, if( i10.hasNext ) i10.next else _a10, if( i11.hasNext ) i11.next else _a11, if( i12.hasNext ) i12.next else _a12, if( i13.hasNext ) i13.next else _a13, if( i14.hasNext ) i14.next else _a14 ) 
        }
        builder.result
    }
    def combineAllWithIndex[ A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, T ]( a1 : Iterable[ A1 ], a2 : Iterable[ A2 ], a3 : Iterable[ A3 ], a4 : Iterable[ A4 ], a5 : Iterable[ A5 ], a6 : Iterable[ A6 ], a7 : Iterable[ A7 ], a8 : Iterable[ A8 ], a9 : Iterable[ A9 ], a10 : Iterable[ A10 ], a11 : Iterable[ A11 ], a12 : Iterable[ A12 ], a13 : Iterable[ A13 ], a14 : Iterable[ A14 ] )( _a1 : A1, _a2 : A2, _a3 : A3, _a4 : A4, _a5 : A5, _a6 : A6, _a7 : A7, _a8 : A8, _a9 : A9, _a10 : A10, _a11 : A11, _a12 : A12, _a13 : A13, _a14 : A14 )( f : ( A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, Int ) => T ) : Iterable[ T ] = {
        val builder = a1.genericBuilder[ T ]
        val ( i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14 ) = ( a1.iterator, a2.iterator, a3.iterator, a4.iterator, a5.iterator, a6.iterator, a7.iterator, a8.iterator, a9.iterator, a10.iterator, a11.iterator, a12.iterator, a13.iterator, a14.iterator )
        var i = 0
        while( i1.hasNext || i2.hasNext || i3.hasNext || i4.hasNext || i5.hasNext || i6.hasNext || i7.hasNext || i8.hasNext || i9.hasNext || i10.hasNext || i11.hasNext || i12.hasNext || i13.hasNext || i14.hasNext ) {
            builder += f( if( i1.hasNext ) i1.next else _a1, if( i2.hasNext ) i2.next else _a2, if( i3.hasNext ) i3.next else _a3, if( i4.hasNext ) i4.next else _a4, if( i5.hasNext ) i5.next else _a5, if( i6.hasNext ) i6.next else _a6, if( i7.hasNext ) i7.next else _a7, if( i8.hasNext ) i8.next else _a8, if( i9.hasNext ) i9.next else _a9, if( i10.hasNext ) i10.next else _a10, if( i11.hasNext ) i11.next else _a11, if( i12.hasNext ) i12.next else _a12, if( i13.hasNext ) i13.next else _a13, if( i14.hasNext ) i14.next else _a14, i )
            i += 1 
        }
        builder.result
    }
}

