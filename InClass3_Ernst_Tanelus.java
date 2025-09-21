/**
 * Name: [Ernst Tanelus]
 * Date: [09/10/2025]
* Purpose: InClass 3 - 
* [This program propts the user to enter the length of a side of a cube, then calculates and displays both the volume and the surface area of the cube.]
 //It empasizes the use of Java's Math.pow() method for exponentiatiopn, reinforcing the significance of abstraction and computational methods in geometric calculations.
 */

// Don't forget to import and declare a Scanner for user input.
import java.util.Scanner; 
public class InClass3_Ernst_Tanelus
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        // In-Class 3 Example:
        // Step 1: Prompt the user to enter the length of the side of a cube.
        double side, volume, surfaceArea; //declare these variavles as Double data types
        // Step 2: Read the user's input and store it in a variable.
        System.out.print("Please enter the length of the side of the cube:");
        side = input.nextDouble();
        // Step 3: Use an appropriate method to determine the volume of the cube.
        volume = Math.pow(side, 3);
   
        // Step 4: Use an appropriate method to determine the surface area of the cube.
        surfaceArea = 6 * Math.pow(side, 2);
        // HINT: Steps 3 and 4 will use the Math.pow(a, b) method
        // Step 5: Print the volume and surface area in clear sentences.
        System.out.println("The volume of the cube is " + volume);
        System.out.println("The surface area of the cube is " + surfaceArea);
    }
}