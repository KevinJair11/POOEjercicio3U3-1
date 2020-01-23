/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;

/**
 *
 * @author labctr
 */
public class VtnPrincipal extends javax.swing.JFrame {

    
    public static void verMensaje(String mensaje, String titulo, int tipo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, tipo);
    }
    /**
     * Creates new form VtnPrincipal
     */
    public VtnPrincipal() {
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

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        mniRegistroMatricula = new javax.swing.JMenuItem();
        mniRegistrocalificaciones = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        mnuEstudiante = new javax.swing.JMenu();
        mniNuevoEstudiante = new javax.swing.JMenuItem();
        mniReporteClificaciones = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Matricula");

        mniRegistroMatricula.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        mniRegistroMatricula.setMnemonic('o');
        mniRegistroMatricula.setText("Registro Matricula");
        mniRegistroMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRegistroMatriculaActionPerformed(evt);
            }
        });
        fileMenu.add(mniRegistroMatricula);

        mniRegistrocalificaciones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mniRegistrocalificaciones.setMnemonic('s');
        mniRegistrocalificaciones.setText("Registro Calificaciones");
        mniRegistrocalificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRegistrocalificacionesActionPerformed(evt);
            }
        });
        fileMenu.add(mniRegistrocalificaciones);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        mnuEstudiante.setMnemonic('e');
        mnuEstudiante.setText("Estudiante");

        mniNuevoEstudiante.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mniNuevoEstudiante.setMnemonic('t');
        mniNuevoEstudiante.setText("Nuevo Estudiante");
        mniNuevoEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNuevoEstudianteActionPerformed(evt);
            }
        });
        mnuEstudiante.add(mniNuevoEstudiante);

        mniReporteClificaciones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mniReporteClificaciones.setMnemonic('y');
        mniReporteClificaciones.setText("Reporte de Calificaciones");
        mniReporteClificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniReporteClificacionesActionPerformed(evt);
            }
        });
        mnuEstudiante.add(mniReporteClificaciones);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        mnuEstudiante.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        mnuEstudiante.add(deleteMenuItem);

        menuBar.add(mnuEstudiante);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void mniRegistroMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRegistroMatriculaActionPerformed
        frmRegistroMatricula mifrmMatricula = new frmRegistroMatricula();
        this.desktopPane.add(mifrmMatricula);
        mifrmMatricula.show();
    }//GEN-LAST:event_mniRegistroMatriculaActionPerformed

    private void mniNuevoEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNuevoEstudianteActionPerformed
        frmRegistroEstudiante mifrmEstudiante = new frmRegistroEstudiante();
        this.desktopPane.add(mifrmEstudiante);
        mifrmEstudiante.show();
    }//GEN-LAST:event_mniNuevoEstudianteActionPerformed

    private void mniRegistrocalificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRegistrocalificacionesActionPerformed
        frmRegistroCalificaciones mifrmCalificaciones = new frmRegistroCalificaciones();
        this.desktopPane.add(mifrmCalificaciones);
        mifrmCalificaciones.show();
    }//GEN-LAST:event_mniRegistrocalificacionesActionPerformed

    private void mniReporteClificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniReporteClificacionesActionPerformed
        frmReporteCalificaciones r = new frmReporteCalificaciones();
        this.desktopPane.add(r);
        r.show();
    }//GEN-LAST:event_mniReporteClificacionesActionPerformed

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
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mniNuevoEstudiante;
    private javax.swing.JMenuItem mniRegistroMatricula;
    private javax.swing.JMenuItem mniRegistrocalificaciones;
    private javax.swing.JMenuItem mniReporteClificaciones;
    private javax.swing.JMenu mnuEstudiante;
    private javax.swing.JMenuItem pasteMenuItem;
    // End of variables declaration//GEN-END:variables

}
