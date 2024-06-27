/*Circle.java
 *10/28/2023
 *Jaden Russell
 *This file creates a Circle class that is a subclass of the TwoDimensionalShape class. 
  The Circle class creates a TwoDimensionalShape in its constructor and has a variable for the 
  radius, and three methods to change the radius, calculate the area, and calculate the circumference 
  of the circle.
 */
package project.pkg1.jaden.russell;

public class Circle extends TwoDimensionalShape{    //extends the TwoDimensionalShape class as a subclass of TwoDimensionalShape
    
    public int radius;  //Variable to hold the radius of the circle
    public double circumference;    //Variable to hold the circumference of the circle
    
    public Circle(){    //Constructor for Circle; Sets the radius and circumference to 0.
        super();    //calls the super class's constructor to initalize inherited fields.
        radius = 0;
        circumference = 0;
    }
    
    public void setRadius(int r){   //Method to set radius to the given argument r.
        radius = r;
    }
    
    public double calcArea(){   //Method to calculate the area and assign it to area field.
        area = Math.PI * (Math.pow(radius, 2));   //Circle area formula pi * r^2 to calculate area.
        return area;
    }
    
    public double calcCir(){    //Method to calculate the circumference and assign it to circumference field.
        circumference = 2*Math.PI*radius;  //Circumference formula 2 * pi * r to calculate circumference.
        return circumference;
    }
}

