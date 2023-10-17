package com.example.demoApi3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "disciplina")
public class Disciplina {

    @Id
    private int codigo;
    @Column
    private String nome;
    @Column
    private int cargaH;
    @Column(length = 2)
    private String sigla;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaH() {
        return cargaH;
    }

    public void setCargaH(int cargaH) {
        this.cargaH = cargaH;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
