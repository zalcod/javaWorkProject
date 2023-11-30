package Week7;

public class MyArrays {

    /**
     * reverses the given array
     * @param array
     */
    public static void reverse(int [] array)
    {
        // notice that the loop should terminate when index is array.length / 2
        // study what happens if we change the condition to index <= array.lenght/2
        // indeks dizi.uzunluk / 2 olduğunda döngünün sonlanması gerektiğine dikkat edin
        // koşulu index <= array.lenght/2 olarak değiştirirsek ne olacağını inceleyin
        for(int index = 0; index < array.length/2; index++ )
        {
            // a classical swap operation
            int temp = array[(array.length - 1) - index];
            array[(array.length - 1) - index] = array[index];
            array[index] = temp;
        }
    }
    /**
     * display the contents of the array
     * @param array to be displayed
     */
    public static void print(int [] array)
    {
        for(int index = 0; index < array.length; index++ )
        {
            System.out.println(array[index] + ",");
        }
    }
    /**
     * append a value to the end of array whose capacity is full
     * @param array whose capacity is full
     * @param x the value to be appended
     * @return int[] the new array appended with x
     */
    public static int[] append(int [] array, int x)
    {
        // create an array with a length one greater than the size of the current array.
        int [] newArray = new int[array.length + 1];
        // loop through array and copy each element to the newArray
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        // append x. the last index of newArray is array.legth
        // remember java starts from 0 (newArray size is array.length+1)
        newArray[array.length] = x;
        // return newArray because we are going to lose it when the method completes its execution
        return newArray;
    }
    /**
     * Linear search algorithm
     * return the index of x if it is in the array, or -1 if it is not in the array
     * @param x the value being searched
     * @param array the associated array
     * @return (int) index of the array
     */
    public static int LinearSearch(int x, int [] array)
    {
        // loop through the array and return i if x is at array[i]
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        // being reached here means that x is not in the array
        return -1;
    }
    /**
     * return the index of x if it is in the array, or -1 if it is not in the array
     * Precondition: a sorted non-decreasing array
     * @param x the value being searched
     * @param array the associated array
     * @return (int) index of the array
     */
    public static int BinarySearch(int x, int [] array)
    {
        // smallest index
        int front = 0;
        // largest index
        int back = array.length - 1;
        while(front <= back)
        {
            int middle = (front + back) / 2;
            if(x < array[middle])
            {
                back = middle - 1;
            }
            else if(x > array[middle])
            {
                front = middle + 1;
            }
            else // there remains only case x == array[middle]
            {
                return middle;
            }
        }
        // the array has been traversed but no x was found in it.
        return -1;
    }
}




