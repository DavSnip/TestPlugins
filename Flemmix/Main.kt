import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.TvType

class Papadustream : MainAPI() {
    override var name = "Flemmix"
    override var mainUrl = "https://flemmix.wales"
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries)
}
