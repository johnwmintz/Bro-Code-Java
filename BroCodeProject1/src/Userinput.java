//importing scanner
import java.util.Scanner;

public class Userinput {
    public static void userinput (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        scanner.close();

    }
}
