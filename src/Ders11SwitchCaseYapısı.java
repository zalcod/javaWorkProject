import java.util.Scanner;

public class Ders11SwitchCaseYapısı {
    public static void main(String[] args) {
        /// 11. Ders Switch Case Yapısı
        System.out.println("11. Ders Switch Case Yapısı");
        Scanner oku = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = oku.nextInt();
        switch (sayi) {
            case 1:
                oyun1();
                break;
            case 2:
                oyun2();
                break;
            case 3:
                oyun3();
                break;
            default:
                System.out.println("Hatalı bir sayı girdiniz.");
                break;
        }


    }

    private static void oyun2() {
        System.out.println("Oyun 2 Başlıyor");
    }

    private static void oyun1() {
        System.out.println("Oyun 1 Başlıyor");
    }

    private static void oyun3() {
        System.out.println("Oyun 3 Başlıyor");
    }
}
