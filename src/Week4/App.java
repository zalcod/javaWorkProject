package Week4;

public class App {
    public static void main(String[] args) throws Exception {
        // Die sınıfının örnekleri
        Die sixSidedDie = new Die(); // Varsayılan olarak 6 yüzlü zar
        Die customDie = new Die(10); // 10 yüzlü özel zar

        // Zarın başlangıç değerini gösterme
        System.out.println("Six Sided Die Initial Value: " + sixSidedDie.getCurrentValue());
        System.out.println("Custom Die Initial Value: " + customDie.getCurrentValue());

        // Zarları rastgele atma
        int rollResult1 = sixSidedDie.roll();
        int rollResult2 = customDie.roll();

        System.out.println("Six Sided Die Rolled: " + rollResult1);
        System.out.println("Custom Die Rolled: " + rollResult2);

        // LeapYear sınıfının örnekleri
        int leapYear1 = 2000;
        int leapYear2 = 2020;
        int nonLeapYear = 2022;

        // LeapYear1 metodu kullanımı
        System.out.println(leapYear1 + " is a leap year? " + LeapYear.isLeapYear1(leapYear1));

        // LeapYear2 metodu kullanımı
        System.out.println(leapYear2 + " is a leap year? " + LeapYear.isLeapYear2(leapYear2));

        // LeapYear3 metodu kullanımı
        System.out.println(nonLeapYear + " is a leap year? " + LeapYear.isLeapYear3(nonLeapYear));
    }
}
