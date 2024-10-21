public class DatabaseError implements Error {
    @Override
    public String getMessage() {
        return "Database connection error!";
    }
}
