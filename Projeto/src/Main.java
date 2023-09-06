import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        ArrayList<Cliente> a1 = new ArrayList<>();
        ArrayList<Funcionario> a2 = new ArrayList<>();
        ArrayList<Produto>a3=new ArrayList<>();
        int option ;


        do {
            System.out.print("\n\n##-----------MENU------------##\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - Novo Cadastro     |\n");
            System.out.print("| Opção 2 - Buscar            |\n");
            System.out.print("| Opção 3 - Deletar           |\n");
            System.out.print("| Opção 4 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");
            option = a.nextInt();

            switch (option) {

                case 1: {
                    System.out.print("\n\n\n\n\n\n##---------CADASTRO----------##\n");
                    System.out.print("|-----------------------------|\n");
                    System.out.print("| Opção 1 - Cliente           |\n");
                    System.out.print("| Opção 2 - Funcionário       |\n");
                    System.out.print("| Opção 3 - Produtos          |\n");
                    System.out.print("| Opção 4 - Voltar <--        |\n");
                            System.out.print("|-----------------------------|\n");
                    System.out.print("Digite uma opção: ");
                    int op2 = a.nextInt();
                    switch (op2) {
                        case 1: {
                            Cliente c1 = new Cliente();

                            System.out.println("\n\n");
                            System.out.print("|-----CADASTRO DE CLIENTE-----|\n");
                            System.out.println("Digite sua CNH: ");
                            try {
                                c1.setCNH(a.nextInt());
                            } catch (NegativeNumberException e) {
                                System.out.println(e.getMessage());

                                break;
                            }
                            System.out.println("Digite seu cpf: ");
                            try {
                                c1.setCpf(a.nextInt());
                            } catch (NegativeNumberException e) {
                                System.out.println(e.getMessage());

                                break;
                            }
                            a.nextLine();
                            System.out.println("Digite seu email: ");
                            try {
                                c1.setEmail(a.nextLine());
                            } catch (NullValueException e) {
                                System.out.println(e.getMessage());

                                break;
                            }
                            System.out.println("Digite seu nome: ");
                            try {
                                c1.setNome(a.nextLine());
                            } catch (NullValueException e) {
                                System.out.println(e.getMessage());

                                break;
                            }

                            System.out.println("Digite sua Idade: ");
                            try {
                                c1.setIdade(a.nextInt());
                            } catch (NegativeNumberException e) {
                                System.out.println(e.getMessage());

                                break;
                            }
                            c1.exibir();
                            System.out.println("Voce tem certeza que deseja adicionar este cliente?(true(sim)/false(não))");
                            boolean co = a.nextBoolean();
                            if (co) {
                                a1.add(c1);
                            }
                            break;
                        }
                        case 2: {
                            Funcionario f1 = new Funcionario();

                            System.out.println("\n\n");
                            System.out.print("|---CADASTRO DE FUNCIONÁRIO---|\n");
                            System.out.println("Digite o número do seu celular: ");
                            try {
                                f1.setCll(a.nextInt());
                            } catch (NegativeNumberException e) {
                                System.out.println(e.getMessage());
                                break;
                            }
                            System.out.println("Digite seu cpf: ");
                            try {
                                f1.setCpf(a.nextInt());
                            } catch (NegativeNumberException e) {
                                System.out.println(e.getMessage());
                                break;
                            }
                            System.out.println("Digite seu Código: ");
                            try {
                                f1.setCodigo(a.nextInt());
                            } catch (NegativeNumberException e) {
                                System.out.println(e.getMessage());
                                break;
                            }
                            a.nextLine();
                            System.out.println("Digite seu nome: ");
                            try {
                                f1.setNome(a.nextLine());
                            } catch (NullValueException e) {
                                System.out.println(e.getMessage());
                                break;
                            }

                            System.out.println("DIgite sua Idade: ");
                            try {
                                f1.setIdade(a.nextInt());
                            } catch (NegativeNumberException e) {
                                System.out.println(e.getMessage());
                                break;
                            }
                            f1.exibir();
                            System.out.println("Voce tem certeza que deseja adicionar este funcionário?(true(sim)/false(não))");
                           boolean co = a.nextBoolean();
                            if (co) {
                                a2.add(f1);

                            }
                            break;
                        }
                        case 3: {
                            Produto p1=new Produto();
                            a.nextLine();

                            System.out.println("\n\n");
                            System.out.print("|-----CADASTRO DE PRODUTO-----|\n");
                            System.out.println("Descreva o carro: ");
                            try {
                                p1.setDescricao(a.nextLine());
                            } catch (NullValueException e) {
                                System.out.println(e.getMessage());
                                break;
                            }
                            System.out.println("Digite o preço do carro: ");
                            try {
                                p1.setPreco(a.nextInt());
                            } catch (NegativeNumberException e) {
                                System.out.println(e.getMessage());
                                break;
                            }
                            a.nextLine();
                            System.out.println("Digite o fabricante: ");
                            try {
                                p1.setFabricante(a.nextLine());
                            } catch (NullValueException e) {
                                System.out.println(e.getMessage());
                                break;
                            }
                            System.out.println("Digite o nome do carro: ");
                            try {
                                p1.setNome(a.nextLine());
                            } catch (NullValueException e) {
                                System.out.println(e.getMessage());
                                break;
                            }

                            System.out.println("Digite o código do carro: ");
                            try {
                                p1.setCodigo(a.nextInt());
                            } catch (NegativeNumberException e) {
                                System.out.println(e.getMessage());
                                break;
                            }catch (NullValueException e ){
                                System.out.println(e.getMessage());
                                break;
                            }
                            p1.exibir();
                            System.out.println("Voce tem certeza que deseja adicionar este funcionário?(true(sim)/false(não))");
                            boolean co = a.nextBoolean();
                            if (co) {
                                a3.add(p1);

                            }
                            break;
                        }
                        case 4: {
                            System.out.println("\n\nVoltando <-- ");
                            break;
                        }

                        default:
                            System.out.println("Opção não disponível");
                            break;
                    }
                }break;
                    case 2:{
                        System.out.print("\n\n\n\n\n\n##-------MENU DE BUSCA-------##\n");
                        System.out.print("|-----------------------------|\n");
                        System.out.print("| Opção 1 - ESPECIAIS         |\n");
                        System.out.print("| Opção 2 - Clientes          |\n");
                        System.out.print("| Opção 3 - Funcionário       |\n");
                        System.out.print("| Opção 4 - Produtos          |\n");
                        System.out.print("| Opção 5 - Voltar <--        |\n");
                        System.out.print("|-----------------------------|\n");
                        System.out.print("Digite uma opção: ");
                        int op2 = a.nextInt();
                        switch (op2){
                            case 1:
                                System.out.println("Selecione: \n1 - Clientes(mais velho, mais novo, quantidade de clientes maiores de 60, quantidade de clientes menores de 18, média de idades)");
                                System.out.println("\n2 - Produto(mais caro, mais barato, média de preço, produtos mais caro que a média)");
                                System.out.println("Voltar <-- ");
                                int op3 = a.nextInt();
                                switch (op3) {
                                    case 1:
                                        if(a1.size()==0){
                                            System.out.println("Sem clientes cadastrados!");
                                            break;
                                        }
                                        int v = 0;
                                        int n = a1.get(0).getIdade();
                                        int q1 = 0;
                                        int q = 0;
                                        int q2 = 0;
                                        int m = 0;
                                        for (Cliente i : a1) {
                                            if (i.getIdade() > v)
                                                v = i.getIdade();
                                            if (i.getIdade() < n)
                                                n = i.getIdade();
                                            if (i.getIdade() > 60)
                                                q1++;
                                            if (i.getIdade() < 18)
                                                q2++;
                                            m += i.getIdade();
                                            q++;
                                        }
                                        if(q>0)
                                        m/=q;
                                        else {
                                            System.out.println("Não há clientes cadastrados!");
                                            break;
                                        }
                                        System.out.println("\nCliente mais velho: " + v + "\nCliente mais novo: " + n + "\nQuantidade de clientes maiores de 60: " + q1 + "\nQuantidade de clientes menores de 18: " + q2 + "\nMédia de idade dos clientes: " + m);
                                        break;
                                    case 2:
                                        if(a3.size()==0) {
                                            System.out.println("Sem produtos cadastrados!");
                                            break;
                                        }
                                        double caro = 0;

                                        double barato = a3.get(0).getPreco();

                                        q = 0;
                                        double media = 0;
                                        q1 = 0;
                                        for (Produto i : a3) {
                                            if (i.getPreco() > caro)
                                                caro = i.getPreco();
                                            if (i.getPreco() < barato)
                                                barato = i.getPreco();
                                            media += i.getPreco();
                                            q++;
                                        }
                                        if(q>0)
                                        media /= q;
                                        else{
                                            System.out.println("Não há produtos cadastrados!");
                                            break;
                                        }
                                        for (Produto i : a3) {
                                            if (i.getPreco() > media)
                                                q1++;
                                        }
                                        System.out.println("\nCarro mais caro: " + caro + "\nCarro mais barato: " + barato + "\nMédia de preço: " + media + "\nQuantidade de produtos com preço acima da média: " + q1);
                                        break;

                                    case 3:
                                        System.out.println("Voltando <--");
                                        break;

                                    default:
                                        System.out.println("Opção indisponível!");
                                        break;
                                }
                                break;
                            case 2:
                                a.nextLine();
                                System.out.println("Digite o nome(ou parte) do cliente");
                                try {
                                    String n = a.nextLine();
                                    for(Cliente i:a1){
                                        if(i.getNome().toUpperCase().contains(n.toUpperCase())) {
                                            i.exibir();

                                        }


                                    }
                                }catch (NullValueException e){
                                    e.getMessage();
                                    break;
                                }

                                break;
                            case 3:
                                a.nextLine();
                                System.out.println("Digite o nome(ou parte) do funcionário");
                                try {
                                    String n = a.nextLine();
                                    for(Funcionario i:a2){
                                        if(i.getNome().toUpperCase().contains(n.toUpperCase())) {
                                            i.exibir();

                                        }


                                    }
                                }catch (NullValueException e){
                                    e.getMessage();
                                    break;
                                }

                                break;
                            case 4:
                                System.out.print("\n\n\n\n\n\n##------BUSCA DE PRODUTO------##\n");
                                System.out.print("|-----------------------------|\n");
                                System.out.print("| Opção 1 - Descrição         |\n");
                                System.out.print("| Opção 2 - Preço             |\n");
                                System.out.print("| Opção 3 - Fabricante        |\n");
                                System.out.print("| Opção 4 - Voltar <--        |\n");
                                System.out.print("|-----------------------------|\n");
                                System.out.print("Digite uma opção: ");
                                int op4=a.nextInt();

                                switch (op4) {

                                    case 1:
                                        int t=0;
                                    a.nextLine();
                                    System.out.println("Digite a descrição do carro");
                                    try {
                                        String n = a.nextLine();
                                        for (Produto i : a3) {

                                            if (i.getDescricao().toUpperCase().contains(n.toUpperCase())) {
                                                i.exibir();
                                                t++;

                                            }if(t==0)
                                                System.out.println("Nenhum produto encontrado");


                                        }
                                    } catch (NullValueException e) {
                                        e.getMessage();
                                        break;
                                    }
                                    break;
                                    case 2:
                                         t=0;
                                        System.out.println("Digite o preço do carro");
                                        try {
                                            Double n = a.nextDouble();
                                            for (Produto i : a3) {
                                                if (i.getPreco()==n) {
                                                    i.exibir();
                                                    t++;

                                                }



                                            }if(t==0)
                                                System.out.println("Nenhum produto encontrado");
                                        } catch (NegativeNumberException e) {
                                            e.getMessage();
                                            break;
                                        }
                                        break;
                                    case 3:
                                        t=0;
                                        a.nextLine();
                                        System.out.println("Digite o fabricante do carro");
                                        try {
                                            String n = a.nextLine();
                                            for (Produto i : a3) {
                                                n = n.toUpperCase();
                                                if (i.getFabricante().toUpperCase().contains(n)) {
                                                    i.exibir();
                                                    t++;

                                                }


                                            }if(t==0)
                                                System.out.println("Nenhum produto encontrado");
                                        } catch (NullValueException e) {
                                            e.getMessage();
                                            break;
                                        }
                                        break;

                                    case 4: {
                                        System.out.println("\n\nVoltando <--");
                                        break;
                                    }
                                    default:
                                        System.out.println("Opção indisponível!");
                                        break;
                                }
                                break;

                            case 5:
                                System.out.println("\n\nVoltando <-- ");
                                break;

                            default:
                                System.out.println("Opção indisponível!");
                                break;
                        }
                        break;
                    }



                    case 3: {
                        System.out.print("\n\n\n\n\n\n##----------DELETAR----------##\n");
                        System.out.print("|-----------------------------|\n");
                        System.out.print("| Opção 1 - Cliente           |\n");
                        System.out.print("| Opção 2 - Funcionário       |\n");
                        System.out.print("| Opção 3 - Produto           |\n");
                        System.out.print("| Opção 4 - Voltar <--        |\n");
                        System.out.print("|-----------------------------|\n");
                        System.out.print("Digite uma opção: ");
                        int op2=a.nextInt();

                        switch (op2){
                            case 1:
                        int del;
                        System.out.println("Digite o CPF do cliente a ser removida: ");
                        try {
                            del = a.nextInt();
                            int index = 0;
                            for (Cliente i : a1) {
                                if (del == i.getCpf()) {
                                    System.out.println("Tem certeza que deseja remover este cliente?(true(sim)/false(não))");
                                    boolean co = a.nextBoolean();
                                    if (co) {
                                        a1.remove(index);
                                    }
                                    break;
                                }

                                index++;
                            }
                            System.out.println("Restante da lista: ");
                            for (Cliente i : a1) {
                                i.exibir();
                                System.out.println("\n------------------------");
                            }
                        } catch (NegativeNumberException e) {
                            System.out.println(e.getMessage());
                            break;
                        }
                        break;
                            case 2:
                                System.out.println("Digite o CÓDIGO do Funcionário a ser removido: ");
                                try {
                                    del = a.nextInt();

                                    int index = 0;
                                    for (Funcionario i : a2) {
                                        if (del == i.getCodigo()) {
                                            System.out.println("Tem certeza que deseja remover o Funcionário?(true(sim)/false(não))");
                                            boolean co = a.nextBoolean();
                                            if (co) {
                                                a2.remove(index);

                                            }
                                            break;


                                        }
                                        index++;

                                    }
                                }catch (NegativeNumberException e){
                                    System.out.println(e.getMessage());
                                }
                                    System.out.println("Restante da lista: \n------------------------");
                                    for (Funcionario i : a2) {
                                        i.exibir();
                                    }
                                break;

                            case 3:
                                System.out.println("Digite o CÓDIGO do Carro a ser removido: ");
                                try{
                                    del = a.nextInt();

                                    int index=0;
                                    for (Produto i :a3){
                                        if(del==i.getCodigo()){
                                            System.out.println("Tem certeza que deseja remover o Carro?(true(sim)/false(não))");
                                            boolean co = a.nextBoolean();
                                            if(co) {

                                                a3.remove(index);

                                            }
                                            break;
                                        }

                                        index++;

                                    }  System.out.println("Restante da lista: \n------------------------");
                                    for (Produto i : a3) {
                                        i.exibir();
                                    }
                                }catch (NegativeNumberException e){
                                    System.out.println(e.getMessage());
                                }
                                break;

                            case 4:
                                System.out.println("\n\nVoltando <--");
                                break;

                            default:
                                System.out.println("Opção indisponível");
                                break;
                            }

                    }break;
                    case 4: {
                        System.out.println("\n\nFINALIZANDO..");
                        break;
                    }
                    default:
                        System.out.println("Opção indisponível");
                        break;
                }

            } while (option != 4) ;
        }
    }
