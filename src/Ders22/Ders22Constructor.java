package Ders22;

public class Ders22Constructor {
    public static void main(String[] args) {
        /// 22. Ders Constructor
        System.out.println("22. Ders Constructor");
        // Constructor: Yapıcı metotlar

        Ders22Adress adr = new Ders22Adress("Istiklal", "A", "5", "Istanbul", "Türkiye"   );

        System.out.println("Adres: " + adr.cadde + " " + adr.blok + " " + adr.no + " " + adr.sehir + " " + adr.ulke);

        Ders22Ogrenci ogr = new Ders22Ogrenci( "Zal", "Solmus", adr);

        System.out.println("Öğrenci Adı: " + ogr.adi + " " + ogr.soyadi + " " + ogr.oAdres.ulke);
    }
}
