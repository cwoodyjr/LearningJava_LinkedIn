import java.util.Scanner;

public class TeaTimeFunction {
    public static void announceTeaTme() {
        System.out.println("waiting for tea time.........");
        System.out.println("enter a random word...");
        Scanner reader = new Scanner(System.in);
        reader.nextLine();
        System.out.println("it's tea time!! lets have cake");
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("would you like to run the 'Announce Tea Time' Function");
        System.out.println("Yes or No?");
        String answer = reader.next().toLowerCase().trim();

        if (answer.equals("yes")) {
            announceTeaTme();
        }else {
            System.out.println("It appears you have come to the wrong place. This programme runs 'Announce Tea Time' Only!");
        }
    }
}
