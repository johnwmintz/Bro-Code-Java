import java.util.Scanner;

public class Userinput2 {
        public static void userinput2 (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        scanner.close();

    }

}
