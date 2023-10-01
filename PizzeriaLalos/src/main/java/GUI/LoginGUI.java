package GUI;

import Logica.Login;
import Logica.Usuario;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;

public class LoginGUI extends javax.swing.JFrame {

    private static Usuario usuarioRegistrado;

    public LoginGUI() {
        initComponents();
        setLocationRelativeTo(null);
        initFields();
    }
    //Metodos Propios 

    public final void initFields() {
        txtcorreo_electronico.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtcorreo_electronico.getText().equals("Correo electronico")) {
                    txtcorreo_electronico.setText("");
                    txtcorreo_electronico.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtcorreo_electronico.getText().isEmpty()) {
                    txtcorreo_electronico.setText("Correo electronico");
                    txtcorreo_electronico.setForeground(Color.GRAY);
                }
            }
        });

        txtpassword.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                String password = new String(txtpassword.getPassword());
                if (password.equals("jPasswordField1")) {
                    txtpassword.setText("");
                    txtpassword.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                String password = new String(txtpassword.getPassword());
                if (password.isEmpty()) {
                    txtpassword.setText("jPasswordField1");
                    txtpassword.setForeground(Color.GRAY);
                }
            }
        });
    }

    public void Autenticacion() {
        String password_aux;
        password_aux = String.valueOf(txtpassword.getPassword());
        if (!txtcorreo_electronico.getText().isEmpty()) {
            if (!password_aux.isEmpty()) {
                if (Login.autenticacion(txtcorreo_electronico.getText(), password_aux)) {
                     usuarioRegistrado = Login.obtenerUsuario(Login.buscarUsuario(txtcorreo_electronico.getText())) ;
                     AdministradorGUI.setMensajeAdminstrador("Usuario " + usuarioRegistrado.getID()+" ha iniciado sesión" );
                    MenuGUI menu = new MenuGUI();
                    menu.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Cuenta no existente");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Inserte su contraseña");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Inserte su metodo de iniciar sesión");
        }
    }

    public static Usuario getUsuarioRegistrado() {
        return usuarioRegistrado;
    }

    public static void setUsuarioRegistrado(Usuario usuarioRegistrado) {
        LoginGUI.usuarioRegistrado = usuarioRegistrado;
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
        pnlEncabezado = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnlPizzeria = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcorreo_electronico = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtpassword = new javax.swing.JPasswordField();
        cbRember_me = new javax.swing.JCheckBox();
        lblRegister = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        lblEmail = new javax.swing.JLabel();
        lblPregunta = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Backg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlEncabezado.setBackground(new java.awt.Color(153, 0, 51));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("INICIAR SESIÓN");

        javax.swing.GroupLayout pnlEncabezadoLayout = new javax.swing.GroupLayout(pnlEncabezado);
        pnlEncabezado.setLayout(pnlEncabezadoLayout);
        pnlEncabezadoLayout.setHorizontalGroup(
            pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEncabezadoLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlEncabezadoLayout.setVerticalGroup(
            pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        Backg.add(pnlEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 60));

        pnlPizzeria.setBackground(new java.awt.Color(153, 0, 51));

        jLabel2.setFont(new java.awt.Font("Calisto MT", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pizzeria");

        jLabel3.setFont(new java.awt.Font("Calisto MT", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Lalo's");

        javax.swing.GroupLayout pnlPizzeriaLayout = new javax.swing.GroupLayout(pnlPizzeria);
        pnlPizzeria.setLayout(pnlPizzeriaLayout);
        pnlPizzeriaLayout.setHorizontalGroup(
            pnlPizzeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlPizzeriaLayout.setVerticalGroup(
            pnlPizzeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPizzeriaLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        Backg.add(pnlPizzeria, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 90, 240));

        txtcorreo_electronico.setBackground(new java.awt.Color(240, 240, 240));
        txtcorreo_electronico.setText("Correo electronico");
        txtcorreo_electronico.setBorder(null);
        Backg.add(txtcorreo_electronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 210, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        Backg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 210, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        Backg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 210, 10));

        txtpassword.setBackground(new java.awt.Color(240, 240, 240));
        txtpassword.setText("jPasswordField1");
        txtpassword.setBorder(null);
        Backg.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 210, 30));

        cbRember_me.setText("Recuerda me");
        cbRember_me.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Backg.add(cbRember_me, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        lblRegister.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblRegister.setForeground(new java.awt.Color(0, 102, 204));
        lblRegister.setText("Registarse");
        lblRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegisterMouseClicked(evt);
            }
        });
        Backg.add(lblRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        btnLogin.setBackground(new java.awt.Color(204, 0, 0));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        Backg.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 180, 40));

        lblEmail.setText("CORREO ELECTRÓNICO");
        Backg.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        lblPregunta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPregunta.setText("¿Necesitas una cuenta?");
        Backg.add(lblPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        lblPassword.setText("CONTRASEÑA");
        Backg.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        getContentPane().add(Backg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseClicked
        RegisterGUI crear = new RegisterGUI();
        crear.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblRegisterMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        Autenticacion();
    }//GEN-LAST:event_btnLoginActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Backg;
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox cbRember_me;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JPanel pnlEncabezado;
    private javax.swing.JPanel pnlPizzeria;
    private javax.swing.JTextField txtcorreo_electronico;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
