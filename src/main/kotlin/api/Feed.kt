package api

import java.time.Instant

data class Feed(
        val title : String,
        val link : String,
        val updated : Instant,
        val author : Author,
        val id : String,
        val entry: Entry )
{
}