public class printfComma {
    void main() {
        double number1 = 1000.75;
        double number2 = 4257.124;
        double number3 = 100000.25;
        char currency = '$';

        System.out.printf("%c%,.2f\n",currency, number1);
        System.out.printf("%c%,.2f\n",currency, number2);
        System.out.printf("%c%,.2f\n",currency, number3);
    }

}
