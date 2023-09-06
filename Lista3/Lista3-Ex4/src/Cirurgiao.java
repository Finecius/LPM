public class Cirurgiao extends Medico{
    @Override
    public boolean isTrabalhaNoHospital() {
        return super.isTrabalhaNoHospital();
    }
    public Cirurgiao(){}
    @Override
    public void setTrabalhaNoHospital(boolean trabalhaNoHospital) {
        super.setTrabalhaNoHospital(trabalhaNoHospital);
    }

    @Override
    public void tratarPaciente() {
        super.tratarPaciente();
    }

    public void fazerIncisao(){
        System.out.println("Fazendo incisão...");
    }

    public Cirurgiao(boolean trabalhaNoHospital) {
        super(trabalhaNoHospital);
    }
}
