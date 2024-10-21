public class Application {
    public static void main(String[] args) {
        // Create a database error
        Error error = new DatabaseError();
        
        // Use LogStrategy to handle the error
        ErrorHandlingStrategy strategy = new LogStrategy();
        
        // Create and execute an ErrorCommand
        HandleErrorCommand command = new HandleErrorCommand(strategy, error);
        command.execute(); // Execute the error handling
    }
}
