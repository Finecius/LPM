public class Main {
    public static void main(String[] args) {
        Medico JohnySins = new Medico();
        ClinicoGeral PauloMuzy = new ClinicoGeral();
        Cirurgiao Noslem = new Cirurgiao();

        System.out.println("Médico Johny Sins..\n");
        System.out.println("Desejas ir trabalhar no hospital? (1 para Sim; 0 para Não).");
        JohnySins.setTrabalhaNoHospital(true);
        System.out.println("\n");
        System.out.println("Um paciente selvagem apareceu e está pronto para ser tratado!");
        JohnySins.tratarPaciente();

        System.out.println("\n\n-----------------------------------------------------------------------------------------\n\n");

        System.out.println("Clinico Paulo Muzy, o senhor deseja atender em casa? (1 para atender em casa; 0 para não atender em casa).");
        PauloMuzy.setAtendeEmCasa(false);
        System.out.println("\n");
        System.out.println("Um paciente está pedindo por uma receita que você havia falado que daria!");
        PauloMuzy.receitar();
        System.out.println("\n");
        System.out.println("Um paciente selvagem apareceu e está pronto para ser tratado!");
        PauloMuzy.tratarPaciente();

        System.out.println("\n\n-----------------------------------------------------------------------------------------\n\n");

        System.out.println("Cirurgião!! Você está recebendo uma chamada URGENTE para ir realizar uma cirurgia, deseja ir ao hospital? (1 para sim; 0 para não).");
        Noslem.setTrabalhaNoHospital(true);
        System.out.println("\n");
        System.out.println("No meio da cirurgia você precisa fazer uma incisão está pronto?");
        Noslem.fazerIncisao();
        System.out.println(".\n..\n...");
        System.out.println("Incisão bem sucedida!");
        System.out.println("\n");
        System.out.println("O paciente foi salvo..");

    }
}