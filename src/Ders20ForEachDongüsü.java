public class Ders20ForEachDongüsü {
    public static void main(String[] args) {
        /// 20. Ders For-Each Döngüsü
        System.out.println("20. Ders For-Each Döngüsü");
        int[] dizi = new int[]{3, 6,3,55, 45, 6, 23,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3};
        int toplam = 0;
       for (int i = 0; i < dizi.length; i++) {
           int value = dizi[i];
            toplam += value;
        }
        System.out.println("toplam: " + toplam);


        System.out.println("toplam: " + toplam);
        //Yukarıda normal bir dizi toplama işlemi yapılmaktadır peki for each bize neyi gösterir?
        //for each döngüsü bize dizinin elemanlarını gösterir.
        // Aşağıdaki ifade ile yukarıdaki ifade aynıdır.
        toplam = 0;
        for (int value : dizi) {
            toplam += value;
        }
        System.out.println("toplam: " + toplam);



    }
}
