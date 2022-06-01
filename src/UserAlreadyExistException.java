public class UserAlreadyExistException extends Exception{
    public UserAlreadyExistException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "UserAlreadyExistException{"+ getMessage() + "}";
    }
}
