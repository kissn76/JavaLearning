package sample;

public class SampleExtends {

    public static void main(String[] args) {
        Teglalap teglalap1 = new Teglalap(20, 30);
        teglalap1.print();
        printLine();
        Negyzet negyzet1 = new Negyzet(20);
        negyzet1.print();
        printLine("=");
        System.out.println("Téglalapok száma: " + Teglalap.getSzamlalo());
        System.out.println("Négyzetek száma: " + Negyzet.getSzamlalo());
    }

    static void printLine() {
        printLine("-");
    }

    static void printLine(int darab) {
        printLine("-", darab);
    }

    static void printLine(String elvalaszto) {
        printLine(elvalaszto, 50);
    }

    static void printLine(String elvalaszto, int darab) {
        for (int i = 0; i < darab; i++) {
            System.out.print(elvalaszto);
        }
        System.out.println();
    }

}

class Teglalap {
    int szelesseg;
    int magassag;
    static int szamlalo = 0;

    Teglalap(int szelesseg, int magassag) {
        this.szelesseg = szelesseg;
        this.magassag = magassag;
        szamlalo++;
    }

    int terulet() {
        return this.szelesseg * this.magassag;
    }

    void print() {
        System.out.println("Téglalap");
        System.out.println("Szélesség: " + this.szelesseg);
        System.out.println("Magasság: " + this.magassag);
        System.out.println("Terület: " + terulet());
    }

    static int getSzamlalo() {
        return szamlalo;
    }
}

class Negyzet extends Teglalap {
    static int szamlalo = 0;

    Negyzet(int oldal) {
        super(oldal, oldal);
        szamlalo++;
    }

    @Override
    void print() {
        System.out.println("Négyzet");
        System.out.println("Szélesség, magasság: " + this.szelesseg);
        System.out.println("Terület: " + terulet());
    }

    static int getSzamlalo() {
        return szamlalo;
    }

}
