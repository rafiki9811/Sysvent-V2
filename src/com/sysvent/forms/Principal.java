/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sysvent.forms;

/**
 *
 * @author Admin
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        setUndecorated(false);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        salaVentas = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        salaCompras = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        salaProductos = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        salaEmpleados = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        salaInformes = new javax.swing.JMenu();
        salaProveedor = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        salaCliente = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setSize(new java.awt.Dimension(1200, 600));

        jInternalFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrame1.setMaximumSize(new java.awt.Dimension(1184, 476));
        jInternalFrame1.setMinimumSize(new java.awt.Dimension(1184, 476));
        jInternalFrame1.setVisible(true);

        jPanel1.setBackground(new java.awt.Color(242, 149, 27));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1168, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane1.setLayer(jInternalFrame1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(36, 45, 45));
        jMenuBar1.setBorder(null);
        jMenuBar1.setMaximumSize(new java.awt.Dimension(615, 45));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(615, 45));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(615, 45));

        jMenu1.setBackground(new java.awt.Color(36, 45, 45));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salida.png"))); // NOI18N
        jMenu1.setText("Salir");
        jMenu1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jMenu1.setMinimumSize(new java.awt.Dimension(27, 30));
        jMenu1.setPreferredSize(new java.awt.Dimension(80, 32));

        jMenuItem1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jMenuItem1.setText("Cerrar Sesion");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        salaVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/venta.png"))); // NOI18N
        salaVentas.setText("Ventas");
        salaVentas.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        salaVentas.setPreferredSize(new java.awt.Dimension(95, 32));
        salaVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaVentasActionPerformed(evt);
            }
        });

        jMenuItem2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jMenuItem2.setText("Consultar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        salaVentas.add(jMenuItem2);

        jMenuBar1.add(salaVentas);

        salaCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/compra.png"))); // NOI18N
        salaCompras.setText("Compras");
        salaCompras.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        salaCompras.setPreferredSize(new java.awt.Dimension(110, 32));

        jMenuItem6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jMenuItem6.setText("Consultar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        salaCompras.add(jMenuItem6);

        jMenuItem9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jMenuItem9.setText("Agregar");
        salaCompras.add(jMenuItem9);

        jMenuBar1.add(salaCompras);

        salaProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/almacen.png"))); // NOI18N
        salaProductos.setText("Productos");
        salaProductos.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        salaProductos.setPreferredSize(new java.awt.Dimension(115, 32));

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        jMenuItem7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jMenuItem7.setText("Consulta/Registro");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        salaProductos.add(jMenuItem7);

        jMenuItem8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jMenuItem8.setText("Registro");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        salaProductos.add(jMenuItem8);

        jMenuBar1.add(salaProductos);

        salaEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empleados.png"))); // NOI18N
        salaEmpleados.setText("Empleados");
        salaEmpleados.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        salaEmpleados.setPreferredSize(new java.awt.Dimension(120, 32));

        jMenuItem3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jMenuItem3.setText("Consulta/Registro");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        salaEmpleados.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jMenuItem4.setText("Registro");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        salaEmpleados.add(jMenuItem4);

        jMenuBar1.add(salaEmpleados);

        salaInformes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/proyecto-de-ley.png"))); // NOI18N
        salaInformes.setText("Informes");
        salaInformes.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jMenuBar1.add(salaInformes);

        salaProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vendedor.png"))); // NOI18N
        salaProveedor.setText("Proveedor");
        salaProveedor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jMenuItem5.setText("Consulta/Registro");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        salaProveedor.add(jMenuItem5);

        jMenuItem10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jMenuItem10.setText("Registro");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        salaProveedor.add(jMenuItem10);

        jMenuBar1.add(salaProveedor);

        salaCliente.setText("Cliente");
        salaCliente.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        jMenuItem11.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jMenuItem11.setText("Consulta/Registro");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        salaCliente.add(jMenuItem11);

        jMenuItem12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jMenuItem12.setText("Agregar");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        salaCliente.add(jMenuItem12);

        jMenuBar1.add(salaCliente);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        setSize(new java.awt.Dimension(1200, 560));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        Agregar_Empleados empleados = new Agregar_Empleados();
       
        jDesktopPane1.add(empleados);
        empleados.show();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        Consultar_Productos frm_productos = new Consultar_Productos();
        jDesktopPane1.add(frm_productos);
        frm_productos.show();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        Agregar_Producto frm_productos = new Agregar_Producto();
        jDesktopPane1.add(frm_productos);
        frm_productos.show();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void salaVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaVentasActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_salaVentasActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        Consultar_Compras compras = new Consultar_Compras();
        jDesktopPane1.add(compras);
        compras.show();

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        Consultar_Empleados empleados = new Consultar_Empleados();
        jDesktopPane1.add(empleados);
        empleados.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        Consultar_Proveedores proveedores = new Consultar_Proveedores();
        jDesktopPane1.add(proveedores);
        proveedores.show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        Agregar_Proveedores proveedores = new Agregar_Proveedores();
        jDesktopPane1.add(proveedores);
        proveedores.show();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        Consultar_Cliente cliente = new Consultar_Cliente();
        jDesktopPane1.add(cliente);
        cliente.show();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
            Agregar_Cliente cliente1 = new Agregar_Cliente();
            jDesktopPane1.add(cliente1);
            cliente1.show();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JMenu salaCliente;
    public static javax.swing.JMenu salaCompras;
    public static javax.swing.JMenu salaEmpleados;
    public static javax.swing.JMenu salaInformes;
    public static javax.swing.JMenu salaProductos;
    public static javax.swing.JMenu salaProveedor;
    public static javax.swing.JMenu salaVentas;
    // End of variables declaration//GEN-END:variables
}
