/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TicketJavaGUI;

import Eventos.AdmEventos;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.Calendar;
import static java.util.Calendar.getInstance;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author DReyes
 */
public class AdministradorEventos extends javax.swing.JFrame {

    AdmEventos eventos;
    private EventUserInterface nInterface;
    
    public AdministradorEventos() {
        eventos = new AdmEventos();
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

        Editar = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lbl_codigoCrearEve = new javax.swing.JLabel();
        txt_codigoCrearEve = new javax.swing.JTextField();
        lbl_tituloCrearEve = new javax.swing.JLabel();
        txt_tituloCrearEve = new javax.swing.JTextField();
        lbl_descCrearEve = new javax.swing.JLabel();
        txt_descCrearEve = new javax.swing.JTextField();
        lbl_fechaCrearEve = new javax.swing.JLabel();
        txt_fechaCrearEve = new javax.swing.JTextField();
        lbl_tipoCrearEve = new javax.swing.JLabel();
        combo_tipoCrearEve = new javax.swing.JComboBox();
        btn_crearEvento = new javax.swing.JButton();
        lbl_rentaCrearEve = new javax.swing.JLabel();
        txt_rentaCrearEve = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lbl_codigoEditEve = new javax.swing.JLabel();
        txt_codigoEditEve = new javax.swing.JTextField();
        lbl_tituloEditEve = new javax.swing.JLabel();
        txt_tituloEditEve = new javax.swing.JTextField();
        lbl_descEditEve = new javax.swing.JLabel();
        txt_descEditEve = new javax.swing.JTextField();
        lbl_fechaEditEve = new javax.swing.JLabel();
        txt_fechaEditEve = new javax.swing.JTextField();
        lbl_rentEditEve = new javax.swing.JLabel();
        txt_rentEditEve = new javax.swing.JTextField();
        lbl_tipoEditEve = new javax.swing.JLabel();
        combo_tipoEditEve = new javax.swing.JComboBox();
        btn_editarEvento = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_tituloBuscEve = new javax.swing.JLabel();
        txt_codigoBuscEve = new javax.swing.JTextField();
        btn_buscarEvento = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbl_codigoElimEve = new javax.swing.JLabel();
        txt_codigoElimEve = new javax.swing.JTextField();
        btn_elimEvento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbl_codigoCrearEve.setText("Codigo");

        txt_codigoCrearEve.setToolTipText("Usuario");
        txt_codigoCrearEve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoCrearEveActionPerformed(evt);
            }
        });

        lbl_tituloCrearEve.setText("Titulo");

        txt_tituloCrearEve.setToolTipText("Usuario");

        lbl_descCrearEve.setText("Descripción");

        lbl_fechaCrearEve.setText("Fecha de Evento");

        txt_fechaCrearEve.setToolTipText("Usuario");

        lbl_tipoCrearEve.setText("Tipo");

        combo_tipoCrearEve.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Deportivo", "Musical", "Religioso" }));
        combo_tipoCrearEve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tipoCrearEveActionPerformed(evt);
            }
        });

        btn_crearEvento.setText("Crear Evento");
        btn_crearEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearEventoActionPerformed(evt);
            }
        });

        lbl_rentaCrearEve.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_rentaCrearEve.setText("Renta");

        txt_rentaCrearEve.setToolTipText("Usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btn_crearEvento))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_descCrearEve)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_descCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_tituloCrearEve)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_tituloCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_codigoCrearEve)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_codigoCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_rentaCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_tipoCrearEve)
                                    .addComponent(lbl_fechaCrearEve))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_rentaCrearEve)
                                    .addComponent(txt_fechaCrearEve)
                                    .addComponent(combo_tipoCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigoCrearEve)
                    .addComponent(txt_codigoCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tituloCrearEve)
                    .addComponent(txt_tituloCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_descCrearEve)
                    .addComponent(txt_descCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_fechaCrearEve)
                    .addComponent(txt_fechaCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_rentaCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_rentaCrearEve))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_tipoCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tipoCrearEve))
                .addGap(18, 18, 18)
                .addComponent(btn_crearEvento)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        Editar.addTab("Crear", jPanel1);

        lbl_codigoEditEve.setText("Codigo");

        txt_codigoEditEve.setToolTipText("Usuario");
        txt_codigoEditEve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoEditEveActionPerformed(evt);
            }
        });

        lbl_tituloEditEve.setText("Titulo");

        txt_tituloEditEve.setToolTipText("Usuario");

        lbl_descEditEve.setText("Descripción");

        lbl_fechaEditEve.setText("Fecha de Evento");

        txt_fechaEditEve.setToolTipText("Usuario");

        lbl_rentEditEve.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_rentEditEve.setText("Renta");

        txt_rentEditEve.setToolTipText("Usuario");

        lbl_tipoEditEve.setText("Tipo");

        combo_tipoEditEve.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Deportivo", "Musical", "Religioso" }));
        combo_tipoEditEve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tipoEditEveActionPerformed(evt);
            }
        });

        btn_editarEvento.setText("Editar Evento");
        btn_editarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarEventoActionPerformed(evt);
            }
        });

        lbl_tituloBuscEve.setText("Codigo");

        txt_codigoBuscEve.setToolTipText("Usuario");
        txt_codigoBuscEve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoBuscEveActionPerformed(evt);
            }
        });

        btn_buscarEvento.setText("Buscar Evento");
        btn_buscarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarEventoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_tituloBuscEve)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_codigoBuscEve, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscarEvento)
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btn_editarEvento))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_rentEditEve, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_tipoEditEve)
                            .addComponent(lbl_fechaEditEve)
                            .addComponent(lbl_descEditEve)
                            .addComponent(lbl_tituloEditEve)
                            .addComponent(lbl_codigoEditEve))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(combo_tipoEditEve, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_codigoEditEve)
                            .addComponent(txt_tituloEditEve)
                            .addComponent(txt_fechaEditEve)
                            .addComponent(txt_descEditEve)
                            .addComponent(txt_rentEditEve, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigoBuscEve, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tituloBuscEve)
                    .addComponent(btn_buscarEvento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigoEditEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_codigoEditEve))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tituloEditEve)
                    .addComponent(txt_tituloEditEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_descEditEve)
                    .addComponent(txt_descEditEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_fechaEditEve)
                    .addComponent(txt_fechaEditEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_rentEditEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_rentEditEve))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_tipoEditEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tipoEditEve))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_editarEvento)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        Editar.addTab("Editar", jPanel2);

        lbl_codigoElimEve.setText("Codigo");

        txt_codigoElimEve.setToolTipText("Usuario");
        txt_codigoElimEve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoElimEveActionPerformed(evt);
            }
        });

        btn_elimEvento.setText("Eliminar Evento");
        btn_elimEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_elimEventoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_elimEvento)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_codigoElimEve)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_codigoElimEve, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(96, 96, 96))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigoElimEve)
                    .addComponent(txt_codigoElimEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btn_elimEvento)
                .addGap(110, 110, 110))
        );

        Editar.addTab("Eliminar", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Editar)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_codigoCrearEveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoCrearEveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoCrearEveActionPerformed

    private void combo_tipoCrearEveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tipoCrearEveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_tipoCrearEveActionPerformed

    private void btn_crearEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearEventoActionPerformed
        String codigo = txt_codigoCrearEve.getText();
        String titulo = txt_tituloCrearEve.getText();
        String desc = txt_descCrearEve.getText();
        Calendar fecha = getInstance();
        String renta = txt_rentaCrearEve.getText();
        String tipo = combo_tipoCrearEve.getSelectedItem().toString();
        
        if(eventos.crearEvento(codigo, titulo, desc, renta, fecha, tipo)){
            
            txt_codigoCrearEve.setText("");
            txt_tituloCrearEve.setText("");
            txt_descCrearEve.setText("");
            txt_rentaCrearEve.setText("");
            
            if(nInterface != null){
                nInterface.EventoCreado(codigo);
            }
            
            JOptionPane.showMessageDialog(rootPane, "Evento creado satisfactoriamente!"
                        , "Administrador de Eventos", WIDTH);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Codigo de Evento ya existe!"
                        , "Error al Crear", WIDTH);
        }
    }//GEN-LAST:event_btn_crearEventoActionPerformed

    private void txt_codigoEditEveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoEditEveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoEditEveActionPerformed

    private void combo_tipoEditEveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tipoEditEveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_tipoEditEveActionPerformed

    private void btn_editarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editarEventoActionPerformed

    private void txt_codigoBuscEveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoBuscEveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoBuscEveActionPerformed

    private void btn_buscarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarEventoActionPerformed

    private void txt_codigoElimEveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoElimEveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoElimEveActionPerformed

    private void btn_elimEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_elimEventoActionPerformed
        String codigo = txt_codigoElimEve.getText();
        if(nInterface != null){
            
            int cod = Integer.parseInt(codigo);
            if(eventos.buscarEvento(cod) != null){
                txt_codigoElimEve.setText("");

                if(nInterface.EventoEliminado(codigo)){
                    eventos.eliminarEvento(codigo);
                    JOptionPane.showMessageDialog(rootPane, "Evento eliminado satisfactoriamente!"
                            , "Administrador de Eventos", WIDTH);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Evento no fue creado por Usuario!"
                            , "Error al Eliminar", WIDTH);
                }
            }else {
                JOptionPane.showMessageDialog(rootPane, "Codigo de Evento no existe!"
                        , "Error al Eliminar", WIDTH);
            }
        }
    }//GEN-LAST:event_btn_elimEventoActionPerformed

    public void setNInterface(EventUserInterface i){
        this.nInterface = i;
    }
    
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
            java.util.logging.Logger.getLogger(AdministradorEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministradorEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministradorEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministradorEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministradorEventos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Editar;
    private javax.swing.JButton btn_buscarEvento;
    private javax.swing.JButton btn_crearEvento;
    private javax.swing.JButton btn_editarEvento;
    private javax.swing.JButton btn_elimEvento;
    private javax.swing.JComboBox combo_tipoCrearEve;
    private javax.swing.JComboBox combo_tipoEditEve;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_codigoCrearEve;
    private javax.swing.JLabel lbl_codigoEditEve;
    private javax.swing.JLabel lbl_codigoElimEve;
    private javax.swing.JLabel lbl_descCrearEve;
    private javax.swing.JLabel lbl_descEditEve;
    private javax.swing.JLabel lbl_fechaCrearEve;
    private javax.swing.JLabel lbl_fechaEditEve;
    private javax.swing.JLabel lbl_rentEditEve;
    private javax.swing.JLabel lbl_rentaCrearEve;
    private javax.swing.JLabel lbl_tipoCrearEve;
    private javax.swing.JLabel lbl_tipoEditEve;
    private javax.swing.JLabel lbl_tituloBuscEve;
    private javax.swing.JLabel lbl_tituloCrearEve;
    private javax.swing.JLabel lbl_tituloEditEve;
    private javax.swing.JTextField txt_codigoBuscEve;
    private javax.swing.JTextField txt_codigoCrearEve;
    private javax.swing.JTextField txt_codigoEditEve;
    private javax.swing.JTextField txt_codigoElimEve;
    private javax.swing.JTextField txt_descCrearEve;
    private javax.swing.JTextField txt_descEditEve;
    private javax.swing.JTextField txt_fechaCrearEve;
    private javax.swing.JTextField txt_fechaEditEve;
    private javax.swing.JTextField txt_rentEditEve;
    private javax.swing.JTextField txt_rentaCrearEve;
    private javax.swing.JTextField txt_tituloCrearEve;
    private javax.swing.JTextField txt_tituloEditEve;
    // End of variables declaration//GEN-END:variables
}
