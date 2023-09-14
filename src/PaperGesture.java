public class PaperGesture implements GestureStrategy {
    @Override
    public boolean beats(GestureStrategy opponent) {
        return opponent instanceof RockGesture;
    }
}
