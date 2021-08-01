package Ventanas;

//import Audio.Sonido;
import java.awt.Image;
import java.awt.Toolkit;

public class Prsentacion extends javax.swing.JFrame {

    public Prsentacion() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
    }
    
    /*public static void CargarMusica(){
        try{
            Thread.sleep(10000);
        }
        catch(InterruptedException e){}
    }*/

    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Dragonballstar.png"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Generos = new javax.swing.ButtonGroup();
        jButtonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButtonM = new javax.swing.JRadioButton();
        jRadioButtonF = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jButtonContinuar = new javax.swing.JButton();
        jLabelVersion = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Broadway", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Crush");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Alien Encounters", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("App");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Seleccione su género:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        Generos.add(jRadioButtonM);
        jRadioButtonM.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jRadioButtonM.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonM.setText("Masculino");
        jRadioButtonM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        Generos.add(jRadioButtonF);
        jRadioButtonF.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jRadioButtonF.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonF.setText("Femenino");
        jRadioButtonF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 100, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Creado por: @Fernando");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, -1, -1));

        jButtonContinuar.setText("Continuar");
        jButtonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        jLabelVersion.setText("Versión 1.0.1");
        getContentPane().add(jLabelVersion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/7df598c07748e949c45d2a01123e3640.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));
        jLabelFondo.getAccessibleContext().setAccessibleName("fondo");
        jLabelFondo.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jRadioButtonMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMActionPerformed

    }//GEN-LAST:event_jRadioButtonMActionPerformed

    private void jRadioButtonFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFActionPerformed
     
    }//GEN-LAST:event_jRadioButtonFActionPerformed

    private void jButtonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContinuarActionPerformed
        if(jRadioButtonM.isSelected()){
            jRadioButtonM.setEnabled(true);
            Masculino M = new Masculino();
            M.setVisible(true);
            this.setVisible(false);
        } else if (jRadioButtonF.isSelected()){
                jRadioButtonF.setEnabled(true);
                Femenino F = new Femenino();
                F.setVisible(true);
                this.setVisible(false);
        }
    }//GEN-LAST:event_jButtonContinuarActionPerformed

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
            java.util.logging.Logger.getLogger(Prsentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prsentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prsentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prsentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prsentacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Generos;
    private javax.swing.JButton jButtonContinuar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelVersion;
    private javax.swing.JRadioButton jRadioButtonF;
    private javax.swing.JRadioButton jRadioButtonM;
    // End of variables declaration//GEN-END:variables
}
