public class ValorInvalidoException extends RuntimeException{

    public String getMessage(double v) {
        return  ("A operação não pode ter valor igual ou inferior a 0\nValor utilizado: "+v);
    }
}
