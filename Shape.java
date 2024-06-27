/*Shape.java
 *10/28/2023
 *Jaden Russell
 *This file creates a Shape object with an int variable to hold the number of
  of dimensions with a getter method to view it.
 */
package project.pkg1.jaden.russell;

public class Shape {
    
    public int dimensionNum; //Variable to hold the number of dimensions in the shape.
    
    public Shape(){
        dimensionNum = 0; //sets the default dimensions to 0.
    }
    
    public int getDimensions(){
        return dimensionNum; //returns the number of dimensions in the shape.
    }  
}
