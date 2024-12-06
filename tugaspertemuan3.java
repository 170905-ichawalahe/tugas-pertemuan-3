public class TugasPertemuan3 {
    public static void main(String[] args) {

        // TestInteger - Contoh 1:  Menunjukkan berbagai tipe data integer
        System.out.println("\nTestInteger - Contoh 1:");
        byte b1 = 120;
        short s1 = 32767;
        int i1 = 1_000_000_000;
        long l1 = 90000000000L;

        System.out.println("byte  : " + b1);
        System.out.println("short : " + s1);
        System.out.println("int   : " + i1);
        System.out.println("long  : " + l1);


        // TestInteger - Contoh 2: Perhitungan dengan tipe data integer
        System.out.println("\nTestInteger - Contoh 2:");
        byte b2 = 10;
        byte b3 = 20;
        short sum = (short)(b2 + b3); // Konversi eksplisit ke short
        int x = 1000000;
        int y = 2000000;
        long product = (long)x * y; // Konversi eksplisit ke long untuk mencegah overflow

        System.out.println("Jumlah byte: " + sum);
        System.out.println("Hasil kali int: " + product);


        // TestPecahan - Contoh 1: Menunjukkan tipe data pecahan
        System.out.println("\nTestPecahan - Contoh 1:");
        float f1 = 1234567890.123456789F;
        double d1 = 1_234_567_890.123456789;

        System.out.println("Float  : " + f1);
        System.out.println("Double : " + d1);


        // TestPecahan - Contoh 2: Menunjukkan potensi masalah presisi floating-point
        System.out.println("\nTestPecahan - Contoh 2:");
        float f2 = 0.1f + 0.2f; 
        double d2 = 0.1 + 0.2;

        System.out.println("Float (0.1f + 0.2f): " + f2);
        System.out.println("Double (0.1 + 0.2): " + d2);


        // TestChar - Contoh 1: Menunjukkan tipe data karakter
        System.out.println("\nTestChar - Contoh 1:");
        char c1 = 'A';
        char tab = '\t';
        char newline = '\n';

        System.out.println("Karakter: " + c1);
        System.out.println("Hasil " + newline + "Karakter \t" + "tab\"berisi \"" + c1);


        // TestChar - Contoh 2: Menunjukkan selisih nilai ASCII
        System.out.println("\nTestChar - Contoh 2:");
        char c2 = 'a';
        char c3 = 'Z';
        int charDiff = c3 - c2; // Selisih nilai ASCII

        System.out.println("Selisih ASCII 'Z' dan 'a': " + charDiff);
    }
}