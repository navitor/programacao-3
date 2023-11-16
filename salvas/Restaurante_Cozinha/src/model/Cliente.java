/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author alunos
 */
public class Cliente {
    int id;
    String nome;
    int mesa; //iniciando na mesa1
    
    int p1Q;// inicio Quantidades
    int p2Q;
    int p3Q;
    int p4Q;// fim Quantidades
    
    int p1P;
    int p2P;
    int p3P;
    int p4P;
   
    int status;

    
    public Cliente() {
    }

    public Cliente(int id, String nome, int mesa, int status) {
        this.id = id;
        this.nome = nome;
        this.mesa = mesa;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getMesa() {
        return mesa;
    }

    public int getStatus(){
        return status;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public void setStatus(int status) {
        this.status = status;
    }
       
   
    
}
