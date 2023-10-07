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
    String senha;
    String email;
    int papel;
/*-Papel
    0 = adm
    1 = caixa
    2 = supervisor
    */
    
    public Usuario(){
        
    }

    public Usuario(int id, String nome, String senha, String email, int papel) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.papel = papel;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    public int getPapel() {
        return papel;
    }

 
}
