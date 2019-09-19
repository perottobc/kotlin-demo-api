package api

import java.time.Instant

data class Entry(
        val title : String,
        val link : String,
        val id : String,
        val updated : Instant,
        val summary : String) {

}
