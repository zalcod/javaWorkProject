public class Ders18MetotlarVeOverloading {
    public static void main(String[] args) {
        int[] dizi = new int[]{3, 45, 6, 23};
        diziYaz(dizi);

        int toplam = diziyiTopla(dizi);
        System.out.println("\ntoplam: " + toplam);

        double dbl = degiskenleriTopla( 3.15 ,  5.5);
        System.out.println("dbl: " + dbl);


        String str = degiskenleriTopla("Merhaba ", "Dünya");
        System.out.println("str: " + str);
    }

    private static String degiskenleriTopla(String merhaba, String dünya) {
        return merhaba + "->" + dünya;
    }

    private static double degiskenleriTopla(double i, double i1) {
        return i + i1;
    }

    private static int diziyiTopla(int[] dizi) {
        int tpl = 0;
        for (int i = 0; i < dizi.length; i++) {
            tpl += dizi[i];
        }
        return tpl;
    }

    private static void diziYaz(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            System.out.printf("%5d", dizi[i]);
        }
    }

    // Void return döndürmek zorundadır ancak void olmayan bir metod return döndürmek zorunda değildir.
}
