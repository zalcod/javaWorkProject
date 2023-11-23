import java.util.Scanner;

public class Ders19TryCatchFinally {
    public static void main(String[] args) {
        /// 19. Ders Try-Catch-Finally
        System.out.println("19. Ders Try-Catch-Finally");
        // Hata yakalama işlemleri için kullanılır.
        // Hatalı durumların kod bloklarından çıkmasını sağlar.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi;
        try {
            sayi = oku.nextInt();
            System.out.println("sayi: " + sayi);
        } catch (Exception e) {
            System.out.println("Hata: " + e);
        } finally {
            System.out.println("finally bloğu çalıştı.");
        }
    }
}
