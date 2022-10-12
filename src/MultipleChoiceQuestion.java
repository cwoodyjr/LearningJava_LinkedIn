import java.util.Scanner;

public class MultipleChoiceQuestion {

    public static void main(String[] args) {
        String question = "How many eggs does a chicken lay per day?";
        String choiceOne = "3";
        String choiceTwo = "1";
        String choiceThree = "5";

        String correctAnswer = choiceTwo;

        // TODO: Write a print statement asking the question
        System.out.println(question);
        // TODO: Write a print statement giving the answer choice
        System.out.print(choiceOne + ", " + choiceTwo + " or "+ choiceThree+"?: ");
        // TODO: Have the user input an answer
        // TODO: Retrieve the user's input
        Scanner reader = new Scanner(System.in);
        String userAnswer = reader.next();

        // TODO: If the user's input matches the correctAnswer...
        if (userAnswer.equals(correctAnswer)) {
            // TODO: then the user is correct and we want to print out a
            //  congrats message to the user.
            System.out.println("Congratulations, the correct answer is "+correctAnswer);
        }
        // TODO: If the user's input does not match the correctAnswer...
        else {
            // TODO: then the user is incorrect and we want to print out a
            //  message saying that the user is incorrect as well as what the
            //  correct choice was.
            System.out.println("That's incorrect, the correct answer is "+correctAnswer);
        }
    }
}
