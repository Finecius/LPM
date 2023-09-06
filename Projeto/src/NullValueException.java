public class NullValueException extends RuntimeException{
    @Override
    public String getMessage() {
        return ("O valor não pode ser nulo!");
    }
}
