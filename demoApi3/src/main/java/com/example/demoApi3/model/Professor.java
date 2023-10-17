package com.example.demoApi3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "professor")
public class Professor {

    @Id
    private int ProfRa;

    @Column
    private String nome;

    @Column
    private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getProfRa() {
        return ProfRa;
    }

    public void setProfRa(int profra) {
        ProfRa = profra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
