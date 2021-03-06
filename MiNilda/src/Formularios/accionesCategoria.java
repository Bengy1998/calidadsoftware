/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Alertas.ErrorAlerta;
import Alertas.ExitoAlerta;
import Controller.categoriaController;
import Modal.modalCategoria;
import util.Memoria;

/**
 *
 * @author Bengy Aguila Ruiz bengyjar1998@outlook.com
 */
public class accionesCategoria extends javax.swing.JDialog {

    private String accion;
    modalCategoria c = new modalCategoria();
    categoriaController cc = new categoriaController();
    modalCategoria categoria = (modalCategoria) Memoria.get("categoria");

    /**
     * Creates new form accionesCategoria
     *
     * @param parent
     * @param modal
     */
    public accionesCategoria(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        txtNombre.requestFocus();
        recogerDatos();
    }

    private void recogerDatos() {

        accion = Memoria.get("accionC").toString();
        //this.setTitle(accion + " USER");
        //  lblTitulo.setText(accion + " USER");
        if (accion.equals("Registrar")) {
            btnAccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar1.png")));
            btnAccion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar2.png")));

        } else {

            btnAccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png")));
            btnAccion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar1.png")));

            txtNombre.setText(categoria.getCategoria());
            txtDescripcion.setText(categoria.getDescripcion());

        }
        btnAccion.setText(accion);

        //user = (modalUsuario) Memoria.get("user");
        // Memoria.put("seccion", null);
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
        jPanel3 = new javax.swing.JPanel();
        btnActualizar = new rojeru_san.RSButtonRiple();
        btnAccion = new rojeru_san.RSButtonRiple();
        btnCancelar = new rojeru_san.RSButtonRiple();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtNombre = new rojerusan.RSMetroTextFullPlaceHolder();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnActualizar.setToolTipText("Limpiar Campos");
        btnActualizar.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnActualizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar1.png"))); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnAccion.setBackground(new java.awt.Color(33, 169, 56));
        btnAccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar1.png"))); // NOI18N
        btnAccion.setText("Nuevo");
        btnAccion.setToolTipText("");
        btnAccion.setColorHover(new java.awt.Color(0, 198, 56));
        btnAccion.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnAccion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAccion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar2.png"))); // NOI18N
        btnAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccionActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(200, 35, 51));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar1.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setColorHover(new java.awt.Color(238, 35, 51));
        btnCancelar.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 112, 192)));

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.setToolTipText("Descripcion");
        txtDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 174, 255)));
        txtDescripcion.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jScrollPane1.setViewportView(txtDescripcion);

        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setBorderColor(new java.awt.Color(31, 174, 255));
        txtNombre.setBotonColor(new java.awt.Color(31, 174, 255));
        txtNombre.setPlaceholder("Nombre de la Categoria...");
        txtNombre.setSoloLetras(true);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        txtNombre.setText("");
        txtDescripcion.setText("");
        txtNombre.requestFocus();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccionActionPerformed
        if (accion.equals("Registrar")) {

            if (txtNombre.getText().isEmpty() || txtDescripcion.getText().isEmpty()) {
                ErrorAlerta ae = new ErrorAlerta(null, true);
                ErrorAlerta.lblMensaje2.setText("¡¡¡COMPLETE TODOS LOS CAMPOS!!!");
                ae.setVisible(true);

                txtNombre.requestFocus();
            } else {
                c.setCategoria(txtNombre.getText());
                c.setDescripcion(txtDescripcion.getText());

                if (cc.sql_insertCategoria(c)) {

                    ExitoAlerta ae = new ExitoAlerta(null, true);
                    ExitoAlerta.lblMensaje1.setText("¡¡¡CATEGORIA!!!");
                    ExitoAlerta.lblMensaje2.setText("¡¡¡REGISTRADA CON EXITO!!!");
                    ae.setVisible(true);
                    dispose();

                } else {
                    ErrorAlerta ae = new ErrorAlerta(null, true);
                    ErrorAlerta.lblMensaje2.setText("¡¡¡CATEGORIA NO REGISTRADA!!!");
                    ae.setVisible(true);
                }

            }
        } else {


            if (txtNombre.getText().isEmpty() || txtDescripcion.getText().isEmpty()) {
                ErrorAlerta ae = new ErrorAlerta(null, true);
                ErrorAlerta.lblMensaje2.setText("¡¡¡COMPLETE TODOS LOS CAMPOS!!!");
                ae.setVisible(true);

                txtNombre.requestFocus();
            } else {
                c.setIdCategoria(categoria.getIdCategoria());
                c.setCategoria(txtNombre.getText());
                c.setDescripcion(txtDescripcion.getText());

                if (cc.sql_updateCategoria(c)) {

                    ExitoAlerta ae = new ExitoAlerta(null, true);
                    ExitoAlerta.lblMensaje1.setText("¡¡¡CATEGORIA!!!");
                    ExitoAlerta.lblMensaje2.setText("¡¡¡ACTUALIZADA CON EXITO!!!");
                    ae.setVisible(true);
                    dispose();

                } else {
                    ErrorAlerta ae = new ErrorAlerta(null, true);
                    ErrorAlerta.lblMensaje2.setText("¡¡¡CATEGORIA NO ACTUALIZADA!!!");
                    ae.setVisible(true);
                }

            }

        }
    }//GEN-LAST:event_btnAccionActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        //lblMensaje.setText("");
    }//GEN-LAST:event_txtNombreKeyReleased

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
            java.util.logging.Logger.getLogger(accionesCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(accionesCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(accionesCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(accionesCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                accionesCategoria dialog = new accionesCategoria(new javax.swing.JFrame(), true);
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
    private rojeru_san.RSButtonRiple btnAccion;
    private rojeru_san.RSButtonRiple btnActualizar;
    private rojeru_san.RSButtonRiple btnCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDescripcion;
    private rojerusan.RSMetroTextFullPlaceHolder txtNombre;
    // End of variables declaration//GEN-END:variables
}
