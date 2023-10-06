/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import model.Venda;

/**
 *
 * @author alunos
 */
public class BD_Vendas {
    public int salvarBanco(ArrayList<Venda> dados) {
        try {
            FileOutputStream fs = new FileOutputStream("VendaBanco.vgr");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(dados);
            os.close();
            return 0;
        } catch (Exception ex) {
            ex.printStackTrace();
            return -1;
        }
    }

    public ArrayList<Venda> carregarBanco() {
        ArrayList<Venda> dados = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("VendaBanco.vgr");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object ob = ois.readObject();

            dados = (ArrayList<Venda>) ob;
            ois.close();
            return dados;
        } catch (Exception ex) {
            ex.printStackTrace();
            return dados;
        }
    }
}
