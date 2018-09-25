package HelloWorld;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapIteration {

    public static void main(String[] args) {
        LinkedHashMap<String, String> hashMap = new LinkedHashMap<String, String>();

        hashMap.put("első", "Első");
        hashMap.put("második", "Második");
        hashMap.put("harmadik", "Harmadik");

        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
