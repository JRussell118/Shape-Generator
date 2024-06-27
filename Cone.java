/*Cone.java
 *10/28/2023
 *Jaden Russell
 *This file creates a Cone class that is a subclass of the ThreeDimensionalShape class. 
  The Cone class creates a ThreeDimensionalShape in its constructor and has three variables 
  for the radius, height and slant height, with methods to calculate the volume and slant height of the Cone.
 */
package project.pkg1.jaden.russell;

public class Cone extends ThreeDimensionalShape{ //extends the ThreeDimensionalShape class as a subclass of ThreeDimensionalShape
    
    public int radius;  //Variables to hold radius, height and slant height of the cone
    public int height;
    public double slant;
    
    public Cone(){      //Constructor for Cone; Sets the radius, height, and slant height to 0.
        super();        //calls the super class's constructor to initalize inherited fields.
        radius = 0;
        height = 0;
        slant = 0;
    }
    
    public void setRadius(int r){   //Method to set radius to the given argument r.
        radius = r;
    }
    
    public void setHeight(int h){   //Method to set height to the given argument h.
        height = h;
    }
    
    public double calcVolume(){     //Method to calculate the volume and assign it to volume field.
        volume = (Math.PI * (Math.pow(radius, 2)))*(height/3);  //Cone volume formula (1/3)*pi*r^2*h to calculate volume
        return volume;
    }
    
    public double calcSlant(){     //Method to calculate the slant height and assign it to slant field.
        slant = Math.sqrt((Math.pow(radius, 2)) + (Math.pow(height, 2)));  //Cone slant height formula sqrt(r^2 + h^2) to calculate slant height
        return slant;
    }
}
