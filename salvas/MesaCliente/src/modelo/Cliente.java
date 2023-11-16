/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author alunos
 */
public class Cliente {
    int id; 
    String nome;
    int mesa; // Iniciando na mesa 1
    int p1Q;
    int p2Q;
    int p3Q;
    int p4Q;
    int p1P;
    int p2P;
    int p3P;
    int p4P;
    int status;

    public Cliente(int id, String nome, int mesa, int status) {
        this.id = id;
        this.nome = nome;
        this.mesa = mesa;
        this.status = status;
    }

    
    
    
    
}
