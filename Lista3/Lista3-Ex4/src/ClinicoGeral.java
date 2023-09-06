public class ClinicoGeral extends Medico{
    private boolean atendeEmCasa;

    @Override
    public boolean isTrabalhaNoHospital() {
        return super.isTrabalhaNoHospital();
    }
    public ClinicoGeral(){}
    @Override
    public void setTrabalhaNoHospital(boolean trabalhaNoHospital) {
        super.setTrabalhaNoHospital(trabalhaNoHospital);
    }

    public ClinicoGeral(boolean trabalhaNoHospital, boolean atendeEmCasa) {
        super(trabalhaNoHospital);
        this.atendeEmCasa = atendeEmCasa;
    }

    public ClinicoGeral(boolean trabalhaNoHospital) {
        super(trabalhaNoHospital);
    }

    @Override
    public void tratarPaciente() {
        super.tratarPaciente();
    }

    public boolean isAtendeEmCasa() {
        return atendeEmCasa;
    }

    public void setAtendeEmCasa(boolean atendeEmCasa) {
        this.atendeEmCasa = atendeEmCasa;
    }

    public void receitar(){
        System.out.println("Entregando receita para o paciente...");
    }
}
