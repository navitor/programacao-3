/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.Dimension;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import model.Usuario;
import view.TelaUsuario;
import view.TelaLogin;

/**
 *
 * @author alunos
 */
public class ControladorTelas {
    Usuario user;
    
    JDesktopPane desktopPane;
    JMenuItem jMLogin;
    JMenuItem jMSair;
    JMenuItem jMEstoque;
    JMenuItem jMUsuario;
    JMenuItem jMProduto;
    
    JButton jBEstoque;
    JButton jBUsuario;
    JButton jBProduto;
    JButton jBLogin;
    JButton jBSair;
    
    JLabel jLInfo;    

    public ControladorTelas(JDesktopPane desktopPane, JMenuItem jMLogin, JMenuItem jMSair, JMenuItem jMEstoque, JMenuItem jMUsuario, JMenuItem jMProduto, JButton jBEstoque, JButton jBUsuario, JButton jBProduto, JButton jBLogin, JButton jBSair, JLabel jLInfo) {
        this.desktopPane = desktopPane;
        this.jMLogin = jMLogin;
        this.jMSair = jMSair;
        this.jMEstoque = jMEstoque;
        this.jMUsuario = jMUsuario;
        this.jMProduto = jMProduto;
        this.jBEstoque = jBEstoque;
        this.jBUsuario = jBUsuario;
        this.jBProduto = jBProduto;
        this.jBLogin = jBLogin;
        this.jBSair = jBSair;
        this.jLInfo = jLInfo;
    }
    

    public void TelaUsuario(){
        desktopPane.removeAll();
        desktopPane.updateUI();
        Dimension resolucao = desktopPane.getSize();//captura a resolução do conteiner
        TelaUsuario t = new TelaUsuario();
        t.setSize(resolucao);
        t.setLocation(0, 0);
        desktopPane.add(t);
        t.setVisible(true);
    }
    
    public void TelaLogin(ControladorTelas controlTela){
        desktopPane.removeAll();
        desktopPane.updateUI();
        Dimension resolucao = desktopPane.getSize();//captura a resolução do conteiner
        TelaLogin tl = new TelaLogin(controlTela);
        tl.setSize(resolucao);
        tl.setLocation(0, 0);
        desktopPane.add(tl);
        tl.setVisible(true);
    }
    
    
    public void inicio(){
        desktopPane.removeAll();
        desktopPane.updateUI();
    }

    public void usuario(Usuario x) {
        user = x;
        if(user.getPapel()==0){
            carregarAdm();
        }

        
    }

    private void carregarAdm() {
        jLInfo.setText(user.getNome()+"  -- Administrador");
    }
    
    
    
}
