/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testehibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateUtil;

/**
 *
 * @author taniabasso
 */
public class TesteHibernate2 {
    public static void main(String[] args) {
        
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
     
            //primeiro cria as disciplinas
            Disciplina disc1 = new Disciplina (1,"java", 80);
            Disciplina disc2 = new Disciplina (2, "estrutura de dados", 40);
            Disciplina disc3 = new Disciplina (3, "banco de dados", 40);
        
            //cria os alunos
            Aluno al1 =new Aluno(1234,"Tania");
            Aluno al2 =new Aluno(5678,"Leandro");
            Aluno al3 =new Aluno(9012,"Maria");

            //cria professores
            Professor prof1 = new Professor(1,"Tania",2000);
            Professor prof2 = new Professor(2,"Xandao",1500);
            List<Disciplina> listadisc = new ArrayList<Disciplina>();
            listadisc.add(disc1);
            listadisc.add(disc2);
            prof1.setListaDisc(listadisc);

            //cria Funcionarios
            Funcionario func1 = new Funcionario(1,"Verinha",1400);
            Funcionario func2 = new Funcionario(2,"Seu Jorge",2000);

            //cria Departamento
            Departamento dept1 = new Departamento(1,"Exatas");
            Departamento dep2 = new Departamento(2,"Humanas");

           
           //salva alunos
            session.save(al1);
            session.save(al2);
            session.save(al3);

            session.save(disc1);
            session.save(disc2);
            session.save(disc3);

            session.save(prof1);
            session.save(prof2);

            session.save(func1);
            session.save(func2);

            session.save(dept1);
            session.save(dep2);

        session.getTransaction().commit();
        
        String hql = "from Professor";
       Query query = session.createQuery(hql);
       List<Professor> result = query.list();
       for (Professor prof:result){
               System.out.println(prof.getNome() + " "+prof.getSalario());
       }

            String hql2 = "from Aluno";
            Query query2 = session.createQuery(hql2);
            List<Aluno> result2 = query2.list();
            for (Aluno aluno:result2){
                    System.out.println(aluno.getNome() + " "+aluno.getRa());
            }

            String hql3 = "from Departamento";
            Query query3 = session.createQuery(hql3);
            List<Departamento> result3 = query3.list();
            for (Departamento dept:result3){
                    System.out.println(dept.getNome()+" "+dept.getCod());
            }

            String hql4 = "from Disciplina";
            Query query4 = session.createQuery(hql4);
            List<Disciplina> result4 = query4.list();
            for (Disciplina dept:result4){
                    System.out.println(dept.getDescricao()+" "+dept.getCodigo());
            }

            String hql5 = "from Funcionario";
            Query query5 = session.createQuery(hql5);
            List<Funcionario> result5 = query5.list();
            for (Funcionario dept:result5){
                    System.out.println(dept.getNome()+" "+dept.getId());
            }

        session.close();
        HibernateUtil.shutdown();
    }
}
