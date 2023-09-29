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
import model.Cliente;
import model.Produto;

/**
 *
 * @author alunos
 */
public class BD_Produto {
    public int salvarBanco(ArrayList<Produto> dados) {
        try {
            FileOutputStream fs = new FileOutputStream("ProdutoBanco.vgr");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(dados);
            os.close();
            return 0;
        } catch (Exception ex) {
            ex.printStackTrace();
            return -1;
        }
    }

    public ArrayList<Produto> carregarBanco() {
        ArrayList<Produto> dados = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("ProdutoBanco.vgr");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object ob = ois.readObject();

            dados = (ArrayList<Produto>) ob;
            ois.close();
            return dados;
        } catch (Exception ex) {
            ex.printStackTrace();
            return dados;
        }
    }
    
}
