/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CuentaBancaria;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class CrearCuentaBancaria extends javax.swing.JFrame {

    static boolean activarTarjeta;

    /**
     * Creates new form CrearCuentaBancaria
     */
    public CrearCuentaBancaria() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        nombretxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        aceptarBtn = new javax.swing.JButton();
        cancelarBtn = new javax.swing.JButton();
        apellidotxt = new javax.swing.JTextField();
        telefonotxt = new javax.swing.JTextField();
        emailtxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nippss = new javax.swing.JPasswordField();
        jSeparator5 = new javax.swing.JSeparator();
        iconoportada = new javax.swing.JLabel();
        iconocity = new javax.swing.JLabel();
        iconologo = new javax.swing.JLabel();
        iconomarca = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        nombretxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombretxt.setForeground(new java.awt.Color(204, 204, 204));
        nombretxt.setText("NOMBRE(S)");
        nombretxt.setBorder(null);
        nombretxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombretxtMouseClicked(evt);
            }
        });
        nombretxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombretxtKeyReleased(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        aceptarBtn.setText("ACEPTAR");
        aceptarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aceptarBtnMouseClicked(evt);
            }
        });

        cancelarBtn.setText("CANCELAR");
        cancelarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarBtnMouseClicked(evt);
            }
        });

        apellidotxt.setForeground(new java.awt.Color(204, 204, 204));
        apellidotxt.setText("APELLIDO(S)");
        apellidotxt.setBorder(null);
        apellidotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apellidotxtMouseClicked(evt);
            }
        });
        apellidotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                apellidotxtKeyReleased(evt);
            }
        });

        telefonotxt.setForeground(new java.awt.Color(204, 204, 204));
        telefonotxt.setText("NÚMERO TELÉFONICO");
        telefonotxt.setBorder(null);
        telefonotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telefonotxtMouseClicked(evt);
            }
        });
        telefonotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telefonotxtKeyReleased(evt);
            }
        });

        emailtxt.setForeground(new java.awt.Color(204, 204, 204));
        emailtxt.setText("CORREO ELECTRÓNICO");
        emailtxt.setBorder(null);
        emailtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailtxtMouseClicked(evt);
            }
        });
        emailtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailtxtKeyReleased(evt);
            }
        });

        jLabel1.setText("NIP");

        nippss.setForeground(new java.awt.Color(204, 204, 204));
        nippss.setText("CONTRASENA");
        nippss.setBorder(null);
        nippss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nippssMouseClicked(evt);
            }
        });
        nippss.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nippssKeyReleased(evt);
            }
        });

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nombretxt, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                        .addComponent(jSeparator1)
                        .addComponent(jSeparator2)
                        .addComponent(jSeparator3)
                        .addComponent(jSeparator4)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(aceptarBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelarBtn)))
                    .addComponent(apellidotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nippss, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(apellidotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(telefonotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nippss, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarBtn)
                    .addComponent(cancelarBtn))
                .addGap(0, 47, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 280, 370));

        iconoportada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconoportada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        bg.add(iconoportada, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 220, -1));

        iconocity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/city.png"))); // NOI18N
        bg.add(iconocity, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 220, 440));

        iconologo.setBackground(new java.awt.Color(255, 255, 255));
        iconologo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconologo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/favicon.png"))); // NOI18N
        bg.add(iconologo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        iconomarca.setBackground(new java.awt.Color(255, 255, 255));
        iconomarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconomarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ICONOBANCO2.png"))); // NOI18N
        bg.add(iconomarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarBtnMouseClicked
        // TODO add your handling code here:
        IniciarSecionGUI iniciar = new IniciarSecionGUI();
        iniciar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarBtnMouseClicked

    private void aceptarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarBtnMouseClicked
        // TODO add your handling code here:
        if (!"NOMBRE(S)".equals(nombretxt.getText()) && !"".equals(nombretxt.getText()) && !"APELLIDO(S)".equals(apellidotxt.getText()) && !"".equals(apellidotxt.getText())
                && !"NÚMERO TELÉFONICO".equals(telefonotxt.getText()) && !"".equals(telefonotxt.getText()) && !"CORREO ELECTRÓNICO".equals(emailtxt.getText())
                && !"".equals(emailtxt.getText()) && !"CONTRASENA".equals(String.valueOf(nippss.getPassword())) && !"".equals(String.valueOf(nippss.getPassword()))) {
            String nombre = nombretxt.getText();
            String nip = String.valueOf(nippss.getPassword());
            OperacionesBancariaGUI.cliente = new CuentaBancaria("4152313982877245", nip, nombre, 0);
            IniciarSecionGUI.cliente = new CuentaBancaria("4152313982877245", nip, nombre, 0);
            activarTarjeta = true;
            IniciarSecionGUI.TarjetaCambio();
            JOptionPane.showMessageDialog(null, "se ha GUARDADO con exito!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            IniciarSecionGUI iniciar = new IniciarSecionGUI();
            iniciar.setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "LLENE TODOS LOS CAMPOS", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_aceptarBtnMouseClicked

    public void cambioLetra() {
        if ("".equals(nombretxt.getText())) {
            nombretxt.setForeground(Color.GRAY);
            nombretxt.setText("NOMBRE(S)");
        }
        if ("".equals(apellidotxt.getText())) {
            apellidotxt.setForeground(Color.GRAY);
            apellidotxt.setText("APELLIDO(S)");
        }
        if ("".equals(telefonotxt.getText())) {
            telefonotxt.setForeground(Color.GRAY);
            telefonotxt.setText("NÚMERO TELÉFONICO");
        }
        if ("".equals(emailtxt.getText())) {
            emailtxt.setForeground(Color.GRAY);
            emailtxt.setText("CORREO ELECTRÓNICO");
        }
        if("".equals(String.valueOf(nippss.getPassword()))){
            nippss.setForeground(Color.GRAY);
            nippss.setText("CONTRASENA");
        }

    }

    private void nombretxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombretxtMouseClicked
        // TODO add your handling code here:
        cambioLetra();
        if ("NOMBRE(S)".equals(nombretxt.getText())) {
            nombretxt.setText("");
            nombretxt.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_nombretxtMouseClicked

    private void nombretxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombretxtKeyReleased
        // TODO add your handling code here:
        if ("".equals(nombretxt.getText()) || "NOMBRE(S)".equals(nombretxt.getText())) {
            nombretxt.setForeground(Color.GRAY);
            nombretxt.setText("NOMBRE(S)");
        }
    }//GEN-LAST:event_nombretxtKeyReleased

    private void apellidotxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidotxtMouseClicked
        // TODO add your handling code here:
        cambioLetra();
        if ("APELLIDO(S)".equals(apellidotxt.getText())) {
            apellidotxt.setText("");
            apellidotxt.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_apellidotxtMouseClicked

    private void apellidotxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidotxtKeyReleased
        // TODO add your handling code here:
         if ("".equals(apellidotxt.getText()) || "APELLIDO(S)".equals(apellidotxt.getText())) {
            apellidotxt.setForeground(Color.GRAY);
            apellidotxt.setText("APELLIDO(S)");
        }
    }//GEN-LAST:event_apellidotxtKeyReleased

    private void telefonotxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefonotxtMouseClicked
        // TODO add your handling code here:
        cambioLetra();
        if ("NÚMERO TELÉFONICO".equals(telefonotxt.getText())) {
            telefonotxt.setText("");
            telefonotxt.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_telefonotxtMouseClicked

    private void telefonotxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonotxtKeyReleased
        // TODO add your handling code here:
        if ("".equals(telefonotxt.getText()) || "NÚMERO TELÉFONICO".equals(telefonotxt.getText())) {
            telefonotxt.setForeground(Color.GRAY);
            telefonotxt.setText("NÚMERO TELÉFONICO");
        }
    }//GEN-LAST:event_telefonotxtKeyReleased

    private void emailtxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailtxtMouseClicked
        // TODO add your handling code here:
        cambioLetra();
        if ("CORREO ELECTRÓNICO".equals(emailtxt.getText())) {
            emailtxt.setText("");
            emailtxt.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_emailtxtMouseClicked

    private void emailtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailtxtKeyReleased
        // TODO add your handling code here:
        if ("".equals(emailtxt.getText()) || "CORREO ELECTRÓNICO".equals(emailtxt.getText())) {
            emailtxt.setForeground(Color.GRAY);
            emailtxt.setText("CORREO ELECTRÓNICO");
        }
    }//GEN-LAST:event_emailtxtKeyReleased

    private void nippssMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nippssMouseClicked
        // TODO add your handling code here:
        cambioLetra();
        if ("CONTRASENA".equals(String.valueOf(nippss.getPassword()))) {
            nippss.setText("");
            nippss.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_nippssMouseClicked

    private void nippssKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nippssKeyReleased
        // TODO add your handling code here:
        if ("".equals(String.valueOf(nippss.getPassword())) || "CONTRASENA".equals(String.valueOf(nippss.getPassword()))) {
            nippss.setForeground(Color.GRAY);
            nippss.setText("CONTRASENA");
        }
    }//GEN-LAST:event_nippssKeyReleased

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
            java.util.logging.Logger.getLogger(CrearCuentaBancaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCuentaBancaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCuentaBancaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCuentaBancaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearCuentaBancaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarBtn;
    private javax.swing.JTextField apellidotxt;
    private javax.swing.JPanel bg;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JLabel iconocity;
    private javax.swing.JLabel iconologo;
    private javax.swing.JLabel iconomarca;
    private javax.swing.JLabel iconoportada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPasswordField nippss;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JTextField telefonotxt;
    // End of variables declaration//GEN-END:variables
}