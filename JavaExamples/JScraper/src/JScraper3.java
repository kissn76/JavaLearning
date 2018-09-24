import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JScraper3 {

    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://ipinfo.io/ip").get();
        String text = doc.body().text();

        System.out.print(text);

    }

}
