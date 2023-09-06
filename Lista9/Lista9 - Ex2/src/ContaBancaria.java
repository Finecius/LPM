public abstract class ContaBancaria {
    protected double saldo=0;

    public void depositar(double deposito){
      if(deposito<=0){
          throw new ValorInvalidoException();
      }
      else
        saldo+=deposito;
    }

    public void sacar(double saque){
        if(saque<=0){
            throw new ValorInvalidoException();
        } else if (saque>saldo) {
            throw new SaldoInsuficienteException();
        } else
            saldo-=saque;
    }

    public void transferir(double qtd, ContaBancaria e){
        if(qtd<=0){
            throw new ValorInvalidoException();
        } else if (qtd>saldo) {
            throw new SaldoInsuficienteException();

        } else {
            saldo -= qtd;
            e.saldo += qtd;
        }
    }


    public void calcularSaldo(){

    }

    public double getSaldo() {
        return saldo;
    }
}
