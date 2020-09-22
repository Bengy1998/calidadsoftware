/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Controller.loginController;
import Modal.modalUsuario;
import ds.desktop.notify.DesktopNotify;
import javax.swing.ImageIcon;
import util.Memoria;


/**
 *
 * @author BENGY AGUILA RUIZ - bengyjar1998@outlook.com
 */
public class FormLogin extends javax.swing.JFrame {

    loginController lc = new loginController();
    modalUsuario mu = new modalUsuario();

    public FormLogin() {
        initComponents();
        //jPanel1.setBorder(new util.ImagenFondo());
        setExtendedState(MAXIMIZED_BOTH);
        //this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//evita cerra jframe con ALT+C
        this.setAlwaysOnTop(true);//siempre al frente       
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
        txtUser.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        txtUser = new rojeru_san.RSMTextFull();
        txtPass = new rojeru_san.RSMPassView();
        rSButtonHover1 = new rojerusan.RSButtonHover();
        btnExit = new rojeru_san.RSButtonRiple();
        btnMinimizar = new rojeru_san.RSButtonRiple();
        lblMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(9, 132, 227));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 470));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Contraseña:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 310, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Usuario:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 310, 40));

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono.png"))); // NOI18N
        jPanel2.add(rSPanelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 240, 150));

        txtUser.setText("BJAR");
        txtUser.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtUser.setPlaceholder("");
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserKeyReleased(evt);
            }
        });
        jPanel2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 310, 40));

        txtPass.setText("BJAR");
        txtPass.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtPass.setPlaceholder("");
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassKeyReleased(evt);
            }
        });
        jPanel2.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 310, 40));

        rSButtonHover1.setBackground(new java.awt.Color(31, 174, 255));
        rSButtonHover1.setText("Iniciar Sesion");
        rSButtonHover1.setColorHover(new java.awt.Color(31, 192, 255));
        rSButtonHover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonHover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, -1, -1));

        btnExit.setBackground(new java.awt.Color(31, 174, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-cerrar.png"))); // NOI18N
        btnExit.setToolTipText("Close");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel2.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 5, 30, 30));

        btnMinimizar.setBackground(new java.awt.Color(31, 174, 255));
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-minimizar.png"))); // NOI18N
        btnMinimizar.setToolTipText("Minimizar");
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 5, 30, 30));

        lblMensaje.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(204, 0, 0));
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setToolTipText("");
        jPanel2.add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 350, 30));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(jPanel2, gridBagConstraints);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void rSButtonHover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover1ActionPerformed

        mu.setUsuario(txtUser.getText());
        mu.setClave(txtPass.getText());

        if (txtUser.getText().isEmpty() || txtPass.getText().isEmpty()) {

            lblMensaje.setText("¡¡¡Complete Todos los Campos!!!");

        } else if (lc.validarUsuario(mu) == true) {

            modalUsuario u = (modalUsuario) Memoria.get("modalUsuario");//Administrador Empleado
            //System.out.println(""+u.getEstado()+"---"+u.getEstadoS());
            if (u.getEstado() == 2) {

                lblMensaje.setText("¡¡¡Acceso Denegado!!!");

            } else if (u.getEstado() == 1) {
                FormMenuPrincipal fm = new FormMenuPrincipal();
                fm.setVisible(true);
                DesktopNotify.showDesktopMessage("Bienvenido al Sistema \n           Mi Nilda\n    USUARIO: " + txtUser.getText(), "", DesktopNotify.SUCCESS, 10000L);
                dispose();

            }

        } else {

            lblMensaje.setText("¡¡¡Usuario y/o Contraseña Incorrectos!!!");

        }


    }//GEN-LAST:event_rSButtonHover1ActionPerformed

    private void txtUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyReleased

        lblMensaje.setText("");
    }//GEN-LAST:event_txtUserKeyReleased

    private void txtPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyReleased
        lblMensaje.setText("");
    }//GEN-LAST:event_txtPassKeyReleased

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btnExit;
    private rojeru_san.RSButtonRiple btnMinimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel lblMensaje;
    private rojerusan.RSButtonHover rSButtonHover1;
    private rojerusan.RSPanelImage rSPanelImage1;
    private rojeru_san.RSMPassView txtPass;
    private rojeru_san.RSMTextFull txtUser;
    // End of variables declaration//GEN-END:variables
}
