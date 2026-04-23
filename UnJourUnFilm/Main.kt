import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.TvType

class Papadustream : MainAPI() {
    override var name = "UnjourUnfilm"
    override var mainUrl = "https://1jour1film0426c.site"
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries)
}
