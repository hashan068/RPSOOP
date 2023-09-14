import java.util.Scanner;

public class RockPaperScissorsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            PlayerFactory playerFactory = new PlayerFactory();
            Player user = playerFactory.createPlayer(true); // true for human, false for computer
            Player computer = playerFactory.createPlayer(false);

            GameEngine gameEngine = new GameEngine(user, computer);
            GameController gameController = new GameController(gameEngine);

            gameController.startGame();

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.nextLine();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        scanner.close();
    }
}
