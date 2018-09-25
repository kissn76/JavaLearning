package basics;

public class A2_FinalVariables {

    public static void main(String[] args) {
        final int intVar = 1;   // deklaráltuk és inicializáltuk
        final int otherIntVar;  // csak deklaráltuk

        otherIntVar = 3;    // itt inicializáltuk
        intVar = 2;         // Error: inicializálás után már nem módosítható az értéke
        otherIntVar = 4;    // Error: inicializálás után már nem módosítható az értéke
    }

}
