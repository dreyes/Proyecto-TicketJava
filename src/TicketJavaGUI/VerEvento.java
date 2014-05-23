/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TicketJavaGUI;

import Eventos.AdmEventos;
import Eventos.Evento;
import javax.swing.JOptionPane;

/**
 *
 * @author DReyes
 */
public class VerEvento extends javax.swing.JFrame {

    AdmEventos eventos;
    Evento eve;
    
    public VerEvento(AdmEventos admeve){
        eventos = new AdmEventos();
        eventos = admeve;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_tituloBuscEve = new javax.swing.JLabel();
        txt_codigoBuscEve = new javax.swing.JTextField();
        btn_verEvento = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_txtArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbl_tituloBuscEve.setText("Codigo");

        txt_codigoBuscEve.setToolTipText("Usuario");

        btn_verEvento.setText("Ver Evento");
        btn_verEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verEventoActionPerformed(evt);
            }
        });

        ta_txtArea.setColumns(20);
        ta_txtArea.setLineWrap(true);
        ta_txtArea.setRows(5);
        ta_txtArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(ta_txtArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(lbl_tituloBuscEve)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_codigoBuscEve, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_verEvento)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigoBuscEve, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tituloBuscEve)
                    .addComponent(btn_verEvento))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_verEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verEventoActionPerformed

        String codigo = txt_codigoBuscEve.getText();
        int c = Integer.parseInt(codigo);
        eve = eventos.buscarEvento(c);
        if(eve != null){
            ta_txtArea.setText(eve.toString());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Evento no existe!"
                , "Error al Buscar", WIDTH);
        }
    }//GEN-LAST:event_btn_verEventoActionPerformed

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
            java.util.logging.Logger.getLogger(VerEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerEvento(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_verEvento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_tituloBuscEve;
    private javax.swing.JTextArea ta_txtArea;
    private javax.swing.JTextField txt_codigoBuscEve;
    // End of variables declaration//GEN-END:variables
}