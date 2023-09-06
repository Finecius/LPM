public class NullNameException extends  RuntimeException{
    @Override
    public String getMessage() {
        return ("O nome não pode estar vazio");
    }
}
