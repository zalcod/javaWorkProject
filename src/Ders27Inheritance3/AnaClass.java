package Ders27Inheritance3;

public class AnaClass {
    public static void main(String[] args) {
        /// Ders 25 Inheritance 3 Over Riding (İptal Etme)

        Kisi ks = new Kisi("tcKimlik","isim","soyisim");
        ks.show();
        System.out.println("*************");
        Ogrenci ogr = new Ogrenci("tcKimlik","isim","soyisim","ogrNo","sube");
        ogr.show();

        //Not: Super anahtar kelimesi ile kalıtım aldığımız sınıfın metotlarını ve mevcut sınıfın metotlarını kullanabiliriz.

    }
}
