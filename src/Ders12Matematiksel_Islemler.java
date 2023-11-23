public class Ders12Matematiksel_Islemler {
    public static void main(String[] args) {
        /// 12. Ders Matematiksel İşlemler
        System.out.println("12. Ders Matematiksel İşlemler");
        int sayi = -15;
        int sayi2 = Math.abs(sayi); // Math.abs() Mutlak değerini alır.
        System.out.println("sayi2: " + sayi2);

        // Math.round örnek;
        double sayi3 = 5.49;
        long sayi4 = Math.round(sayi3); // Math.round() Sayıyı yuvarlar.
        System.out.println("sayi4: " + sayi4);

        // Math.random örnek;
        double sayi5 = Math.random(); // Math.random() 0 ile 1 arasında rastgele sayı üretir.
        System.out.println("sayi5: " + sayi5);

        // Math.max örnek;
        int sayi6 = 5;
        int sayi7 = 10;
        int sayi8 = Math.max(sayi6, sayi7); // Math.max() İki sayıdan büyük olanı döndürür.
        System.out.println("sayi8: " + sayi8);

        // Math.sqrt örnek;
        int sayi9 = 16;
        double sayi10 = Math.sqrt(sayi9); // Math.sqrt() Sayının karekökünü alır.
        System.out.println("sayi10: " + sayi10);
    }
}
