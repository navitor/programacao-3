
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import BD.BD_Cliente;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import modelo.Cliente;

/**
 *
 * @author alunos
 */
public class ControlCliente {
    JTextField jTNome;
    JComboBox<String> jCMesa;
    
    JTextField jTP1Q;
    JTextField jTP2Q;
    JTextField jTP3Q;
    JTextField jTP4Q;
    
    JTextField jTP1P;
    JTextField jTP2P;
    JTextField jTP3P;
    JTextField jTP4P;
    
    JTextArea jTAInfo;
    
    ArrayList<Cliente> BDClientes = new ArrayList<>();
    DefaultListModel ListaTelaCliente = new DefaultListModel();

    BD_Cliente bd_Cliente = new BD_Cliente();

    public ControlCliente(JTextField jTNome, JComboBox<String> jCMesa, JTextField jTP1Q, JTextField jTP2Q, JTextField jTP3Q, JTextField jTP4Q, JTextField jTP1P, JTextField jTP2P, JTextField jTP3P, JTextField jTP4P, JTextArea jTAInfo) {
        this.jTNome = jTNome;
        this.jCMesa = jCMesa;
        this.jTP1Q = jTP1Q;
        this.jTP2Q = jTP2Q;
        this.jTP3Q = jTP3Q;
        this.jTP4Q = jTP4Q;
        this.jTP1P = jTP1P;
        this.jTP2P = jTP2P;
        this.jTP3P = jTP3P;
        this.jTP4P = jTP4P;
        this.jTAInfo = jTAInfo;
    }
    
    
    public int novoID(){
        BDClientes = bd_Cliente.carregarBanco();
        return BDClientes.size() +1;
    }
    
    public void salvarEditarCliente(){
        int id = novoID();
        String nome = jTNome.getText();
        
        
    }
    
    
    
}
