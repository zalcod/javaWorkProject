package Week3;

import javax.swing.JFrame;

// remember that all the activity occurs in classes in Java
// this is the class that contains our main method where your code will start running
public class App {
    public static void main(String[] args) throws Exception {

        Person p1 = new Person();
        p1.age = 5;
        Person.population = 1;//
        Person p2 = new Person();
        p2.age = 6;
        Person.population = Person.population +1;
        System.out.println("p1 age " + p1.age);
        System.out.println("p2 age " + p2.age);
        System.out.println("population  " + Person.population);

        System.out.println("**************************");

      MyClass myClass = new MyClass();
      int avg = myClass.getAverage(10, 20);
      System.out.println("the average is " + avg);

        System.out.println("**************************");

        GeometricFrame gF = new GeometricFrame();
        gF.setSize(300, 500);
        gF.setVisible(true);
        gF.tranpose();
        //gF.scale(2.5);
        JFrame j1 = new JFrame();
        j1.setSize(300, 500);
        j1.setVisible(true);
        boolean isEqual = gF.isEqualArea(j1);
        System.out.println("they are " + (isEqual ? "" : " not") + " equal");

        System.out.println("**************************");

        GeometricFrame gF2 = new GeometricFrame();
        gF2.setSize(180, 350);
        gF2.setVisible(true);
        gF2.tranpose();
        gF2.scale(2.5);

        System.out.println("**************************");

        JFrame j2 = new JFrame();
        j2.setSize(180, 350);
        j2.setVisible(true);
        isEqual = gF2.isEqualArea(j2);
        System.out.println("they are " + (isEqual ? "" : " not") + " equal");




    }
}