/*Sphere.java
 *10/28/2023
 *Jaden Russell
 *This file creates a Sphere class that is a subclass of the ThreeDimensionalShape class. 
  The Sphere class creates a ThreeDimensionalShape in its constructor and has two variables 
  for the radius and surface area, with methods to calculate the volume and surface area of the Sphere.
 */
package project.pkg1.jaden.russell;

public class Sphere extends ThreeDimensionalShape{  //extends the ThreeDimensionalShape class as a subclass of ThreeDimensionalShape
    
    public int radius;  //Variable to hold the radius of the sphere
    public double sArea;    //Variable to hold the surface area of the sphere
    
    public Sphere(){    //Constructor for Sphere; Sets the radius and surface area to 0.
        super();        //calls the super class's constructor to initalize inherited fields.
        radius = 0;
        sArea = 0;
    }
    
    public void setRadius(int r){   //Method to set radius to the given argument r.
        radius = r;
    }
    
    public double calcVolume(){     //Method to calculate the volume and assign it to volume field.
        volume = (4/3)*Math.PI*(Math.pow(radius, 3));  //Sphere volume formula (4/3)pi*r^3 to calculate volume
        return volume;
    }
    
    public double calcSArea(){      //Method to calculate the surface area and assign it to sArea field.
        sArea = 4*Math.PI*radius;   //Sphere surface area formula 4*pi*r to calculate surface area
        return sArea;
    }
    
}
