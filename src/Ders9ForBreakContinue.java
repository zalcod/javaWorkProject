public class Ders9ForBreakContinue {
    public static void main(String[] args) {
        /// 9. Ders Looplar (For Döngüsü, Break ve Continue)
        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
        }
        System.out.println("-----------------------");

        // Örnek;
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("i: " + i);
        }

        System.out.println("-----------------------");

        // Örnek;
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("i: " + i);
        }

        System.out.println("-----------------------");

        // Örnek;
        for (int i = 0; i <= 10; i++) {
            int sayi = i / 2 * 2;
            if (sayi == i) {
                System.out.println("Sayi:" + i + " Çifttir.");
            } else {
                System.out.println("Sayi:" + i + " Tektir.");
            }
        }

        System.out.println("-----------------------");

        // Örnek;
        for (int a = 0; a <= 15; a++) {
            if (a % 2 == 0) {
                System.out.println("Sayi:" + a + " Çifttir.");
                // continue;
                if (a%5 == 0) {
                    break;
                }
            }
                System.out.println("Sayi:" + a + " Tektir.");

        }



    }
}
