import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

public class JScraper2 {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://ipinfo.io/ip");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection(); // Cast shouldn't fail
        HttpURLConnection.setFollowRedirects(true);

        conn.setRequestProperty("Accept-Encoding", "gzip, deflate"); // allow both GZip and Deflate (ZLib) encodings
        // conn.setRequestProperty("User-agent", "my agent name");
        String encoding = conn.getContentEncoding();
        InputStream inStr = null;

        // create the appropriate stream wrapper based on
        // the encoding type
        if (encoding != null && encoding.equalsIgnoreCase("gzip")) {
            inStr = new GZIPInputStream(conn.getInputStream());
        } else if (encoding != null && encoding.equalsIgnoreCase("deflate")) {
            inStr = new InflaterInputStream(conn.getInputStream(), new Inflater(true));
        } else {
            inStr = conn.getInputStream();
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(inStr));
        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

    }

}
