/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JTextField;
import logic.porcentajes;

public class Window extends javax.swing.JPanel {
    
    public Window() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        TabbedPane = new javax.swing.JTabbedPane();
        panelPositivo = new javax.swing.JPanel();
        jlabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        triples = new javax.swing.JTextField();
        tirosLibresTotales = new javax.swing.JTextField();
        dobles = new javax.swing.JTextField();
        jlabel6 = new javax.swing.JLabel();
        tirosCampoTotales = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        libres = new javax.swing.JTextField();
        javax.swing.JLabel jlabel7 = new javax.swing.JLabel();
        faltasRecibidas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rebotes = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        asistencias = new javax.swing.JTextField();
        robos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tapones = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        panelNegativo = new javax.swing.JPanel();
        jlabel13 = new javax.swing.JLabel();
        faltasCometidas = new javax.swing.JTextField();
        jlabel14 = new javax.swing.JLabel();
        perdidasBalon = new javax.swing.JTextField();
        logoPanel = new javax.swing.JPanel();
        informador = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        addInfo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        TabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        TabbedPane.setPreferredSize(new java.awt.Dimension(500, 500));

        panelPositivo.setBackground(new java.awt.Color(204, 255, 255));
        panelPositivo.setPreferredSize(new java.awt.Dimension(500, 500));
        java.awt.GridBagLayout formPanelLayout = new java.awt.GridBagLayout();
        formPanelLayout.columnWidths = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        formPanelLayout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        panelPositivo.setLayout(formPanelLayout);

        jlabel5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jlabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel5.setText("Tiros libres intentados");
        jlabel5.setPreferredSize(new java.awt.Dimension(170, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        panelPositivo.add(jlabel5, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Triples");
        jLabel3.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        panelPositivo.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Dobles");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        panelPositivo.add(jLabel4, gridBagConstraints);

        triples.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        triples.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        triples.setPreferredSize(new java.awt.Dimension(65, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        panelPositivo.add(triples, gridBagConstraints);

        tirosLibresTotales.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        tirosLibresTotales.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        tirosLibresTotales.setPreferredSize(new java.awt.Dimension(93, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        panelPositivo.add(tirosLibresTotales, gridBagConstraints);

        dobles.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        dobles.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        dobles.setPreferredSize(new java.awt.Dimension(65, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        panelPositivo.add(dobles, gridBagConstraints);

        jlabel6.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jlabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel6.setText("Tiros de campo totales");
        jlabel6.setPreferredSize(new java.awt.Dimension(170, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        panelPositivo.add(jlabel6, gridBagConstraints);

        tirosCampoTotales.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        tirosCampoTotales.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        tirosCampoTotales.setPreferredSize(new java.awt.Dimension(93, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        panelPositivo.add(tirosCampoTotales, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Libres");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        panelPositivo.add(jLabel5, gridBagConstraints);

        libres.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        libres.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        libres.setPreferredSize(new java.awt.Dimension(65, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        panelPositivo.add(libres, gridBagConstraints);

        jlabel7.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jlabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel7.setText("Faltas recibidas");
        jlabel7.setPreferredSize(new java.awt.Dimension(170, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        panelPositivo.add(jlabel7, gridBagConstraints);

        faltasRecibidas.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        faltasRecibidas.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        faltasRecibidas.setPreferredSize(new java.awt.Dimension(93, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        panelPositivo.add(faltasRecibidas, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Rebotes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        panelPositivo.add(jLabel6, gridBagConstraints);

        rebotes.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        rebotes.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        rebotes.setPreferredSize(new java.awt.Dimension(65, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        panelPositivo.add(rebotes, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Asistencias");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        panelPositivo.add(jLabel7, gridBagConstraints);

        asistencias.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        asistencias.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        asistencias.setPreferredSize(new java.awt.Dimension(65, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        panelPositivo.add(asistencias, gridBagConstraints);

        robos.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        robos.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        robos.setPreferredSize(new java.awt.Dimension(65, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 18;
        panelPositivo.add(robos, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Robos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 16;
        panelPositivo.add(jLabel8, gridBagConstraints);

        tapones.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        tapones.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        tapones.setPreferredSize(new java.awt.Dimension(65, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        panelPositivo.add(tapones, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Tapones");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        panelPositivo.add(jLabel9, gridBagConstraints);

        TabbedPane.addTab("Positivo", panelPositivo);

        panelNegativo.setBackground(new java.awt.Color(204, 255, 255));
        panelNegativo.setPreferredSize(new java.awt.Dimension(500, 500));
        java.awt.GridBagLayout formPanel1Layout = new java.awt.GridBagLayout();
        formPanel1Layout.columnWidths = new int[] {0};
        formPanel1Layout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0};
        panelNegativo.setLayout(formPanel1Layout);

        jlabel13.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jlabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel13.setText("Faltas cometidas");
        jlabel13.setPreferredSize(new java.awt.Dimension(170, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        panelNegativo.add(jlabel13, gridBagConstraints);

        faltasCometidas.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        faltasCometidas.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        faltasCometidas.setPreferredSize(new java.awt.Dimension(93, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        panelNegativo.add(faltasCometidas, gridBagConstraints);

        jlabel14.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jlabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel14.setText("Perdidas de balon");
        jlabel14.setPreferredSize(new java.awt.Dimension(170, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        panelNegativo.add(jlabel14, gridBagConstraints);

        perdidasBalon.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        perdidasBalon.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        perdidasBalon.setPreferredSize(new java.awt.Dimension(93, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        panelNegativo.add(perdidasBalon, gridBagConstraints);

        TabbedPane.addTab("Negativo", panelNegativo);

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

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        Logo.setBorder(javax.swing.BorderFactory.createEmptyBorder(60, 1, 30, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weighty = 0.2;
        logoPanel.add(Logo, gridBagConstraints);

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
            
            
            porcentajes.excel(tca, tct, tli, t, d, l, re, asis, ro, ta, fr, pb, fc);
            informador.setText("Accion Completada");
            informador.setForeground(Color.green);
        }
        
    }//GEN-LAST:event_addInfoActionPerformed
    
    private boolean fieldEmpty(JTextField dato){
        String text = dato.getText();
        return text == null || text.isEmpty();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JButton addInfo;
    private javax.swing.JTextField asistencias;
    private javax.swing.JTextField dobles;
    private javax.swing.JTextField faltasCometidas;
    private javax.swing.JTextField faltasRecibidas;
    private javax.swing.JLabel informador;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlabel13;
    private javax.swing.JLabel jlabel14;
    private javax.swing.JLabel jlabel5;
    private javax.swing.JLabel jlabel6;
    private javax.swing.JTextField libres;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JPanel panelNegativo;
    private javax.swing.JPanel panelPositivo;
    private javax.swing.JTextField perdidasBalon;
    private javax.swing.JTextField rebotes;
    private javax.swing.JTextField robos;
    private javax.swing.JTextField tapones;
    private javax.swing.JTextField tirosCampoTotales;
    private javax.swing.JTextField tirosLibresTotales;
    private javax.swing.JTextField triples;
    // End of variables declaration//GEN-END:variables
}