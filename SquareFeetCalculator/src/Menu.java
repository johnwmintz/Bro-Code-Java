import java.util.Scanner;
public class Menu {
    public static void main (String[] args) {

        int mainNumber = (0);
        int projectNumber =(0);


        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("Mintz Construction Estimator");
        System.out.println("----------------------------");
        System.out.println("Main Menu");
        System.out.println("----------------------------");
        System.out.println("               ");
        System.out.println("1.  Create a new project");
        System.out.println("2.  Open an existing project");
        System.out.println("0.  Exit");
        System.out.print("Enter your choice:");

          mainNumber = scanner.nextInt();

         if (mainNumber == 1) {
            System.out.print("Please enter the new project number: ");
            projectNumber = scanner.nextInt();
            System.out.println("----------------------------------------------------------");
            System.out.println("New project estimator for project number: " + projectNumber);
            System.out.println("----------------------------------------------------------");
            System.out.println(" ");
            System.out.println("1.  Square foot calculator");
            System.out.println("2.  Wall stud calculator");
            System.out.println("3.  Floor joist calculator");
            System.out.println("4.  Plywood sheet calculator");
            System.out.println("5.  Rough opening calculator");
            System.out.println("6.  Full room estimation");
            System.out.println("0.  Back to main menu");
            System.out.print("Enter your choice: ");
            mainNumber = scanner.nextInt();


         
         }else if (mainNumber == 2) {
            System.out.print("Please enter a project number: ");
            projectNumber = scanner.nextInt();
            System.out.println("---------------------------------------------------------------");
            System.out.println("Existing project estimator for project number: " + projectNumber);
            System.out.println("---------------------------------------------------------------");
            System.out.println("This is the placeholder for the menu");
        
         }else{
            System.out.println("Exiting now...");
        }
        scanner.close();

    }
        



            
         
         //System.out.println("You chose " + character);

         


    }


