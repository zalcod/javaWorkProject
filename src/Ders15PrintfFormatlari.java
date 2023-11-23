public class Ders15PrintfFormatlari {
    public static void main(String[] args) {
        /// 15. Ders Printf Formatları
        System.out.println("15. Ders Printf Formatları");
        // printf() metodu ile formatlı yazdırma yapabiliriz.
        int sayi = 5;

        System.out.printf("%3d", sayi); // %3d -> 3 hane sağa dayalı yazdırma yapar.
        System.out.printf("%-3d", sayi); // %-3d -> 3 hane sola dayalı yazdırma yapar.
        System.out.println("sayi: " + sayi); // sayi: 5 -> println() metodu ile normal yazdırma yapar. Ve diğer değerle bitişik yazdırır.


        // Başka örnek;
        int sayi2 = 543545345;
        // Virgülle yazdırmak istediğimde;
        System.out.printf("%,d", sayi2); // 543,545,345 -> Virgülle yazdırır.

        // Başka örnek;
        double sayi3 = 100/3.45;
        System.out.printf("%10.2f", sayi3); // 29.00 -> 10 hane sağa dayalı ve virgülden sonra 2 hane yazdırır.

        //Not: Sayıları alt alta yazdırmak için \n kullanabiliriz.
    }
}
