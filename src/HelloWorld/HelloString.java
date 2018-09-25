package HelloWorld;

public class HelloString {

    public static void main(String[] args) {
        String a = "Két kicsi kecske baktat a hegyre.";
        String a2 = "Két kicsi kecske baktat a hegyre.";
        String b = new String("Két kicsi kecske baktat a hegyre.");
        String b2 = new String("Két kicsi kecske baktat a hegyre.");
        char[] c = {'K', 'é', 't', ' ', 'k', 'i', 'c', 's', 'i', '.'};
        int d = 23;
        double e = 23.456;

        System.out.println(a == a2);        // true
        System.out.println(a == b);         // false
        System.out.println(b == b2);        // false
        System.out.println(a.equals(b));    // true

        String cString = new String(c);
        System.out.println(cString);

        String dString = String.valueOf(d);
        System.out.println(dString);

        String eString = String.valueOf(e);
        System.out.println(eString);
 
        // információ
        System.out.println("length: " + a.length());
        System.out.println("isEmpty: " + a.isEmpty());
        // indexek
        System.out.println("charAt(2): " + a.charAt(2));
        System.out.println("indexOf(\"kecske\"): " + a.indexOf("kecske"));
        System.out.println("indexOf('e'): " + a.indexOf('e'));
        System.out.println("lastIndexOf('e'): " + a.lastIndexOf('e'));
        System.out.println("lastIndexOf('e', 30): " + a.lastIndexOf('e', 30));
        // módosítás
        System.out.println("replace('e', 'E'): " + a.replace('e', 'E'));
        System.out.println("replace(\"kecske\", \"farkas\"): " + a.replace("kecske", "farkas"));
        System.out.println("replaceFirst(\"e\", \"E\"): " + a.replaceFirst("e", "E"));
        System.out.println("replaceAll(\"e\", \"E\"): " + a.replaceAll("e", "E"));
        System.out.println("substring(20): " + a.substring(20));
        System.out.println("substring(20, 30): " + a.substring(20, 30));
        System.out.println(String.join(" ", a, "Almát", "eszik."));
        // hasonlítás
        System.out.println("compareTo(\"Két a\"): " + a.compareTo("Két a"));
        System.out.println("compareTo(\"Két á\"): " + a.compareTo("Két á"));    // UTF!!!
        System.out.println("compareTo(\"Két j\"): " + a.compareTo("Két j"));
        System.out.println("compareTo(b): " + a.compareTo(b));
        System.out.println("compareTo(\"Két l\"): " + a.compareTo("Két l"));
    }

}
