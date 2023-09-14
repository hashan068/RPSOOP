public class RockGesture implements GestureStrategy {
    @Override
    public boolean beats(GestureStrategy opponent) {
        return opponent instanceof ScissorsGesture;
    }
}