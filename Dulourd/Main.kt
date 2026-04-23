import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.TvType

class Papadustream : MainAPI() {
    override var name = "Dulourd"
    override var mainUrl = "https://dulourd.boo"
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries)
}
