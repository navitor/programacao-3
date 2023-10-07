/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import BD.BD_Usuario;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.Usuario;

/**
 *
 * @author alunos
 */
public class ControladorUsuario {

    JTextField jTid;
    JTextField jTNome;
    JPasswordField jPSenha;
    JTextField jTEmail;
    JComboBox<String> jCPapel;
    
    JList<String> jLUsuarios;
    JButton jBSalvarEditar;

    ArrayList<Usuario> BDUsuarios = new ArrayList<>();
    DefaultListModel ListaTelaUsuario = new DefaultListModel();

    BD_Usuario bd_usuario = new BD_Usuario();

    public ControladorUsuario(JTextField jTid, JTextField jTNome, JPasswordField jTSenha, JTextField jTEmail, JComboBox<String> jCPapel, JList<String> jLUsuarios, JButton jBSalvarEditar) {
        this.jTid = jTid;
        this.jTNome = jTNome;
        this.jPSenha = jTSenha;
        this.jTEmail = jTEmail;
        this.jCPapel = jCPapel;
        this.jLUsuarios = jLUsuarios;
        this.jBSalvarEditar = jBSalvarEditar;
        
        
        novoID();
        carregarLista();
    }



    public void novoID() {
        BDUsuarios = bd_usuario.carregarBanco();
        int tamanhoArray = BDUsuarios.size();
        jTid.setText((tamanhoArray + 1) + "");

        carregarLista();
        limpar();
    }

    public int pegarIndex(Usuario usuario) {
        int index = 0;
        for (Usuario user : BDUsuarios) {            
            if (user.getId() == usuario.getId()) {
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
        ListaTelaUsuario = new DefaultListModel();
        ArrayList<String> ListaTelaAtualizada = new ArrayList<>();
        for (Usuario user1 : BDUsuarios) {
            ListaTelaAtualizada.add(user1.getNome() + " (" + user1.getId() + ")");
        }
        Collections.sort(ListaTelaAtualizada);
        ListaTelaUsuario.addAll(ListaTelaAtualizada);
        jLUsuarios.setModel(ListaTelaUsuario);
    }

    public void limpar() {
        jTNome.setText("");
        jTNome.setBackground(Color.WHITE);
        jTEmail.setText("");
        jTEmail.setBackground(Color.WHITE);
        jPSenha.setText("");
        jPSenha.setBackground(Color.WHITE);
        jBSalvarEditar.setText("Salvar");
    }

    public void salvarEditarCliente() {
        String nId = jTid.getText();
        String nome = jTNome.getText();
        String email = jTEmail.getText();
        int papel = jCPapel.getSelectedIndex();
        String senha = String.copyValueOf(jPSenha.getPassword());
        
        boolean verificador = true;

        if (campoVazio(nome)) {
            JOptionPane.showMessageDialog(null, "O campo Nome não pode ser vazio");
            jTNome.setBackground(Color.red);
            verificador = false;
        }
        if (verificador) {
            //SALVAR
            Usuario usuario = new Usuario(Integer.parseInt(nId), nome, senha, email, papel);

            if (jBSalvarEditar.getText().compareToIgnoreCase("Salvar") == 0) {
                BDUsuarios.add(usuario);

            } else {
                int index = pegarIndex(usuario);
                BDUsuarios.set(index, usuario);
            }
            limpar();
            carregarLista();
            bd_usuario.salvarBanco(BDUsuarios);
            novoID();
        }
    }

    public void editar() {
        String temp = jLUsuarios.getSelectedValue();
        int indexInicioConsulta = temp.indexOf("(", 2);
        int indexFinalConsulta = temp.indexOf(")", 2);
        String res = temp.substring(indexInicioConsulta + 1, indexFinalConsulta);
        int id = Integer.parseInt(res);
        Usuario userEditar = buscar(id);

        jTid.setText(userEditar.getId() + "");
        jTNome.setText(userEditar.getNome());
        jTEmail.setText(userEditar.getEmail());
        jCPapel.setSelectedIndex(userEditar.getPapel());
        
        jBSalvarEditar.setText("Editar");
    }

    public Usuario buscar(int id) {
        for (Usuario user1 : BDUsuarios) {
            if (user1.getId() == id) {
                return user1;
            }
        }
        return null;
    }
    
    //Login
    JTextField jTLEmail;
    JPasswordField jPLSenha;
    JLabel jLLinfo;

    public ControladorUsuario(JTextField jTLEmail, JPasswordField jPLSenha, JLabel jLLinfo) {
        this.jTLEmail = jTLEmail;
        this.jPLSenha = jPLSenha;
        this.jLLinfo = jLLinfo;
        
        BDUsuarios = bd_usuario.carregarBanco();
        
    }


    
    public Usuario FazerLogin(){
        String email= jTLEmail.getText();
        String senha= String.copyValueOf(jPLSenha.getPassword());
        String msg= jLLinfo.getText();
        
            for(Usuario usu : BDUsuarios){
                if(usu.getEmail().compareToIgnoreCase(email)==0){
                    if(usu.getSenha().compareTo(senha)==0){
                       return usu; 
                    }
                }
            }
            jLLinfo.setText("Email ou Senha Incorretos");
            
            
        return null; 
    }
    
    
}
