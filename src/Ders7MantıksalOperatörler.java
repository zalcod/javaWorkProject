public class Ders7MantıksalOperatörler {
    public static void main(String[] args) {
        /// 7. Ders Mantıksal Operatörler
        System.out.println("7. Ders Mantıksal Operatörler");
        int a = 5, b = 10, c = 15;
        if (a > b && a > c) {
            System.out.println("a, b ve c'den büyüktür.");
        } else if (a < b && a < c) {
            System.out.println("a, b ve c'den küçüktür.");
        } else {
            System.out.println("a, b ve c'den büyük değildir.");
        }
        if (a > b || a > c) {
            System.out.println("a, b veya c'den büyüktür.");
        } else if (a < b || a < c) {
            System.out.println("a, b veya c'den küçüktür.");
        } else {
            System.out.println("a, b veya c'den büyük değildir.");
        }
        if (!(a > b)) {
            System.out.println("a, b'den büyük değildir.");
        } else {
            System.out.println("a, b'den büyüktür.");
        }

        // Bir başka örnek;
        String kullaniciAdi = "admin";
        if (kullaniciAdi.equals("admin")) {
            System.out.println("Kullanıcı adı doğru.");
        } else {
            System.out.println("Kullanıcı adı yanlış.");
        }


    }
}
