public enum Gesture {
    ROCK(new RockGesture()),
    PAPER(new PaperGesture()),
    SCISSORS(new ScissorsGesture());

    private final GestureStrategy strategy;

    Gesture(GestureStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean beats(Gesture opponent) {
        return strategy.beats(opponent.strategy);
    }
}




