package antipatterns;

/*
 * https://hup.hu/node/160938#comment-2269526
 */
public class Extends02 {

    public static void main(String[] args) throws Exception {
        BB inst = new BB();
        System.out.println(inst.foo);           // 5
        System.out.println(((AA) inst).foo);    // 4
        System.out.println(((BB) inst).foo);    // 5
        System.out.println(Class.forName("antipatterns.AA").getField("foo").getInt(inst)); // 4, de ugye a Class-t hozhatod bárhonnan ;)
        System.out.println(Class.forName("antipatterns.BB").getField("foo").getInt(inst)); // 5, de ugye a Class-t hozhatod bárhonnan ;)
    }

}

class AA {

    public int foo = 4;

}

class BB extends AA {

    public int foo = 5;

}
