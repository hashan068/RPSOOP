public class PlayerFactory {
    public Player createPlayer(boolean isHuman) {
        if (isHuman) {
            return new HumanPlayer();
        } else {
            return new ComputerPlayer();
        }
    }
}
