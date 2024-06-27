/*Triangle.java
 *10/28/2023
 *Jaden Russell
 *This file creates a Triangle class that is a subclass of the TwoDimensionalShape class. 
  The Triangle class creates a TwoDimensionalShape in its constructor and has three variables 
  for the three sides of the triangle, with methods to change the value of the triangle's sides
  and calculate the area and type of the triangle.
 */
package project.pkg1.jaden.russell;

 

public class Triangle extends TwoDimensionalShape{  //extends the TwoDimensionalShape class as a subclass of TwoDimensionalShape.
    
    public int sideA;   //Variables to hold the length of the three sides of the triangle.
    public int sideB;
    public int sideC;
    
    public Triangle(){  //Constructor for Triangle; Sets the length of the three sides to 0.
        super();        //calls the super class's constructor to initalize inherited fields.
        sideA = 0;
        sideB = 0;
        sideC = 0;
    }
    
    public void setSideA(int a){    //Method to set sideA to the given argument a.
        sideA = a;
    }
    
    public void setSideB(int b){    //Method to set sideB to the given argument b.
        sideB = b;
    }
    
    public void setSideC(int c){    //Method to set sideC to the given argument c.
        sideC = c;
    }
    
    public double calcArea(){       //Method to calculate the area and assign it to area field.
        double sPerim = (sideA + sideB + sideC)/2;  //variable to hold semi-perimeter for area calculation.
        area = Math.sqrt(sPerim*(sPerim-sideA)*(sPerim-sideB)*(sPerim-sideC));  //Triangle area formula square root[s(s-a)(s-b)(s-c)] to calculate area.
        return area;
    }
    
    public void triangleType(){     //Method to state the type of the triangle.
        if(sideA == sideB && sideA == sideC){   //Checks if the sides are equal.
            System.out.println("The Triangle you created is Equilateral.\n");     //States the triangle is equalateral.
        }
        else if(sideA == sideB || sideA == sideC || sideB == sideC){    //Checks if any two sides are equal.
            System.out.println("The Triangle you created is Isosceles.\n");    //States the triangle is isoceles.
        }
        else{                                                           //if no sides are equal.
            System.out.println("The Triangle you created is Scalene.\n");     //States the triangle is Scalene.
        }
        
    }
    
}
