/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sysvent.forms;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import static com.sysvent.forms.Consultar_Empleados.jTextUser6;
import com.uabcs.model.empleado;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Agregar_Empleados extends javax.swing.JInternalFrame {

    /**
     * Creates new form Agregar_Empleados
     */
    public Agregar_Empleados() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTextApePa = new javax.swing.JTextField();
        jTextApeMa = new javax.swing.JTextField();
        jTextDireccion = new javax.swing.JTextField();
        jTextCel = new javax.swing.JTextField();
        jTextUser6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setMaximumSize(new java.awt.Dimension(1186, 521));
        setMinimumSize(new java.awt.Dimension(1186, 521));
        setPreferredSize(new java.awt.Dimension(1186, 521));

        jPanel1.setBackground(new java.awt.Color(242, 149, 27));

        jPanel2.setBackground(new java.awt.Color(184, 178, 178));
        jPanel2.setMaximumSize(new java.awt.Dimension(523, 347));
        jPanel2.setMinimumSize(new java.awt.Dimension(523, 347));
        jPanel2.setPreferredSize(new java.awt.Dimension(523, 347));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("Apellido Paterno");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setText("Apellido Materno");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setText("Direccion");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setText("Telefono");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setText("Usuario");

        jTextNombre.setMaximumSize(new java.awt.Dimension(200, 25));
        jTextNombre.setMinimumSize(new java.awt.Dimension(200, 25));
        jTextNombre.setPreferredSize(new java.awt.Dimension(200, 25));
        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });
        jTextNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombreKeyTyped(evt);
            }
        });

        jTextApePa.setMaximumSize(new java.awt.Dimension(200, 25));
        jTextApePa.setMinimumSize(new java.awt.Dimension(200, 25));
        jTextApePa.setPreferredSize(new java.awt.Dimension(200, 25));
        jTextApePa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextApePaActionPerformed(evt);
            }
        });
        jTextApePa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextApePaKeyTyped(evt);
            }
        });

        jTextApeMa.setMaximumSize(new java.awt.Dimension(200, 25));
        jTextApeMa.setMinimumSize(new java.awt.Dimension(200, 25));
        jTextApeMa.setPreferredSize(new java.awt.Dimension(200, 25));
        jTextApeMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextApeMaActionPerformed(evt);
            }
        });
        jTextApeMa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextApeMaKeyTyped(evt);
            }
        });

        jTextDireccion.setMaximumSize(new java.awt.Dimension(200, 50));
        jTextDireccion.setMinimumSize(new java.awt.Dimension(200, 50));
        jTextDireccion.setPreferredSize(new java.awt.Dimension(200, 50));
        jTextDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDireccionActionPerformed(evt);
            }
        });

        jTextCel.setMaximumSize(new java.awt.Dimension(200, 25));
        jTextCel.setMinimumSize(new java.awt.Dimension(200, 25));
        jTextCel.setPreferredSize(new java.awt.Dimension(200, 25));
        jTextCel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCelActionPerformed(evt);
            }
        });
        jTextCel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCelKeyTyped(evt);
            }
        });

        jTextUser6.setMaximumSize(new java.awt.Dimension(120, 25));
        jTextUser6.setMinimumSize(new java.awt.Dimension(120, 25));
        jTextUser6.setPreferredSize(new java.awt.Dimension(120, 25));
        jTextUser6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUser6ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setText("Contraseña");

        jPasswordField1.setMaximumSize(new java.awt.Dimension(120, 25));
        jPasswordField1.setMinimumSize(new java.awt.Dimension(120, 25));
        jPasswordField1.setPreferredSize(new java.awt.Dimension(120, 25));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setText("Tipo de Usuario");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "General" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel3)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextApePa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextApeMa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextUser6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextApePa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextApeMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextUser6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setText(" REGISTRO EMPLEADOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(268, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1186, 521));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            int UNIQUE_CONSTRAINT_VIOLATED = 1062;
        String nombre = jTextNombre.getText();
        String apellidoP = jTextApePa.getText();
        String apellidoM = jTextApeMa.getText();
        String direccion = jTextDireccion.getText();
        String phone = jTextCel.getText();
        String usuario = jTextUser6.getText();
        String password = String.valueOf(jPasswordField1.getPassword());
        String tipoUsuario = jComboBox1.getSelectedItem().toString();
        
         if (nombre.length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Nombre");
            jTextNombre.requestFocus();
            return;
        }

        if (apellidoP.length() == 0 && apellidoM.length()==0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar al menos un Apellido");
            jTextApePa.requestFocus();
            return;
        }


        if (usuario.length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar nombre de Usuario");
            jTextUser6.requestFocus();
            return;
        }

        if (password.length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una Contraseña");
            jTextUser6.requestFocus();
            return;
        }
        try {
            empleado.createEmpleado(nombre, apellidoP, apellidoM, direccion, phone, usuario, password,tipoUsuario);
        }catch (MySQLIntegrityConstraintViolationException e) {
                String msg = "Advertencia";
        
                if (UNIQUE_CONSTRAINT_VIOLATED == e.getErrorCode ()) {
                    // manejar la excepcion de la manera que corresponda segun la logica de negocio, posiblemente agregando un mensaje de error; tambien se
                    // podria levantar la excepcion a una capa superior mediante "throw e";
                    msg = "El nombre de usuario ya se encuentra en uso, intenta con otro";
                }
                JOptionPane.showMessageDialog(null,msg,null,JOptionPane.WARNING_MESSAGE);
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(Agregar_Empleados.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Agregar_Empleados.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Agregar_Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
            // TODO add your handling code here:
            jPasswordField1.transferFocus();
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      jTextApeMa.setText("");
      jTextApePa.setText("");
      jTextCel.setText("");
      jTextDireccion.setText("");
      jTextNombre.setText("");
      jTextUser6.setText("");
      jPasswordField1.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        jComboBox1.transferFocus();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextCelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCelActionPerformed
        // TODO add your handling code here:
        jTextCel.transferFocus();
    }//GEN-LAST:event_jTextCelActionPerformed

    private void jTextCelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCelKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != evt.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextCelKeyTyped

    private void jTextNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
                if (Character.isDigit(c)) {
                    getToolkit().beep();
                    evt.consume();
                    // JOptionPane.showMessageDialog(null, "Ingrese solo letras");
                }
    }//GEN-LAST:event_jTextNombreKeyTyped

    private void jTextApePaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextApePaKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
                if (Character.isDigit(c)) {
                    getToolkit().beep();
                    evt.consume();
                    // JOptionPane.showMessageDialog(null, "Ingrese solo letras");
                }
    }//GEN-LAST:event_jTextApePaKeyTyped

    private void jTextApeMaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextApeMaKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
                if (Character.isDigit(c)) {
                    getToolkit().beep();
                    evt.consume();
                    // JOptionPane.showMessageDialog(null, "Ingrese solo letras");
                }
    }//GEN-LAST:event_jTextApeMaKeyTyped

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
        jTextNombre.transferFocus();
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jTextApePaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextApePaActionPerformed
        // TODO add your handling code here:
        jTextApePa.transferFocus();
    }//GEN-LAST:event_jTextApePaActionPerformed

    private void jTextApeMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextApeMaActionPerformed
        // TODO add your handling code here:}
        jTextApeMa.transferFocus();
    }//GEN-LAST:event_jTextApeMaActionPerformed

    private void jTextDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDireccionActionPerformed
        // TODO add your handling code here:
        jTextDireccion.transferFocus();
    }//GEN-LAST:event_jTextDireccionActionPerformed

    private void jTextUser6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUser6ActionPerformed
        // TODO add your handling code here:+
        jTextUser6.transferFocus();
    }//GEN-LAST:event_jTextUser6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextApeMa;
    private javax.swing.JTextField jTextApePa;
    private javax.swing.JTextField jTextCel;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextUser6;
    // End of variables declaration//GEN-END:variables
}
