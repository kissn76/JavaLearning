package string.reverse;

public class StringReverse3 {

    public static void main(String[] args) {
        String a = "Kiss Norbert";
        String b = "";

        StringBuilder c = new StringBuilder(a);
        c.reverse();

        b = c.toString();

        System.out.println(b);
    }

}
