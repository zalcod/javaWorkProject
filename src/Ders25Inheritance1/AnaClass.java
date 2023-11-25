package Ders25Inheritance1;

public class AnaClass {
    public static void main(String[] args) {
        /// Ders 25 Inheritance (Kalıtım)

        // Öğrenci
        Ogrenci ogr = new Ogrenci();
        ogr.TCKimlik = "12345678901";
        ogr.Ad = "Ali";
        ogr.Soyad = "Veli";
        ogr.ogrNo = "123";
        ogr.sube = "A";
        ogr.adres = new Adres();
        ogr.adres.il = "İstanbul";
        ogr.adres.ilce = "Kadıköy";
        ogr.adres.mahalle = "Caddebostan";
        ogr.adres.sokak = "Bağdat";
        ogr.adres.kapiNo = "123";
        ogr.adres.daireNo = "4";

        System.out.println("Öğrenci Adı Soyadı: " + ogr.Ad + " " + ogr.Soyad);
        System.out.println("Öğrenci Numarası: " + ogr.ogrNo);
        System.out.println("Öğrenci Şubesi: " + ogr.sube);
        System.out.println("Öğrenci Adresi: " + ogr.adres.il + " " + ogr.adres.ilce + " " + ogr.adres.mahalle + " " + ogr.adres.sokak + " " + ogr.adres.kapiNo + " " + ogr.adres.daireNo);

        // Öğretmen
        Ogretmen ogrt = new Ogretmen();
        ogrt.TCKimlik = "12345678901";
        ogrt.Ad = "Deniz";
        ogrt.Soyad = "Yılmaz";
        ogrt.brans = "Matematik";
        ogrt.adres = new Adres();
        ogrt.adres.il = "İzmir";
        ogrt.adres.ilce = "Bornova";
        ogrt.adres.mahalle = "Çamdibi";
        ogrt.adres.sokak = "123";
        ogrt.adres.kapiNo = "4";
        ogrt.adres.daireNo = "5";

        System.out.println("Öğretmen Adı Soyadı: " + ogrt.Ad + " " + ogrt.Soyad);
        System.out.println("Öğretmen Branşı: " + ogrt.brans);
        System.out.println("Öğretmen Adresi: " + ogrt.adres.il + " " + ogrt.adres.ilce + " " + ogrt.adres.mahalle + " " + ogrt.adres.sokak + " " + ogrt.adres.kapiNo + " " + ogrt.adres.daireNo);



    }
}
