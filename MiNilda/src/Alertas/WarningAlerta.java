/*
 * BENGY JAMMIL AGUILA RUIZ.
 * bengyjar1998@outlook.com
 * facebook: https://www.facebook.com/0101114100d
 */
package Alertas;

import Controller.loginController;
import Modal.modalUsuario;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;
import util.Memoria;

/**
 *
 * @author BENGY AGUILA RUIZ - bengyjar1998@outlook.com
 */
public class WarningAlerta extends javax.swing.JDialog {

    Timer timer = null;
    TimerTask task;
    int i = 32;
    loginController lc = new loginController();
    modalUsuario iduser = (modalUsuario) Memoria.get("iduser");

    public WarningAlerta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblMensaje2 = new javax.swing.JLabel();
        lblMensaje1 = new javax.swing.JLabel();
        rSButtonRiple1 = new rojeru_san.RSButtonRiple();
        rSButtonRiple2 = new rojeru_san.RSButtonRiple();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(235, 156, 32), 5, true));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/warning.png"))); // NOI18N

        lblMensaje2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblMensaje2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje2.setText("¡¡¡VA A ELIMINA UN REGISTRO!!!");

        lblMensaje1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblMensaje1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje1.setText("¡¡¡ALERTA!!!");

        rSButtonRiple1.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonRiple1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 156, 32), 10));
        rSButtonRiple1.setText("ACPETAR");
        rSButtonRiple1.setColorHover(new java.awt.Color(255, 255, 255));
        rSButtonRiple1.setColorText(new java.awt.Color(235, 156, 32));
        rSButtonRiple1.setColorTextHover(new java.awt.Color(235, 156, 32));
        rSButtonRiple1.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        rSButtonRiple1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple1ActionPerformed(evt);
            }
        });

        rSButtonRiple2.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonRiple2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 156, 32), 10));
        rSButtonRiple2.setText("CANCELAR");
        rSButtonRiple2.setColorHover(new java.awt.Color(255, 255, 255));
        rSButtonRiple2.setColorText(new java.awt.Color(235, 156, 32));
        rSButtonRiple2.setColorTextHover(new java.awt.Color(235, 156, 32));
        rSButtonRiple2.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        rSButtonRiple2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblMensaje1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblMensaje2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rSButtonRiple1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rSButtonRiple2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensaje2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonRiple1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonRiple2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonRiple1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple1ActionPerformed

        task = new TimerTask() {
            @Override
            public void run() {
                if (i == 0) {
                    Cerrar();
                } else {
                    Ubicar(i);
                    i -= 32;
                    //Trasparencia((float) i / 352);
                }
            }
        };
        timer = new Timer();
        timer.schedule(task, 0, 2);
        if (lc.sql_delete(iduser)) {

            ExitoAlerta ae = new ExitoAlerta(null, true);
            ExitoAlerta.lblMensaje2.setText("¡¡¡REGISTRO ELIMINADO!!!");
            ae.setVisible(true);
            dispose();
        } else {

            ErrorAlerta ae = new ErrorAlerta(null, true);
            ErrorAlerta.lblMensaje2.setText("¡¡¡REGISTRO NO ELIMINADO!!!");
            ae.setVisible(true);
            dispose();
        }

        //System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonRiple1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        setVisible(false);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        task = new TimerTask() {
            @Override
            public void run() {
                if (i == 352) {
                    timer.cancel();
                } else {
                    Ubicar(i);
                    i += 32;
                    //Trasparencia((float) i / 352);
                }
            }
        };
        timer = new java.util.Timer();
        timer.schedule(task, 0, 2);        //         // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void rSButtonRiple2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple2ActionPerformed
        task = new TimerTask() {
            @Override
            public void run() {
                if (i == 0) {
                    Cerrar();
                } else {
                    Ubicar(i);
                    i -= 32;
                    //Trasparencia((float) i / 352);
                }
            }
        };
        timer = new Timer();
        timer.schedule(task, 0, 2);
        dispose();
    }//GEN-LAST:event_rSButtonRiple2ActionPerformed

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
            java.util.logging.Logger.getLogger(WarningAlerta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WarningAlerta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WarningAlerta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WarningAlerta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                WarningAlerta dialog = new WarningAlerta(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lblMensaje1;
    public static javax.swing.JLabel lblMensaje2;
    private rojeru_san.RSButtonRiple rSButtonRiple1;
    private rojeru_san.RSButtonRiple rSButtonRiple2;
    // End of variables declaration//GEN-END:variables
private void Cerrar() {
        this.dispose();
        timer = null;
        task = null;
    }

    private void Ubicar(int y) {
        // this.setLocationRelativeTo(this);
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //System.out.println("Tu resolución es de " + screenSize.width + "x" + screenSize.height);
        this.setLocation(screenSize.width - screenSize.height, y - 10);
        //his.setLocation(screenSize.width/4, screenSize.height/4);
    }
}