public class LogStrategy implements ErrorHandlingStrategy {
    @Override
    public void handleError(Error error) {
        System.out.println("Logging error: " + error.getMessage());
    }
}
