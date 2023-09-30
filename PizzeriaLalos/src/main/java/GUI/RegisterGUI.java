package GUI;

import Logica.Login;
import Logica.Usuario;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;
import javax.swing.JOptionPane;


public class RegisterGUI extends javax.swing.JFrame {
    Login registro = new Login();
    static int IDs = 0;
    public RegisterGUI() {
        initComponents();
        setLocationRelativeTo(null);
        initFields  ();
        
    }
    
    private void  regitstroUsuario(char[] password){
        String nombre_aux,apellidos_aux,email_aux,telefono_aux;
        nombre_aux = txtnombre.getText();
        apellidos_aux = txtapellido.getText();
        email_aux = txtemail.getText();
        telefono_aux = txttelefono.getText();
        Usuario usuario_aux = new Usuario(nombre_aux, apellidos_aux, telefono_aux, email_aux,password, IDs);
        if (registro.agregar(usuario_aux)) {
            IDs++;
            JOptionPane.showMessageDialog(RegisterGUI.this, "Registro exitoso \nBienvenido "  +usuario_aux.getNombres() , "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
            LoginGUI crear = new LoginGUI();
            crear.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(RegisterGUI.this, registro.getMensajeAdmin() , "Te chingas", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        
        
                    
    }
    private void initFields(){
        configureTextField(txtnombre, "Nombre");
        configureTextField(txtapellido, "Apellido");
        configureTextField(txtemail, "Correo Electronico");
        configureTextField(txttelefono, "Teléfono");
        configurePasswordField(txtpassword, "Contraseña");
        configurePasswordField(txtpassword_confirmed, "Confirmar contraseña");

    }
    private void configureTextField(javax.swing.JTextField textField, String placeholder) {
        textField.setText(placeholder);

        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setText(placeholder);
                }
            }
        });
    }

    private void configurePasswordField(javax.swing.JPasswordField passwordField, String placeholder) {
        passwordField.setText(placeholder);

        passwordField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                char[] password = passwordField.getPassword();
                String currentPassword = new String(password);

                if (currentPassword.equals(placeholder)) {
                    passwordField.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                char[] password = passwordField.getPassword();
                String currentPassword = new String(password);

                if (currentPassword.isEmpty()) {
                    passwordField.setText(placeholder);
                }
            }
        });

        passwordField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                char[] password = passwordField.getPassword();
                String currentPassword = new String(password);
                
                if (currentPassword.isEmpty()) {
                    passwordField.setText(placeholder);
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Backg = new javax.swing.JPanel();
        pnlCabezera = new javax.swing.JPanel();
        txtcabezera = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        txtpassword_confirmed = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        lblcontraseña = new javax.swing.JLabel();
        lblcontraseña_confirmar = new javax.swing.JLabel();
        btnregister = new javax.swing.JButton();
        lblpregunta = new javax.swing.JLabel();
        lbliniciar_sesion = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lblapellido = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Backg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCabezera.setBackground(new java.awt.Color(153, 0, 51));

        txtcabezera.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtcabezera.setForeground(new java.awt.Color(255, 255, 255));
        txtcabezera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtcabezera.setText("CREAR CUENTA");

        javax.swing.GroupLayout pnlCabezeraLayout = new javax.swing.GroupLayout(pnlCabezera);
        pnlCabezera.setLayout(pnlCabezeraLayout);
        pnlCabezeraLayout.setHorizontalGroup(
            pnlCabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCabezeraLayout.createSequentialGroup()
                .addComponent(txtcabezera, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlCabezeraLayout.setVerticalGroup(
            pnlCabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtcabezera, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        Backg.add(pnlCabezera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 80));

        txtnombre.setBackground(new java.awt.Color(240, 240, 240));
        txtnombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombre.setText("Nombre");
        txtnombre.setBorder(null);
        Backg.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 210, 30));

        txtapellido.setBackground(new java.awt.Color(240, 240, 240));
        txtapellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtapellido.setText("Apellido");
        txtapellido.setBorder(null);
        Backg.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 210, 30));

        txtemail.setBackground(new java.awt.Color(240, 240, 240));
        txtemail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtemail.setText("Correo Electronico");
        txtemail.setBorder(null);
        Backg.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 210, 30));

        txttelefono.setBackground(new java.awt.Color(240, 240, 240));
        txttelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txttelefono.setText("Teléfono");
        txttelefono.setBorder(null);
        Backg.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 210, 30));

        txtpassword.setBackground(new java.awt.Color(240, 240, 240));
        txtpassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpassword.setText("jPasswordField1");
        txtpassword.setBorder(null);
        Backg.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 210, 30));

        txtpassword_confirmed.setBackground(new java.awt.Color(240, 240, 240));
        txtpassword_confirmed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpassword_confirmed.setText("jPasswordField2");
        txtpassword_confirmed.setBorder(null);
        Backg.add(txtpassword_confirmed, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 210, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        Backg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 210, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        Backg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 210, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        Backg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 210, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        Backg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 210, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        Backg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 210, 10));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        Backg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 210, 10));

        lblcontraseña.setText("CONTRASEÑA");
        Backg.add(lblcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        lblcontraseña_confirmar.setText("CONFIRMAR CONTRASEÑA");
        Backg.add(lblcontraseña_confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        btnregister.setBackground(new java.awt.Color(204, 0, 0));
        btnregister.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnregister.setForeground(new java.awt.Color(255, 255, 255));
        btnregister.setText("REGISTRARSE");
        btnregister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        Backg.add(btnregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, -1, -1));

        lblpregunta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblpregunta.setText("¿ya tienes una cuenta?");
        Backg.add(lblpregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        lbliniciar_sesion.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lbliniciar_sesion.setForeground(new java.awt.Color(0, 102, 204));
        lbliniciar_sesion.setText("Iniciar sesión");
        lbliniciar_sesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbliniciar_sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbliniciar_sesionMouseClicked(evt);
            }
        });
        Backg.add(lbliniciar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, -1, -1));

        lbltelefono.setText("TELÉFONO");
        Backg.add(lbltelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        lblemail.setText("CORREO ELECTRÓNICO");
        Backg.add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        lblapellido.setText("APELLIDOS");
        Backg.add(lblapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        lblnombre.setText("NOMBRE");
        Backg.add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        getContentPane().add(Backg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbliniciar_sesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbliniciar_sesionMouseClicked
        LoginGUI crear = new LoginGUI();
        crear.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbliniciar_sesionMouseClicked

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
        if (!"Nombre".equals(txtnombre.getText()) && !"".equals(txtnombre.getText()) && !"Apellido".equals(txtapellido.getText())
                && !"".equals(txtapellido.getText()) && !"Correo Electronico".equals(txtemail.getText()) && !"".equals(txtemail.getText())
                && !"Teléfono".equals(txttelefono.getText()) && !"".equals(txttelefono.getText()) && !"Contraseña".equals(String.valueOf(txtpassword.getPassword()))
                && !"".equals(String.valueOf(txtpassword.getPassword())) && !"Confirmar contraseña".equals(String.valueOf(txtpassword_confirmed.getPassword()))
                && !"".equals(String.valueOf(txtpassword_confirmed.getPassword()))) {

            char[] password1 = txtpassword.getPassword();
            char[] password2 = txtpassword_confirmed.getPassword();

            if (Arrays.equals(password1, password2)) {
                regitstroUsuario(password2);
            } else {
                JOptionPane.showMessageDialog(RegisterGUI.this, "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(RegisterGUI.this, "Llene todos los campos solicitados", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnregisterActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Backg;
    private javax.swing.JButton btnregister;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblapellido;
    private javax.swing.JLabel lblcontraseña;
    private javax.swing.JLabel lblcontraseña_confirmar;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lbliniciar_sesion;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblpregunta;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JPanel pnlCabezera;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JLabel txtcabezera;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JPasswordField txtpassword_confirmed;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
