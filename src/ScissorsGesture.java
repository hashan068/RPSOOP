public class ScissorsGesture implements GestureStrategy {
    @Override
    public boolean beats(GestureStrategy opponent) {
        return opponent instanceof PaperGesture;
    }
}