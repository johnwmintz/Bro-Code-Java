import java.util.Scanner;

public class Practice {

    public static void main (String[] args) {
        int wholeNumber = 0;
        
        // Printing a basic string

        System.out.println("This is a string that takes up the line");

        Scanner scanner = new Scanner(System.in);

        //This is a string that requests an input of an integer.
        System.out.print("Please enter a whole number: ");
        wholeNumber = scanner.nextInt();
        System.out.println(wholeNumber);

        scanner.close();


    }

}
