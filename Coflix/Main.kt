import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.TvType

class Coflix : MainAPI() {
    override var name = "Coflix"
    override var mainUrl = "https://coflix.wales"
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries)
}
