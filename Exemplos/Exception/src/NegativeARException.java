public class NegativeARException extends RuntimeException{
    @Override
    public String getMessage() {
        return ("O Ra não pode ser negativo");
    }
}
