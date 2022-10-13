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
        announceTeaTme();

    }
}
