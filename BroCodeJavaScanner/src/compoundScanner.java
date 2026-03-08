/**
 *this is from bro code java.  This is a compound interest calculator using the 
    older method of scanner.
 */
import java.util.Scanner;

public class compoundScanner {
    void main(){
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("How much is the principal: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate in %: ");
        rate = scanner.nextDouble() / 100;

        System.out.print("How many times per year will it be compounded: ");
        timesCompounded = scanner.nextInt();
        
        System.out.print("How many years will this be saved: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.println("After " + years + " you will have $" +amount);
      
        scanner.close();

    }
    
}
