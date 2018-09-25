package basics;

public class A1Variables {

    public static void main(String[] args) {
        /*
         * Egészek
         */
        // bájt méretű előjeles egész
        byte byteVar = 1;   // 8-bit kettes komplemens; -128...127; default value: 0
        // rövid előjeles egész
        short shortVar = 1; // 16-bit kettes komplemens; -32768...32767; default value: 0
        // előjeles egész
        int intVar = 1;     // 32-bit kettes komplemens; -2147483648...2147483647; default value: 0
        // hosszú előjeles egész
        long longVar = 1;   // 64-bit kettes komplemens; -9223372036854775808...9223372036854775807; default value: 0

        /*
         * Valós számok
         */
        // egyszeres pontosságú lebegőpontos
        float floatVar = 1;     // 32-bit IEEE 754; +/-1.4E-45...+/-3.4028235E+38, +/-infinity, +/-0, NaN; default value: 0.0
        // dupla pontosságú lebegőpontos
        double doubleVar = 1.0E-10;   // 64-bit IEEE 754; +/-4.9E-324...+/-1.7976931348623157E+308, +/-infinity, +/-0, NaN; default value: 0.0

        /*
         * Egyéb
         */
        // karakter
        char charVar = 'a';         // 16-bit Unicode karakter; \u0000 - \uFFFF; default value: \u0000
        // logikai érték
        boolean booleanVar = true;  // 1 bitet használ egy 32 bites egészből; true, false; default value: false

        System.out.println(byteVar);
        System.out.println(shortVar + intVar);
        System.out.println(longVar + floatVar + doubleVar);
        System.out.println(charVar);
        System.out.println(booleanVar);
        System.out.println("The byte value: from " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("The short value: from " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("The int value: from " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("The long value: from " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("The float value: from " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("The double value: from " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
    }

}
