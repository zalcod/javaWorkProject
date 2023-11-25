package Ders23;

public class AnaClass {
    private static double sayi; // private: Sadece tanımlandığı sınıf içerisinden erişilebilir.

    // static: Sınıfın bir örneği oluşturulmadan erişilebilir.
    public static void main(String[] args) {
        /// Ders 23. Acces Modifiers (Public, Private, Static Keywords)
        System.out.println("Ders 23. Acces Modifiers (Public, Private, Static Keywords)");
        // Access Modifiers: Erişim Belirleyiciler

        // Public: Her yerden erişilebilir
        // Private: Sadece tanımlandığı sınıf içerisinden erişilebilir
        // Static: Sınıfın bir örneği oluşturulmadan erişilebilir
        Adres adr = new Adres("Istiklal", "1", "1", "Istanbul", "Turkey");
        Ogrenci ogrenci = new Ogrenci("Ahmet", "Yilmaz", adr);
        adr.setCadde("Mevlana");
        adr.blok = "2";
        adr.no = "3";
        adr.sehir = "Ankara";
        adr.ulke = "Turkey";
        Adres.qq = "qq";
        ogrenci.ad = "Ahmet";
        ogrenci.soyad = "Yilmaz";
        ogrenci.oAdres = adr;
        sayi = 10; // sayi değişkenine değer atadık.
        yazdir(); // yazdir() metodu ile sayi değişkenini yazdırdık.

        System.out.println("ogrenci.ad: " + ogrenci.ad);

        System.out.println("adr = " + adr.qq);



    }

    public static void yazdir(){
        System.out.println("sayi: " + sayi);
    } // Bu metotta sayi değişkenini yukarıda belirlediğimiz değere göre yazdırabildik.

}
