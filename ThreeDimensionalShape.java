/*ThreeDimensionalShape.java
 *10/28/2023
 *Jaden Russell
 *This file creates a ThreeDimensionalShape class that is a subclass of the Shape
  class. The ThreeDimensionalShape class creates a Shape with three dimensions in
  its constructor and has a double variable for the volume of the ThreeDimensionalShape.
 */
package project.pkg1.jaden.russell;

public class ThreeDimensionalShape extends Shape{   //extends the Shape class as a subclass of Shape
    
    public double volume;   //Variable to hold the volume of the three dimensional shape.
    
    public ThreeDimensionalShape() {    //Constructor for ThreeDimensionalShape; Sets volume to 0.
        dimensionNum = 3;   //sets the number of dimensions to 3
        volume = 0;
    }
}
