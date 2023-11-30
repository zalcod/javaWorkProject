package Week6;

public class Loops {

    /**
     * calculates the greatest common divisor for a and b
     * @param a the first integer
     * @param b the second integer
     */
    public static int gcd(int a, int b)
    {
        while(a % b != 0)
        {
            int temp = a % b;
            a = b;
            b = temp;
        }
        // if you are out of the loop
        // a%b == 0 is true
        return b;
    }


    /**
     * calculates the square root of a given n
     * @param n number whose sqroot will be calc.
     * @return double squareroot of the given number
     */
    public static double squareRoot(double n)
    {
        double x1 = n + 2;
        double x2 = n + 1;
        while(x1 - x2 > 1e-10)
        {
            x1 = x2;
            x2 = x1 - (x1 * x1 - n) / (2 * x1);
        }
        return x2;
    }


    /**
     * checks whether a string is palindrome or not
     * @param string the string to check
     * @return boolean true if the string is palindrome
     * false otherwise
     */
    public static boolean isPalindrome(String s)
    {
        for(int first = 0, last = s.length()-1; first < last ; first=first+1, last=last-1)
        {
            if (s.charAt(first) != s.charAt(last))
            {
                return false;
            }
        }
        return true;
    }

    public static String capitalize(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length() ;i++)
        {
            char temp = s.charAt(i);
            if(temp >= 'a' && temp <= 'z')
            {
                temp = (char)('A' + (temp - 'a'));
            }
            sb.append(temp);

        }
        return sb.toString();
    }
}
