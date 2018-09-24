package Basics.ArraysCollectionsMaps;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionIteration {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Első");
        arrayList.add("Második");
        arrayList.add("Harmadik");

        System.out.println("Gyűjtemények és tömbök bejárása kibővített for ciklussal");
        for (String string : arrayList) {
            System.out.println(string);
        }

        System.out.println();
        System.out.println("Gyűjtemények bejárása iterátor segítségével for ciklussal");
        for (Iterator<String> iterator = arrayList.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println("Gyűjtemények bejárása hagyományos for ciklussal");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i + ": " + arrayList.get(i));
        }
    }

}
