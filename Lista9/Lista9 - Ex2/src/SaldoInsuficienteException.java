public class SaldoInsuficienteException extends RuntimeException{

    public String getMessage(double v) {
        return ("Valor acima do saldo atual\nSaldo disponível: "+v);
    }
}
