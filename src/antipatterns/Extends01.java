package antipatterns;

/*
 * https://hup.hu/node/160938
 */
public class Extends01 {

    public static void main(String[] args) {
        A x = new B();
        x.f();
        System.out.println(x.a);    // B 2
    }
    /*
     * A publikus változók máshogy viselkednek, mint a publikus metódusok ebben az esetben.
     * Az "a" fieldet a B-ben definiált "a" field elrejti, viszont az f metódust a B-ben definiált metódus overrideolja. Ezért az x.f() hívás a B
     * implementációját futtatja és a B fieldjét módosítja, de az x.a már az A fieldjét adja vissza, mivel az x referenciának A a típusa.
     * https://docs.oracle.com/javase/tutorial/java/IandI/hidevariables.html
     * https://docs.oracle.com/javase/tutorial/java/IandI/override.html
     */

}

class A {

    public int a = 2;

    public void f() {
        a += 5;
        System.out.print("A ");
    }
}

class B extends A {

    public int a = 7;

    public void f() {
        this.a += 3;
        System.out.print("B ");
    }
}
