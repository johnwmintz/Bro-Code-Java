/**
 * This is to demonstrate how to do the same as the compoundScanner but using new features of Java 25.
 * I ran an ititial test and it came back with same number as compoundScanner.java.
 * I will be modifying to add $ sign, comma seperated, and 2 decimal places. 
 * Update: principal = 1000, interest = 3.5 /100, times compounded = 4, years =  5.
 *          Scanner =  1190.339799
 *          IO = 1190.339799
 *          IO with print f = $1,190.34
 */

public class CompoundIO {
    void main(){
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;
        char currency = '$';
        
        principal = Double.parseDouble(IO.readln("How much is the principal: "));

        rate = Double.parseDouble(IO.readln("Enter the interest rate in %: "));
        rate = rate / 100;
        
        timesCompounded = Integer.parseInt(IO.readln("How many times per year will it be compounded: "));
                
        years = Integer.parseInt(IO.readln("How many years will this be saved: "));

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        //This line of code hahs to system.out because printf is not available with IO
        System.out.printf("After %d years you will have %c%,.2f\n", years, currency, amount);
    }

}
