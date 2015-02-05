package kcmweb
import com.knightcapllc.NewsArticles
class IndexController {

    def index() {
		[articles: NewsArticles.list()]
	}
}
