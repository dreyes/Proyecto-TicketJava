
package TicketJavaGUI;

import Eventos.AdmEventos;
import Eventos.Evento;
import Eventos.EventoDeportivo;
import Eventos.EventoMusical;
import Eventos.EventoReligioso;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.ArrayList;
import java.util.Calendar;
import static java.util.Calendar.getInstance;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DReyes
 */
public class AdministradorEventos extends javax.swing.JFrame {

    AdmEventos eventos;
    private EventUserInterface nInterface;
    private Evento eve;
    private int type;
    DefaultTableModel modelo;
    DefaultTableModel modelo1;
    DefaultTableModel modelo2;
    private String codn;
    
    public AdministradorEventos() {
        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo1 = new DefaultTableModel();
        modelo1.addColumn("Nombre");
        modelo2 = new DefaultTableModel();
        modelo2.addColumn("Nombre");
        eventos = new AdmEventos();
        initComponents();
        jt_prueba.setModel(modelo);
        jt_prueba1.setModel(modelo1);
        jt_prueba2.setModel(modelo2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        tp_eventos = new javax.swing.JTabbedPane();
        p_crearEvento = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jp_deportivoCrearEve = new javax.swing.JPanel();
        lbl_equipo1CrearEve = new javax.swing.JLabel();
        txt_equipo1CrearEve = new javax.swing.JTextField();
        lbl_equipo2CrearEve = new javax.swing.JLabel();
        txt_equipo2CrearEve = new javax.swing.JTextField();
        lbl_tipoDeporteCrearEve = new javax.swing.JLabel();
        combo_tipoDeporteCrearEve = new javax.swing.JComboBox();
        jp_musicalCrearEve = new javax.swing.JPanel();
        lbl_tipoMusicaCrearEve = new javax.swing.JLabel();
        combo_tipoMusicaCrearEve = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        lbl_codigoCrearEve = new javax.swing.JLabel();
        txt_codigoCrearEve = new javax.swing.JTextField();
        lbl_tituloCrearEve = new javax.swing.JLabel();
        lbl_descCrearEve = new javax.swing.JLabel();
        lbl_fechaCrearEve = new javax.swing.JLabel();
        lbl_rentaCrearEve = new javax.swing.JLabel();
        lbl_tipoCrearEve = new javax.swing.JLabel();
        btn_crearEvento = new javax.swing.JButton();
        combo_tipoCrearEve = new javax.swing.JComboBox();
        txt_rentaCrearEve = new javax.swing.JTextField();
        combo_diaCrearEve = new javax.swing.JComboBox();
        combo_mesCrearEve = new javax.swing.JComboBox();
        combo_anoCrearEve = new javax.swing.JComboBox();
        txt_descCrearEve = new javax.swing.JTextField();
        txt_tituloCrearEve = new javax.swing.JTextField();
        p_eliminarEvento = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txt_codigoElimEve = new javax.swing.JTextField();
        lbl_codigoElimEve = new javax.swing.JLabel();
        btn_elimEvento = new javax.swing.JButton();
        p_editarEvento = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_tituloBuscEve = new javax.swing.JLabel();
        txt_codigoBuscEve = new javax.swing.JTextField();
        btn_buscarEvento = new javax.swing.JButton();
        jp_deportivo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_tipoDeporteCrearEve1 = new javax.swing.JLabel();
        combo_tipoDeporteEditEve = new javax.swing.JComboBox();
        lbl_equipo1CrearEve1 = new javax.swing.JLabel();
        txt_equipo1EditEve = new javax.swing.JTextField();
        txt_equipo2EditEve = new javax.swing.JTextField();
        lbl_equipo1CrearEve2 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jt_prueba1 = new javax.swing.JTable();
        jb_add1 = new javax.swing.JButton();
        jb_subs1 = new javax.swing.JButton();
        txt_jugadores1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_jugadores2 = new javax.swing.JTextField();
        jb_add2 = new javax.swing.JButton();
        jb_subs2 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jt_prueba2 = new javax.swing.JTable();
        jSeparator4 = new javax.swing.JSeparator();
        jp_musica = new javax.swing.JPanel();
        combo_tipoMusicaEditEve = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_staff = new javax.swing.JTextField();
        jb_add = new javax.swing.JButton();
        jb_subs = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jt_prueba = new javax.swing.JTable();
        jp_religion = new javax.swing.JPanel();
        cb_convertidosEditEve = new javax.swing.JCheckBox();
        txt_cantConverEditEve = new javax.swing.JTextField();
        lbl_equipo1CrearEve3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lbl_codigoEditEve = new javax.swing.JLabel();
        lbl_tituloEditEve = new javax.swing.JLabel();
        lbl_descEditEve = new javax.swing.JLabel();
        lbl_fechaEditEve = new javax.swing.JLabel();
        lbl_rentEditEve = new javax.swing.JLabel();
        txt_rentEditEve = new javax.swing.JTextField();
        lbl_tipoEditEve = new javax.swing.JLabel();
        btn_editarEvento = new javax.swing.JButton();
        combo_diaEditEve = new javax.swing.JComboBox();
        combo_mesEditEve = new javax.swing.JComboBox();
        combo_anoEditEve = new javax.swing.JComboBox();
        txt_descEditEve = new javax.swing.JTextField();
        txt_tituloEditEve = new javax.swing.JTextField();
        txt_codigoEditEve = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jp_deportivoCrearEve.setBorder(javax.swing.BorderFactory.createTitledBorder("Deportivo"));

        lbl_equipo1CrearEve.setText("Equipo 1");

        txt_equipo1CrearEve.setToolTipText("Usuario");

        lbl_equipo2CrearEve.setText("Equipo 2");

        txt_equipo2CrearEve.setToolTipText("Usuario");

        lbl_tipoDeporteCrearEve.setText("Tipo Deporte");

        combo_tipoDeporteCrearEve.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FUTBOL", "TENNIS", "RUGBY", "BASEBALL" }));

        javax.swing.GroupLayout jp_deportivoCrearEveLayout = new javax.swing.GroupLayout(jp_deportivoCrearEve);
        jp_deportivoCrearEve.setLayout(jp_deportivoCrearEveLayout);
        jp_deportivoCrearEveLayout.setHorizontalGroup(
            jp_deportivoCrearEveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_deportivoCrearEveLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_deportivoCrearEveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_equipo2CrearEve)
                    .addComponent(lbl_tipoDeporteCrearEve)
                    .addComponent(lbl_equipo1CrearEve))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_deportivoCrearEveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_equipo2CrearEve)
                    .addComponent(combo_tipoDeporteCrearEve, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_equipo1CrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jp_deportivoCrearEveLayout.setVerticalGroup(
            jp_deportivoCrearEveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_deportivoCrearEveLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_deportivoCrearEveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_equipo1CrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_equipo1CrearEve))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_deportivoCrearEveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_equipo2CrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_equipo2CrearEve))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_deportivoCrearEveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_tipoDeporteCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tipoDeporteCrearEve))
                .addContainerGap())
        );

        jp_musicalCrearEve.setBorder(javax.swing.BorderFactory.createTitledBorder("Musical"));

        lbl_tipoMusicaCrearEve.setText("Tipo Música");

        combo_tipoMusicaCrearEve.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "POP", "ROCK", "RAP", "CLASICA", "REGGAETON", "OTRO" }));

        javax.swing.GroupLayout jp_musicalCrearEveLayout = new javax.swing.GroupLayout(jp_musicalCrearEve);
        jp_musicalCrearEve.setLayout(jp_musicalCrearEveLayout);
        jp_musicalCrearEveLayout.setHorizontalGroup(
            jp_musicalCrearEveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_musicalCrearEveLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(lbl_tipoMusicaCrearEve)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(combo_tipoMusicaCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jp_musicalCrearEveLayout.setVerticalGroup(
            jp_musicalCrearEveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_musicalCrearEveLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_musicalCrearEveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_tipoMusicaCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tipoMusicaCrearEve))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_codigoCrearEve.setText("Codigo");

        txt_codigoCrearEve.setToolTipText("Usuario");

        lbl_tituloCrearEve.setText("Titulo");

        lbl_descCrearEve.setText("Descripción");

        lbl_fechaCrearEve.setText("Fecha de Evento");

        lbl_rentaCrearEve.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_rentaCrearEve.setText("Renta");

        lbl_tipoCrearEve.setText("Tipo");

        btn_crearEvento.setText("Crear Evento");
        btn_crearEvento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_crearEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearEventoActionPerformed(evt);
            }
        });

        combo_tipoCrearEve.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Deportivo", "Musical", "Religioso" }));
        combo_tipoCrearEve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tipoCrearEveActionPerformed(evt);
            }
        });

        txt_rentaCrearEve.setToolTipText("Usuario");

        combo_diaCrearEve.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        combo_mesCrearEve.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        combo_anoCrearEve.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        txt_tituloCrearEve.setToolTipText("Usuario");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_rentaCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tipoCrearEve)
                    .addComponent(lbl_fechaCrearEve)
                    .addComponent(lbl_descCrearEve)
                    .addComponent(lbl_tituloCrearEve)
                    .addComponent(lbl_codigoCrearEve))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_descCrearEve)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(combo_diaCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combo_mesCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combo_anoCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_codigoCrearEve)
                            .addComponent(txt_tituloCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_crearEvento)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_rentaCrearEve)
                                .addComponent(combo_tipoCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigoCrearEve)
                    .addComponent(txt_codigoCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tituloCrearEve)
                    .addComponent(txt_tituloCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_descCrearEve)
                    .addComponent(txt_descCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_diaCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_mesCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_anoCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_fechaCrearEve))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_rentaCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_rentaCrearEve))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_tipoCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tipoCrearEve))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_crearEvento)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout p_crearEventoLayout = new javax.swing.GroupLayout(p_crearEvento);
        p_crearEvento.setLayout(p_crearEventoLayout);
        p_crearEventoLayout.setHorizontalGroup(
            p_crearEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_crearEventoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(p_crearEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_musicalCrearEve, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jp_deportivoCrearEve, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        p_crearEventoLayout.setVerticalGroup(
            p_crearEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_crearEventoLayout.createSequentialGroup()
                .addGroup(p_crearEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_crearEventoLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jp_deportivoCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jp_musicalCrearEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p_crearEventoLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p_crearEventoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tp_eventos.addTab("Crear Evento", p_crearEvento);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txt_codigoElimEve.setToolTipText("Usuario");
        txt_codigoElimEve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoElimEveActionPerformed(evt);
            }
        });

        lbl_codigoElimEve.setText("Codigo");

        btn_elimEvento.setText("Cancelar Evento");
        btn_elimEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_elimEventoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_elimEvento)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(lbl_codigoElimEve)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_codigoElimEve, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigoElimEve)
                    .addComponent(txt_codigoElimEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btn_elimEvento)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout p_eliminarEventoLayout = new javax.swing.GroupLayout(p_eliminarEvento);
        p_eliminarEvento.setLayout(p_eliminarEventoLayout);
        p_eliminarEventoLayout.setHorizontalGroup(
            p_eliminarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_eliminarEventoLayout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        p_eliminarEventoLayout.setVerticalGroup(
            p_eliminarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_eliminarEventoLayout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        tp_eventos.addTab("Cancelar Evento", p_eliminarEvento);

        lbl_tituloBuscEve.setText("Codigo");

        txt_codigoBuscEve.setToolTipText("Usuario");

        btn_buscarEvento.setText("Buscar Evento");
        btn_buscarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarEventoActionPerformed(evt);
            }
        });

        jp_deportivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Evento Deportivo"));

        jLabel1.setText("Jugadores Equipo 1");

        lbl_tipoDeporteCrearEve1.setText("Tipo Deporte");

        combo_tipoDeporteEditEve.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FUTBOL", "TENNIS", "RUGBY", "BASEBALL" }));

        lbl_equipo1CrearEve1.setText("Nombre Equipo 1");

        txt_equipo1EditEve.setToolTipText("Usuario");
        txt_equipo1EditEve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_equipo1EditEveActionPerformed(evt);
            }
        });

        txt_equipo2EditEve.setToolTipText("Usuario");

        lbl_equipo1CrearEve2.setText("Nombre Equipo 2");

        jt_prueba1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(jt_prueba1);

        jb_add1.setText("+");
        jb_add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_add1ActionPerformed(evt);
            }
        });

        jb_subs1.setText("-");
        jb_subs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_subs1ActionPerformed(evt);
            }
        });

        txt_jugadores1.setToolTipText("Usuario");

        jLabel5.setText("Jugadores Equipo 1");

        txt_jugadores2.setToolTipText("Usuario");

        jb_add2.setText("+");
        jb_add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_add2ActionPerformed(evt);
            }
        });

        jb_subs2.setText("-");
        jb_subs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_subs2ActionPerformed(evt);
            }
        });

        jt_prueba2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane8.setViewportView(jt_prueba2);

        javax.swing.GroupLayout jp_deportivoLayout = new javax.swing.GroupLayout(jp_deportivo);
        jp_deportivo.setLayout(jp_deportivoLayout);
        jp_deportivoLayout.setHorizontalGroup(
            jp_deportivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_deportivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_deportivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_deportivoLayout.createSequentialGroup()
                        .addGroup(jp_deportivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_deportivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_deportivoLayout.createSequentialGroup()
                                    .addComponent(jb_add1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jb_subs1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(jp_deportivoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txt_jugadores1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jp_deportivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_deportivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_deportivoLayout.createSequentialGroup()
                                    .addComponent(jb_add2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jb_subs2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addGroup(jp_deportivoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jp_deportivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_jugadores2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jp_deportivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_equipo1CrearEve2)
                                        .addComponent(txt_equipo2EditEve, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jp_deportivoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jp_deportivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_equipo1CrearEve1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jp_deportivoLayout.createSequentialGroup()
                                .addComponent(txt_equipo1EditEve, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(jp_deportivoLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lbl_tipoDeporteCrearEve1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(combo_tipoDeporteEditEve, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_deportivoLayout.setVerticalGroup(
            jp_deportivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_deportivoLayout.createSequentialGroup()
                .addGroup(jp_deportivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp_deportivoLayout.createSequentialGroup()
                        .addComponent(lbl_equipo1CrearEve2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jp_deportivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_equipo1EditEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_equipo2EditEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jp_deportivoLayout.createSequentialGroup()
                        .addComponent(lbl_equipo1CrearEve1)
                        .addGap(34, 34, 34)))
                .addGroup(jp_deportivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_deportivoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_jugadores1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp_deportivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb_subs1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_add1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_deportivoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_jugadores2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp_deportivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb_subs2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_add2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_deportivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tipoDeporteCrearEve1)
                    .addComponent(combo_tipoDeporteEditEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jp_musica.setBorder(javax.swing.BorderFactory.createTitledBorder("Evento Musical"));

        combo_tipoMusicaEditEve.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "POP", "ROCK", "RAP", "CLASICA", "REGGAETON", "OTRO" }));

        jLabel3.setText("Staff Evento");

        jLabel4.setText("Tipo Música");

        txt_staff.setToolTipText("Usuario");
        txt_staff.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_staffKeyPressed(evt);
            }
        });

        jb_add.setText("+");
        jb_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_addActionPerformed(evt);
            }
        });

        jb_subs.setText("-");
        jb_subs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_subsActionPerformed(evt);
            }
        });

        jt_prueba.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(jt_prueba);

        javax.swing.GroupLayout jp_musicaLayout = new javax.swing.GroupLayout(jp_musica);
        jp_musica.setLayout(jp_musicaLayout);
        jp_musicaLayout.setHorizontalGroup(
            jp_musicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jp_musicaLayout.createSequentialGroup()
                .addGroup(jp_musicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_musicaLayout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(combo_tipoMusicaEditEve, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_musicaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jb_add, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_subs, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addComponent(txt_staff, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jp_musicaLayout.createSequentialGroup()
                .addGroup(jp_musicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_musicaLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4))
                    .addGroup(jp_musicaLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jp_musicaLayout.setVerticalGroup(
            jp_musicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_musicaLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_musicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_subs, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_add, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_tipoMusicaEditEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jp_religion.setBorder(javax.swing.BorderFactory.createTitledBorder("Evento Religioso"));

        cb_convertidosEditEve.setText("Convertidos");
        cb_convertidosEditEve.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cb_convertidosEditEveStateChanged(evt);
            }
        });
        cb_convertidosEditEve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_convertidosEditEveActionPerformed(evt);
            }
        });

        txt_cantConverEditEve.setToolTipText("Usuario");

        lbl_equipo1CrearEve3.setText("Cantidad");

        javax.swing.GroupLayout jp_religionLayout = new javax.swing.GroupLayout(jp_religion);
        jp_religion.setLayout(jp_religionLayout);
        jp_religionLayout.setHorizontalGroup(
            jp_religionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_religionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_religionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_convertidosEditEve)
                    .addComponent(txt_cantConverEditEve, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_religionLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lbl_equipo1CrearEve3)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jp_religionLayout.setVerticalGroup(
            jp_religionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_religionLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(cb_convertidosEditEve)
                .addGap(29, 29, 29)
                .addComponent(lbl_equipo1CrearEve3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_cantConverEditEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_codigoEditEve.setText("Codigo");

        lbl_tituloEditEve.setText("Titulo");

        lbl_descEditEve.setText("Descripción");

        lbl_fechaEditEve.setText("Fecha de Evento");

        lbl_rentEditEve.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_rentEditEve.setText("Renta");

        txt_rentEditEve.setToolTipText("Usuario");

        lbl_tipoEditEve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_tipoEditEve.setText("Tipo");

        btn_editarEvento.setText("Editar Evento");
        btn_editarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarEventoActionPerformed(evt);
            }
        });

        combo_diaEditEve.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        combo_mesEditEve.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        combo_anoEditEve.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        txt_tituloEditEve.setToolTipText("Usuario");

        txt_codigoEditEve.setToolTipText("Usuario");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btn_editarEvento)
                        .addGap(0, 80, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(lbl_tipoEditEve, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbl_rentEditEve, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_fechaEditEve)
                                .addComponent(lbl_descEditEve)
                                .addComponent(lbl_tituloEditEve)
                                .addComponent(lbl_codigoEditEve))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_codigoEditEve)
                                .addComponent(txt_tituloEditEve)
                                .addComponent(txt_descEditEve)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(combo_diaEditEve, 0, 1, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(combo_mesEditEve, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(combo_anoEditEve, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txt_rentEditEve, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigoEditEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_codigoEditEve))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tituloEditEve)
                    .addComponent(txt_tituloEditEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_descEditEve)
                    .addComponent(txt_descEditEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_diaEditEve, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_mesEditEve, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_anoEditEve, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_fechaEditEve))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_rentEditEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_rentEditEve))
                .addGap(25, 25, 25)
                .addComponent(lbl_tipoEditEve)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_editarEvento))
        );

        javax.swing.GroupLayout p_editarEventoLayout = new javax.swing.GroupLayout(p_editarEvento);
        p_editarEvento.setLayout(p_editarEventoLayout);
        p_editarEventoLayout.setHorizontalGroup(
            p_editarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_editarEventoLayout.createSequentialGroup()
                .addGroup(p_editarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, p_editarEventoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, p_editarEventoLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(lbl_tituloBuscEve)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_codigoBuscEve, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscarEvento)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(p_editarEventoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(p_editarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(p_editarEventoLayout.createSequentialGroup()
                                .addComponent(jp_musica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jp_religion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jp_deportivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(13, 13, 13)))
                .addContainerGap())
        );
        p_editarEventoLayout.setVerticalGroup(
            p_editarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_editarEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_editarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigoBuscEve, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tituloBuscEve)
                    .addComponent(btn_buscarEvento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(p_editarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_editarEventoLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jp_deportivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(p_editarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jp_musica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jp_religion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(p_editarEventoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p_editarEventoLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        tp_eventos.addTab("Editar Evento", p_editarEvento);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tp_eventos, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tp_eventos, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cb_convertidosEditEveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_convertidosEditEveActionPerformed

    }//GEN-LAST:event_cb_convertidosEditEveActionPerformed

    private void cb_convertidosEditEveStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cb_convertidosEditEveStateChanged
        if(cb_convertidosEditEve.isSelected()){
            txt_cantConverEditEve.setEnabled(true);
            txt_cantConverEditEve.setEditable(true);
        } else {
            txt_cantConverEditEve.setEnabled(false);
            txt_cantConverEditEve.setEditable(false);
        }
    }//GEN-LAST:event_cb_convertidosEditEveStateChanged

    private void jb_subsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_subsActionPerformed
        modelo.removeRow(jt_prueba.getSelectedRow());
    }//GEN-LAST:event_jb_subsActionPerformed

    private void jb_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_addActionPerformed
        String [] modadd = new String[1];
        modadd[0] = txt_staff.getText();
        modelo.addRow(modadd);
        txt_staff.setText("");
    }//GEN-LAST:event_jb_addActionPerformed

    private void txt_staffKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_staffKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_staffKeyPressed

    private void jb_subs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_subs2ActionPerformed
        modelo2.removeRow(jt_prueba2.getSelectedRow());
    }//GEN-LAST:event_jb_subs2ActionPerformed

    private void jb_add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_add2ActionPerformed
        String [] modadd = new String[1];
        modadd[0] = txt_jugadores2.getText();
        modelo2.addRow(modadd);
        txt_jugadores2.setText("");
    }//GEN-LAST:event_jb_add2ActionPerformed

    private void jb_subs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_subs1ActionPerformed
        modelo1.removeRow(jt_prueba1.getSelectedRow());
    }//GEN-LAST:event_jb_subs1ActionPerformed

    private void jb_add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_add1ActionPerformed
        String [] modadd = new String[1];
        modadd[0] = txt_jugadores1.getText();
        modelo1.addRow(modadd);
        txt_jugadores1.setText("");
    }//GEN-LAST:event_jb_add1ActionPerformed

    private void btn_buscarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarEventoActionPerformed

        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        jt_prueba.setModel(modelo);
        modelo1 = new DefaultTableModel();
        modelo1.addColumn("Nombre");
        jt_prueba1.setModel(modelo1);
        modelo2 = new DefaultTableModel();
        modelo2.addColumn("Nombre");
        jt_prueba2.setModel(modelo2);
        
        String codigo = txt_codigoBuscEve.getText();
        int c = Integer.parseInt(codigo);
        eve = eventos.buscarEvento(c);
        if(eve != null){
            txt_codigoEditEve.setText(String.valueOf(eve.getCodigo_evento()));
            txt_tituloEditEve.setText(String.valueOf(eve.getTitulo_evento()));
            txt_descEditEve.setText(String.valueOf(eve.getDescripcion()));
            txt_rentEditEve.setText(String.valueOf(eve.getRenta()));
            combo_diaEditEve.setSelectedItem(String.valueOf(eve.getFecha_evento().get(5)));
            combo_mesEditEve.setSelectedItem(String.valueOf(eve.getFecha_evento().get(2)));
            combo_anoEditEve.setSelectedItem(String.valueOf(eve.getFecha_evento().get(1)));
            txt_cantConverEditEve.setEnabled(false);
            txt_cantConverEditEve.setEditable(false);
            codn = txt_codigoEditEve.getText();
            //DefaultTableModel dtm = new DefaultTableModel();
            //dtm.addColumn("Nombre");
            //jt_prueba.setModel(dtm);
            //for(int i=0; i < modelo.getRowCount(); i++){
                //    modelo.removeRow(i);
                //}

            int n = eventos.getTipo(eve);
            type = n;
            switch (n) {
                case 0:
                    lbl_tipoEditEve.setText("Evento de Tipo Deportivo");
                    
                    //Deportivo
                    jp_deportivo.setEnabled(true);
                    txt_equipo1EditEve.setEnabled(true);
                    txt_equipo2EditEve.setEnabled(true);
                    txt_jugadores1.setEnabled(true);
                    txt_jugadores2.setEnabled(true);
                    jb_add1.setEnabled(true);
                    jb_subs1.setEnabled(true);
                    jb_add2.setEnabled(true);
                    jb_subs2.setEnabled(true);
                    jt_prueba1.setEnabled(true);
                    jt_prueba2.setEnabled(true);
                    combo_tipoDeporteEditEve.setEnabled(true);
                    //Musical
                    jp_musica.setEnabled(false);
                    txt_staff.setEnabled(false);
                    jb_add.setEnabled(false);
                    jb_subs.setEnabled(false);
                    jt_prueba.setEnabled(false);
                    combo_tipoMusicaEditEve.setEnabled(false);
                    //Religioso
                    jp_religion.setEnabled(false);
                    cb_convertidosEditEve.setEnabled(false);
                    txt_cantConverEditEve.setEnabled(false);
                    
                    ArrayList<String> e1 = ((EventoDeportivo)eve).getJugadores_equipo1();
                    for (int i = 0; i<e1.size(); i++) {
                        String [] mod1 = new String[1];
                        mod1[0] = e1.get(i);
                        modelo1.addRow(mod1);
                    }
                    jt_prueba1.setModel(modelo1);

                    ArrayList<String> e2 = ((EventoDeportivo)eve).getJugadores_equipo2();
                    for (int i = 0; i<e2.size(); i++) {
                        String [] mod1 = new String[1];
                        mod1[0] = e2.get(i);
                        modelo2.addRow(mod1);
                    }
                    jt_prueba2.setModel(modelo2);

                    combo_tipoDeporteEditEve.setSelectedItem(((EventoDeportivo)eve).getDeporte().toString());
                    txt_equipo1EditEve.setText(((EventoDeportivo)eve).getN_equipo1());
                    txt_equipo2EditEve.setText(((EventoDeportivo)eve).getN_equipo2());
                    break;
                case 1:
                    lbl_tipoEditEve.setText("Evento de Tipo Musical");
                    
                    //Deportivo
                    jp_deportivo.setEnabled(false);
                    txt_equipo1EditEve.setEnabled(false);
                    txt_equipo2EditEve.setEnabled(false);
                    txt_jugadores1.setEnabled(false);
                    txt_jugadores2.setEnabled(false);
                    jb_add1.setEnabled(false);
                    jb_subs1.setEnabled(false);
                    jb_add2.setEnabled(false);
                    jb_subs2.setEnabled(false);
                    jt_prueba1.setEnabled(false);
                    jt_prueba2.setEnabled(false);
                    combo_tipoDeporteEditEve.setEnabled(false);
                    //Musical
                    jp_musica.setEnabled(true);
                    txt_staff.setEnabled(true);
                    jb_add.setEnabled(true);
                    jb_subs.setEnabled(true);
                    jt_prueba.setEnabled(true);
                    combo_tipoMusicaEditEve.setEnabled(true);
                    //Religioso
                    jp_religion.setEnabled(false);
                    cb_convertidosEditEve.setEnabled(false);
                    txt_cantConverEditEve.setEnabled(false);
                    
                    ArrayList<String> em = ((EventoMusical)eve).getEquipo_sonido();
                    
                    for (int i = 0; i<em.size(); i++) {
                        String [] mod1 = new String[1];
                        mod1[0] = em.get(i);
                        System.out.println("mod1"+mod1);
                        modelo.addRow(mod1);
                    }
                    jt_prueba.setModel(modelo);
                    combo_tipoMusicaEditEve.setSelectedItem(((EventoMusical)eve).getMusica().toString());

                    break;
                case 2:
                    lbl_tipoEditEve.setText("Evento de Tipo Religioso");
                    
                    //Deportivo
                    jp_deportivo.setEnabled(false);
                    txt_equipo1EditEve.setEnabled(false);
                    txt_equipo2EditEve.setEnabled(false);
                    txt_jugadores1.setEnabled(false);
                    txt_jugadores2.setEnabled(false);
                    jb_add1.setEnabled(false);
                    jb_subs1.setEnabled(false);
                    jb_add2.setEnabled(false);
                    jb_subs2.setEnabled(false);
                    jt_prueba1.setEnabled(false);
                    jt_prueba2.setEnabled(false);
                    combo_tipoDeporteEditEve.setEnabled(false);
                    //Musical
                    jp_musica.setEnabled(false);
                    txt_staff.setEnabled(false);
                    jb_add.setEnabled(false);
                    jb_subs.setEnabled(false);
                    jt_prueba.setEnabled(false);
                    combo_tipoMusicaEditEve.setEnabled(false);
                    //Religioso
                    jp_religion.setEnabled(true);
                    cb_convertidosEditEve.setEnabled(true);
                    txt_cantConverEditEve.setEnabled(true);
                    
                    txt_cantConverEditEve.setText(String.valueOf(((EventoReligioso)eve).getPers_convert()));
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Evento no existe!"
                , "Error al Buscar", WIDTH);
        }
    }//GEN-LAST:event_btn_buscarEventoActionPerformed

    private void btn_editarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarEventoActionPerformed
        String cod = txt_codigoEditEve.getText();
        String titulo = txt_tituloEditEve.getText();
        String desc = txt_descEditEve.getText();
        String rent = txt_rentEditEve.getText();

        Calendar fecha = new GregorianCalendar();
        int dia = Integer.parseInt(combo_diaEditEve.getSelectedItem().toString());
        int mes = Integer.parseInt(combo_mesEditEve.getSelectedItem().toString());
        int ano = Integer.parseInt(combo_anoEditEve.getSelectedItem().toString());
        fecha.set(ano, mes, dia);

        String tip = "";
        switch(type) {
            case 0:
            tip = "Deportivo";
            break;
            case 1:
            tip = "Musical";
            break;
            case 2:
            tip = "Religioso";
            break;
        }

        String n_equipo1 = txt_equipo1EditEve.getText();
        String n_equipo2 = txt_equipo2EditEve.getText();
        String tipoDeporte = combo_tipoDeporteEditEve.getSelectedItem().toString();
        String tipMusica = combo_tipoMusicaEditEve.getSelectedItem().toString();

        ArrayList<String> e1 = new ArrayList();
        modelo1 = (DefaultTableModel) jt_prueba1.getModel();
        for (int i=0; i < modelo1.getRowCount(); i++){
            e1.add(modelo1.getValueAt(i, 0).toString());
        }

        ArrayList<String> e2 = new ArrayList();
        modelo2 = (DefaultTableModel) jt_prueba2.getModel();
        for (int i=0; i < modelo2.getRowCount(); i++){
            e2.add(modelo2.getValueAt(i, 0).toString());
        }

        ArrayList<String> em = new ArrayList();
        modelo = (DefaultTableModel) jt_prueba.getModel();
        for (int i=0; i < modelo.getRowCount(); i++){
            em.add(modelo.getValueAt(i, 0).toString());
        }
        
        String convert;
        if(cb_convertidosEditEve.isSelected()){
            convert = txt_cantConverEditEve.getText();
        } else {
            convert = "0";
        } 
        if(nInterface != null){

            txt_codigoBuscEve.setText("");
            txt_codigoEditEve.setText("");
            txt_tituloEditEve.setText("");
            txt_descEditEve.setText("");
            txt_rentEditEve.setText("");
            txt_equipo1EditEve.setText("");
            txt_equipo2EditEve.setText("");
            txt_cantConverEditEve.setText("");
            txt_staff.setText("");
            
            modelo = new DefaultTableModel();
            modelo.addColumn("Nombre");
            jt_prueba.setModel(modelo);
            modelo1 = new DefaultTableModel();
            modelo1.addColumn("Nombre");
            jt_prueba1.setModel(modelo1);
            modelo2 = new DefaultTableModel();
            modelo2.addColumn("Nombre");
            jt_prueba2.setModel(modelo2);

            System.out.println("Borrados");

            int codigo = Integer.parseInt(cod);
            if(eventos.buscarEvento(codigo) != null){
                txt_codigoElimEve.setText("");

                if(nInterface.EventoEditado(codn,cod)){
                    eventos.editarEvento(cod, titulo, desc, rent, fecha, tip, n_equipo1,
                        n_equipo2, tipoDeporte, tipMusica, e1, e2, em, convert);
                    JOptionPane.showMessageDialog(rootPane, "Evento editado satisfactoriamente!"
                        , "Administrador de Eventos", WIDTH);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Evento no fue creado por Usuario!"
                        , "Error al Cancelar", WIDTH);
                }
            }else {
                JOptionPane.showMessageDialog(rootPane, "Codigo de Evento no existe!"
                    , "Error al Cancelar", WIDTH);
            }
        }
    }//GEN-LAST:event_btn_editarEventoActionPerformed

    private void btn_elimEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_elimEventoActionPerformed

        String codigo = txt_codigoElimEve.getText();
        if(nInterface != null){

            int cod = Integer.parseInt(codigo);
            if(eventos.buscarEvento(cod) != null){
                txt_codigoElimEve.setText("");

                if(nInterface.EventoEliminado(codigo)){
                    eventos.eliminarEvento(codigo);
                    JOptionPane.showMessageDialog(rootPane, "Evento cancelado satisfactoriamente!"
                        , "Administrador de Eventos", WIDTH);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Evento no fue creado por Usuario!"
                        , "Error al Cancelar", WIDTH);
                }
            }else {
                JOptionPane.showMessageDialog(rootPane, "Codigo de Evento no existe!"
                    , "Error al Cancelar", WIDTH);
            }
        }
    }//GEN-LAST:event_btn_elimEventoActionPerformed

    private void txt_codigoElimEveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoElimEveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoElimEveActionPerformed

    private void btn_crearEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearEventoActionPerformed

        //Campos Comunes
        String codigo = txt_codigoCrearEve.getText();
        String titulo = txt_tituloCrearEve.getText();
        String desc = txt_descCrearEve.getText();
        String renta = txt_rentaCrearEve.getText();
        String tipo = combo_tipoCrearEve.getSelectedItem().toString();
        //Fecha
        Calendar fecha = new GregorianCalendar();
        int dia = Integer.parseInt(combo_diaCrearEve.getSelectedItem().toString());
        int mes = Integer.parseInt(combo_mesCrearEve.getSelectedItem().toString());
        int ano = Integer.parseInt(combo_anoCrearEve.getSelectedItem().toString());
        fecha.set(ano, mes, dia);

        //Campos Adicionales Deporte
        String equipo1 = txt_equipo1CrearEve.getText();
        String equipo2 = txt_equipo2CrearEve.getText();
        String tipoDeporte = combo_tipoDeporteCrearEve.getSelectedItem().toString();
        //Campos Adicionales Musica
        String tipoMusica = combo_tipoMusicaCrearEve.getSelectedItem().toString();

        if (eventos.crearEvento(codigo, titulo, desc, renta, fecha, tipo, equipo1,
            equipo2, tipoDeporte, tipoMusica)) {

        //Campos en blanco
        txt_codigoCrearEve.setText("");
        txt_tituloCrearEve.setText("");
        txt_descCrearEve.setText("");
        txt_rentaCrearEve.setText("");
        txt_equipo1CrearEve.setText("");
        txt_equipo2CrearEve.setText("");

        //Utilizar interfaz de evento creado
        System.out.println(nInterface);
        if (nInterface != null) {
            nInterface.EventoCreado(codigo);
        }

        JOptionPane.showMessageDialog(rootPane, "Evento creado satisfactoriamente!"
            , "Administrador de Eventos", WIDTH);

        } else {

            JOptionPane.showMessageDialog(rootPane, "Codigo de Evento ya existe!"
                , "Error al Crear", WIDTH);

        }

    }//GEN-LAST:event_btn_crearEventoActionPerformed

    private void combo_tipoCrearEveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tipoCrearEveActionPerformed

        if (combo_tipoCrearEve.getSelectedItem().equals("Deportivo")) {

            //Campos Deporte true
            jp_deportivoCrearEve.setEnabled(true);
            txt_equipo1CrearEve.setEnabled(true);
            txt_equipo2CrearEve.setEnabled(true);
            combo_tipoDeporteCrearEve.setEnabled(true);
            lbl_equipo1CrearEve.setEnabled(true);
            lbl_equipo2CrearEve.setEnabled(true);
            lbl_tipoDeporteCrearEve.setEnabled(true);
            //Campos Musica false
            jp_musicalCrearEve.setEnabled(false);
            combo_tipoMusicaCrearEve.setEnabled(false);
            lbl_tipoMusicaCrearEve.setEnabled(false);

        } else if (combo_tipoCrearEve.getSelectedItem().equals("Musical")) {

            //Campos Deporte false
            jp_deportivoCrearEve.setEnabled(false);
            txt_equipo1CrearEve.setEnabled(false);
            txt_equipo2CrearEve.setEnabled(false);
            combo_tipoDeporteCrearEve.setEnabled(false);
            lbl_equipo1CrearEve.setEnabled(false);
            lbl_equipo2CrearEve.setEnabled(false);
            lbl_tipoDeporteCrearEve.setEnabled(false);
            //Campos Musica true
            jp_musicalCrearEve.setEnabled(true);
            combo_tipoMusicaCrearEve.setEnabled(true);
            lbl_tipoMusicaCrearEve.setEnabled(true);

        } else {

            //Campos Deporte y Musica false
            jp_deportivoCrearEve.setEnabled(false);
            txt_equipo1CrearEve.setEnabled(false);
            txt_equipo2CrearEve.setEnabled(false);
            combo_tipoDeporteCrearEve.setEnabled(false);
            lbl_equipo1CrearEve.setEnabled(false);
            lbl_equipo2CrearEve.setEnabled(false);
            lbl_tipoDeporteCrearEve.setEnabled(false);
            jp_musicalCrearEve.setEnabled(false);
            combo_tipoMusicaCrearEve.setEnabled(false);
            lbl_tipoMusicaCrearEve.setEnabled(false);

        }

    }//GEN-LAST:event_combo_tipoCrearEveActionPerformed

    private void txt_equipo1EditEveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_equipo1EditEveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_equipo1EditEveActionPerformed

    public void setNInterface(EventUserInterface i){
        this.nInterface = i;
    }

    public AdmEventos getEventos() {
        return eventos;
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
    private javax.swing.JButton btn_buscarEvento;
    private javax.swing.JButton btn_crearEvento;
    private javax.swing.JButton btn_editarEvento;
    private javax.swing.JButton btn_elimEvento;
    private javax.swing.JCheckBox cb_convertidosEditEve;
    private javax.swing.JComboBox combo_anoCrearEve;
    private javax.swing.JComboBox combo_anoEditEve;
    private javax.swing.JComboBox combo_diaCrearEve;
    private javax.swing.JComboBox combo_diaEditEve;
    private javax.swing.JComboBox combo_mesCrearEve;
    private javax.swing.JComboBox combo_mesEditEve;
    private javax.swing.JComboBox combo_tipoCrearEve;
    private javax.swing.JComboBox combo_tipoDeporteCrearEve;
    private javax.swing.JComboBox combo_tipoDeporteEditEve;
    private javax.swing.JComboBox combo_tipoMusicaCrearEve;
    private javax.swing.JComboBox combo_tipoMusicaEditEve;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton jb_add;
    private javax.swing.JButton jb_add1;
    private javax.swing.JButton jb_add2;
    private javax.swing.JButton jb_subs;
    private javax.swing.JButton jb_subs1;
    private javax.swing.JButton jb_subs2;
    private javax.swing.JPanel jp_deportivo;
    private javax.swing.JPanel jp_deportivoCrearEve;
    private javax.swing.JPanel jp_musica;
    private javax.swing.JPanel jp_musicalCrearEve;
    private javax.swing.JPanel jp_religion;
    private javax.swing.JTable jt_prueba;
    private javax.swing.JTable jt_prueba1;
    private javax.swing.JTable jt_prueba2;
    private javax.swing.JLabel lbl_codigoCrearEve;
    private javax.swing.JLabel lbl_codigoEditEve;
    private javax.swing.JLabel lbl_codigoElimEve;
    private javax.swing.JLabel lbl_descCrearEve;
    private javax.swing.JLabel lbl_descEditEve;
    private javax.swing.JLabel lbl_equipo1CrearEve;
    private javax.swing.JLabel lbl_equipo1CrearEve1;
    private javax.swing.JLabel lbl_equipo1CrearEve2;
    private javax.swing.JLabel lbl_equipo1CrearEve3;
    private javax.swing.JLabel lbl_equipo2CrearEve;
    private javax.swing.JLabel lbl_fechaCrearEve;
    private javax.swing.JLabel lbl_fechaEditEve;
    private javax.swing.JLabel lbl_rentEditEve;
    private javax.swing.JLabel lbl_rentaCrearEve;
    private javax.swing.JLabel lbl_tipoCrearEve;
    private javax.swing.JLabel lbl_tipoDeporteCrearEve;
    private javax.swing.JLabel lbl_tipoDeporteCrearEve1;
    private javax.swing.JLabel lbl_tipoEditEve;
    private javax.swing.JLabel lbl_tipoMusicaCrearEve;
    private javax.swing.JLabel lbl_tituloBuscEve;
    private javax.swing.JLabel lbl_tituloCrearEve;
    private javax.swing.JLabel lbl_tituloEditEve;
    private javax.swing.JPanel p_crearEvento;
    public javax.swing.JPanel p_editarEvento;
    public javax.swing.JPanel p_eliminarEvento;
    private javax.swing.JTabbedPane tp_eventos;
    private javax.swing.JTextField txt_cantConverEditEve;
    private javax.swing.JTextField txt_codigoBuscEve;
    private javax.swing.JTextField txt_codigoCrearEve;
    private javax.swing.JTextField txt_codigoEditEve;
    private javax.swing.JTextField txt_codigoElimEve;
    private javax.swing.JTextField txt_descCrearEve;
    private javax.swing.JTextField txt_descEditEve;
    private javax.swing.JTextField txt_equipo1CrearEve;
    private javax.swing.JTextField txt_equipo1EditEve;
    private javax.swing.JTextField txt_equipo2CrearEve;
    private javax.swing.JTextField txt_equipo2EditEve;
    private javax.swing.JTextField txt_jugadores1;
    private javax.swing.JTextField txt_jugadores2;
    private javax.swing.JTextField txt_rentEditEve;
    private javax.swing.JTextField txt_rentaCrearEve;
    private javax.swing.JTextField txt_staff;
    private javax.swing.JTextField txt_tituloCrearEve;
    private javax.swing.JTextField txt_tituloEditEve;
    // End of variables declaration//GEN-END:variables
}
