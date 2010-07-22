package com.hjl.util

import java.io.Closeable

class RichCloseable[ T <% Closeable ]( t : T ) {
    def use[ S ]( f : T => S ) : S = try { f( t ) } finally { t.close }
}
