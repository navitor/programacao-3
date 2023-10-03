/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import view.TelaCliente;
import view.TelaProduto;

/**
 *
 * @author alunos
 */
public class ControladorTelas {
    JDesktopPane desktopPane;
    
    public ControladorTelas(JDesktopPane desktopPane){
        this.desktopPane = desktopPane;
    }

    public void TelaCliente(){
        desktopPane.removeAll();
        desktopPane.updateUI();
        Dimension resolucao = desktopPane.getSize();//captura a resolução do conteiner
        TelaCliente t = new TelaCliente();
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
    
    public void inicio(){
        desktopPane.removeAll();
        desktopPane.updateUI();
    }
    
}
