/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import BD.BD_Cliente;
import BD.BD_Produto;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextField;
import model.Cliente;
import model.Produto;

/**
 *
 * @author alunos
 */
public class ControladorProduto {
    JTextField jTId;
    JTextField jTNome;
    JTextField jTQuantidade;
    JTextField jTValor;
    JList<String> jLProdutos;
    JButton jBSalvar;
    
    ArrayList<Produto> BDProduto = new ArrayList<>();
    DefaultListModel ListaTelaProduto = new DefaultListModel();

    BD_Produto bd_Produto = new BD_Produto();

    public ControladorProduto(JTextField jTid, JTextField jTnome, JTextField jTquantidade, JTextField jTvalor, JList<String> jLProdutos, JButton jBSalvar) {
        this.jTId = jTid;
        this.jTNome = jTnome;
        this.jTQuantidade = jTquantidade;
        this.jTValor = jTvalor;
        this.jLProdutos = jLProdutos;
        this.jBSalvar = jBSalvar;
        
        novoID();
        carregarLista();
    }

    public void novoID() {
        BDProduto = bd_Produto.carregarBanco();
        int tamanhoArray = BDProduto.size();
        jTId.setText((tamanhoArray + 1) + "");

        carregarLista();
        limpar();
    }
    
    public void carregarLista() {
        ListaTelaProduto = new DefaultListModel();
        ArrayList<String> ListaTelaAtualizada = new ArrayList<>();
        for (Produto produto1 : BDProduto) {
            ListaTelaAtualizada.add(produto1.getNome() + " (" + produto1.getId() + ")");
        }
        Collections.sort(ListaTelaAtualizada);
        ListaTelaProduto.addAll(ListaTelaAtualizada);
        jLProdutos.setModel(ListaTelaProduto);
    }
    
    public void limpar() {
        jTNome.setText("");
        jTNome.setBackground(Color.WHITE);
        jBSalvar.setText("Salvar");
    }
    
}
