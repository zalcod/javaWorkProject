import java.util.Scanner;

public class AnaClass {
    public static void main(String[] args) {
        /// 1. Ders Java'da proje ve class oluşturma
        System.out.println("Java Dersleri Basladi");
        System.out.println("Hosgeldiniz.");

        /// 2. Ders Java'da değişkenler, veri tipleri, atama işlemleri
        int sayi1;
        sayi1 = 10; // int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;
        int toplam = sayi1 + sayi2 + sayi3;
        System.out.println("Toplam: " + toplam);

        // int sayi; // 2.147.000.000 -> int sayılar bundan büyük olamaz
        int sayi = 10;
        sayi = sayi + 5;
        System.out.println("Sayi: " + sayi);

        sayi += 1; // sayi = sayi + 1;
        sayi ++; // sayi += 1;
        System.out.println("Sayi: " + sayi);

        sayi -= 1; // sayi = sayi - 1;
        sayi --; // sayi -= 1;
        System.out.println("Sayi: " + sayi);

        /// 3.Ders Değişken Tipleri

        byte b1; // 1 byte = 8 bit
        short s1; // 2 byte = 16 bit
        int i1; // 4 byte = 32 bit
        long l1; // 8 byte = 64 bit
        float f1; // 4 byte = 32 bit
        double dbl1; // 8 byte = 64 bit
        char ch1; // 2 byte = 16 bit //Karakter tutarız
        boolean bool1; // 1 byte = 8 bit // true veya false

        // String değeri bir sınıftır. String değerlerini tutmak için kullanılır.
        String str = "Merhaba Dünya";

        // En çok kullanılan değişken tipleri: int, double, String, boolean
        // Örnek Kullanımlar;
        System.out.println(str);

        boolean ifade = false;
        System.out.println(ifade);



        /// 4. Ders Java'da operatörler / Matematiksel ifadeler
        System.out.println("4. Ders Java'da operatörler / Matematiksel ifadeler");
        int sayi4 = 5;
        sayi4 = sayi4 +5;
        sayi4 = sayi4 * 2;
        int bolen = 3;

        sayi4 = (sayi4 + 10) / bolen;
        System.out.println("Sayi4: " + sayi4);

        // Başka bir örnek daha;
        String str1 = "Merhaba ";
        String isim = "Dünya";
        String mesaj;
        mesaj = str1 + isim;
        System.out.println(mesaj);

        ///Bir örnek daha;
        double dSayi = 1+2*3.15;
        System.out.println("dSayi: " + dSayi);




        /// 5. Ders Kullanıcıdan Veri Alma
        System.out.println("5. Ders Kullanıcıdan Veri Alma");
        Scanner oku = new Scanner(System.in);
        int sayi5;
        System.out.print("Bir sayi giriniz: "); // ln'yi kaldırdık aynı satırda yazdırmak için
        sayi5 = oku.nextInt();

        System.out.println("Girilen sayi: " + sayi5);

        // Örnek: String değer okuma;
        String str2;
        System.out.print("Bir string değer giriniz: ");
        str2 = oku.next();
        System.out.println("Girilen string değer: " + str2);


    }
}
