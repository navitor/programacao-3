/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import BD.BD_Cliente;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Cliente;

/**
 *
 * @author alunos
 */
public class ControladorCliente {

    JTextField jTid;
    JTextField jTNome;
    JList<String> jLClientes;
    JButton jBSalvarEditar;

    ArrayList<Cliente> BDClientes = new ArrayList<>();
    DefaultListModel ListaTelaCliente = new DefaultListModel();

    BD_Cliente bd_Cliente = new BD_Cliente();

    public ControladorCliente(JTextField jTid, JTextField jTNome, JList<String> jLClientes, JButton jBSalvarEditar) {
        this.jTid = jTid;
        this.jTNome = jTNome;
        this.jLClientes = jLClientes;
        this.jBSalvarEditar = jBSalvarEditar;

        novoID();
        carregarLista();

    }

    public void novoID() {
        BDClientes = bd_Cliente.carregarBanco();
        int tamanhoArray = BDClientes.size();
        jTid.setText((tamanhoArray + 1) + "");

        carregarLista();
        limpar();
    }

    public int pegarIndex(Cliente cliente) {
        int index = 0;
        for (Cliente cli : BDClientes) {
            if (cli.getId() == cliente.getId()) {
                break;
            }
            index++;
        }
        return index;
    }

    public boolean campoVazio(String temp) {
        return temp.isEmpty();
    }

    public void carregarLista() {
        ListaTelaCliente = new DefaultListModel();
        ArrayList<String> ListaTelaAtualizada = new ArrayList<>();
        for (Cliente cliente1 : BDClientes) {
            ListaTelaAtualizada.add(cliente1.getNome() + " (" + cliente1.getId() + ")");
        }
        Collections.sort(ListaTelaAtualizada);
        ListaTelaCliente.addAll(ListaTelaAtualizada);
        jLClientes.setModel(ListaTelaCliente);
    }

    public void limpar() {
        jTNome.setText("");
        jTNome.setBackground(Color.WHITE);
        jBSalvarEditar.setText("Salvar");
    }

    public void salvarEditarCliente() {
        String nId = jTid.getText();
        String nome = jTNome.getText();
        boolean verificador = true;

        if (campoVazio(nome)) {
            JOptionPane.showMessageDialog(null, "O campo Nome não pode ser vazio");
            jTNome.setBackground(Color.red);
            verificador = false;
        }
        if (verificador) {
            //SALVAR
            Cliente cliente = new Cliente(Integer.parseInt(nId), nome);

            if (jBSalvarEditar.getText().compareToIgnoreCase("Salvar") == 0) {
                BDClientes.add(cliente);

            } else {
                int index = pegarIndex(cliente);
                BDClientes.set(index, cliente);
            }
            limpar();
            carregarLista();
            bd_Cliente.salvarBanco(BDClientes);
            novoID();
        }
    }

    public void editar() {
        String temp = jLClientes.getSelectedValue();
        int indexInicioConsulta = temp.indexOf("(", 2);
        int indexFinalConsulta = temp.indexOf(")", 2);
        String res = temp.substring(indexInicioConsulta + 1, indexFinalConsulta);
        int id = Integer.parseInt(res);
        Cliente clienteEditar = buscar(id);

        jTid.setText(clienteEditar.getId() + "");
        jTNome.setText(clienteEditar.getNome());
        jBSalvarEditar.setText("Editar");
    }

    public Cliente buscar(int id) {
        for (Cliente cliente1 : BDClientes) {
            if (cliente1.getId() == id) {
                return cliente1;
            }
        }
        return null;
    }
}
