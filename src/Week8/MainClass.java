package Week8;


public class MainClass {
    public static void main(String[] args) {
        // Örnek bir array oluştur
        int[] myList = {2, 4, 6, 8, 10};
        int n = myList.length;

        // Belirli bir değeri listeden kaldır
        int removeValue = 6;
        GLoops.remove(myList, n, removeValue);
        System.out.println("Array after removing " + removeValue + ":");
        printArray(myList);

        // Kaldır ve boyutu küçült
        int[] myListShrinked = GLoops.removeAndShrink(myList, n, 4);
        System.out.println("\nShrinked Array after removing 4:");
        printArray(myListShrinked);

        // Sıralı sırada bir değeri listeye ekle
        int insertValue = 5;
        GLoops.insert(myList, n, insertValue);
        System.out.println("\nArray after inserting " + insertValue + ":");
        printArray(myList);
    }

    // Yardımcı bir metot: Array'i ekrana yazdırma
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

