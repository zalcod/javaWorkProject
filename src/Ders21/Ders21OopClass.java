package Ders21;

public class Ders21OopClass {
    public static void main(String[] args) {
        /// 21. Ders OOP ve Class Yapısı
        System.out.println("21. Ders OOP ve Class Yapısı");
        // OOP: Object Oriented Programming
        /*
        Java, sınıflar ve nesneler aracılığıyla veri
        ve işlevselliği gruplayan ve düzenleyen bir nesne yönelimli programlama dilidir.
        Temelde, Java'da her şey sınıf ve nesnelerle temsil edilir, ancak dil aynı zamanda
        ilkel veri tiplerini (int, double, char, vs.) ve diğer özel yapıları (diziler, enum'lar) içerir.
        Bu ilkel veri tipleri nesne olmadan kullanılabilir ve bu tiplerin özellikleri ve davranışları doğrudan
        dil tarafından tanımlanır.

        Örneğin:
        int x = 5; // int, bir ilkel veri tipidir
        String text = "Hello, Java!"; // String, bir nesne tipidir

        Java'da temel prensip, her şeyin bir nesne olmasa da (ilkel veri tipleri gibi),
        nesne yönelimli programlamanın avantajlarından yararlanmak ve kodu daha düzenli ve
        sürdürülebilir hale getirmektir. Nesne yönelimli programlama, kodu sınıflara ve nesnelere
        bölerek daha modüler, anlaşılabilir ve bakımı kolay bir yapı oluşturmanıza olanak tanır.

         */
        Ders21Adress adr = new Ders21Adress();
        adr.cadde = "Kazım Karabekir";
        adr.blok = "A";
        adr.no = "5";
        adr.sehir = "İstanbul";
        adr.ülke = "Bursa";

        System.out.println("Adres: " + adr.cadde + " " + adr.blok + " " + adr.no + " " + adr.sehir + " " + adr.ülke);

        Ders21Ogrenci ogr = new Ders21Ogrenci();
        ogr.adi = "Zal";
        ogr.soyadi = "Solmus";
        ogr.oAdres = adr;

        System.out.println("Öğrenci Adı: " + ogr.adi + " " + ogr.soyadi + " " + ogr.oAdres.sehir);

        // Bu kısımda biz doğrudan eriştik sınıflarımıza ancak bu istenmeyen bir yöntemdir. İlerleyen
        // derslerde bu konuyu daha detaylı işleyeceğiz. Private sınıflar ile tanışacağız.


    }
}
