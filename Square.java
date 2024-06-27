/*Square.java
 *10/28/2023
 *Jaden Russell
 *This file creates a Square class that is a subclass of the TwoDimensionalShape class. 
  The Square class creates a TwoDimensionalShape in its constructor and has two variables 
  for the sideLength and perimeter, with methods to calculate the area and perimeter of the Square.
 */
package project.pkg1.jaden.russell;

public class Square extends TwoDimensionalShape{    //extends the TwoDimensionalShape class as a subclass of TwoDimensionalShape.
    
    public int sideLength;  //Variables to hold the side length and perimeter of the square.
    public int perimeter;   
    
    public Square(){    //Constructor for Rectangle; Sets the side length and perimeter to 0.
        super();        //calls the super class's constructor to initalize inherited fields.
        sideLength = 0;
        perimeter = 0;
    }
    
    public void setSide(int s){     //Method to set sideLength to the given argument s.
        sideLength = s;
    }
    
    public double calcArea(){       //Method to calculate the area and assign it to area field.
        area = sideLength * sideLength;
        return area;                //2D area formula length * width to calculate area.
    }
    
    public int calcPerim(){      //Method to calculate the perimeter and assign it to perimeter field.
        perimeter = sideLength*4;   //Perimeter formula Length + length + width + width to calculate perimeter.
        return perimeter;
    }
}
