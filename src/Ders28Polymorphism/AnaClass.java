package Ders28Polymorphism;

import java.util.ArrayList;

public class AnaClass {

    public static void main(String[] args) {
        /// Ders 28 Polymorphism (Çok Biçimlilik)

        ArrayList<Kisi> kisiler = new ArrayList<Kisi>();

        Kisi ogr;
        ogr = new Ogrenci("12345678901", "Derin", "Su", "999", "A");
        System.out.println(ogr.getTCKimlik()); // Ogrenci kişisi kendiyle ilgili bilgileri getirir.
        ogr = new Ogretmen("98765542578", "Murat", "Turan", "Coğrafya", "23500");
        System.out.println(ogr.getTCKimlik()); // Öğretmen kişisi kendiyle ilgili bilgileri getirir.

        kisiler.add(ogr);
        System.out.println(kisiler.get(0).getTCKimlik());
        System.out.println(kisiler.get(1).getAd());
        // Biz burada kisiler ArrayList'ine Ogrenci ve Ogretmen nesnelerini ekledik.
        // Ama kisiler ArrayList'i Kisi tipinde tanımlandığı için içine sadece Kisi tipinde nesneler alabilir.
        // Bu durumda bizler Database'de bu bilgileri bir arada tutabiliriz.

        // Başka bir kullanım;

        Kisi ogr2;
        ogr2 = new Ogrenci("4444444444", "Mennan", "Laf", "432", "L");
        ogr2.show();

        ogr2 = new Ogretmen("5555555555", "Mehmet", "Yılmaz", "Matematik", "25000");
        ogr2.show();

        // Görüldüğü gibi Ogrenci ve Ogretmen nesneleri Kisi tipinde tanımlanan ogr2 değişkenine atanabiliyor.
        // Kisi referansı tarafından oluşturulmuş objeler farklı şekillerde davranabiliyor.
        // Bir referansın farklı iki sınıf tipindeki nesneyi gösterebilmesine Polymorphism (Çok Biçimlilik) denir.

    }
}
