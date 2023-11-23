public class Ders16JavadaDiziKavrami {
    public static void main(String[] args) {
        /// 16. Ders Java'da Dizi Kavramı
        System.out.println("16. Ders Java'da Dizi Kavramı");
        int sayi1 = 10;
        int [] dizi = new int[] {45, 4, 77, 33, 2,4,6,7,8};// Dizi tanımlama
        int i = 2;
        dizi[i] = dizi[1+1] + dizi[5]; // Dizinin ikinci elemanı ile altıncı elemanının toplamını üçüncü elemana atar.
        System.out.println("dizi[i]: " + dizi[i]);

        System.out.println("********************");
        int [] [] dizi2 = new int[][] {{1,2}, {3,4}, {5,6}}; // Çok boyutlu dizi tanımlama
        int j = 1;
        int k = 0;
        dizi2[j][k] = dizi2[0][1] + dizi2[2][0];
        System.out.println("dizi2[j][k]: " + dizi2[j][k]);
        // Dizinin ikinci elemanının birinci elemanı ile üçüncü elemanının birinci elemanının toplamını
        // ikinci elemanın birinci elemanına atar.

    }
}
