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
public class Usuario implements Serializable{
    int id;
    String nome;
    int papel;
/*-Papel
    0 = adm
    1 = caixa
    */
    
    public Usuario(){
        
    }

    public Usuario(int id, String nome, int papel) {
        this.id = id;
        this.nome = nome;
        this.papel = papel;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setPapel(int papel) {
        this.papel = papel;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }


    public int getPapel() {
        return papel;
    }
 
}
