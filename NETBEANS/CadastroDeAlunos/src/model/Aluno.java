/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */
public class Aluno {
    
    private int Ra;
    private String Nome;

    public Aluno(int Ra, String Nome) {
        this.Ra = Ra;
        this.Nome = Nome;
    }

    public int getRa() {
        return Ra;
    }

    public void setRa(int Ra) {
        this.Ra = Ra;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
}
