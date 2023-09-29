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
public class Produto implements Serializable{
    int id;
    String nome;
    int qtdEstoque;
    float value;

    public Produto() {
    }

    public Produto(int id, String nome, int qtdEstoque, float value) {
        this.id = id;
        this.nome = nome;
        this.qtdEstoque = qtdEstoque;
        this.value = value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public float getValue() {
        return value;
    }
    
    
}
