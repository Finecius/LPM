public class Main {
    public static void main(String[] args) {
    SimuladorCaixaBanco c= new SimuladorCaixaBanco(1);
    c.proximoAtendimento();
    SimuladorCaixaBanco c2= new SimuladorCaixaBanco(2);
    c.proximoAtendimento();
    c2.proximoAtendimento();
    }
}