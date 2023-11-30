package Week8;

public class GLoops {
    /**
     * remove the given element from a list
     * precondition: array is already sorted in non-decreasing order
     * precondition: k is in the array
     * postcondition: list[0...n-2] is sorted
     * @param list the array
     * @param n length of the array
     * @param k the value to be removed
     */
    public static void remove(int[] list, int n, int k)
    {
        int i;

        // step 1: find index of k
        for (i = 0; i < n && k != list[i]; i = i + 1)
            ;

        // at this point, k = list[i] (or i == n if k is not in the list)
        // step 2: remove k and slide the rest of the entries down
        while (i < n - 1) {
            list[i] = list[i + 1];
            i = i + 1;
        }
    }

    public static void remove2(int[] list, int n, int k)
    {
        int i;

        for(i = 0; i < n && k != list[i]; i = i+1);

        while (i< n -1){ // yani i < n-1 ise döngüye gir
            list[i] = list[i+1]; // i. elemanı i+1. elemana eşitle
            i = i+1; // i'yi bir arttır
        }
    }

    /**
     * remove the given element from a list and the array is shrinked after the operation
     * the usage -> list = GLoops.removeAndShrink(list, n, k);
     * precondition: array is already sorted in non-decreasing order
     * precondition: k is in the array
     * postcondition: list[0...n-2] is sorted
     * @param list the array
     * @param n length of the array
     * @param k the value to be removed
     * @return the array of length (n-1) and k removed
     */
    public static int [] removeAndShrink(int[] list, int n, int k)
    {
        // this method removes the element from the list and shrinks the length
        // to do this we return the listTemp so that list will point to it

        int i;
        int [] listTemp = new int[n-1];
        // step 1: find index of k
        // notice that listTemp.length > 0 is added to the conditions because the size of list can be 1
        // so we do not want an ArrayOutOfBoundsException. remove the condition and run this method
        // with an array whose lenght is 1 (an array with a single element).
        for (i = 0; i < n && k != list[i] && listTemp.length > 0; i = i + 1)
            // yani i < n ise ve k != list[i] ise ve listTemp.length > 0 ise döngüye gir
            listTemp[i] = list[i]; // listTemp[i] = list[i] olsun

        // at this point, k = list[i] (or i == n if k is not in the list)
        // step 2: remove k and slide the rest of the entries down
        while (i < n - 1) {
            listTemp[i] = list[i + 1];
            i = i + 1;
        }
        // return the newArray
        return listTemp;
    }
    /**
     * insert the element to the list while maintaining the sorted order of the array
     * precondition: list[0..n-2] is sorted
     * precondition: we have a room for k (meaning that list[n-1] is not in use)
     * @param list the array
     * @param n length of the array
     * @param k the value to be inserted
     */
   /* public static void insert(int[] list, int n, int k) {
        int i;
        // start from the back to the front until you have located k (meaning that the element at (i-1) is less k)
        for(i = n; i > 0 && k < list[i-1]; i--)
        {
            list[i] = list[i-1];
        }
        list[i] = k;
    }*/
    public static void insert(int[] list, int n, int k) {
        int i;

        // Kontrol ekle: Diziyi genişlet
        if (n >= list.length) {
            int[] tempList = new int[n + 1];
            for (i = 0; i < n; i++) {
                tempList[i] = list[i];
            }
            list = tempList;
        }

        // start from the back to the front until you have located k (meaning that the element at (i-1) is less k)
        for (i = n; i > 0 && k < list[i - 1]; i--) {
            list[i] = list[i - 1];
        }
        list[i] = k;
    }
}
