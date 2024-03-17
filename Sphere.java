// Aman Shrestha [sh1179255@email.ccbcmd.edu]
/**
* Overview: 
Define a class named Sphere.
Declare private instance variables radius (double) and id (String).
Implement a parameterized constructor to initialize the id of the sphere.
Implement getter and setter methods for radius and id to encapsulate the access to these variables.
Implement a method to calculate the volume of the sphere using the formula 4/3 * π * radius^3.
Implement a method to calculate the surface area of the sphere using the formula 4 * π * radius^2.
Override the 'toString'method to return a string representation of the sphere, including its ID and radius.

* @version: 1.0 March 17, 2024 (today's date)
* @author: Aman Shrestha
* */

public class Sphere {
    private double radius;
    private String id;

    // Constructor
    public Sphere(String id) {
        this.id = id;
    }

    // Getter and Setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for ID
    public String getId() {
        return id;
    }

    // Method to calculate volume
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Method to calculate surface area
    public double area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // Method to generate string representation
    public String toString() {
        return "Sphere ID: " + id + ", Radius: " + radius;
    }
}
