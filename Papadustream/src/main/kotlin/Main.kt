import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.TvType

class Papadustream : MainAPI() {
    override var name = "Papadustream"
    override var mainUrl = "https://papadustream.singles"
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries)
}
