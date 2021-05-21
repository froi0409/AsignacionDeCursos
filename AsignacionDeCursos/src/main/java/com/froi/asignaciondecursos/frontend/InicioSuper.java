/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.asignaciondecursos.frontend;

import com.froi.asignaciondecursos.manejadores.ManejadorGrafico;
import com.froi.asignaciondecursos.manejadores.ManejadorPrincipal;
import javax.swing.JFrame;

/**
 *
 * @author froi-pc
 */
public class InicioSuper extends javax.swing.JFrame {

    private ManejadorPrincipal manejadorPrincipal;
    private JFrame ventanaInicial;
    
    /**
     * Creates new form InicioSuper
     * @param manejadorPrincipal
     * @param ventanaInicial
     */
    public InicioSuper(ManejadorPrincipal manejadorPrincipal, JFrame ventanaInicial) {
        initComponents();
        this.manejadorPrincipal = manejadorPrincipal;
        this.ventanaInicial = ventanaInicial;
        this.setLocationRelativeTo(null);
       
    }

    private InicioSuper() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnEdificios = new javax.swing.JButton();
        btnSalones = new javax.swing.JButton();
        btnCursos = new javax.swing.JButton();
        btnCatedraticos = new javax.swing.JButton();
        btnEstudiantes = new javax.swing.JButton();
        btnGrafEdificios = new javax.swing.JButton();
        btnGrafSalones = new javax.swing.JButton();
        btnGrafCursos = new javax.swing.JButton();
        btnGrafCatedraticos = new javax.swing.JButton();
        btnGrafAsignaciones = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnGrafUsuarios = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Opciones:");

        btnEdificios.setText("Edificios");
        btnEdificios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdificiosActionPerformed(evt);
            }
        });

        btnSalones.setText("Salones");

        btnCursos.setText("Cursos");
        btnCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCursosActionPerformed(evt);
            }
        });

        btnCatedraticos.setText("Catedráticos");
        btnCatedraticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatedraticosActionPerformed(evt);
            }
        });

        btnEstudiantes.setText("Estudiantes");
        btnEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstudiantesActionPerformed(evt);
            }
        });

        btnGrafEdificios.setText("Graficar");

        btnGrafSalones.setText("Graficar");

        btnGrafCursos.setText("Graficar");
        btnGrafCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrafCursosActionPerformed(evt);
            }
        });

        btnGrafCatedraticos.setText("Graficar");
        btnGrafCatedraticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrafCatedraticosActionPerformed(evt);
            }
        });

        btnGrafAsignaciones.setText("Graficar");
        btnGrafAsignaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrafAsignacionesActionPerformed(evt);
            }
        });

        btnUsuarios.setText("Usuarios");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnGrafUsuarios.setText("Graficar");
        btnGrafUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrafUsuariosActionPerformed(evt);
            }
        });

        jMenu1.setText("Acciones");

        jMenuItem1.setText("Cargar Archivo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEdificios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCursos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCatedraticos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(btnEstudiantes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGrafEdificios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGrafSalones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGrafCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGrafCatedraticos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGrafAsignaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(btnGrafUsuarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdificios)
                    .addComponent(btnGrafEdificios))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalones)
                    .addComponent(btnGrafSalones))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCursos)
                    .addComponent(btnGrafCursos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCatedraticos)
                    .addComponent(btnGrafCatedraticos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEstudiantes)
                    .addComponent(btnGrafAsignaciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUsuarios)
                    .addComponent(btnGrafUsuarios))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        CargaArchivo carga = new CargaArchivo(manejadorPrincipal);
        carga.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnEdificiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdificiosActionPerformed
        // TODO add your handling code here:
        VentanaEdificios v = new VentanaEdificios(manejadorPrincipal);
        v.setVisible(true);
    }//GEN-LAST:event_btnEdificiosActionPerformed

    private void btnGrafCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrafCursosActionPerformed
        // TODO add your handling code here:
        ManejadorGrafico m = new ManejadorGrafico();
        String dotCode = manejadorPrincipal.getCursos().dotCodeCursos();
        m.graficarEstadoMemoria(dotCode, "cursos");
    }//GEN-LAST:event_btnGrafCursosActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ventanaInicial.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
        VentanaUsuarios v = new VentanaUsuarios(manejadorPrincipal);
        v.setVisible(true);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstudiantesActionPerformed
        // TODO add your handling code here:
        VentanaEstudiantes v = new VentanaEstudiantes(manejadorPrincipal);
        v.setVisible(true);
    }//GEN-LAST:event_btnEstudiantesActionPerformed

    private void btnGrafUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrafUsuariosActionPerformed
        ManejadorGrafico m = new ManejadorGrafico();
        String dotCode = manejadorPrincipal.getUsuarios().dotCodeUsuarios();
        m.graficarEstadoMemoria(dotCode, "usuarios");
        
        
    }//GEN-LAST:event_btnGrafUsuariosActionPerformed

    private void btnGrafAsignacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrafAsignacionesActionPerformed
        // TODO add your handling code here:
        ManejadorGrafico m = new ManejadorGrafico();
        String dotCode = manejadorPrincipal.getEstudiantes().dotCode();
        m.graficarEstadoMemoria(dotCode, "estudiantes");
    }//GEN-LAST:event_btnGrafAsignacionesActionPerformed

    private void btnCatedraticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatedraticosActionPerformed
        // TODO add your handling code here:
        VentanaCatedratico v = new VentanaCatedratico(manejadorPrincipal);
        v.setVisible(true);
    }//GEN-LAST:event_btnCatedraticosActionPerformed

    private void btnGrafCatedraticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrafCatedraticosActionPerformed
        // TODO add your handling code here:
        ManejadorGrafico m = new ManejadorGrafico();
        String dotCode = manejadorPrincipal.getCatedraticos().dotCode();
        m.graficarEstadoMemoria(dotCode, "catedraticos");
    }//GEN-LAST:event_btnGrafCatedraticosActionPerformed

    private void btnCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCursosActionPerformed
        // TODO add your handling code here:
        VentanaCursos v = new VentanaCursos(manejadorPrincipal);
        v.setVisible(true);
    }//GEN-LAST:event_btnCursosActionPerformed

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
            java.util.logging.Logger.getLogger(InicioSuper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSuper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSuper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSuper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSuper().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCatedraticos;
    private javax.swing.JButton btnCursos;
    private javax.swing.JButton btnEdificios;
    private javax.swing.JButton btnEstudiantes;
    private javax.swing.JButton btnGrafAsignaciones;
    private javax.swing.JButton btnGrafCatedraticos;
    private javax.swing.JButton btnGrafCursos;
    private javax.swing.JButton btnGrafEdificios;
    private javax.swing.JButton btnGrafSalones;
    private javax.swing.JButton btnGrafUsuarios;
    private javax.swing.JButton btnSalones;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
