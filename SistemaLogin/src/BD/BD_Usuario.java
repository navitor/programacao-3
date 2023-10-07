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
import model.Usuario;

/**
 *
 * @author alunos
 */
public class BD_Usuario {
    public int salvarBanco(ArrayList<Usuario> dados) {
        try {
            FileOutputStream fs = new FileOutputStream("UsuarioBanco.vgr");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(dados);
            os.close();
            return 0;
        } catch (Exception ex) {
            ex.printStackTrace();
            return -1;
        }
    }

    public ArrayList<Usuario> carregarBanco() {
        ArrayList<Usuario> dados = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("UsuarioBanco.vgr");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object ob = ois.readObject();

            dados = (ArrayList<Usuario>) ob;
            ois.close();
            return dados;
        } catch (Exception ex) {
            ex.printStackTrace();
            return dados;
        }
    }
}
