
package Ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Masculino extends javax.swing.JFrame {

    public Masculino() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }
    
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Dragonballstar.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButtonSiguiente = new javax.swing.JButton();
        jLabelNombre = new javax.swing.JLabel();
        jLabelEdad = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldEdad = new javax.swing.JTextField();
        jButtonAtras = new javax.swing.JButton();
        jLabelTu = new javax.swing.JLabel();
        jLabelCrush = new javax.swing.JLabel();
        jLabelNombre2 = new javax.swing.JLabel();
        jTextFieldNombre2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldEdad2 = new javax.swing.JTextField();
        jLabelFondo = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSiguiente.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButtonSiguiente.setText("Calcular");
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, 30));

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelNombre.setText("Nombre:");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabelEdad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelEdad.setText("Edad:");
        getContentPane().add(jLabelEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 100, 30));

        jTextFieldEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEdadActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 50, 30));

        jButtonAtras.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButtonAtras.setText("Atrás");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        jLabelTu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTu.setText("Primera Persona (Tú)");
        getContentPane().add(jLabelTu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabelCrush.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCrush.setText("Segunda Persona (Crush)");
        getContentPane().add(jLabelCrush, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabelNombre2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelNombre2.setText("Nombre:");
        getContentPane().add(jLabelNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 240, 80, -1));
        getContentPane().add(jTextFieldNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 100, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Edad:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));
        getContentPane().add(jTextFieldEdad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 50, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vegeta-dragon-ball-super.jpg"))); // NOI18N
        jLabelFondo.setMaximumSize(new java.awt.Dimension(720, 405));
        jLabelFondo.setMinimumSize(new java.awt.Dimension(720, 405));
        jLabelFondo.setPreferredSize(new java.awt.Dimension(720, 405));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEdadActionPerformed

    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        ResulM ResulH = new ResulM();
        ResulH.setVisible(true);
        this.setVisible(false);
        
        ActionListener ResultadoM = new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                jLabelResulM.setText(jTextFieldNombre.getText() + " & " + jTextFieldNombre2.getText());
            }
        };
        jButtonSiguiente.addActionListener(ResultadoM);
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        Prsentacion Atras = new Prsentacion();
        Atras.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(Masculino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Masculino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Masculino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Masculino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Masculino().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCrush;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombre2;
    private javax.swing.JLabel jLabelTu;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldEdad2;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNombre2;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JLabel jLabelResulM;
}
