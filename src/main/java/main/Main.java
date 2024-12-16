/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.BorderLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author marcos
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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

        tamañoTexto = new javax.swing.ButtonGroup();
        window1 = new gui.Window();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        small = new javax.swing.JRadioButtonMenuItem();
        medium = new javax.swing.JRadioButtonMenuItem();
        large = new javax.swing.JRadioButtonMenuItem();
        ventanaCondicionesServicio = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(900, 560));
        setMinimumSize(new java.awt.Dimension(900, 560));
        setPreferredSize(new java.awt.Dimension(900, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        window1.setMaximumSize(new java.awt.Dimension(900, 500));
        window1.setMinimumSize(new java.awt.Dimension(800, 450));
        getContentPane().add(window1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menu.setText("Tamaño texto");

        tamañoTexto.add(small);
        small.setText("Pequeño");
        small.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smallActionPerformed(evt);
            }
        });
        menu.add(small);

        tamañoTexto.add(medium);
        medium.setSelected(true);
        medium.setText("Mediano");
        medium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumActionPerformed(evt);
            }
        });
        menu.add(medium);

        tamañoTexto.add(large);
        large.setText("Grande");
        large.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                largeActionPerformed(evt);
            }
        });
        menu.add(large);

        jMenuBar1.add(menu);

        ventanaCondicionesServicio.setText("Condiciones de Servicio");
        ventanaCondicionesServicio.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                ventanaCondicionesServicioMenuSelected(evt);
            }
        });
        jMenuBar1.add(ventanaCondicionesServicio);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void smallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smallActionPerformed
        // TODO add your handling code here:
        window1.sizes(1);
    }//GEN-LAST:event_smallActionPerformed

    private void largeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_largeActionPerformed
        // TODO add your handling code here:
        window1.sizes(3);
    }//GEN-LAST:event_largeActionPerformed

    private void mediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumActionPerformed
        // TODO add your handling code here:
        window1.sizes(2);
    }//GEN-LAST:event_mediumActionPerformed

    private void ventanaCondicionesServicioMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_ventanaCondicionesServicioMenuSelected
        // TODO add your handling code here:
        mostrarCondicionesServicio();
    }//GEN-LAST:event_ventanaCondicionesServicioMenuSelected

    private void mostrarCondicionesServicio() {
        JFrame condicionesFrame = new JFrame("Condiciones de Servicio");
        condicionesFrame.setSize(300, 300);
        condicionesFrame.setLayout(new BorderLayout());

        JTextArea textoCondiciones = new JTextArea("Estas son las condiciones de servicio...");
        textoCondiciones.setEditable(false);
        condicionesFrame.add(textoCondiciones, BorderLayout.CENTER);

        JCheckBox aceptarCheck = new JCheckBox("Aceptar condiciones para cerrar");
        condicionesFrame.add(aceptarCheck, BorderLayout.SOUTH);

        condicionesFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        aceptarCheck.addActionListener(e -> {
            if (aceptarCheck.isSelected()) {
                condicionesFrame.dispose();
            }
        });

        condicionesFrame.setVisible(true);
    }
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButtonMenuItem large;
    private javax.swing.JRadioButtonMenuItem medium;
    private javax.swing.JMenu menu;
    private javax.swing.JRadioButtonMenuItem small;
    private javax.swing.ButtonGroup tamañoTexto;
    private javax.swing.JMenu ventanaCondicionesServicio;
    private gui.Window window1;
    // End of variables declaration//GEN-END:variables
}
