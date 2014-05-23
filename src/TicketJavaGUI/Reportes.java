/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TicketJavaGUI;

import Eventos.AdmEventos;
import Eventos.Evento;
import Eventos.EventoDeportivo;
import Eventos.EventoMusical;
import Eventos.EventoReligioso;
import Usuarios.Administrador;
import Usuarios.Usuario;
import Usuarios.UsuarioContenido;
import Usuarios.UsuarioLimitado;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DReyes
 */
public class Reportes extends javax.swing.JFrame {

    DefaultTableModel modelo;
    DefaultTableModel model1;
    DefaultTableModel model2;
    DefaultTableModel model3;
    DefaultTableModel model4;
    AdmEventos event;
    Usuario user;
    ArrayList al; 
    
    public Reportes(AdmEventos ae, Usuario usu, ArrayList arr) {
        
        int dep=0, mus=0, rel=0;
        int dep2=0, mus2=0, rel2=0;
        int dep3=0, mus3=0, rel3=0;
        double depo=0, musi=0, reli=0;
        double depo2=0, musi2=0, reli2=0;
        double depo3=0, musi3=0, reli3=0;
        Calendar cal = Calendar.getInstance();
        event = new AdmEventos();
        event = ae;
        user = usu;
        al = new ArrayList();
        al = arr;
        modelo = new DefaultTableModel();
        modelo.addColumn("CODIGO");
        modelo.addColumn("TIPO");
        modelo.addColumn("TITULO");
        modelo.addColumn("FECHA");
        modelo.addColumn("MONTO");
        model1 = new DefaultTableModel();
        model1.addColumn("CODIGO");
        model1.addColumn("TIPO");
        model1.addColumn("TITULO");
        model1.addColumn("FECHA");
        model1.addColumn("MONTO");
        model2 = new DefaultTableModel();
        model2.addColumn("CODIGO");
        model2.addColumn("TIPO");
        model2.addColumn("TITULO");
        model2.addColumn("FECHA");
        model2.addColumn("MULTA");
        model3 = new DefaultTableModel();
        model3.addColumn("ID");
        model3.addColumn("TIPO");
        model3.addColumn("TITULO");
        model3.addColumn("MONTO");
        model4 = new DefaultTableModel();
        model4.addColumn("CODIGO");
        model4.addColumn("TIPO");
        model4.addColumn("TITULO");
        model4.addColumn("FECHA");
        model4.addColumn("MONTO");
        initComponents();
        t_realizados.setModel(modelo);
        t_futuros.setModel(model1);
        t_cancelados.setModel(model2);
        t_usuario.setModel(model3);
        t_porfecha.setModel(model4);
        
        for(int x =0; x < event.getEventos().size(); x++){
            Evento n = event.getEventos().get(x);
            
            if(n.getFecha_evento().getTimeInMillis()<=cal.getTimeInMillis()){
                String cod = String.valueOf(n.getCodigo_evento());
                String tipo="";
                if (n instanceof EventoDeportivo){
                    tipo = "Evento Deportivo";
                    dep++;
                    depo += n.getRenta();
                } else if (n instanceof EventoMusical){
                    tipo = "Evento Musical";
                    mus++;
                    musi += n.getRenta();
                } else if (n instanceof EventoReligioso){
                    tipo = "Evento Religioso";
                    rel++;
                    reli += n.getRenta();
                }
                String tit = n.getTitulo_evento();
                Calendar f = n.getFecha_evento();

                String fecha = (String.valueOf(f.get(5))+"/"+String.valueOf(f.get(2))+"/"+
                        String.valueOf(f.get(1)));
                String monto = String.valueOf(n.getRenta());

                String datos[] = {cod, tipo, tit, fecha, monto};
                modelo.addRow(datos);
                
            } else if (n.getFecha_evento().getTimeInMillis()>cal.getTimeInMillis()) {
                if (!(n.isEstado_cancelado())) {
                    String cod = String.valueOf(n.getCodigo_evento());
                    String tipo="";
                    if (n instanceof EventoDeportivo){
                        tipo = "Evento Deportivo";
                        dep2++;
                        depo2 += n.getRenta();
                    } else if (n instanceof EventoMusical){
                        tipo = "Evento Musical";
                        mus2++;
                        musi2 += n.getRenta();
                    } else if (n instanceof EventoReligioso){
                        tipo = "Evento Religioso";
                        rel2++;
                        reli2 += n.getRenta();
                    }
                    String tit = n.getTitulo_evento();
                    Calendar f = n.getFecha_evento();

                    String fecha = (String.valueOf(f.get(5))+"/"+String.valueOf(f.get(2))+"/"+
                            String.valueOf(f.get(1)));
                    String monto = String.valueOf(n.getRenta());

                    String datos[] = {cod, tipo, tit, fecha, monto};
                    model1.addRow(datos);    
                } else {
                    String cod = String.valueOf(n.getCodigo_evento());
                    String tipo="";
                    if (n instanceof EventoDeportivo){
                        tipo = "Evento Deportivo";
                        dep3++;
                        depo3 += n.getRenta();
                    } else if (n instanceof EventoMusical){
                        tipo = "Evento Musical";
                        mus3++;
                        musi3 += n.getRenta();
                    } else if (n instanceof EventoReligioso){
                        tipo = "Evento Religioso";
                        rel3++;
                        reli3 += n.getRenta();
                    }
                    String tit = n.getTitulo_evento();
                    Calendar f = n.getFecha_evento();

                    String fecha = (String.valueOf(f.get(5))+"/"+String.valueOf(f.get(2))+"/"+
                            String.valueOf(f.get(1)));
                    String monto = String.valueOf(n.getRenta());

                    String datos[] = {cod, tipo, tit, fecha, monto};
                    model2.addRow(datos);
                }
            }
        }
        
        if(al != null){
            System.out.println("al: "+al);
            for(int x =0; x < al.size(); x++){
                String m = al.get(x).toString();
                System.out.println("m: "+m);
                for(int y =0; y < event.getEventos().size(); y++){
                    Evento ev = event.getEventos().get(y);
                    System.out.println("ev: "+ev);
                    String n = String.valueOf(event.getEventos().get(y).getCodigo_evento());
                    if(m.equals(n)){
                        String codigo = String.valueOf(ev.getCodigo_evento());
                        String titulo = ev.getTitulo_evento();
                        String monto = String.valueOf(ev.getRenta());
                        String tipo = "";
                        if(ev instanceof EventoDeportivo)
                            tipo = "Evento Deportivo";
                        else if(ev instanceof EventoMusical)
                            tipo = "Evento Musical";
                        else if(ev instanceof EventoReligioso)
                            tipo = "Evento Religioso";
                        
                        String datos[] = {codigo, tipo, titulo, monto};
                        model3.addRow(datos);
                    }
                }
            }
            
        }
        else if(user instanceof UsuarioContenido)
            user = ((UsuarioContenido)user);
        else if(user instanceof UsuarioLimitado)
            user = null;
            
        
        deport.setText(String.valueOf(dep));
        music.setText(String.valueOf(mus));
        relig.setText(String.valueOf(rel));
        deport1.setText(String.valueOf(depo));
        music1.setText(String.valueOf(musi));
        relig1.setText(String.valueOf(reli));
        
        deport2.setText(String.valueOf(dep2));
        music2.setText(String.valueOf(mus2));
        relig2.setText(String.valueOf(rel2));
        deport3.setText(String.valueOf(depo2));
        music3.setText(String.valueOf(musi2));
        relig3.setText(String.valueOf(reli2));
        
        deport4.setText(String.valueOf(dep3));
        music4.setText(String.valueOf(mus3));
        relig4.setText(String.valueOf(rel3));
        deport5.setText(String.valueOf(depo3));
        music5.setText(String.valueOf(musi3));
        relig5.setText(String.valueOf(reli3));
        
        datos_usuario.setText(user.toString());
        
    }
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_realizados = new javax.swing.JTable();
        deport = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        music = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        relig = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        deport1 = new javax.swing.JTextField();
        music1 = new javax.swing.JTextField();
        relig1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_futuros = new javax.swing.JTable();
        deport2 = new javax.swing.JTextField();
        deport3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        music2 = new javax.swing.JTextField();
        music3 = new javax.swing.JTextField();
        relig2 = new javax.swing.JTextField();
        relig3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        t_cancelados = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        deport4 = new javax.swing.JTextField();
        deport5 = new javax.swing.JTextField();
        music4 = new javax.swing.JTextField();
        music5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        relig4 = new javax.swing.JTextField();
        relig5 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        t_porfecha = new javax.swing.JTable();
        lbl_fechaCrearEve = new javax.swing.JLabel();
        dia1 = new javax.swing.JComboBox();
        mes1 = new javax.swing.JComboBox();
        ano1 = new javax.swing.JComboBox();
        lbl_fechaCrearEve1 = new javax.swing.JLabel();
        dia2 = new javax.swing.JComboBox();
        mes2 = new javax.swing.JComboBox();
        ano2 = new javax.swing.JComboBox();
        BuscarEventos = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        deport6 = new javax.swing.JTextField();
        music6 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        relig6 = new javax.swing.JTextField();
        total_gen = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        datos_usuario = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        t_usuario = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        t_realizados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(t_realizados);

        deport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deportActionPerformed(evt);
            }
        });

        jLabel1.setText("Eventos Deportivos");

        jLabel2.setText("Eventos Musicales");

        jLabel3.setText("Eventos Religiosos");

        deport1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deport1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deport1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deport, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(music1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(music, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(relig1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(relig, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(music, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(relig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deport1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(music1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(relig1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eventos Realizados", jPanel1);

        t_futuros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(t_futuros);

        deport2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deport2ActionPerformed(evt);
            }
        });

        deport3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deport3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Eventos Deportivos");

        jLabel5.setText("Eventos Musicales");

        jLabel6.setText("Eventos Religiosos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deport3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deport2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(music3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(music2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(relig2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(relig3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deport2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(music2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(relig3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deport3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(music3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(relig2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eventos Futuros", jPanel2);

        t_cancelados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(t_cancelados);

        jLabel7.setText("Eventos Deportivos");

        deport4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deport4ActionPerformed(evt);
            }
        });

        deport5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deport5ActionPerformed(evt);
            }
        });

        jLabel8.setText("Eventos Musicales");

        jLabel9.setText("Eventos Religiosos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deport5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deport4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(music4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(music5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(relig5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(relig4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deport4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(music5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(relig4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deport5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(music4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(relig5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eventos Cancelados", jPanel3);

        t_porfecha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(t_porfecha);

        lbl_fechaCrearEve.setText("Fecha Inicial");

        dia1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        mes1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        ano1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        lbl_fechaCrearEve1.setText("Fecha Final");

        dia2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        mes2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        ano2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        BuscarEventos.setText("Buscar Eventos entre Fechas");
        BuscarEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarEventosActionPerformed(evt);
            }
        });

        jLabel12.setText("Eventos Deportivos");

        deport6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deport6ActionPerformed(evt);
            }
        });

        jLabel13.setText("Eventos Musicales");

        jLabel14.setText("Eventos Religiosos");

        total_gen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_genActionPerformed(evt);
            }
        });

        jLabel15.setText("Total Generado");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lbl_fechaCrearEve1)
                                .addGap(6, 6, 6)
                                .addComponent(dia2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mes2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ano2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lbl_fechaCrearEve)
                                .addGap(6, 6, 6)
                                .addComponent(dia1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mes1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ano1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(BuscarEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(total_gen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(deport6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(music6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(relig6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(14, 14, 14))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dia1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mes1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ano1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_fechaCrearEve)
                    .addComponent(BuscarEventos))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dia2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mes2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ano2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_fechaCrearEve1)
                    .addComponent(total_gen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(4, 4, 4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deport6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(music6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(relig6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ingreso por Fecha", jPanel4);

        datos_usuario.setColumns(20);
        datos_usuario.setLineWrap(true);
        datos_usuario.setRows(5);
        datos_usuario.setWrapStyleWord(true);
        jScrollPane4.setViewportView(datos_usuario);

        jLabel10.setText("Datos del Usuario");

        t_usuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(t_usuario);

        jLabel11.setText("Eventos Creados por el Usuario");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        jTabbedPane1.addTab("Perfil de Usuario", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deportActionPerformed

    private void deport1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deport1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deport1ActionPerformed

    private void deport2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deport2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deport2ActionPerformed

    private void deport3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deport3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deport3ActionPerformed

    private void deport4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deport4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deport4ActionPerformed

    private void deport5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deport5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deport5ActionPerformed

    private void BuscarEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarEventosActionPerformed
        int dep4=0, mus4=0, rel4=0;
        double total=0;
        
        Calendar fecha1 = new GregorianCalendar();
        int d1 = Integer.parseInt(dia1.getSelectedItem().toString());
        int m1 = Integer.parseInt(mes1.getSelectedItem().toString());
        int a1 = Integer.parseInt(ano1.getSelectedItem().toString());
        fecha1.set(a1, m1-1, d1);
        
        Calendar fecha2 = new GregorianCalendar();
        int d2 = Integer.parseInt(dia2.getSelectedItem().toString());
        int m2 = Integer.parseInt(mes2.getSelectedItem().toString());
        int a2 = Integer.parseInt(ano2.getSelectedItem().toString());
        fecha2.set(a2, m2-1, d2);
        
        for(int x =0; x < event.getEventos().size(); x++){
            Evento n = event.getEventos().get(x);
            
            if(n.getFecha_evento().getTimeInMillis()<fecha2.getTimeInMillis()){
                if (n.getFecha_evento().getTimeInMillis()>fecha1.getTimeInMillis()) {
                    String cod = String.valueOf(n.getCodigo_evento());
                    String tipo="";
                    if (n instanceof EventoDeportivo){
                        tipo = "Evento Deportivo";
                        dep4++;
                    } else if (n instanceof EventoMusical){
                        tipo = "Evento Musical";
                        mus4++;
                    } else if (n instanceof EventoReligioso){
                        tipo = "Evento Religioso";
                        rel4++;
                    }
                    String tit = n.getTitulo_evento();
                    Calendar f = n.getFecha_evento();
                    
                    String fecha = (String.valueOf(f.get(5))+"/"+String.valueOf(f.get(2))+"/"+
                            String.valueOf(f.get(1)));
                    String monto = String.valueOf(n.getRenta());
                    total += n.getRenta();
                    String datos[] = {cod, tipo, tit, fecha, monto};
                    model4.addRow(datos);
                }
                
            }
        }
        
        deport6.setText(String.valueOf(dep4));
        music6.setText(String.valueOf(mus4));
        relig6.setText(String.valueOf(rel4));
        total_gen.setText(String.valueOf(total));
        
    }//GEN-LAST:event_BuscarEventosActionPerformed

    private void deport6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deport6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deport6ActionPerformed

    private void total_genActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_genActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_genActionPerformed

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
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportes(null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarEventos;
    private javax.swing.JComboBox ano1;
    private javax.swing.JComboBox ano2;
    private javax.swing.JTextArea datos_usuario;
    private javax.swing.JTextField deport;
    private javax.swing.JTextField deport1;
    private javax.swing.JTextField deport2;
    private javax.swing.JTextField deport3;
    private javax.swing.JTextField deport4;
    private javax.swing.JTextField deport5;
    private javax.swing.JTextField deport6;
    private javax.swing.JComboBox dia1;
    private javax.swing.JComboBox dia2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_fechaCrearEve;
    private javax.swing.JLabel lbl_fechaCrearEve1;
    private javax.swing.JComboBox mes1;
    private javax.swing.JComboBox mes2;
    private javax.swing.JTextField music;
    private javax.swing.JTextField music1;
    private javax.swing.JTextField music2;
    private javax.swing.JTextField music3;
    private javax.swing.JTextField music4;
    private javax.swing.JTextField music5;
    private javax.swing.JTextField music6;
    private javax.swing.JTextField relig;
    private javax.swing.JTextField relig1;
    private javax.swing.JTextField relig2;
    private javax.swing.JTextField relig3;
    private javax.swing.JTextField relig4;
    private javax.swing.JTextField relig5;
    private javax.swing.JTextField relig6;
    private javax.swing.JTable t_cancelados;
    private javax.swing.JTable t_futuros;
    private javax.swing.JTable t_porfecha;
    private javax.swing.JTable t_realizados;
    private javax.swing.JTable t_usuario;
    private javax.swing.JTextField total_gen;
    // End of variables declaration//GEN-END:variables
}
