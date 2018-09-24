package string.reverse;
public class StringReverse2 {

    public static void main(String[] args) {
        String a = "Kiss Norbert";
        String b = "";

        StringBuffer c = new StringBuffer(a);
        c.reverse();

        b = c.toString();

        System.out.println(b);
    }

}
