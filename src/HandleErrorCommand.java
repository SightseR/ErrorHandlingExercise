public class HandleErrorCommand implements ErrorCommand {
    private ErrorHandlingStrategy strategy;
    private Error error;

    public HandleErrorCommand(ErrorHandlingStrategy strategy, Error error) {
        this.strategy = strategy;
        this.error = error;
    }

    @Override
    public void execute() {
        strategy.handleError(error);
    }
}
