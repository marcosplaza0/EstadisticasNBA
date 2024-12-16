/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import logic.Excel;
import logic.Graficos;
import logic.PDF;

public class Window extends javax.swing.JPanel {
    
    public Window() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        equipos = new javax.swing.ButtonGroup();
        TabbedPane = new javax.swing.JTabbedPane();
        panelPuntuaje = new javax.swing.JPanel();
        tirosCampoTotales = new javax.swing.JTextField();
        tirosLibresTotales = new javax.swing.JTextField();
        faltasRecibidas = new javax.swing.JTextField();
        rebotes = new javax.swing.JTextField();
        tapones = new javax.swing.JTextField();
        triples = new javax.swing.JTextField();
        dobles = new javax.swing.JTextField();
        libres = new javax.swing.JTextField();
        asistencias = new javax.swing.JTextField();
        robos = new javax.swing.JTextField();
        faltasCometidas = new javax.swing.JTextField();
        perdidasBalon = new javax.swing.JTextField();
        texto1 = new gui.Texto();
        texto3 = new gui.Texto();
        texto4 = new gui.Texto();
        texto5 = new gui.Texto();
        texto6 = new gui.Texto();
        texto7 = new gui.Texto();
        texto8 = new gui.Texto();
        texto9 = new gui.Texto();
        texto10 = new gui.Texto();
        texto11 = new gui.Texto();
        texto12 = new gui.Texto();
        texto2 = new gui.Texto();
        panelJugadores = new javax.swing.JPanel();
        bChicagoBulls = new javax.swing.JRadioButton();
        bAtlantaHawks = new javax.swing.JRadioButton();
        cbEquipos = new javax.swing.JComboBox<>();
        logoEquipos = new javax.swing.JLabel();
        buttonGraficoPuntos = new javax.swing.JButton();
        botonGraficoRebotes = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        logoPanel = new javax.swing.JPanel();
        informador = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        addInfo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        TabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        TabbedPane.setPreferredSize(new java.awt.Dimension(500, 500));

        panelPuntuaje.setBackground(new java.awt.Color(204, 255, 255));
        panelPuntuaje.setPreferredSize(new java.awt.Dimension(500, 500));
        java.awt.GridBagLayout formPanelLayout = new java.awt.GridBagLayout();
        formPanelLayout.columnWidths = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        formPanelLayout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        panelPuntuaje.setLayout(formPanelLayout);

        tirosCampoTotales.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        tirosCampoTotales.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        tirosCampoTotales.setPreferredSize(new java.awt.Dimension(93, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        panelPuntuaje.add(tirosCampoTotales, gridBagConstraints);

        tirosLibresTotales.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        tirosLibresTotales.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        tirosLibresTotales.setPreferredSize(new java.awt.Dimension(93, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        panelPuntuaje.add(tirosLibresTotales, gridBagConstraints);

        faltasRecibidas.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        faltasRecibidas.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        faltasRecibidas.setPreferredSize(new java.awt.Dimension(93, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        panelPuntuaje.add(faltasRecibidas, gridBagConstraints);

        rebotes.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        rebotes.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        rebotes.setPreferredSize(new java.awt.Dimension(65, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 22;
        panelPuntuaje.add(rebotes, gridBagConstraints);

        tapones.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        tapones.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        tapones.setPreferredSize(new java.awt.Dimension(65, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 22;
        panelPuntuaje.add(tapones, gridBagConstraints);

        triples.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        triples.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        triples.setPreferredSize(new java.awt.Dimension(65, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        panelPuntuaje.add(triples, gridBagConstraints);

        dobles.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        dobles.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        dobles.setPreferredSize(new java.awt.Dimension(65, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        panelPuntuaje.add(dobles, gridBagConstraints);

        libres.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        libres.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        libres.setPreferredSize(new java.awt.Dimension(65, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        panelPuntuaje.add(libres, gridBagConstraints);

        asistencias.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        asistencias.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        asistencias.setPreferredSize(new java.awt.Dimension(65, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 14;
        panelPuntuaje.add(asistencias, gridBagConstraints);

        robos.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        robos.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        robos.setPreferredSize(new java.awt.Dimension(65, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 18;
        panelPuntuaje.add(robos, gridBagConstraints);

        faltasCometidas.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        faltasCometidas.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        faltasCometidas.setPreferredSize(new java.awt.Dimension(93, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        panelPuntuaje.add(faltasCometidas, gridBagConstraints);

        perdidasBalon.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        perdidasBalon.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        perdidasBalon.setPreferredSize(new java.awt.Dimension(93, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        panelPuntuaje.add(perdidasBalon, gridBagConstraints);

        texto1.setText("Tiros campo totales");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        panelPuntuaje.add(texto1, gridBagConstraints);

        texto3.setText("Tiros libres intentados");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        panelPuntuaje.add(texto3, gridBagConstraints);

        texto4.setText("Faltas recibidas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        panelPuntuaje.add(texto4, gridBagConstraints);

        texto5.setText("Faltas cometidas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        panelPuntuaje.add(texto5, gridBagConstraints);

        texto6.setText("Perdidas de balon");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        panelPuntuaje.add(texto6, gridBagConstraints);

        texto7.setText("Tapones");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        panelPuntuaje.add(texto7, gridBagConstraints);

        texto8.setText("Triples");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        panelPuntuaje.add(texto8, gridBagConstraints);

        texto9.setText("Dobles");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        panelPuntuaje.add(texto9, gridBagConstraints);

        texto10.setText("Libres");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        panelPuntuaje.add(texto10, gridBagConstraints);

        texto11.setText("Asistencias");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 12;
        panelPuntuaje.add(texto11, gridBagConstraints);

        texto12.setText("Robos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 16;
        panelPuntuaje.add(texto12, gridBagConstraints);

        texto2.setText("Rebotes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 20;
        panelPuntuaje.add(texto2, gridBagConstraints);

        TabbedPane.addTab("Puntuaje", panelPuntuaje);

        panelJugadores.setBackground(new java.awt.Color(204, 255, 255));
        panelJugadores.setPreferredSize(new java.awt.Dimension(500, 500));
        java.awt.GridBagLayout formPanel1Layout = new java.awt.GridBagLayout();
        formPanel1Layout.columnWidths = new int[] {0, 10, 0};
        formPanel1Layout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        panelJugadores.setLayout(formPanel1Layout);

        equipos.add(bChicagoBulls);
        bChicagoBulls.setSelected(true);
        bChicagoBulls.setText("Chicago Bulls");
        bChicagoBulls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bChicagoBullsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 14);
        panelJugadores.add(bChicagoBulls, gridBagConstraints);

        equipos.add(bAtlantaHawks);
        bAtlantaHawks.setText("Atlanta Hawks");
        bAtlantaHawks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtlantaHawksActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.insets = new java.awt.Insets(0, 14, 0, 0);
        panelJugadores.add(bAtlantaHawks, gridBagConstraints);

        cbEquipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jalen  Smith", "Adama Sanogo", "Patrick Williams", "Josh Giddey", "Jevon Carter" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.ipady = 6;
        panelJugadores.add(cbEquipos, gridBagConstraints);

        logoEquipos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoEquipos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chicagoBulls.png"))); // NOI18N
        logoEquipos.setPreferredSize(new java.awt.Dimension(250, 250));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        panelJugadores.add(logoEquipos, gridBagConstraints);

        buttonGraficoPuntos.setText("Grafico puntos");
        buttonGraficoPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGraficoPuntosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        panelJugadores.add(buttonGraficoPuntos, gridBagConstraints);

        botonGraficoRebotes.setText("Grafico rebotes");
        botonGraficoRebotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGraficoRebotesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        panelJugadores.add(botonGraficoRebotes, gridBagConstraints);

        jButton1.setText("Generar PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        panelJugadores.add(jButton1, gridBagConstraints);

        TabbedPane.addTab("Jugador", panelJugadores);

        add(TabbedPane, java.awt.BorderLayout.WEST);

        logoPanel.setBackground(new java.awt.Color(153, 153, 153));
        logoPanel.setPreferredSize(new java.awt.Dimension(400, 500));
        logoPanel.setLayout(new java.awt.GridBagLayout());

        informador.setBackground(new java.awt.Color(211, 210, 210));
        informador.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        informador.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(100, 0, 0, 0);
        logoPanel.add(informador, gridBagConstraints);

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        logo.setBorder(javax.swing.BorderFactory.createEmptyBorder(60, 1, 30, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weighty = 0.2;
        logoPanel.add(logo, gridBagConstraints);

        addInfo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        addInfo.setText("Añadir información");
        addInfo.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        addInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInfoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 80, 0);
        logoPanel.add(addInfo, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(211, 210, 210));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        jPanel1.setForeground(new java.awt.Color(242, 242, 242));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 450));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        logoPanel.add(jPanel1, gridBagConstraints);

        add(logoPanel, java.awt.BorderLayout.EAST);
    }// </editor-fold>//GEN-END:initComponents

    private void addInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInfoActionPerformed
        // TODO add your handling code here:
        if(fieldEmpty(tirosCampoTotales) || fieldEmpty(tirosLibresTotales) || fieldEmpty(triples) || fieldEmpty(dobles) || fieldEmpty(libres) || fieldEmpty(rebotes) || fieldEmpty(asistencias) || fieldEmpty(robos) || fieldEmpty(tapones) || fieldEmpty(faltasRecibidas) || fieldEmpty(perdidasBalon) || fieldEmpty(faltasCometidas)) {
            informador.setText("Faltan campos por completar");
            informador.setForeground(Color.red);
        } else {
            int tct = Integer.parseInt(tirosCampoTotales.getText());
            int tli = Integer.parseInt(tirosLibresTotales.getText());
            int t = Integer.parseInt(triples.getText());
            int d = Integer.parseInt(dobles.getText());
            int l = Integer.parseInt(libres.getText());
            int re = Integer.parseInt(rebotes.getText());
            int asis = Integer.parseInt(asistencias.getText());
            int ro = Integer.parseInt(robos.getText());
            int ta = Integer.parseInt(tapones.getText());
            int fr = Integer.parseInt(faltasRecibidas.getText());
            int pb = Integer.parseInt(perdidasBalon.getText());
            int fc = Integer.parseInt(faltasCometidas.getText());
            int tca = t + d;
            if(validarTiros(tca,tct)) {
                boolean equipo = bChicagoBulls.isSelected();
                String jugador = cbEquipos.getSelectedItem().toString();

                Excel.excel(equipo, jugador, tca, tct, tli, t, d, l, re, asis, ro, ta, fr, pb, fc);
                informador.setText("Accion Completada");
                informador.setForeground(Color.green);
            } else {
                informador.setText("Revisa los datos");
                informador.setForeground(Color.red);
            }
        }
    }//GEN-LAST:event_addInfoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean equipo = bChicagoBulls.isSelected();
        String jugador = cbEquipos.getSelectedItem().toString();
        PDF.pdf(equipo, jugador);
        informador.setText("PDF creado");
        informador.setForeground(Color.green);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonGraficoRebotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGraficoRebotesActionPerformed
        // TODO add your handling code here:
        boolean equipo = bChicagoBulls.isSelected();
        String jugador = cbEquipos.getSelectedItem().toString();
        Graficos.graficoRebotes(equipo, jugador);
        informador.setText("Grafico creado");
        informador.setForeground(Color.green);
    }//GEN-LAST:event_botonGraficoRebotesActionPerformed

    private void buttonGraficoPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGraficoPuntosActionPerformed
        // TODO add your handling code here:
        boolean equipo = bChicagoBulls.isSelected();
        String jugador = cbEquipos.getSelectedItem().toString();
        Graficos.graficoPersonalizado(equipo, jugador, "Puntos", 11);
        informador.setText("Grafico creado");
        informador.setForeground(Color.green);

    }//GEN-LAST:event_buttonGraficoPuntosActionPerformed

    private void bAtlantaHawksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtlantaHawksActionPerformed
        // TODO add your handling code here:
        logoEquipos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atlantaHawks.png")));
        cbEquipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trae Young", "David Roddy", "Kobe Bufkin", "Dominick Barlow", "Cody Zeller" }));
    }//GEN-LAST:event_bAtlantaHawksActionPerformed

    private void bChicagoBullsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bChicagoBullsActionPerformed
        // TODO add your handling code here:
        logoEquipos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chicagoBulls.png")));
        cbEquipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jalen  Smith", "Adama Sanogo", "Patrick Williams", "Josh Giddey", "Jevon Carter" }));
    }//GEN-LAST:event_bChicagoBullsActionPerformed
    
    private boolean fieldEmpty(JTextField dato){
        String text = dato.getText();
        return text == null || text.isEmpty();
    }
    
    private boolean validarTiros(int tirosMetidos, int tirosTirados) {
        if(tirosMetidos > tirosTirados) {
            JFrame condicionesFrame = new JFrame("Error");
            condicionesFrame.setSize(1000, 300);
            condicionesFrame.setLayout(new BorderLayout());

            JLabel textoCondiciones = new JLabel("Los tiros metidos son superiores a los tirados, revisa los datos");
            Font font = new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 24);
            textoCondiciones.setFont(font);
            textoCondiciones.setForeground(Color.RED);
            
            textoCondiciones.setHorizontalAlignment(SwingConstants.CENTER);
            condicionesFrame.add(textoCondiciones, BorderLayout.CENTER);

            condicionesFrame.setVisible(true);
            return false;
        }
        return true;
    }
    
    public void sizes(int num) {
        texto1.setSizeMode(num);
        texto2.setSizeMode(num);
        texto3.setSizeMode(num);
        texto4.setSizeMode(num);
        texto5.setSizeMode(num);
        texto6.setSizeMode(num);
        texto7.setSizeMode(num);
        texto8.setSizeMode(num);
        texto9.setSizeMode(num);
        texto10.setSizeMode(num);
        texto11.setSizeMode(num);
        texto12.setSizeMode(num);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JButton addInfo;
    private javax.swing.JTextField asistencias;
    private javax.swing.JRadioButton bAtlantaHawks;
    private javax.swing.JRadioButton bChicagoBulls;
    private javax.swing.JButton botonGraficoRebotes;
    private javax.swing.JButton buttonGraficoPuntos;
    private javax.swing.JComboBox<String> cbEquipos;
    private javax.swing.JTextField dobles;
    private javax.swing.ButtonGroup equipos;
    private javax.swing.JTextField faltasCometidas;
    private javax.swing.JTextField faltasRecibidas;
    private javax.swing.JLabel informador;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField libres;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoEquipos;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JPanel panelJugadores;
    private javax.swing.JPanel panelPuntuaje;
    private javax.swing.JTextField perdidasBalon;
    private javax.swing.JTextField rebotes;
    private javax.swing.JTextField robos;
    private javax.swing.JTextField tapones;
    private gui.Texto texto1;
    private gui.Texto texto10;
    private gui.Texto texto11;
    private gui.Texto texto12;
    private gui.Texto texto2;
    private gui.Texto texto3;
    private gui.Texto texto4;
    private gui.Texto texto5;
    private gui.Texto texto6;
    private gui.Texto texto7;
    private gui.Texto texto8;
    private gui.Texto texto9;
    private javax.swing.JTextField tirosCampoTotales;
    private javax.swing.JTextField tirosLibresTotales;
    private javax.swing.JTextField triples;
    // End of variables declaration//GEN-END:variables
}