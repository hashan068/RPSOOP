import java.util.Random;

public class GameEngine {
    private final Player user;
    private final Player computer;
    private int userWins = 0;
    private int computerWins = 0;
    private int draws = 0;

    public GameEngine(Player user, Player computer) {
        this.user = user;
        this.computer = computer;
    }

    public void playRound() {
        user.makeChoice();
        computer.makeChoice();

        Gesture userChoice = user.getChoice();
        Gesture computerChoice = computer.getChoice();

        if (userChoice == computerChoice) {
            System.out.println("It's a draw!");
            draws++;
        } else if (userChoice.beats(computerChoice)) {
            System.out.println("You win this round!");
            userWins++;
        } else {
            System.out.println("Computer wins this round!");
            computerWins++;
        }
    }


    public int getUserWins() {
        return userWins;
    }

    public int getComputerWins() {
        return computerWins;
    }

    public int getDraws() {
        return draws;
    }
}
