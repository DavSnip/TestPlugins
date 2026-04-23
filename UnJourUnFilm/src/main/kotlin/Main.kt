import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.TvType
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin

@CloudstreamPlugin
class UnjourUnfilm : MainAPI() {
    override var name = "UnjourUnfilm"
    override var mainUrl = "https://1jour1film0426c.site"
    override var lang = "fr"
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries)
}
