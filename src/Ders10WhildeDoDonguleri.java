public class Ders10WhildeDoDonguleri {
    public static void main(String[] args) {
        /// 10. Ders While ve Do While Döngüleri
        System.out.println("10. Ders While ve Do While Döngüleri");
        int a = 0;
        while (a < 10) {
            // While şu demektir: a değişkeni 10'dan küçük olduğu sürece aşağıdaki işlemleri yap.
            System.out.println("a: " + a);
            a++;
        }

        System.out.println("-----------------------");

        // Örnek;
        // Do While
        int b = 0;
        do {
            System.out.println("b: " + b);
            b++;
        } while (b < 10);
        System.out.println("b: " + b);
        // Do While şu demektir: b değişkeni 10'dan küçük olduğu sürece aşağıdaki işlemleri yap.
        // Ancak while do'dan sonra olduğu için b'nin değeri 10'dur.
        // For ile While arasındaki fark, For'da döngü başlamadan önce değer verilirken, While'da döngü başladıktan sonra değer verilir.


    }
}
