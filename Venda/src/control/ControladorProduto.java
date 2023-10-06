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
    
    public int pegarIndex(Produto produto) {
        int index = 0;
        for (Produto prod1 : BDProduto) {
            if (prod1.getId() == produto.getId()) {
                break;
            }
            index++;
        }
        return index;
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
        for (Produto produto1 : BDProduto){
            ListaTelaAtualizada.add(produto1.getNome() + " (" + produto1.getId() + ")");
        }
        Collections.sort(ListaTelaAtualizada);
        ListaTelaProduto.addAll(ListaTelaAtualizada);
        jLProdutos.setModel(ListaTelaProduto);
    }
    
    
    public void limpar() {
        jTNome.setText("");
        jTNome.setBackground(Color.WHITE);        
        jTQuantidade.setText("");
        jTValor.setText("");
        jBSalvar.setText("Salvar");
    }
    
    public boolean campoVazio(String temp) {
        return temp.isEmpty();
    }
    
    public boolean verificarTipoInt(String x){
        try {
            int y = Integer.parseInt(x);
            return false;
        } catch (Exception e) {
            return true;
        }
    }
    
    public boolean verificarTipoFloat(String x){
        try {
            float y = Float.parseFloat(x);
            return false;
        } catch (Exception e) {
            return true;
        }
    }
    
    public void salvarEditarProduto() {
        String nId = jTId.getText();
        String nome = jTNome.getText();
        String nQtd = jTQuantidade.getText();
        String nValor = jTValor.getText();
        
        boolean verificador = true;

        if (campoVazio(nome)) {
            JOptionPane.showMessageDialog(null, "O campo Nome não pode ser vazio");
            jTNome.setBackground(Color.red);
            verificador = false;
        } else if (campoVazio(nQtd)) {
            JOptionPane.showMessageDialog(null, "O campo Quantidade não pode ser vazio");
            jTQuantidade.setBackground(Color.red);
            verificador = false;
        } else if(campoVazio(nValor)) {
            JOptionPane.showMessageDialog(null, "O campo Valor não pode ser vazio");
            jTValor.setBackground(Color.red);
            verificador = false;
        } else if(verificarTipoInt(nQtd)){
            JOptionPane.showMessageDialog(null, "O campo Quantidade não pode ser vazio");
            jTQuantidade.setBackground(Color.red);
            verificador = false;
        } else if(verificarTipoFloat(nValor)){
            JOptionPane.showMessageDialog(null, "O campo Valor não pode ser vazio");
            jTValor.setBackground(Color.red);
            verificador = false;
        }
        
        if (verificador) {
            //SALVAR
            Produto produto1 = new Produto(Integer.parseInt(nId), nome, Integer.parseInt(nQtd),Float.parseFloat(nValor) );

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
        jTQuantidade.setText(produtoEditar.getQtdEstoque() + "");
        jTValor.setText(produtoEditar.getValue() + "");
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
    
    
}
