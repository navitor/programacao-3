/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import BD.BD_Carro;
import BD.BD_Manutencao;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Carro;
import model.Manutencao;

/**
 *
 * @author alunos
 */
public final class Manu_Control {

    JTextField jTID;
    JTextField jTIDCarro;
    JTextField jTPlaca;
    JTextField jTKms;
    JTextField jTKmsManu;

    JButton jBSalvarRemover;

    JList<String> jTListCarro;
    JList<String> jTListManu;

    ArrayList<Carro> BDCarro = new ArrayList<>();
    ArrayList<Manutencao> BDManu = new ArrayList<>();

    DefaultListModel ListaTelaCarro = new DefaultListModel();
    DefaultListModel ListaTelaManu = new DefaultListModel();

    BD_Carro bdCarro = new BD_Carro();
    BD_Manutencao bdManu = new BD_Manutencao();

    public Manu_Control(JTextField jTID, JTextField jTIDCarro, JTextField jTPlaca, JTextField jTKms, JTextField jTKmsManu, JButton jBSalvarRemover, JList<String> jTListCarro, JList<String> jTListManu) {
        this.jTID = jTID;
        this.jTIDCarro = jTIDCarro;
        this.jTPlaca = jTPlaca;
        this.jTKms = jTKms;
        this.jTKmsManu = jTKmsManu;
        this.jBSalvarRemover = jBSalvarRemover;
        this.jTListCarro = jTListCarro;
        this.jTListManu = jTListManu;

        BDCarro = bdCarro.carregarBanco();
        carregarListaCarro();

        BDManu = bdManu.carregarBanco();
        novoID();

    }

    public void novoID() {
        BDCarro = bdCarro.carregarBanco();
        BDManu = bdManu.carregarBanco();
        int tamanhoArray = BDManu.size();
        jTID.setText((tamanhoArray + 1) + "");
        jTIDCarro.setText("");
        jTPlaca.setText("");
        jTKms.setText("");
        jTKmsManu.setText("");

        carregarListaCarro();
    }

    public void carregarListaCarro() {
        ListaTelaCarro = new DefaultListModel();

        ArrayList<String> ListaTelaAtualizada = new ArrayList<>();

        for (Carro carro1 : BDCarro) {
            ListaTelaAtualizada.add(carro1.getPlaca() + " (" + carro1.getId() + ")");
        }

        Collections.sort(ListaTelaAtualizada);

        ListaTelaCarro.addAll(ListaTelaAtualizada);
        jTListCarro.setModel(ListaTelaCarro);

    }

    
    public void selecionarCarro() {
        String temp = jTListCarro.getSelectedValue();
        int indexInicioConsulta = temp.indexOf("(", 2);
        int indexFinalConsulta = temp.indexOf(")", 2);

        String res = temp.substring(indexInicioConsulta + 1, indexFinalConsulta);

        int id = Integer.parseInt(res);

        Carro carroSelect = buscarCarro(id);

        jTIDCarro.setText(carroSelect.getId() + "");
        jTPlaca.setText(carroSelect.getPlaca() + "");
        jTKms.setText(carroSelect.getKms() + "");
        jTKmsManu.setText(carroSelect.getKms() + "");
        jBSalvarRemover.setText("Salvar");
    }

    public Carro buscarCarro(int id) {
        for (Carro carro1 : BDCarro) {
            if (carro1.getId() == id) {
                return carro1;
            }
        }
        return null;
    }

    public void salvarManu() {
        String nId = jTID.getText();
        String nIdCarro = jTIDCarro.getText();

        Carro car = buscarCarro(Integer.parseInt(nId));

        //SALVAR
        Manutencao manu = new Manutencao(Integer.parseInt(nId), car.getKms(), car);

        BDManu.add(manu);
        
        bdManu.salvarBanco(BDManu);
        
        novoID();
        
    }
    
}

