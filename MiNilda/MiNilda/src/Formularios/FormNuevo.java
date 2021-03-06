/*
 * BENGY JAMMIL AGUILA RUIZ.
 * bengyjar1998@outlook.com
 * facebook: https://www.facebook.com/0101114100d
 */
package Formularios;

import Alertas.ErrorAlerta;
import Controller.loginController;
import Modal.modalUsuario;
import ds.desktop.notify.DesktopNotify;
import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author BENGY AGUILA RUIZ - bengyjar1998@outlook.com
 */
public class FormNuevo extends javax.swing.JFrame {

    JFileChooser foto = new JFileChooser();
    File archivo;
    String ruta_guardar = "./imagenes/";
    String origen;
    loginController lc = new loginController();
    modalUsuario u = new modalUsuario();
 

    /**
     * byte [] imagen; FileInputStream entrada; FileOutputStream salida; Creates
     * new form FormNuevo
     */
    public FormNuevo() {
        initComponents();
        //jPanel1.setBorder(new utilClass.ImagenFondo());
        setExtendedState(MAXIMIZED_BOTH);
        ///fotoxd.getRutaImagen();
        txtNombre.requestFocus();
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
        //setAlwaysOnTop(true);//siempre al frente 

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
        jPanel3 = new javax.swing.JPanel();
        btnEliminar8 = new rojeru_san.RSButtonRiple();
        txtNombre = new rojerusan.RSMetroTextFullPlaceHolder();
        txtApellido = new rojerusan.RSMetroTextFullPlaceHolder();
        cboSexo = new rojerusan.RSComboMetro();
        txtUsuario = new rojerusan.RSMetroTextFullPlaceHolder();
        txtContraseña = new rojerusan.RSMetroTextPassPlaceHolderView();
        lblFoto = new rojerusan.RSLabelImage();
        btnAgregar = new rojeru_san.RSButtonRiple();
        btnCargar = new rojeru_san.RSButtonRiple();
        jPanel2 = new javax.swing.JPanel();
        btn1 = new rojeru_san.RSButtonRiple();
        txtDni = new app.bolivia.swing.JCTextField();
        jPanel5 = new javax.swing.JPanel();
        txtTelefono = new app.bolivia.swing.JCTextField();
        btn2 = new rojeru_san.RSButtonRiple();
        txtRepetirContraseña = new rojerusan.RSMetroTextPassPlaceHolderView();
        btnEliminar9 = new rojeru_san.RSButtonRiple();
        jPanel4 = new javax.swing.JPanel();
        lbltitulo1 = new javax.swing.JLabel();
        lbltitulo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(9, 132, 227));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminar8.setBackground(new java.awt.Color(200, 35, 51));
        btnEliminar8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_delete_property_48px.png"))); // NOI18N
        btnEliminar8.setText("Cancelar");
        btnEliminar8.setColorHover(new java.awt.Color(238, 35, 51));
        btnEliminar8.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnEliminar8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar8ActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(899, 295, 180, 53));

        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setBorderColor(new java.awt.Color(31, 174, 255));
        txtNombre.setBotonColor(new java.awt.Color(31, 174, 255));
        txtNombre.setPlaceholder("Nombre...");
        txtNombre.setSoloLetras(true);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 27, 395, 52));

        txtApellido.setForeground(new java.awt.Color(0, 0, 0));
        txtApellido.setBorderColor(new java.awt.Color(31, 174, 255));
        txtApellido.setBotonColor(new java.awt.Color(31, 174, 255));
        txtApellido.setPlaceholder("Apellido...");
        txtApellido.setSoloLetras(true);
        jPanel3.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 97, 395, 52));

        cboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " Genero", " Hombre", " Mujer" }));
        cboSexo.setColorArrow(new java.awt.Color(31, 174, 255));
        cboSexo.setColorBorde(new java.awt.Color(31, 174, 255));
        cboSexo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cboSexo.setMinimumSize(new java.awt.Dimension(101, 28));
        jPanel3.add(cboSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 230, 395, 52));

        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.setBorderColor(new java.awt.Color(31, 174, 255));
        txtUsuario.setBotonColor(new java.awt.Color(31, 174, 255));
        txtUsuario.setPlaceholder("Usuario...");
        jPanel3.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 27, 395, 52));

        txtContraseña.setForeground(new java.awt.Color(0, 0, 0));
        txtContraseña.setBorderColor(new java.awt.Color(31, 174, 255));
        txtContraseña.setBotonColor(new java.awt.Color(31, 174, 255));
        txtContraseña.setPlaceholder("Contraseña...");
        jPanel3.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 97, 395, 52));

        lblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 174, 255), 3));
        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user-prueba.png"))); // NOI18N
        jPanel3.add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 25, 226, 196));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_save_48px.png"))); // NOI18N
        btnAgregar.setText("Registrar");
        btnAgregar.setToolTipText("");
        btnAgregar.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnAgregar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 295, 179, 53));

        btnCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_pictures_folder_48px.png"))); // NOI18N
        btnCargar.setText("CARGAR");
        btnCargar.setToolTipText("");
        btnCargar.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnCargar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 228, 228, 53));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 174, 255), 2));
        jPanel2.setPreferredSize(new java.awt.Dimension(395, 52));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-cerrar.png"))); // NOI18N
        btn1.setColorHover(new java.awt.Color(31, 174, 255));
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn1MouseReleased(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 6, 40, 40));

        txtDni.setBorder(null);
        txtDni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDni.setPhColor(new java.awt.Color(0, 112, 192));
        txtDni.setPlaceholder("Dni...");
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        jPanel2.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 2, 330, 48));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 165, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 174, 255), 2));
        jPanel5.setPreferredSize(new java.awt.Dimension(395, 52));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTelefono.setBorder(null);
        txtTelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTelefono.setPhColor(new java.awt.Color(0, 112, 192));
        txtTelefono.setPlaceholder("Telefono/Celular...");
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel5.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 2, 330, 48));

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-cerrar.png"))); // NOI18N
        btn2.setColorHover(new java.awt.Color(31, 174, 255));
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn2MouseReleased(evt);
            }
        });
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel5.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 6, 40, 40));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 230, -1, -1));

        txtRepetirContraseña.setForeground(new java.awt.Color(0, 0, 0));
        txtRepetirContraseña.setBorderColor(new java.awt.Color(31, 174, 255));
        txtRepetirContraseña.setBotonColor(new java.awt.Color(31, 174, 255));
        txtRepetirContraseña.setPlaceholder("Repetir Contraseña...");
        jPanel3.add(txtRepetirContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 165, 395, 52));

        btnEliminar9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-minimizar.png"))); // NOI18N
        btnEliminar9.setText("Minimizar");
        btnEliminar9.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnEliminar9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar9ActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminar9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 295, 180, 53));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.ipady = 32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 22, 137, 0);
        jPanel1.add(jPanel3, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setPreferredSize(new java.awt.Dimension(965, 101));

        lbltitulo1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbltitulo1.setForeground(new java.awt.Color(0, 0, 204));
        lbltitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitulo1.setText("Bienvenido Al Sistema De Gestion De Ventas MiNilda");
        lbltitulo1.setToolTipText("");

        lbltitulo2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lbltitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitulo2.setText("Hemos notado que usara el sistema por primera vez, Por ello le pedimos que por  favor complete el siguiente formulario  ");
        lbltitulo2.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbltitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, 1122, Short.MAX_VALUE)
            .addComponent(lbltitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lbltitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbltitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 159;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(173, 24, 0, 30);
        jPanel1.add(jPanel4, gridBagConstraints);

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar8ActionPerformed

    }//GEN-LAST:event_btnActualizar8ActionPerformed
    /*FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG", "jpg", "png");

     foto.setFileFilter(filtro);
     foto.setAcceptAllFileFilterUsed(false);
     int respuesta = foto.showOpenDialog(this);
     if (respuesta == JFileChooser.APPROVE_OPTION) {

     archivo = foto.getSelectedFile();

     if (archivo != null) {
     origen = archivo.getPath();

     ImageIcon icon = new ImageIcon(origen);
     lblFoto.setIcon(icon);

     } else {

     System.out.println("principal.NewJFrame.jButton1ActionPerformed()");
     }
     }*/
    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG", "jpg", "png");

        foto.setFileFilter(filtro);
        foto.setAcceptAllFileFilterUsed(false);
        int respuesta = foto.showOpenDialog(this);
        if (respuesta == JFileChooser.APPROVE_OPTION) {

            archivo = foto.getSelectedFile();

            if (archivo != null) {
                origen = archivo.getPath();

                ImageIcon icon = new ImageIcon(origen);
                lblFoto.setIcon(icon);

            } else {

                System.out.println("error");
            }
        }


    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnEliminar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar8ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnEliminar8ActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        //lblMensaje.setText("");
    }//GEN-LAST:event_txtNombreKeyReleased
    /*if (txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtDni.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtUsuario.getText().isEmpty()
                || txtContraseña.getText().isEmpty() || txtRepetirContraseña.getText().isEmpty() || cboSexo.getSelectedIndex() == 0) {
            ErrorAlerta ae = new ErrorAlerta(this, true);
            ErrorAlerta.lblMensaje2.setText("¡¡¡COMPLETE TODOS LOS CAMPOS!!!");
            ae.setVisible(true);

            txtNombre.requestFocus();
        } else if (!txtContraseña.getText().equals(txtRepetirContraseña.getText())) {
            ErrorAlerta ae = new ErrorAlerta(this, true);
            ErrorAlerta.lblMensaje2.setText("¡¡¡CONTRASEÑAS DISTINTAS!!!");
            ae.setVisible(true);

        } else {
            boolean com = false;
            if (archivo == null) {
                com = false;
                u.setFotoUrl("user-prueba.png");
            } else {
                com = true;
                u.setFotoUrl(archivo.getName());

            }
            u.setNombre(txtNombre.getText());
            u.setApellido(txtApellido.getText());
            u.setDni(Integer.parseInt(txtDni.getText()));
            u.setTelefono(Integer.parseInt(txtTelefono.getText()));
            u.setEstado(1);
            u.setSexo(cboSexo.getSelectedItem().toString());
            u.setUsuario(txtUsuario.getText());
            u.setClave(txtContraseña.getText());
            u.setIdrol(3);
            // u.setFotoUrl(archivo.getName());
            // System.out.println("ruta: " + archivo.getName());

            if (lc.sql_insertUsuario(u)) {
              
                FormLogin fl = new FormLogin();
                //dispose();
                this.setVisible(false);
                if (com) {
                    copyImagen(archivo.getPath(), ruta_guardar + archivo.getName());
                }

                DesktopNotify.showDesktopMessage("CONFIGURAR USUARIO SUPER ADMIN...", "El usuario SUPER ADMIN fue configurado con exito. Ahora ya "
                        + "puedes iniciar sesión en el sistema.", DesktopNotify.SUCCESS, 8000L);

                //  this.setVisible(false);
                task = new TimerTask() {
                    @Override
                    public void run() {
                        if (i == 0) {

                            fl.setVisible(true);

                        } else {
                           
                            i -= 50000;
                            
                        }
                    }

                };
                timer = new Timer();
                timer.schedule(task, 0, 5000);

            } else {
                DesktopNotify.showDesktopMessage("CONFIGURAR USUARIO SUPER ADMIN...", "Error Al configurar usuario SUPER ADMIN", DesktopNotify.SUCCESS, 8000L);
            }

        }*/
    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        char num = evt.getKeyChar();

        if ((num < '0' || num > '8') || txtDni.getText().length() == 8) {

            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char num = evt.getKeyChar();

        if ((num < '0' || num > '9') || txtTelefono.getText().length() == 9) {

            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void btn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseEntered
        //System.out.println("pase por encima");
        btn1.setBackground(new java.awt.Color(31, 174, 255));// TODO add your handling code here:
    }//GEN-LAST:event_btn1MouseEntered

    private void btn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseExited
        // System.out.println("SALI");
        btn1.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btn1MouseExited

    private void btn1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1MousePressed

    private void btn1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseReleased

    }//GEN-LAST:event_btn1MouseReleased

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        txtDni.setText("");
        txtDni.requestFocus();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseEntered
        btn2.setBackground(new java.awt.Color(31, 174, 255));
    }//GEN-LAST:event_btn2MouseEntered

    private void btn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseExited
        btn2.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btn2MouseExited

    private void btn2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn2MousePressed

    private void btn2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btn2MouseReleased

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        txtTelefono.setText("");
        txtTelefono.requestFocus();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btnEliminar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar9ActionPerformed
        this.setState(ICONIFIED);
        //dispose();

    }//GEN-LAST:event_btnEliminar9ActionPerformed

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtDni.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtUsuario.getText().isEmpty()
                || txtContraseña.getText().isEmpty() || txtRepetirContraseña.getText().isEmpty() || cboSexo.getSelectedIndex() == 0) {
            ErrorAlerta ae = new ErrorAlerta(null, true);
            ErrorAlerta.lblMensaje2.setText("¡¡¡COMPLETE TODOS LOS CAMPOS!!!");
            ae.setVisible(true);

            txtNombre.requestFocus();
        } else if (!txtContraseña.getText().equals(txtRepetirContraseña.getText())) {
            ErrorAlerta ae = new ErrorAlerta(null, true);
            ErrorAlerta.lblMensaje2.setText("¡¡¡CONTRASEÑAS DISTINTAS!!!");
            ae.setVisible(true);

        } else {
            boolean com = false;
            if (archivo == null) {
                com = false;
                u.setFotoUrl("user-prueba.png");
            } else {
                com = true;
                u.setFotoUrl(archivo.getName());

            }
            u.setNombre(txtNombre.getText());
            u.setApellido(txtApellido.getText());
            u.setDni(Integer.parseInt(txtDni.getText()));
            u.setTelefono(Integer.parseInt(txtTelefono.getText()));
            u.setEstado(1);
            u.setSexo(cboSexo.getSelectedItem().toString());
            u.setUsuario(txtUsuario.getText());
            u.setClave(txtContraseña.getText());
            u.setIdrol(3);
            // u.setFotoUrl(archivo.getName());
            // System.out.println("ruta: " + archivo.getName());

            if (lc.sql_insertUsuario(u)) {

                FormLogin fl = new FormLogin();

                if (com) {
                    copyImagen(archivo.getPath(), ruta_guardar + archivo.getName());
                }
                dispose();
               
                DesktopNotify.showDesktopMessage("CONFIGURAR USUARIO SUPER ADMIN...", "El usuario SUPER ADMIN fue configurado con exito. Ahora ya "
                        + "puedes iniciar sesión en el sistema.", DesktopNotify.SUCCESS, 5000L);

                Timer timer = new Timer();
                
                TimerTask tarea = new TimerTask() {
                    @Override
                    public void run() {
                        System.out.println("xd");
                         fl.setVisible(true);
                    }
                };
                timer.schedule(tarea, 5000);
                /*task = new TimerTask() {
                    
                    public void run() {
                        if (i == 0) {

                            

                        } else {
                           
                            i -= 5000;
                            
                        }
                    }

                };
                timer = new Timer();
                timer.schedule(task, 0, 5000);*/

            } else {
                DesktopNotify.showDesktopMessage("CONFIGURAR USUARIO SUPER ADMIN...", "Error Al configurar usuario SUPER ADMIN", DesktopNotify.SUCCESS, 5000L);
            }

        }
    }//GEN-LAST:event_btnAgregarActionPerformed

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
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormNuevo().setVisible(true);
        });
    }
    /* char num = evt.getKeyChar();

        if ((num < '0' || num > '8') || txtDni.getText().length() == 9) {

            evt.consume();
        }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btn1;
    private rojeru_san.RSButtonRiple btn2;
    private rojeru_san.RSButtonRiple btnAgregar;
    private rojeru_san.RSButtonRiple btnCargar;
    private rojeru_san.RSButtonRiple btnEliminar8;
    private rojeru_san.RSButtonRiple btnEliminar9;
    public static rojerusan.RSComboMetro cboSexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private rojerusan.RSLabelImage lblFoto;
    public static javax.swing.JLabel lbltitulo1;
    public static javax.swing.JLabel lbltitulo2;
    private rojerusan.RSMetroTextFullPlaceHolder txtApellido;
    private rojerusan.RSMetroTextPassPlaceHolderView txtContraseña;
    private app.bolivia.swing.JCTextField txtDni;
    private rojerusan.RSMetroTextFullPlaceHolder txtNombre;
    private rojerusan.RSMetroTextPassPlaceHolderView txtRepetirContraseña;
    private app.bolivia.swing.JCTextField txtTelefono;
    private rojerusan.RSMetroTextFullPlaceHolder txtUsuario;
    // End of variables declaration//GEN-END:variables
    public void copyImagen(String origen, String destino) {
        Path DE = Paths.get(origen);
        Path A = Paths.get(destino);

        CopyOption[] opciones = new CopyOption[]{
            StandardCopyOption.REPLACE_EXISTING,
            StandardCopyOption.COPY_ATTRIBUTES
        };

        try {
            Files.copy(DE, A, opciones);
        } catch (IOException ex) {
            Logger.getLogger(FormNuevo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
