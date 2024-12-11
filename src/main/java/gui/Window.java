/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import java.awt.Color;
import logic.porcentajes;

public class Window extends javax.swing.JPanel {

    public Window() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        formPanel = new javax.swing.JPanel();
        jlabel5 = new javax.swing.JLabel();
        tirosCampoAcertados = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        triples = new javax.swing.JTextField();
        tirosLibresTotales = new javax.swing.JTextField();
        dobles = new javax.swing.JTextField();
        jlabel6 = new javax.swing.JLabel();
        tirosCampoTotales = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        libres = new javax.swing.JTextField();
        logoPanel = new javax.swing.JPanel();
        informador = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        addInfo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        formPanel.setBackground(new java.awt.Color(204, 255, 255));
        formPanel.setPreferredSize(new java.awt.Dimension(500, 500));
        java.awt.GridBagLayout formPanelLayout = new java.awt.GridBagLayout();
        formPanelLayout.columnWidths = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        formPanelLayout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        formPanel.setLayout(formPanelLayout);

        jlabel5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jlabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel5.setText("Tiros libres intentados");
        jlabel5.setPreferredSize(new java.awt.Dimension(170, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        formPanel.add(jlabel5, gridBagConstraints);

        tirosCampoAcertados.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        tirosCampoAcertados.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        tirosCampoAcertados.setPreferredSize(new java.awt.Dimension(93, 25));
        tirosCampoAcertados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tirosCampoAcertadosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        formPanel.add(tirosCampoAcertados, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tiros de campo acertados");
        jLabel2.setToolTipText("");
        jLabel2.setMaximumSize(new java.awt.Dimension(200, 19));
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 20));
        formPanel.add(jLabel2, new java.awt.GridBagConstraints());

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Triples");
        jLabel3.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        formPanel.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Dobles");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        formPanel.add(jLabel4, gridBagConstraints);

        triples.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        triples.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        triples.setPreferredSize(new java.awt.Dimension(65, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        formPanel.add(triples, gridBagConstraints);

        tirosLibresTotales.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        tirosLibresTotales.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        tirosLibresTotales.setPreferredSize(new java.awt.Dimension(93, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        formPanel.add(tirosLibresTotales, gridBagConstraints);

        dobles.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        dobles.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        dobles.setPreferredSize(new java.awt.Dimension(65, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        formPanel.add(dobles, gridBagConstraints);

        jlabel6.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jlabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel6.setText("Tiros de campo totales");
        jlabel6.setPreferredSize(new java.awt.Dimension(170, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        formPanel.add(jlabel6, gridBagConstraints);

        tirosCampoTotales.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        tirosCampoTotales.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        tirosCampoTotales.setPreferredSize(new java.awt.Dimension(93, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        formPanel.add(tirosCampoTotales, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Libres");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        formPanel.add(jLabel5, gridBagConstraints);

        libres.setFont(new java.awt.Font("Cantarell", 2, 15)); // NOI18N
        libres.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        libres.setPreferredSize(new java.awt.Dimension(65, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        formPanel.add(libres, gridBagConstraints);

        add(formPanel, java.awt.BorderLayout.CENTER);

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
            .addGap(0, 342, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
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
        if(fieldEmpty(dobles) || fieldEmpty(triples) || fieldEmpty(tirosCampoAcertados) || fieldEmpty(tirosLibresTotales) || fieldEmpty(tirosCampoTotales) || fieldEmpty(libres)) {
            informador.setText("Faltan campos por completar");
            informador.setForeground(Color.red);
        } else {
            int tca = Integer.parseInt(tirosCampoAcertados.getText());
            int tct = Integer.parseInt(tirosCampoTotales.getText());
            int tli = Integer.parseInt(tirosLibresTotales.getText());
            int t = Integer.parseInt(triples.getText());
            int d = Integer.parseInt(dobles.getText());
            int l = Integer.parseInt(libres.getText());
            
            porcentajes.creararchivo(tca, tct, tli, t, d, l);
            informador.setText("Accion Completada");
            informador.setForeground(Color.green);
        }
        
    }//GEN-LAST:event_addInfoActionPerformed

    private void tirosCampoAcertadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tirosCampoAcertadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tirosCampoAcertadosActionPerformed
    

    private boolean fieldEmpty(javax.swing.JTextField tf){
        String text = tf.getText();
        if(text == null) {
            return false;
        }
        return text.isEmpty();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton addInfo;
    private javax.swing.JTextField dobles;
    private javax.swing.JPanel formPanel;
    private javax.swing.JLabel informador;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlabel5;
    private javax.swing.JLabel jlabel6;
    private javax.swing.JTextField libres;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JTextField tirosCampoAcertados;
    private javax.swing.JTextField tirosCampoTotales;
    private javax.swing.JTextField tirosLibresTotales;
    private javax.swing.JTextField triples;
    // End of variables declaration//GEN-END:variables
}
