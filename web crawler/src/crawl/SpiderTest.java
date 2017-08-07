package crawl;

/**
 * Created by mattlawlor on 7/24/17.
 */
public class SpiderTest {

    public static void main(String[] args) {
        Spider spider = new Spider();
        spider.search("http://arstechnica.com/", "computer");
    }
}
