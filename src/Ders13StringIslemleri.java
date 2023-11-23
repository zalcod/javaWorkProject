public class Ders13StringIslemleri {
    public static void main(String[] args) {
        /// 13. Ders String İşlemleri
        System.out.println("13. Ders String İşlemleri");
        String isim = "Mehmet";
        String soyisim = "Kara";
        String tamIsim = isim + " " + soyisim; // String birleştirme
        System.out.println("tamIsim: " + tamIsim);

        // String uzunluğu
        int tamIsimUzunlugu = tamIsim.length();
        System.out.println("tamIsimUzunlugu: " + tamIsimUzunlugu);

        // String karakter alma
        char ilkKarakter = tamIsim.charAt(0);
        System.out.println("ilkKarakter: " + ilkKarakter);

        // String içinde arama
        boolean aramaSonucu = tamIsim.contains("met");
        System.out.println("aramaSonucu: " + aramaSonucu);

        // String içinde arama (Büyük küçük harf duyarlılığı)
        boolean aramaSonucu2 = tamIsim.contains("Met");
        System.out.println("aramaSonucu2: " + aramaSonucu2);

        // String içinde arama (Büyük küçük harf duyarlılığı)
        boolean aramaSonucu3 = tamIsim.toLowerCase().contains("Met".toLowerCase());
        System.out.println("aramaSonucu3: " + aramaSonucu3);

        // String içinde arama (Büyük küçük harf duyarlılığı)
        boolean aramaSonucu4 = tamIsim.toUpperCase().contains("Met".toUpperCase());
        System.out.println("aramaSonucu4: " + aramaSonucu4);

        // String içinde arama (Büyük küçük harf duyarlılığı)
        boolean aramaSonucu5 = tamIsim.toLowerCase().contains("Met".toLowerCase());
        System.out.println("aramaSonucu5: " + aramaSonucu5);

        // String içinde arama (Büyük küçük harf duyarlılığı)
        boolean aramaSonucu6 = tamIsim == "Mehmet Kara";
        System.out.println("aramaSonucu6: " + aramaSonucu6);

        // substring(0, 5) 0. indexten başlayarak 5. indexe kadar alır.
        String altString = tamIsim.substring(0, 5);
        System.out.println("altString: " + altString);

        // replaceAll() metodu ile string içindeki karakterleri değiştirebiliriz.
        String yeniIsim = tamIsim.replaceAll("Mehmet", "Ahmet");
        System.out.println("yeniIsim: " + yeniIsim);

        // contains ile sorgulama yapabiliriz.
        boolean aramaSonucu7 = tamIsim.contains("Mehmet");
        System.out.println("aramaSonucu7: " + aramaSonucu7);

        // Not: Boolean sorgulamalarda true veya false döndürür.

        // lastIndexOf() metodu ile string içindeki karakterlerin son indexlerini bulabiliriz.
        int sonIndex = tamIsim.lastIndexOf("a");
        System.out.println("sonIndex: " + sonIndex);


    }
}
