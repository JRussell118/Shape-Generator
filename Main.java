/*Main.java
 *10/28/2023
 *Jaden Russell
 *This file creates a command driven menu to allow the user to create a shape
  and get appropriate values by entering the required values.
 */
package project.pkg1.jaden.russell;

import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();     //date variable to get and hold the current date and time
        int choice = 0;     //Varable to hold the user's input.

        System.out.println("*********Welcome to the Java OO Shapes Program**********");     //Welcomes the user to the program.

        while (choice != 10) {    //Loops until the user chooses to exit the program
            Scanner s = new Scanner(System.in);     //scanner variable to read system inputs
            System.out.println("Select from the menu below:");  //Creates a menu of available choices to the user
            System.out.println("1. Construct a Circle");
            System.out.println("2. Construct a Rectangle");
            System.out.println("3. Construct a Square");
            System.out.println("4. Construct a Triangle");
            System.out.println("5. Construct a Sphere");
            System.out.println("6. Construct a Cube");
            System.out.println("7. Construct a Cone");
            System.out.println("8. Construct a Cylinder");
            System.out.println("9. Construct a Torus");
            System.out.println("10. Exit the program");

            try {
                choice = (s.nextInt());   //gets the next integer input by the user to assign to choice
            } catch (Exception e) {     //sets choice to an invalid integer if anything other than int is read
                choice = 0;
            }

            switch (choice) {     //switch to differentiate different menu options
                case 1:
                    Circle c = new Circle();    //Creates a new Circle object

                    System.out.println("You have selected a Circle");
                    System.out.println("What is the circle's radius?");
                    
                    do{
                        s = new Scanner(System.in); //renews scanner buffer
                        try {
                            choice = (s.nextInt());   //gets the next integer input by the user to assign to choice
                        } catch (Exception e) {     //sets choice to an invalid integer if anything other than int is read
                            System.out.println("Please enter a valid radius value.");   //displays error message and sets input to 0 when exception is caught
                            choice = 0;
                        }
                    }
                    while (choice == 0);    //loops until a radius value not equal to 0 is read

                    c.setRadius(choice);    //sets c's radius to the user input.

                    System.out.println("Your circle's area is " + c.calcArea());    //displays c's area using the input radius
                    System.out.println("Your circle's circumference is " + c.calcCir() + "\n");    //displays c's circumference using the input radius  
                    choice = 0;
                    break;
                    
                case 2:
                    Rectangle r = new Rectangle();    //Creates a new Rectangle object

                    System.out.println("You have selected a Rectangle");
                    System.out.println("What is the Rectangle's length?");
                    
                    do{
                        s = new Scanner(System.in); //renews scanner buffer
                        try {
                            choice = (s.nextInt());   //gets the next integer input by the user to assign to choice
                        } catch (Exception e) {     //sets choice to an invalid integer if anything other than int is read
                            System.out.println("Please enter a valid length value.");   //displays error message and sets input to 0 when exception is caught
                            choice = 0;
                        }
                    }
                    while (choice == 0);    //loops until a length value not equal to 0 is read
                    r.setLength(choice);    //sets r's length to the user input.
                    
                    System.out.println("What is the Rectangle's width?");
                    
                    do{
                        s = new Scanner(System.in); //renews scanner buffer
                        try {
                            choice = (s.nextInt());   //gets the next integer input by the user to assign to choice
                        } catch (Exception e) {     //sets choice to an invalid integer if anything other than int is read
                            System.out.println("Please enter a valid width value.");   //displays error message and sets input to 0 when exception is caught
                            choice = 0;
                        }
                    }
                    while (choice == 0);    //loops until a width value not equal to 0 is read
                    r.setWidth(choice);

                    System.out.println("Your rectangle's area is " + r.calcArea());    //displays r's area using the input length and width
                    System.out.println("Your rectangle's perimeter is " + r.calcPerim() + "\n");    //displays r's perimeter using the input input length and width    
                    choice = 0;
                    break;
        
                case 3:
                    Square sq = new Square();    //Creates a new Square object

                    System.out.println("You have selected a Square");
                    System.out.println("What is the square's side length?");
                    
                    do{
                        s = new Scanner(System.in); //renews scanner buffer
                        try {
                            choice = (s.nextInt());   //gets the next integer input by the user to assign to choice
                        } catch (Exception e) {     //sets choice to an invalid integer if anything other than int is read
                            System.out.println("Please enter a valid side value.");   //displays error message and sets input to 0 when exception is caught
                            choice = 0;
                        }
                    }
                    while (choice == 0);    //loops until a side length value not equal to 0 is read

                    sq.setSide(choice);    //sets the sq's side length to the user input.

                    System.out.println("Your square's area is " + sq.calcArea());    //displays the sq's area using the input side length
                    System.out.println("Your square's perimeter is " + sq.calcPerim() + "\n");    //displays the sq's circumference using the input side length  
                    choice = 0;
                    break;
                    
                case 4:
                    Triangle t = new Triangle();    //Creates a new Triangle object

                    System.out.println("You have selected a Triangle");
                    System.out.println("What is the length of the triangle's side A?");
                    
                    do{
                        s = new Scanner(System.in); //renews scanner buffer
                        try {
                            choice = (s.nextInt());   //gets the next integer input by the user to assign to choice
                        } catch (Exception e) {     //sets choice to an invalid integer if anything other than int is read
                            System.out.println("Please enter a valid side value.");   //displays error message and sets input to 0 when exception is caught
                            choice = 0;
                        }
                    }
                    while (choice == 0);    //loops until a radius value not equal to 0 is read

                    t.setSideA(choice);    //sets the t's side length to the user input.
                    
                    System.out.println("What is the length of the triangle's side B?");
                    
                    do{
                        s = new Scanner(System.in);
                        try {
                            choice = (s.nextInt());   //gets the next integer input by the user to assign to choice
                        } catch (Exception e) {     //sets choice to an invalid integer if anything other than int is read
                            System.out.println("Please enter a valid side value.");   //displays error message and sets input to 0 when exception is caught
                            choice = 0;
                        }
                    }
                    while (choice == 0);    //loops until a radius value not equal to 0 is read

                    t.setSideB(choice);    //sets the t's side length to the user input.
                    
                    System.out.println("What is the length of the triangle's side C?");
                    
                    do{
                        s = new Scanner(System.in); //renews scanner buffer
                        try {
                            choice = (s.nextInt());   //gets the next integer input by the user to assign to choice
                        } catch (Exception e) {     //sets choice to an invalid integer if anything other than int is read
                            System.out.println("Please enter a valid side value.");   //displays error message and sets input to 0 when exception is caught
                            choice = 0;
                        }
                    }
                    while (choice == 0);    //loops until a radius value not equal to 0 is read

                    t.setSideC(choice);    //sets the t's side length to the user input.

                    System.out.println("Your triangle's area is " + t.calcArea());    //displays t's area using the input sides
                    t.triangleType();   //displays the type of triangle using the input sides
                    choice = 0;
                    break;
                    
                case 5:
                    Sphere sp = new Sphere();    //Creates a new Sphere object

                    System.out.println("You have selected a Sphere");
                    System.out.println("What is the sphere's radius?");
                    
                    do{
                        s = new Scanner(System.in); //renews scanner buffer
                        try {
                            choice = (s.nextInt());   //gets the next integer input by the user to assign to choice
                        } catch (Exception e) {     //sets choice to an invalid integer if anything other than int is read
                            System.out.println("Please enter a valid radius value.");   //displays error message and sets input to 0 when exception is caught
                            choice = 0;
                        }
                    }
                    while (choice == 0);    //loops until a radius value not equal to 0 is read

                    sp.setRadius(choice);    //sets sp's radius to the user input.

                    System.out.println("Your sphere's volume is " + sp.calcVolume());    //displays sp's volume using the input radius
                    System.out.println("Your sphere's surface area is " + sp.calcSArea() + "\n");    //displays sp's surface area using the input radius
                    choice = 0;
                    break;
                    
                case 6:
                    Cube cu = new Cube();    //Creates a new Cube object

                    System.out.println("You have selected a Cube");
                    System.out.println("What is the cube's edge length?");
                    
                    do{
                        s = new Scanner(System.in); //renews scanner buffer
                        try {
                            choice = (s.nextInt());   //gets the next integer input by the user to assign to choice
                        } catch (Exception e) {     //sets choice to an invalid integer if anything other than int is read
                            System.out.println("Please enter a valid edge value.");   //displays error message and sets input to 0 when exception is caught
                            choice = 0;
                        }
                    }
                    while (choice == 0);    //loops until a edge value not equal to 0 is read

                    cu.setEdge(choice);    //sets cu's edge to the user input.

                    System.out.println("Your cube's volume is " + cu.calcVolume());    //displays cu's volume using the input edge length
                    System.out.println("Your cube's surface area is " + cu.calcSArea() + "\n");    //displays cu's surface area using the input edge length
                    choice = 0;
                    break;
                    
                case 7:
                    Cone co = new Cone();    //Creates a new Cone object

                    System.out.println("You have selected a Cone");
                    System.out.println("What is the cone's radius?");
                    
                    do{
                        s = new Scanner(System.in); //renews scanner buffer
                        try {
                            choice = (s.nextInt());   //gets the next integer input by the user to assign to choice
                        } catch (Exception e) {     //sets choice to an invalid integer if anything other than int is read
                            System.out.println("Please enter a valid radius value.");   //displays error message and sets input to 0 when exception is caught
                            choice = 0;
                        }
                    }
                    while (choice == 0);    //loops until a radius value not equal to 0 is read

                    co.setRadius(choice);    //sets co's radius to the user input.
                    
                    System.out.println("What is the cone's height?");
                    
                    do{
                        s = new Scanner(System.in); //renews scanner buffer
                        try {
                            choice = (s.nextInt());   //gets the next integer input by the user to assign to choice
                        } catch (Exception e) {     //sets choice to an invalid integer if anything other than int is read
                            System.out.println("Please enter a valid height value.");   //displays error message and sets input to 0 when exception is caught
                            choice = 0;
                        }
                    }
                    while (choice == 0);    //loops until a height value not equal to 0 is read

                    co.setHeight(choice);    //sets co's height to the user input.

                    System.out.println("Your cone's volume is " + co.calcVolume());    //displays co's volume using the input radius and height
                    System.out.println("Your cone's slant height is " + co.calcSlant() + "\n");    //displays co's slant height using the input radius and height
                    choice = 0;
                    break;
                    
                case 8:
                    Cylinder cy = new Cylinder();    //Creates a new Cylinder object

                    System.out.println("You have selected a Cylinder");
                    System.out.println("What is the cylinder's radius?");
                    
                    do{
                        s = new Scanner(System.in); //renews scanner buffer
                        try {
                            choice = (s.nextInt());   //gets the next integer input by the user to assign to choice
                        } catch (Exception e) {     //sets choice to an invalid integer if anything other than int is read
                            System.out.println("Please enter a valid radius value.");   //displays error message and sets input to 0 when exception is caught
                            choice = 0;
                        }
                    }
                    while (choice == 0);    //loops until a radius value not equal to 0 is read

                    cy.setRadius(choice);    //sets cy's radius to the user input.
                    
                    System.out.println("What is the cylinder's height?");
                    
                    do{
                        s = new Scanner(System.in); //renews scanner buffer
                        try {
                            choice = (s.nextInt());   //gets the next integer input by the user to assign to choice
                        } catch (Exception e) {     //sets choice to an invalid integer if anything other than int is read
                            System.out.println("Please enter a valid height value.");   //displays error message and sets input to 0 when exception is caught
                            choice = 0;
                        }
                    }
                    while (choice == 0);    //loops until a height value not equal to 0 is read

                    cy.setHeight(choice);    //sets cy's height to the user input.

                    System.out.println("Your cylinder's volume is " + cy.calcVolume());    //displays cy's volume using the input radius and height
                    System.out.println("Your cylinder's surface area is " + cy.calcSArea() + "\n");    //displays cy's surface area using the input radius and height
                    choice = 0;
                    break;
                    
                case 9:
                    Torus to = new Torus();    //Creates a new Torus object

                    System.out.println("You have selected a Torus");
                    System.out.println("What is the torus' major radius?");
                    
                    do{
                        s = new Scanner(System.in); //renews scanner buffer
                        try {
                            choice = (s.nextInt());   //gets the next integer input by the user to assign to choice
                        } catch (Exception e) {     //sets choice to an invalid integer if anything other than int is read
                            System.out.println("Please enter a valid radius value.");   //displays error message and sets input to 0 when exception is caught
                            choice = 0;
                        }
                    }
                    while (choice == 0);    //loops until a radius value not equal to 0 is read

                    to.setMajor(choice);    //sets to's major radius to the user input.
                    
                    System.out.println("What is the torus' minor radius?");
                    
                    do{
                        if(choice > to.majorR){
                            System.out.println("Please enter a valid radius value less than the major radius.");
                        }
                        s = new Scanner(System.in); //renews scanner buffer
                        try {
                            choice = (s.nextInt());   //gets the next integer input by the user to assign to choice
                        } catch (Exception e) {     //sets choice to an invalid integer if anything other than int is read
                            System.out.println("Please enter a valid radius value.");   //displays error message and sets input to 0 when exception is caught
                            choice = 0;
                        }
                    }
                    while (choice == 0 || choice > to.majorR);    //loops until a radius value not equal to 0 or less than the major radius is read

                    to.setMinor(choice);    //sets to's minor radius to the user input.

                    System.out.println("Your torus' volume is " + to.calcVolume());    //displays to's volume using the input major and minor radius
                    System.out.println("Your torus' surface area is " + to.calcSArea() + "\n");    //displays to's surface area using the input major and minor radius
                    choice = 0;
                    break;
                    
                case 10:
                    System.out.println("Thanks for using the program. Today is " + date);
                    break;
                    
                default:
                    System.out.println("Your input is invalid. Please try again.\n");
            }

        }

    }

}
