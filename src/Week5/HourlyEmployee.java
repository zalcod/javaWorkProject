package Week5;

/*
HourlyEmployee class extends from the Employee class.
*/

public class HourlyEmployee extends Employee{
    // wage for hour
    private double hourlyWage;
    // how many hours s/he has worked
    private int hoursWorked;

    // methods below are examples of method overloading

    // constructor with a single parameter of name
    public HourlyEmployee(String name)
    {
        // create an instance of Employee class
        // notice that it does not have an empty constructor
        super(name);
        // set hourlyWage and hoursWorked fields
        // of the instance with default value
        // since we are creating an HourlyEmployee instance
        this.setHourlyWage(1000);
        //
        this.setHoursWorked(0);
    }

    // method overloading for the constructor.
    // notice that there are two parameters
    public HourlyEmployee(String name, int hoursWorked)
    {
        // another call to the constructor of Employee class
        super(name);
        // set hoursWorked with the input (hoursWorked)
        this.setHoursWorked(hoursWorked);
        // set hourlyWage with the default value of 1000
        this.setHourlyWage(1000);
    }

    // another method overloading for the constructor.
    // notice that there are two parameters,
    // but the signatures are different from the previous one
    public HourlyEmployee(String name, double hourlyWage)
    {
        // another call to the constructor of Employee class
        super(name);
        // set hoursWorked with the default value of 0
        this.setHoursWorked(0);
        // set hoursWorked with the input (hourlyWage)
        this.setHourlyWage(hourlyWage);
    }
    // another method overloading for the constructor.
    // notice that there are three parameters
    // and method signature has changed once again
    public HourlyEmployee(String name, int hoursWorked, double hourlyWage)
    {
        // another call to the constructor of Employee class
        super(name);
        // set hoursWorked with the input (hoursWorked)
        this.setHoursWorked(hoursWorked);
        // set hoursWorked with the input (hourlyWage)
        this.setHourlyWage(hourlyWage);
    }

    // get method for the field hoursWorked
    public double getHoursWorked()
    {
        return this.hoursWorked;
    }
    // set method for the field hoursWorked

    public void setHoursWorked(int hoursWorked)
    {
        // notice that hoursWorked is the input parameter
        // and this.hoursWorked is the field associated with the instance
        if(hoursWorked >= 0)
            this.hoursWorked = hoursWorked;
    }
    // get method for the field hourlyWage
    public double getHourlyWage()
    {
        return this.hourlyWage;
    }
    // set method for the field hourlyWage
    public void setHourlyWage(double hourlyWage)
    {
        if(hourlyWage > 0)
            this.hourlyWage = hourlyWage;
    }


    // override the getSalary method of Employee class
    // so that we can calculate the wage of hourly employee
    @Override
    public double getSalary()
    {
        return this.getHourlyWage() * this.getHoursWorked();
    }

    // override the toString method to return information about
    // the hourly employee instance.
    @Override
    public String toString()
    {
        return super.toString() +
                "hourly wage : " + this.hourlyWage + "\n" +
                "hoursWorked : " + this.hoursWorked + "\n";
    }

    // override the equals method
    @Override
    public boolean equals(Object o)
    {

        // we inherent from the Employee class
        // use its equals method to check if name and id match.
        // then check if wage and hoursWorked are the same.
        return
                super.equals(o)
                        &&
                        (
                                this.getHourlyWage() == ((HourlyEmployee)o).getHourlyWage()
                                        &&
                                        this.getHoursWorked() == ((HourlyEmployee)o).getHoursWorked()
                        );
    }
}



