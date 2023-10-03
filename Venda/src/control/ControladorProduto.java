/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import BD.BD_Produto;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
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
    JButton jBNovo;
    
    ArrayList<Produto> BDProduto = new ArrayList<>();
    DefaultListModel ListaTelaProduto = new DefaultListModel();

    BD_Produto bd_Produto = new BD_Produto();

    public ControladorProduto(JTextField jTid, JTextField jTnome, JTextField jTquantidade, JTextField jTvalor, JList<String> jLProdutos, JButton jBSalvar, JButton jBNovo) {
        this.jTId = jTid;
        this.jTNome = jTnome;
        this.jTQuantidade = jTquantidade;
        this.jTValor = jTvalor;
        this.jLProdutos = jLProdutos;
        this.jBSalvar = jBSalvar;
        this.jBNovo = jBNovo;
        
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
    
    public int pegarIndex(Produto produto1) {
        int index = 0;
        for (Produto prod1 : BDProduto) {
            if (prod1.getId() == prod1.getId()) {
                break;
            }
            index++;
        }
        return index;
    }
    
    public void carregarLista() {
        ListaTelaProduto = new DefaultListModel();
        ArrayList<String> ListaTelaAtualizada = new ArrayList<>();
        for (Produto produto1 : BDProduto){
            ListaTelaAtualizada.add(produto1.getNome() + " (" + produto1.getId() + ")");
        }
        Collections.sort(ListaTelaAtualizada);
        ListaTelaProduto.addAll(ListaTelaAtualizada);
        jLProdutos.setModel(ListaTelaProduto);
    }
    
    
    public void limpar() {
        jTNome.setText("");
        jTQuantidade.setText("");
        jTValor.setText("");
        jTNome.setBackground(Color.WHITE);
        jBSalvar.setText("Salvar");
    }
    
    public boolean campoVazio(String temp) {
        return temp.isEmpty();
    }
    
    public void salvarEditarCliente() {
        String nId = jTId.getText();
        String nome = jTNome.getText();
        int nQtd = jTQuantidade.getComponentCount();
        float nValor = jTValor.getAlignmentX();
        
        boolean verificador = true;

        if (campoVazio(nome)) {
            JOptionPane.showMessageDialog(null, "O campo Nome não pode ser vazio");
            jTNome.setBackground(Color.red);
            verificador = false;
        }
        if (verificador) {
            //SALVAR
            Produto produto1 = new Produto(0, nome, 0, 0);

            if (jBSalvar.getText().compareToIgnoreCase("Salvar") == 0) {
                BDProduto.add(produto1);

            } else {
                int index = pegarIndex(produto1);
                BDProduto.set(index, produto1);
            }
            limpar();
            carregarLista();
            bd_Produto.salvarBanco(BDProduto);
            novoID();
        }
    }
    
    public void editar() {
        String temp = jLProdutos.getSelectedValue();
        int indexInicioConsulta = temp.indexOf("(", 2);
        int indexFinalConsulta = temp.indexOf(")", 2);
        String res = temp.substring(indexInicioConsulta + 1, indexFinalConsulta);
        int id = Integer.parseInt(res);
        Produto produtoEditar = buscar(id);

        jTId.setText(produtoEditar.getId() + "");
        jTNome.setText(produtoEditar.getNome());
        jBSalvar.setText("Editar");
    }
    
    public Produto buscar(int id) {
        for (Produto produto1 : BDProduto) {
            if (produto1.getId() == id) {
                return produto1;
            }
        }
        return null;
    }
    
    
    /*public void calcvalor(int qtd){
        float soma = jTQuantidade * jTValor;
        
    }
    */
    
}
