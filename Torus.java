/*Torus.java
 *10/28/2023
 *Jaden Russell
 *This file creates a Torus class that is a subclass of the ThreeDimensionalShape class. 
  The Torus class creates a ThreeDimensionalShape in its constructor and has three variables 
  for the major and minor radius and surface area, with methods to calculate the volume and surface area of the torus.
 */
package project.pkg1.jaden.russell;

public class Torus extends ThreeDimensionalShape{ //extends the ThreeDimensionalShape class as a subclass of ThreeDimensionalShape
    
   public int majorR;   //Variables to hold major and minor radius and surface area.
   public int minorR;
   public double sArea;
   
   public Torus(){      //Constructor for Torus; Sets the major and minor radius and surface area to 0.
       super();
       majorR = 0;
       minorR = 0;
       sArea = 0;
   }
   
   public void setMajor(int r1){    //Method to set major radius to the given argument r1.
       majorR = r1;
   }
   
   public void setMinor(int r2){    //Method to set minor radius to the given argument r2.
       minorR = r2;
   }
   
   public double calcVolume(){     //Method to calculate the volume and assign it to volume field.
        volume = (Math.PI * (Math.pow(minorR, 2)))*(2*Math.PI*majorR);  //Torus volume formula (pi*r^2)*(2*pi*R) to calculate volume
        return volume;
    }
    
    public double calcSArea(){      //Method to calculate the surface area and assign it to sArea field.
        sArea = (2*Math.PI*majorR) * (2*Math.PI*minorR);   //Torus surface area formula (2*pi*R) * (2*pi*r) to calculate surface area
        return sArea;
    }
}
