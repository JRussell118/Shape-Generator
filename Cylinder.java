/*Cylinder.java
 *10/28/2023
 *Jaden Russell
 *This file creates a Cylinder class that is a subclass of the ThreeDimensionalShape class. 
  The Cylinder class creates a ThreeDimensionalShape in its constructor and has three variables 
  for the radius, height and surface area, with methods to calculate the volume and surface area of the cylinder.
 */
package project.pkg1.jaden.russell;

public class Cylinder extends ThreeDimensionalShape{ //extends the ThreeDimensionalShape class as a subclass of ThreeDimensionalShape
    
    public int radius;  //Variables to hold radius, height and surface area of the cylinder
    public int height;
    public double sArea;
    
    public Cylinder(){  //Constructor for Cylinder; Sets the radius, height and surface area to 0.
        super();        //calls the super class's constructor to initalize inherited fields.
        radius = 0;
        height = 0;
        sArea = 0;
    }
    
    public void setRadius(int r){   //Method to set radius to the given argument r.
        radius = r;
    }
    
    public void setHeight(int h){   //Method to set height to the given argument h.
        height = h;
    }
    
    public double calcVolume(){     //Method to calculate the volume and assign it to volume field.
        volume = (Math.PI * (Math.pow(radius, 2)))*height;  //Cylinder volume formula pi*r^2 * h to calculate volume
        return volume;
    }
    
    public double calcSArea(){      //Method to calculate the surface area and assign it to sArea field.
        sArea = (Math.PI * (Math.pow(radius, 2))) * (height + radius);   //Cylinder surface area formula pi*r^2 * (h+r) to calculate surface area
        return sArea;
    }
}
