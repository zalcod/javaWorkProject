import java.util.ArrayList;
import java.util.Arrays;

public class Ders17ArrayListeler {
    public static void main(String[] args) {
        /// 17. Ders ArrayList'ler
        System.out.println("17. Ders ArrayList'ler");
        // ArrayList'ler, dizilerin geliştirilmiş halidir.
        // Dizilerdeki gibi tek tip veri tutarlar.
        // Dizilerdeki gibi sıralıdırlar.
        // Dizilerdeki gibi index numarası ile elemanlara erişilir.
        // Dizilerdeki gibi eleman sayısı kadar bellekte yer kaplarlar.

        ArrayList<Integer> dizi = new ArrayList<>(Arrays.asList(3,45,6,23)); // ArrayList tanımlama
        dizi.add(5); // ArrayList'e eleman ekleme
        dizi.add(1, 10); // ArrayList'in birinci index'ine eleman ekleme
        dizi.set(0, 100); // ArrayList'in birinci index'indeki elemanı değiştirme
        dizi.remove(1); // ArrayList'in birinci index'indeki elemanı silme
        dizi.remove(Integer.valueOf(45)); // ArrayList'teki 45 değerini silme
        System.out.println(dizi.get(3));
        int sayi = dizi.get(3) + dizi.get(1);
        System.out.println("sayi: " + sayi);
        System.out.println("dizi: " + dizi);
        System.out.println("dizi boyutu = " + dizi.size());

        // Array Listler klasik dizilerin kullanımına göre daha yaygındır
        // çünkü bu dizilerde bir sınıf kullanabiliyoruz. Dizinin bir elamanında bir çok veri tipi tutabiliyoruz.

        // Klasik dizilerde eleman ekleme, silme gibi işlemler yapılamazken ArrayListlerde bu işlemler yapılabilir.




    }
}
