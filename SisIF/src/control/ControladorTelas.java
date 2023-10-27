/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import model.Usuario;
import view.TelaLogin;
import view.TelaProduto;
import view.TelaUsuario;

/**
 *
 * @author alunos
 */
public class ControladorTelas {
    Usuario user;
    
    JDesktopPane desktopPane;
    
    JLabel jPInfo;  
    
    public ControladorTelas(JDesktopPane desktopPane){
        this.desktopPane = desktopPane;
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
    
    public void TelaProduto(){
        desktopPane.removeAll();
        desktopPane.updateUI();
        Dimension resolucao = desktopPane.getSize();//captura a resolução do conteiner
        TelaProduto tp = new TelaProduto();
        tp.setSize(resolucao);
        tp.setLocation(0, 0);
        desktopPane.add(tp);
        tp.setVisible(true);
    }
    
    public void TelaLogin(){
        desktopPane.removeAll();
        desktopPane.updateUI();
        Dimension resolucao = desktopPane.getSize();//captura a resolução do conteiner
        TelaLogin tp = new TelaLogin();
        tp.setSize(resolucao);
        tp.setLocation(0, 0);
        desktopPane.add(tp);
        tp.setVisible(true);
    }
    
/*    
    public void TelaVenda(){
        desktopPane.removeAll();
        desktopPane.updateUI();
        Dimension resolucao = desktopPane.getSize();//captura a resolução do conteiner
        TelaVenda tp = new TelaVenda();
        tp.setSize(resolucao);
        tp.setLocation(0, 0);
        desktopPane.add(tp);
        tp.setVisible(true);
    }
*/    
    
    public void usuario(Usuario x) {
        user = x;
        if(user.getPapel()==0){
            carregarAdm();
        }

        
    }

    private void carregarAdm() {
        jPInfo.setText("Olá"+user.getNome()+"\n"+"--"+user.getPapel());
    }
    
    
    public void inicio(){
        desktopPane.removeAll();
        desktopPane.updateUI();
    }
    
}
