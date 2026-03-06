import java.util.Scanner;
public class OddEven {
    public static void main (String[] args) {
        int x = (0);
        int y = (2);
        int z = (0);

        Scanner scanner = new Scanner(System.in);
        System.out.println("This application will tell if the number you enter is odd or even.");

        System.out.print("Enter your number: ");
        x = scanner.nextInt();
        z = x % y;
        //System.out.println(z);

        if (z == 0) {
            System.out.println("The number " + x + " is an even number.");

        }
        else{
            System.out.println("The number " + x + " is an odd number");
        }

        scanner.close();


    }

}
