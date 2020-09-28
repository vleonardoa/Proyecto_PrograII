package Capa_Grafica;

import Capa_Logica.Logica;
import gt.gob.banguat.variables.ws.InfoVariable;

public class Grafica extends javax.swing.JFrame {
//Hola
    public Grafica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Valor1 = new javax.swing.JTextField();
        Valor2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cambio de Moneda");
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Valor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Valor1MouseClicked(evt);
            }
        });
        Valor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Valor1ActionPerformed(evt);
            }
        });
        Valor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Valor1KeyReleased(evt);
            }
        });
        getContentPane().add(Valor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 144, 173, -1));

        Valor2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Valor2MouseClicked(evt);
            }
        });
        Valor2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Valor2KeyReleased(evt);
            }
        });
        getContentPane().add(Valor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 106, 173, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Quetzales:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 106, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Dolares:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 144, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Valor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Valor1ActionPerformed

    }//GEN-LAST:event_Valor1ActionPerformed

    private void Valor1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Valor1KeyReleased
        if (Valor1.getText().equals("")) {
            Valor2.setText("0.00");
        } else {
            Logica Log = new Logica(Valor1.getText());
            Double Cambio = Log.Quetzales();
            Valor2.setText(String.valueOf(String.format("%.5f", Cambio)));
        }
    }//GEN-LAST:event_Valor1KeyReleased

    private void Valor2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Valor2KeyReleased
        if (Valor2.getText().equals("")) {
            Valor1.setText("0.00");
        } else {
            Logica Log = new Logica(Valor2.getText());
            Double Cambio = Log.Dolares();
            Valor1.setText(String.valueOf(String.format("%.5f", Cambio)));
    }//GEN-LAST:event_Valor2KeyReleased
    }
    private void Valor2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Valor2MouseClicked
        Valor2.setText("");
    }//GEN-LAST:event_Valor2MouseClicked

    private void Valor1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Valor1MouseClicked
        Valor1.setText("");
    }//GEN-LAST:event_Valor1MouseClicked

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
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Valor1;
    private javax.swing.JTextField Valor2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
