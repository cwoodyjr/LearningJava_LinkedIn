import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {
        // ask user to choose a number

        System.out.println("Pick a number between 1 and 10: ");
        //set up scanner to read user input
        Scanner reader = new Scanner(System.in);
        // create a variable to store user input as an Integer
        int inputtedNum = reader.nextInt();
        // use if statement, check if user input is less than or equal to 5

         if  (inputtedNum <= 5) {
             // the condition is true and the code inside is executed
            System.out.println("choose a higher number");
        // use else, if user input is not less than 5
        } else {
             // then the condition is false and so the else statement will execute
             System.out.println("you will have a good day");
         }
    }
}
