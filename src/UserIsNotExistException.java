public class UserIsNotExistException extends Exception{
    public UserIsNotExistException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "UserIsNotExistException{" + getMessage() + "}";
    }
}
