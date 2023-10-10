package testehibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Empregado")
public class Funcionario {
    @Id
    @Column (unique = true)
    private int id;

    @Column (nullable = false,length = 100)
    private String nome;

    @Column
    private double Salario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        Salario = salario;
    }
}
