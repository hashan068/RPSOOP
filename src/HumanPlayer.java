import java.util.Scanner;

public class HumanPlayer implements Player {
    private Gesture choice;

    @Override
    public void makeChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice (ROCK, PAPER, SCISSORS): ");
        String userInput = scanner.nextLine().toUpperCase();

        // Validate and set the choice
        if (userInput.equals("ROCK") || userInput.equals("PAPER") || userInput.equals("SCISSORS")) {
            choice = Gesture.valueOf(userInput);
        } else {
            System.out.println("Invalid choice. Please choose ROCK, PAPER, or SCISSORS.");
            makeChoice(); // Recursive call to allow the user to re-enter a valid choice.
        }
    }

    @Override
    public Gesture getChoice() {
        return choice;
    }
}
