public class Ders14TipDonusumleri {
    public static void main(String[] args) {
        /// 14. Ders Tip Dönüşümleri
        System.out.println("14. Ders Tip Dönüşümleri");
        // Tip dönüşümleri
        // String -> int
        String sayi = "5";
        int sayi2 = Integer.parseInt(sayi);
        // Integer.parseInt() metodu ile string değeri inte çevirebiliriz.
        System.out.println("sayi2: " + sayi2);

        // int -> String
        int sayi3 = 10;
        String sayi4 = String.valueOf(sayi3);
        // String.valueOf() metodu ile int değeri stringe çevirebiliriz.
        System.out.println("sayi4: " + sayi4);

        // String -> double
        String sayi5 = "5.5";
        double sayi6 = Double.parseDouble(sayi5);
        // Double.parseDouble() metodu ile string değeri double çevirebiliriz.
        System.out.println("sayi6: " + sayi6);

        // double -> String
        double sayi7 = 10.5;
        String sayi8 = String.valueOf(sayi7);
        // String.valueOf() metodu ile double değeri stringe çevirebiliriz.
        System.out.println("sayi8: " + sayi8);

        // String -> char
        String karakter = "a";
        char karakter2 = karakter.charAt(0);
        // charAt() metodu ile stringin belirttiğimiz indeksteki karakterini alabiliriz.
        System.out.println("karakter2: " + karakter2);

        // char -> String
        char karakter3 = 'b';
        String karakter4 = String.valueOf(karakter3);
        // String.valueOf() metodu ile char değeri stringe çevirebiliriz.
        System.out.println("karakter4: " + karakter4);

        // String -> boolean
        String booleanDeger = "true";
        boolean booleanDeger2 = Boolean.parseBoolean(booleanDeger);
        // Boolean.parseBoolean() metodu ile string değeri boolean çevirebiliriz. String olarak da sadece
        // true veya false değerleri alabilir.
        System.out.println("booleanDeger2: " + booleanDeger2);

        // boolean -> String
        boolean booleanDeger3 = true;
        String booleanDeger4 = String.valueOf(booleanDeger3);
        // String.valueOf() metodu ile boolean değeri stringe çevirebiliriz.
        System.out.println("booleanDeger4: " + booleanDeger4);

        // int -> double
        int sayi9 = 5;
        double sayi10 = sayi9;
        // int değeri double değere çevirebiliriz.
        System.out.println("sayi10: " + sayi10);

        // double -> int
        double sayi11 = 5.5;
        int sayi12 = (int) sayi11;
        // double değeri int değere çevirebiliriz.
        System.out.println("sayi12: " + sayi12);

        // int -> char
        int sayi13 = 97;
        char sayi14 = (char) sayi13;
        // int değeri char değere çevirebiliriz.
        System.out.println("sayi14: " + sayi14);

        // Örnek:
        int i = 50;
        double dbl = 3.99;
        String s = "08:20:15";
        i = Integer.valueOf(s.substring(0, 2));
        i--;
        s = String.valueOf(i) + s.substring(2);
        System.out.println("dbl = " + dbl);
        System.out.println("i = " + i);
        System.out.println("s = " + s);

        System.out.println("**********************");

        // Örnek:
        int i1;
        String s1 = "08:20:15";
        i1 = Integer.parseInt(s1.substring(0, 2));
        i1--;
        if (i1 < 10) s1 = "0" + i1 + s1.substring(2);
        else s1 = i1 + s1.substring(2);

        System.out.println("i1 = " + i1);
        System.out.println("s1 = " + s1);

        // Value.of() metodu ile string değeri int değere çevirebiliriz.


    }
}
