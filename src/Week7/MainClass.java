package Week7;

public class MainClass {
    public static void main(String[] args) {
        // Bir dizi oluştur
        int[] myArray = {1, 2, 3, 4, 5};

        // Diziyi ters çevir
        MyArrays.reverse(myArray);
        System.out.println("Reversed Array:");
        MyArrays.print(myArray);

        // Yeni bir değeri dizinin sonuna ekle
        int newValue = 6;
        myArray = MyArrays.append(myArray, newValue);
        System.out.println("\nArray after appending " + newValue + ":");
        MyArrays.print(myArray);

        // Bir değeri lineer arama ile bul
        int searchValue = 3;
        int linearSearchResult = MyArrays.LinearSearch(searchValue, myArray);
        System.out.println("\nLinear Search ReRsult for " + searchValue + ": " + linearSearchResult);

        // Bir değeri ikili arama ile bul (önce sırala)
        java.util.Arrays.sort(myArray);
        System.out.println("\nSorted Array:");
        MyArrays.print(myArray);

        int binarySearchResult = MyArrays.BinarySearch(searchValue, myArray);
        System.out.println("\nBinary Search Result for " + searchValue + ": " + binarySearchResult);
    }
}
