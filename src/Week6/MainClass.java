package Week6;


public class MainClass {
    public static void main(String[] args) {
        // Greatest Common Divisor (GCD) hesaplama örneği
        int gcdResult = Loops.gcd(48, 18);
        System.out.println("Greatest Common Divisor (GCD): " + gcdResult);

        // Karekök hesaplama örneği
        double sqrtResult = Loops.squareRoot(25.0);
        System.out.println("Square Root: " + sqrtResult);

        // Palindrome kontrolü
        String palindromeString = "level";
        boolean isPalindrome = Loops.isPalindrome(palindromeString);
        System.out.println("Is \"" + palindromeString + "\" a Palindrome? " + isPalindrome);

        // String büyük harfe dönüştürme
        String lowercaseString = "hello";
        String capitalizedString = Loops.capitalize(lowercaseString);
        System.out.println("Original String: " + lowercaseString);
        System.out.println("Capitalized String: " + capitalizedString);
    }
}
