public class Ders8ScorpBlockYapisi {
    static int sayi = 4; //Static değerler class içerisinde her yerde kullanılabilir.
    public static void main(String[] args) {
        /// 8. Ders Scope Block Yapısı
        System.out.println("8. Ders Scope Block Yapısı");
        int a = 5, b = 10;
        if (a > b) {
            System.out.println("a, b'den büyüktür.");
            int c = 15;
            System.out.println("c: " + c);
        } else if (a < b) {
            System.out.println("a, b'den küçüktür.");
            int c = 20;
            System.out.println("c: " + c);
        } else {
            System.out.println("a, b'ye eşittir.");
            int c = 25;
            System.out.println("c: " + c);
        }
        // System.out.println("c: " + c); // c değişkeni if bloğu içerisinde tanımlandığı için burada kullanılamaz.

        //Not: Scorpun içinde tanımlanan değişkenler sadece o scorpun içinde kullanılabilir.

        // Örnek;
        int sayi = 15;
        if (sayi > 5) {
            int sayi2 = 20;
            System.out.println("Sayi2: " + sayi2);
        } else {
            int sayi2 = 30;
            System.out.println("Sayi2: " + sayi2);
        }
        //Yani burada sayi2 değişkeni sadece if ve else blokları içerisinde kullanılabilir.
        // Ancak sayi değişkeni ise her yerde kullanılabilir.

        ///Static değere örnek;
        System.out.println("Sayi: " + sayi);
        // Eğer sayi değeri main içerisinde tekrar tanımlanırsa main içerisindeki değer kullanılır.
        // Ancak sayi değeri main dışında tanımlıysa metod olarak tanımlıysa o değer kullanılır.





    }
}
