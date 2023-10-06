/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import BD.BD_Cliente;
import BD.BD_Produto;
import BD.BD_Vendas;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextField;
import model.Cliente;
import model.Produto;
import model.Venda;

/**
 *
 * @author alunos
 */
public class ControladorVendas {
    JTextField jTIdVenda;
    JTextField jTIdCliente;
    JTextField jTNomeCliente;
    JList<String> JListClient;
    JTextField jTIdProduto;
    JTextField jTNomeProduto;
    JTextField jTQtdProduto;
    JTextField jTValorProduto;
    JList<String> JListProduto;
    JButton jBcomprar;
    
    ArrayList<Cliente> BDClientes = new ArrayList<>();
    DefaultListModel ListaTelaCliente = new DefaultListModel();
    BD_Cliente bd_Cliente = new BD_Cliente();
    
    ArrayList<Venda> BDVendas = new ArrayList<>();
    DefaultListModel ListaTelaVendas = new DefaultListModel();
    BD_Vendas bd_Vendas = new BD_Vendas();
    
        
    ArrayList<Produto> BDProduto = new ArrayList<>();
    DefaultListModel ListaTelaProduto = new DefaultListModel();
    BD_Produto bd_Produto = new BD_Produto();

    public ControladorVendas(JTextField jTIdVenda, JTextField jTIdCliente, JTextField jTNomeCliente, JList<String> JListClient, JTextField jTIdProduto, JTextField jTNomeProduto, JTextField jTQtdProduto, JTextField jTValorProduto, JButton jBcomprar) {
        this.jTIdVenda = jTIdVenda;
        this.jTIdCliente = jTIdCliente;
        this.jTNomeCliente = jTNomeCliente;
        this.JListClient = JListClient;
        this.jTIdProduto = jTIdProduto;
        this.jTNomeProduto = jTNomeProduto;
        this.jTQtdProduto = jTQtdProduto;
        this.jTValorProduto = jTValorProduto;
        this.jBcomprar = jBcomprar;
        
        novoID();
        carregarLista();        
    }
    
    public int pegarIndex(Venda venda) {
        int index = 0;
        for (Venda sell1 : BDVendas) {
            if (sell1.getId() == venda.getId()) {
                break;
            }
            index++;
        }
        return index;
    }
    
    public void novoID() {
        BDVendas = bd_Vendas.carregarBanco();
        int tamanhoArray = BDVendas.size();
        jTIdCliente.setText((tamanhoArray + 1) + "");

        carregarLista();
        limpar();
    }
    
    public void editar() {
        String temp = JListClient.getSelectedValue();
        int indexInicioConsulta = temp.indexOf("(", 2);
        int indexFinalConsulta = temp.indexOf(")", 2);
        String res = temp.substring(indexInicioConsulta + 1, indexFinalConsulta);
        int id = Integer.parseInt(res);
        Cliente clienteEditar = buscarCliente(id);
        Produto produtoEditar = buscarProduto(id);

        jTIdCliente.setText(clienteEditar.getId() + "");
        jTNomeCliente.setText(clienteEditar.getNome());
        jTIdProduto.setText(produtoEditar.getId() + "");
        jTNomeProduto.setText(produtoEditar.getNome());
        jTQtdProduto.setText(produtoEditar.getQtdEstoque() + "");
        jTValorProduto.setText(produtoEditar.getValue() + "");
        jBcomprar.setText("Editar");
    }
   
    
    public Cliente buscarCliente(int id) {
        for (Cliente cliente1 : BDClientes) {
            if (cliente1.getId() == id) {
                return cliente1;
            }
        }
        return null;
    }
    
    public Produto buscarProduto(int id) {
        for (Produto produto1 : BDProduto) {
            if (produto1.getId() == id) {
                return produto1;
            }
        }
        return null;
    }
    
    
}
