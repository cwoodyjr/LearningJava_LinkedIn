import java.util.Scanner;

public class WhileLoop_OnRepeat {
    public static void main(String[] args) {
//        create a boolean variable and set it to true
        boolean isOnRepeat = true;
//        set up a scanner to read user input
        Scanner reader = new Scanner(System.in);


        while (isOnRepeat) {
            System.out.println("playing the current song");
            System.out.println("would you like to take the song off repeat? yes or no?");
            String userInput = reader.next();
            if (userInput.equals("yes")){
                isOnRepeat = false;
            }


        }
        System.out.println("playing the next song");
    }
}
