public class NegativeNumberException extends RuntimeException{
    @Override
    public String getMessage() {
        return("O Valor não pode ser negativo!");
    }
}
