/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import java.awt.Color;
import javax.swing.JTextField;
import logic.Excel;
import logic.Graficos;

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panelJugadores = new javax.swing.JPanel();
        bChicagoBulls = new javax.swing.JRadioButton();
        bAtlantaHawks = new javax.swing.JRadioButton();
        cbEquipos = new javax.swing.JComboBox<>();
        logoEquipos = new javax.swing.JLabel();
        buttonGrafico = new javax.swing.JButton();
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
        gridBagConstraints.gridx = 2;
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
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        panelPuntuaje.add(triples, gridBagConstraints);

        dobles.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        dobles.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        dobles.setPreferredSize(new java.awt.Dimension(65, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        panelPuntuaje.add(dobles, gridBagConstraints);

        libres.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        libres.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        libres.setPreferredSize(new java.awt.Dimension(65, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        panelPuntuaje.add(libres, gridBagConstraints);

        asistencias.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        asistencias.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        asistencias.setPreferredSize(new java.awt.Dimension(65, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        panelPuntuaje.add(asistencias, gridBagConstraints);

        robos.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        robos.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        robos.setPreferredSize(new java.awt.Dimension(65, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
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

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tiros libres intentados");
        jLabel1.setPreferredSize(new java.awt.Dimension(170, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        panelPuntuaje.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tiros de campo totales");
        jLabel2.setPreferredSize(new java.awt.Dimension(170, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        panelPuntuaje.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Triples");
        jLabel3.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        panelPuntuaje.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Dobles");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        panelPuntuaje.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Libres");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        panelPuntuaje.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Rebotes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 20;
        panelPuntuaje.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Asistencias");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        panelPuntuaje.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Robos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 16;
        panelPuntuaje.add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Tapones");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        panelPuntuaje.add(jLabel9, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Faltas recibidas");
        jLabel10.setPreferredSize(new java.awt.Dimension(170, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        panelPuntuaje.add(jLabel10, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Faltas cometidas");
        jLabel11.setPreferredSize(new java.awt.Dimension(170, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        panelPuntuaje.add(jLabel11, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Perdidas de balon");
        jLabel12.setPreferredSize(new java.awt.Dimension(170, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        panelPuntuaje.add(jLabel12, gridBagConstraints);

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
        gridBagConstraints.gridy = 4;
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
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.insets = new java.awt.Insets(0, 14, 0, 0);
        panelJugadores.add(bAtlantaHawks, gridBagConstraints);

        cbEquipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jalen  Smith", "Adama Sanogo", "Patrick Williams", "Josh Giddey", "Jevon Carter" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
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

        buttonGrafico.setText("Sacar Grafico");
        buttonGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGraficoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        panelJugadores.add(buttonGrafico, gridBagConstraints);

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
            boolean equipo = bChicagoBulls.isSelected();
            String jugador = cbEquipos.getSelectedItem().toString();
            
            Excel.excel(equipo, jugador, tca, tct, tli, t, d, l, re, asis, ro, ta, fr, pb, fc);
            informador.setText("Accion Completada");
            informador.setForeground(Color.green);
        }
        
    }//GEN-LAST:event_addInfoActionPerformed

    private void bChicagoBullsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bChicagoBullsActionPerformed
        // TODO add your handling code here:
        logoEquipos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chicagoBulls.png")));
        cbEquipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jalen  Smith", "Adama Sanogo", "Patrick Williams", "Josh Giddey", "Jevon Carter" }));
    }//GEN-LAST:event_bChicagoBullsActionPerformed

    private void bAtlantaHawksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtlantaHawksActionPerformed
        // TODO add your handling code here:
        logoEquipos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atlantaHawks.png")));
        cbEquipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trae Young", "David Roddy", "Kobe Bufkin", "Dominick Barlow", "Cody Zeller" }));
    }//GEN-LAST:event_bAtlantaHawksActionPerformed

    private void buttonGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGraficoActionPerformed
        // TODO add your handling code here:
        boolean equipo = bChicagoBulls.isSelected();
        String jugador = cbEquipos.getSelectedItem().toString();
        Graficos.grafico(equipo, jugador);
        informador.setText("Grafico creado");
        informador.setForeground(Color.green);
        
    }//GEN-LAST:event_buttonGraficoActionPerformed
    
    private boolean fieldEmpty(JTextField dato){
        String text = dato.getText();
        return text == null || text.isEmpty();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JButton addInfo;
    private javax.swing.JTextField asistencias;
    private javax.swing.JRadioButton bAtlantaHawks;
    private javax.swing.JRadioButton bChicagoBulls;
    private javax.swing.JButton buttonGrafico;
    private javax.swing.JComboBox<String> cbEquipos;
    private javax.swing.JTextField dobles;
    private javax.swing.ButtonGroup equipos;
    private javax.swing.JTextField faltasCometidas;
    private javax.swing.JTextField faltasRecibidas;
    private javax.swing.JLabel informador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JTextField tirosCampoTotales;
    private javax.swing.JTextField tirosLibresTotales;
    private javax.swing.JTextField triples;
    // End of variables declaration//GEN-END:variables
}