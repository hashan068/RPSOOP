import java.util.Random;

public class ComputerPlayer implements Player {
    private Gesture choice;

    @Override
    public void makeChoice() {
        Random random = new Random();
        int randomIndex = random.nextInt(Gesture.values().length);
        choice = Gesture.values()[randomIndex];
        System.out.println("Computer's choice: " + choice);
    }

    @Override
    public Gesture getChoice() {
        return choice;
    }
}
