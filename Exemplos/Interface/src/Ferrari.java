public class Ferrari implements Icarro,IItemLoja{
    @Override
    public void acelerar() {
        System.out.println("ferrari acelerando 0 a 100");
    }

    @Override
    public void parar() {
        System.out.println("ferraru parando");
    }

    @Override
    public void abrirPorta() {
        System.out.println("ferrari abrindo porta");
    }

    @Override
    public double getValor() {
        return 800000;
    }
}
