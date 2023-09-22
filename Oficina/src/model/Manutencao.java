/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author alunos
 */
public class Manutencao implements Serializable {
    int id;
    int kms;
    Carro carro;

    public Manutencao() {
    }

    public Manutencao(int id, int kms, Carro carro) {
        this.id = id;
        this.kms = kms;
        this.carro = carro;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public int getId() {
        return id;
    }

    public int getKms() {
        return kms;
    }

    public Carro getCarro() {
        return carro;
    }
 
    
    
}
