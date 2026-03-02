//This is a basic application on how to calculate square feet
//I learned most of this from using Bro Code from YouTube

//This imports the utility to allow user input
import java.util.Scanner;


public class Main {
    public static void main (String[] args) {

        //Initial variable of width height and area
        double width = 0;
        double height = 0;
        double area = 0;
        String measurement ="sq ft";

        System.out.println("This is a square ft calculator created by John Mintz.  Please enter the measurements in feet.");
        //This opens the scanner to allow user input
        Scanner scanner = new Scanner(System.in);

        //This gathers the width and updates the width variable
        System.out.print("Please enter the width: ");
        width = scanner.nextDouble();

        //This gathers the height and updates the height variable
        System.out.print("Please enter the height: ");
        height =  scanner.nextDouble();

        //Calculating the area and updating the area variable
        area = width * height;

        //output the area
        System.out.println("The area is: " + area + " " + measurement);





        //This closes the scanner utility
        scanner.close();




    }
    
}
