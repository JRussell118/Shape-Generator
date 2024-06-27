/*Cube.java
 *10/28/2023
 *Jaden Russell
 *This file creates a Cube class that is a subclass of the ThreeDimensionalShape class. 
  The Cube class creates a ThreeDimensionalShape in its constructor and has two variables 
  for the edge length and surface area, with methods to calculate the volume and surface area of the Cube.
 */
package project.pkg1.jaden.russell;

public class Cube extends ThreeDimensionalShape{    //extends the ThreeDimensionalShape class as a subclass of ThreeDimensionalShape
    
    public int edgeLength;  //Variable to hold the edge length of the cube
    public double sArea;    //Variable to hold the surface area of the cube
    
    public Cube(){      //Constructor for Cube; Sets the edge length and surface area to 0.
        super();        //calls the super class's constructor to initalize inherited fields.
        edgeLength = 0; 
        sArea = 0;
    }
    
    public void setEdge(int e){     //Method to set edge length to the given argument e.
        edgeLength = e;
    }
    
    public double calcVolume(){     //Method to calculate the volume and assign it to volume field.
        volume = Math.pow(edgeLength, 3);  //Cube volume formula a^3 to calculate volume
        return volume;
    }
    
    public double calcSArea(){      //Method to calculate the surface area and assign it to sArea field.
        sArea = 6*(Math.pow(edgeLength, 2));   //Cube surface area formula 6a^2 to calculate surface area
        return sArea;
    }
}
