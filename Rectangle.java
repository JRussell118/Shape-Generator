/*Rectangle.java
 *10/28/2023
 *Jaden Russell
 *This file creates a Rectangle class that is a subclass of the TwoDimensionalShape class. 
  The Rectangle class creates a TwoDimensionalShape in its constructor and has two variables 
  for the length and width with methods to calculate the area and perimeter of the Rectangle.
 */
package project.pkg1.jaden.russell;

public class Rectangle extends TwoDimensionalShape{ //extends the TwoDimensionalShape class as a subclass of TwoDimensionalShape.
    
    public int length;  //Variables to hold length, width, and perimeter of the rectangle.
    public int width;
    public int perimeter;
    
    public Rectangle(){ //Constructor for Rectangle; Sets the length, width and perimeter to 0.
        super();    //calls the super class's constructor to initalize inherited fields.
        length = 0;
        width = 0;
        perimeter = 0;
    }
    
    public void setLength(int l){   //Method to set length to the given argument l.
        length = l;
    }
    
    public void setWidth(int w){    //Method to set width to the given argument w.
        width = w;
    }
    
    public double calcArea(){       //Method to calculate the area and assign it to area field.
        area = length * width;      //2D area formula length * width to calculate area.
        return area;
    }
    
    public int calcPerim(){      //Method to calculate the perimeter and assign it to perimeter field.
        perimeter = (length*2) + (width*2);    //Perimeter formula Length + length + width + width to calculate perimeter.
        return perimeter;
    }
}
