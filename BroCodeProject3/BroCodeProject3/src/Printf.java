/**
 * Using brocode Java for reference
 */

public class Printf {

    void main() {
        //Declaring and initalizing variables
        String name  ="Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        //Printing ines
        
        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a letter %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall.\n", height);
        System.out.printf("Employed: %b", isEmployed);
    }
    
}
