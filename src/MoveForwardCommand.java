public class MoveForwardCommand implements Command {
    @Override
    public void execute(Rover rover) {
        rover.moveForward();
    }
}