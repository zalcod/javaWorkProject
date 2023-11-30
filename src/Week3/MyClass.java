package Week3;

public class MyClass extends Object{
    // we are defining an instance method that takes the average of two integers
    public int getAverage(int input1, int input2){
        int sum = input1 + input2;
        int avg = sum / 2;
        return avg;
    }
}