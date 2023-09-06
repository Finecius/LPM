import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Hourly A = new Hourly("Alberto",500,40);
        Hourly B = new Hourly("Sérgio",350,50);
        Employee C = new Salaried("Cleber",15000);
        Employee D = new Salaried("Roberto",20000);

        ArrayList <Employee> trabalhadores = new ArrayList<Employee>();

        trabalhadores.add(A);
        trabalhadores.add(B);
        trabalhadores.add(C);
        trabalhadores.add(D);

        double somaSalario=0, somaAssalariados=0, somaHourly=0;

        for(Employee I: trabalhadores){
            if (I instanceof Employee)
                somaSalario=somaSalario+I.getPay();

            if(I instanceof Salaried)
                somaAssalariados=somaAssalariados+I.getPay();

            if(I instanceof Hourly)
                somaHourly=somaHourly+((Hourly) I).getHours();
        }
        System.out.println("O gasto total da empresa com os Salários são de: "+somaSalario);
        System.out.println(somaAssalariados+" para os funcionarios assalariados.");
        System.out.println(somaHourly+" horas totais dos Hourlys.");
    }
}