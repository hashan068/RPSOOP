import java.util.Scanner;

class GameController {
    private final GameEngine gameEngine;

    public GameController(GameEngine gameEngine) {
        this.gameEngine = gameEngine;
    }

    public void startGame() {
        System.out.println("Welcome to Rock-Paper-Scissors!");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            gameEngine.playRound();

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.nextLine().toLowerCase();

            if (!playAgain.equals("yes")) {
                break;
            }
        }

        // Display results here if needed
        System.out.println("Game over. User wins: " + gameEngine.getUserWins() +
                ", Computer wins: " + gameEngine.getComputerWins() +
                ", Draws: " + gameEngine.getDraws());
    }
}
