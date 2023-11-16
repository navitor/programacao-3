/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.ControlCliente;
import java.awt.Color;
import ferramentas.data;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author alunos
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    data b;
    
    public main() {
        initComponents();
        runData();
        runHora();
    }
    
    public void runData() {
        b = new data();
        b.le_data();
        JLabelData.setText(b.dia_semana + ", " + b.dia + " de " + b.mes + " de " + b.ano);
    }
    
    public void runHora(){
        ActionListener action = new ActionListener() {

        public void actionPerformed(@SuppressWarnings("unused") java.awt.event.ActionEvent e) {
            b.le_hora();
            jLabelHora.setText((b.hora));
            }
            };
            Timer t = new Timer(1000, action);
            t.start();
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabbedPaneMain = new javax.swing.JTabbedPane();
        PanelCliente = new javax.swing.JPanel();
        LabelNome = new javax.swing.JLabel();
        FieldNome = new javax.swing.JTextField();
        ComboMesa = new javax.swing.JComboBox<>();
        LabelMesa = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        PanelPedido = new javax.swing.JPanel();
        jPanelPedido = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        FieldP1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FieldP2 = new javax.swing.JTextField();
        FieldP3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        FieldP4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanelComanda = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        FieldP1Comanda = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        FieldP2Comanda = new javax.swing.JTextField();
        FieldP3Comanda = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        FieldP4Comanda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaInfo = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        JLabelData = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TabbedPaneMain.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TabbedPaneMainStateChanged(evt);
            }
        });

        LabelNome.setText("Nome");

        ComboMesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        ComboMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboMesaActionPerformed(evt);
            }
        });

        LabelMesa.setText("Mesa");

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelClienteLayout = new javax.swing.GroupLayout(PanelCliente);
        PanelCliente.setLayout(PanelClienteLayout);
        PanelClienteLayout.setHorizontalGroup(
            PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelMesa)
                    .addComponent(FieldNome)
                    .addComponent(LabelNome)
                    .addComponent(ComboMesa, 0, 127, Short.MAX_VALUE))
                .addContainerGap(448, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        PanelClienteLayout.setVerticalGroup(
            PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClienteLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(LabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelMesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        TabbedPaneMain.addTab("Cliente", PanelCliente);

        jPanelPedido.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        jLabel3.setText("P1");

        FieldP1.setColumns(6);
        FieldP1.setText("Produto 1");
        FieldP1.setMinimumSize(new java.awt.Dimension(200, 23));

        jLabel4.setText("P2");

        FieldP2.setColumns(6);
        FieldP2.setText("Produto 2");

        FieldP3.setColumns(6);
        FieldP3.setText("Produto 3");

        jLabel5.setText("P3");

        jLabel6.setText("P4");

        FieldP4.setColumns(6);
        FieldP4.setText("Produto 4");

        jButton2.setText("Confirmar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPedidoLayout = new javax.swing.GroupLayout(jPanelPedido);
        jPanelPedido.setLayout(jPanelPedidoLayout);
        jPanelPedidoLayout.setHorizontalGroup(
            jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(25, 25, 25)
                .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FieldP4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldP3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldP2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldP1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPedidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanelPedidoLayout.setVerticalGroup(
            jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPedidoLayout.createSequentialGroup()
                .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(FieldP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(FieldP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(FieldP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(FieldP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelComanda.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        jLabel11.setText("P1");

        FieldP1Comanda.setColumns(6);
        FieldP1Comanda.setText("Produto 1");

        jLabel12.setText("P2");

        FieldP2Comanda.setColumns(6);
        FieldP2Comanda.setText("Produto 2");

        FieldP3Comanda.setColumns(6);
        FieldP3Comanda.setText("Produto 3");

        jLabel13.setText("P3");

        jLabel14.setText("P4");

        FieldP4Comanda.setColumns(6);
        FieldP4Comanda.setText("Produto 4");

        javax.swing.GroupLayout jPanelComandaLayout = new javax.swing.GroupLayout(jPanelComanda);
        jPanelComanda.setLayout(jPanelComandaLayout);
        jPanelComandaLayout.setHorizontalGroup(
            jPanelComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComandaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addGap(30, 30, 30)
                .addGroup(jPanelComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FieldP4Comanda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldP3Comanda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldP2Comanda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldP1Comanda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanelComandaLayout.setVerticalGroup(
            jPanelComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComandaLayout.createSequentialGroup()
                .addGroup(jPanelComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(FieldP1Comanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(FieldP2Comanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(FieldP3Comanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(FieldP4Comanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextAreaInfo.setColumns(20);
        jTextAreaInfo.setRows(5);
        jScrollPane1.setViewportView(jTextAreaInfo);

        javax.swing.GroupLayout PanelPedidoLayout = new javax.swing.GroupLayout(PanelPedido);
        PanelPedido.setLayout(PanelPedidoLayout);
        PanelPedidoLayout.setHorizontalGroup(
            PanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(PanelPedidoLayout.createSequentialGroup()
                        .addComponent(jPanelPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                        .addComponent(jPanelComanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelPedidoLayout.setVerticalGroup(
            PanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPedidoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelComanda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TabbedPaneMain.addTab("Pedido", PanelPedido);

        jPanel3.setBackground(new java.awt.Color(51, 255, 204));

        JLabelData.setText("jLabel1");

        jLabelHora.setText("00:00:00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabelData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelHora)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHora)
                    .addComponent(JLabelData))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TabbedPaneMain)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TabbedPaneMain)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboMesaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TabbedPaneMain.setSelectedIndex(1);
        LabelNome.setForeground(Color.BLACK);
        LabelMesa.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String p1 = FieldP1.getText();
        String p2 = FieldP2.getText();
        String p3 = FieldP3.getText();
        String p4 = FieldP4.getText();
        
        FieldP1Comanda.setText(p1);
        FieldP2Comanda.setText(p2);
        FieldP3Comanda.setText(p3);
        FieldP4Comanda.setText(p4);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void TabbedPaneMainStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TabbedPaneMainStateChanged
        int i = TabbedPaneMain.getSelectedIndex();
        if (i == 1) {
            String n = FieldNome.getText();
            int m = ComboMesa.getSelectedIndex();
            if (n.length() == 0) {
                LabelNome.setForeground(Color.RED);
            }
            if (m == 0) {
                LabelMesa.setForeground(Color.RED);
            }
            if (n.length() == 0 || m == 0) {
                TabbedPaneMain.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_TabbedPaneMainStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboMesa;
    private javax.swing.JTextField FieldNome;
    private javax.swing.JTextField FieldP1;
    private javax.swing.JTextField FieldP1Comanda;
    private javax.swing.JTextField FieldP2;
    private javax.swing.JTextField FieldP2Comanda;
    private javax.swing.JTextField FieldP3;
    private javax.swing.JTextField FieldP3Comanda;
    private javax.swing.JTextField FieldP4;
    private javax.swing.JTextField FieldP4Comanda;
    private javax.swing.JLabel JLabelData;
    private javax.swing.JLabel LabelMesa;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JPanel PanelCliente;
    private javax.swing.JPanel PanelPedido;
    private javax.swing.JTabbedPane TabbedPaneMain;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelComanda;
    private javax.swing.JPanel jPanelPedido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaInfo;
    // End of variables declaration//GEN-END:variables
ControlCliente controlUser;

public void inicio(){
   controlUser = new ControlCliente(FieldNome, ComboMesa, FieldP1, FieldP2, FieldP3, FieldP4, FieldP1Comanda, FieldP2Comanda, FieldP3Comanda, FieldP4Comanda, jTextAreaInfo);   
}

}