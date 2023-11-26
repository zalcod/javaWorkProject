package Ders32HashSet_LinkedHashSet_TreeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class AnaClass {
    public static void main(String[] args) {
        // Ders 32 Set (HashSet, LinkedHashSet, TreeSet)

        // HashSet
        // Not: Setlerde index olmaz!
        HashSet<String> hs = new HashSet<>(); // HashSet kümesi oluşturduk.
        // LindkedHashSet ile HashSet arasındaki fark, LinkedHashSet elemanları eklediğimiz sırayla tutar.
        // TreeSet ile HashSet arasındaki fark, TreeSet elemanları alfabetik sırayla tutar.
        // Eğer bu setimiz Array List olsaydı aynı elemanı 2 kere ekleyebilirdik ama HashSet olsaydı aynı elemanı 2 kere ekleyemezdik.
        hs.add("Java"); // Küme içine String türünde eleman ekledik.
        System.out.println(hs.add("Hasan")); // Bu yöntemle de küme içine String türünde eleman ekledik.
        System.out.println(hs.add("Masan"));
        System.out.println(hs.add("Java")); // Aynı elemanı 2 kere ekleyemeyiz. False döndürür.
        System.out.println(hs.size());
        hs.remove("Masan"); // Küme içinden eleman silme
        // Not; Hashsetler'de eleman silme obje ile olur. Index ile değil. Biz silmek istediğimiz elemanı obje olarak veririz.
        // Silinip silinmeme denetimi de yapabiliriz;
        if (hs.remove("Java")) {
            System.out.println("Java silindi.");
        } else {
            System.out.println("Java silinemedi.");
        }

        hs.clear(); // Küme içindeki tüm elemanları siler.

        // Iterator ile küme içindeki elemanlara erişme
        // Iterator ile küme içindeki elemanlara erişebilmek için önce Iterator objesi oluşturmalıyız.
        // Iterator objesi oluşturmak için ise iterator() metodunu kullanırız.
        // Iterator objesi oluşturduktan sonra while döngüsü ile küme içindeki elemanlara erişebiliriz.
        Iterator<String> iterator = hs.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }



        // Not: Dizi ile kümenin farkı, diziye aynı elemanı 2 kere ekleyebiliriz ama küme de aynı elemanı 2 kere ekleyemeyiz.
        // Ve diziye index ile erişiriz ama kümede index yoktur, kümede elemanlar dağınık halde bulunur.
        // Küme içindeki elemanlara erişmek için for-each döngüsü gibi yöntemler kullanılabilir.

        // Örnek
        Scanner oku = new Scanner(System.in);
        HashSet<String> hs2 = new HashSet<>();

        hs2.add("Mustafa");
        hs2.add("Mehmet");


        boolean kullaniciAdiKabulEdildi = false;
        System.out.println("Kullanıcı adı giriniz:");

        do {
            String kullaniciAdi = oku.next();
            if (hs2.add(kullaniciAdi)) {
                System.out.println("Kullanıcı adı kaydedildi.");
                kullaniciAdiKabulEdildi = true;
            } else {
                System.out.print("Kullanıcı adı daha önce kaydedilmiş. Lütfen başka bir kullanıcı adı giriniz:");
            }
        } while (!kullaniciAdiKabulEdildi);


    }
}
