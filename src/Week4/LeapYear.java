package Week4;

public class LeapYear {
    /* determines if a year is a leap year
     * a leap year is divisible by 4 unless it is divisible by 100, but not 400
     *  - this first example uses straightforward if-else statements
     */
    public static boolean isLeapYear1(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    return true;
                else
                    return false;
            }
            else
                return true;
        }
        else
            return false;
    }

    /* determines if a year is a leap year
     * a leap year is divisible by 4 unless it is divisible by 100, but not 400
     *  - another example of if statements, but now styled so "else if" is on one line
     */
    public static boolean isLeapYear2(int year) {
        if (year % 4 != 0)
            return false;
        else if (year % 100 != 0)
            return true;
        else if (year % 400 != 0)
            return false;
        else
            return true;
    }

    /* determines if a year is a leap year
     * a leap year is divisible by 4 unless it is divisible by 100, but not 400
     *   - an example without an if statement
     */
    public static boolean isLeapYear3(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }
}