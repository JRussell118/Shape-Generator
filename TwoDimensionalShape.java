/*TwoDimensionalShape.java
 *10/28/2023
 *Jaden Russell
 *This file creates a TwoDimensionalShape class that is a subclass of the Shape
  class. The TwoDimensionalShape class creates a Shape with two dimensions in
  its constructor and has a double variable for the area of the TwoDimensionalShape.
 */
package project.pkg1.jaden.russell;

public class TwoDimensionalShape extends Shape{ //extends the Shape class as a subclass of Shape
    
    public double area;      //Variable to hold the area of the two dimensional shape.
    
    public TwoDimensionalShape() {  //Constructor for TwoDimensionalShape; Sets area and perimeter to 0. 
        dimensionNum = 2;   //sets the number of dimensions to 2
        area = 0;           
    }
}
