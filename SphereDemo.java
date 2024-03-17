// Aman Shrestha [sh1179255@email.ccbcmd.edu]
/**
* Overview: 
Define a class named SphereDemo.
Inside the main method:
Create three instances of the Sphere class with IDs "s0", "s1", and "s2".
Prompt the user to enter the radius for each sphere.
Set the radius for each sphere using the setter methods.
Print the ID, radius, volume, and surface area of each sphere using the toString, volume, and area methods of the Sphere class.

* @version: 1.0 March 17, 2024 (today's date)
* @author: Aman Shrestha
* */


import java.util.Scanner;

public class SphereDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instantiate 3 spheres with IDs s0, s1, s2
        Sphere s0 = new Sphere("s0");
        Sphere s2 = new Sphere("s2");
        Sphere s3= new Sphere("s3");

        // Prompt the user to enter the radius for each sphere
        System.out.print("Enter radius for s0: ");
        s0.setRadius(scanner.nextDouble());

        System.out.print("Enter radius for s2: ");
        s2.setRadius(scanner.nextDouble());

        System.out.print("Enter radius for s3: ");
        s3.setRadius(scanner.nextDouble());

        // Print the area and volume for each sphere
        System.out.println(s0.toString());
        System.out.println("Volume: " + s0.volume());
        System.out.println("Area: " + s0.area());

        System.out.println(s2.toString());
        System.out.println("Volume: " + s2.volume());
        System.out.println("Area: " + s2.area());

        System.out.println(s2.toString());
        System.out.println("Volume: " + s3.volume());
        System.out.println("Area: " + s3.area());

        scanner.close();
    }
}
