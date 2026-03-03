import java.util.Scanner;
public class Menu {
    public static void main (String[] args) {

        int mainNumber = 'A';
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
            System.out.println("This is the placeholder for the menu.");
         
         }else if (mainNumber == 2) {
            System.out.print("Please enter an project number: ");
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


