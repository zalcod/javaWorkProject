package Week5;

public class MainClass {
    public static void main(String[] args) {
        // Employee örneği oluşturma
        Employee employee1 = new Employee("John Doe");
        // Bilgileri ekrana yazdırma
        System.out.println("Employee Information:");
        System.out.println(employee1.toString());

        // HourlyEmployee örneği oluşturma
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Jane Doe", 25, 20.0);
        // Bilgileri ekrana yazdırma
        System.out.println("\nHourly Employee Information:");
        System.out.println(hourlyEmployee1.toString());

        // Maaşları hesaplama
        System.out.println("\nCalculated Salaries:");
        System.out.println("Employee Salary: $" + employee1.getSalary());
        System.out.println("Hourly Employee Salary: $" + hourlyEmployee1.getSalary());

        // İki çalışanın eşit olup olmadığını kontrol etme
        System.out.println("\nAre Employees Equal?");
        System.out.println("Employee and HourlyEmployee are equal: " + employee1.equals(hourlyEmployee1));
    }
}
