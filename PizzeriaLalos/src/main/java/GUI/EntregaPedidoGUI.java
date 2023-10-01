
package GUI;

import Logica.Pedidos.ColaPedidos;

public class EntregaPedidoGUI extends javax.swing.JFrame {

    public EntregaPedidoGUI() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Backg = new javax.swing.JPanel();
        pnlEncabezado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlMetodos = new javax.swing.JPanel();
        pnlMetodo1 = new javax.swing.JPanel();
        pnlMetodo2 = new javax.swing.JPanel();
        pnlMetodo3 = new javax.swing.JPanel();
        pnlMetodo4 = new javax.swing.JPanel();
        btnConfirmar_pedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Backg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlEncabezado.setBackground(new java.awt.Color(153, 0, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Entrega Pedido");

        javax.swing.GroupLayout pnlEncabezadoLayout = new javax.swing.GroupLayout(pnlEncabezado);
        pnlEncabezado.setLayout(pnlEncabezadoLayout);
        pnlEncabezadoLayout.setHorizontalGroup(
            pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        pnlEncabezadoLayout.setVerticalGroup(
            pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        Backg.add(pnlEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 70));

        pnlMetodos.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout pnlMetodo1Layout = new javax.swing.GroupLayout(pnlMetodo1);
        pnlMetodo1.setLayout(pnlMetodo1Layout);
        pnlMetodo1Layout.setHorizontalGroup(
            pnlMetodo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );
        pnlMetodo1Layout.setVerticalGroup(
            pnlMetodo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlMetodo2Layout = new javax.swing.GroupLayout(pnlMetodo2);
        pnlMetodo2.setLayout(pnlMetodo2Layout);
        pnlMetodo2Layout.setHorizontalGroup(
            pnlMetodo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );
        pnlMetodo2Layout.setVerticalGroup(
            pnlMetodo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlMetodo3Layout = new javax.swing.GroupLayout(pnlMetodo3);
        pnlMetodo3.setLayout(pnlMetodo3Layout);
        pnlMetodo3Layout.setHorizontalGroup(
            pnlMetodo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );
        pnlMetodo3Layout.setVerticalGroup(
            pnlMetodo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlMetodo4Layout = new javax.swing.GroupLayout(pnlMetodo4);
        pnlMetodo4.setLayout(pnlMetodo4Layout);
        pnlMetodo4Layout.setHorizontalGroup(
            pnlMetodo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );
        pnlMetodo4Layout.setVerticalGroup(
            pnlMetodo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlMetodosLayout = new javax.swing.GroupLayout(pnlMetodos);
        pnlMetodos.setLayout(pnlMetodosLayout);
        pnlMetodosLayout.setHorizontalGroup(
            pnlMetodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMetodosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlMetodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMetodo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlMetodo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(pnlMetodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMetodo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlMetodo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMetodosLayout.setVerticalGroup(
            pnlMetodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMetodosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlMetodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMetodo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlMetodo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlMetodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMetodo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlMetodo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        Backg.add(pnlMetodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 210, 160));

        btnConfirmar_pedido.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnConfirmar_pedido.setText("CONFIRMAR PEDIDO ENTREGADO");
        btnConfirmar_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmar_pedidoActionPerformed(evt);
            }
        });
        Backg.add(btnConfirmar_pedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 210, 40));

        getContentPane().add(Backg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmar_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmar_pedidoActionPerformed
        ColaPedidos.eliminarDeCola();
        AdministradorGUI.setMensajeAdminstrador("El pedido de " + CarritoCompraGUI.getPedido().getUsuario().getNombres() + " ha sido entregado, La cola se encuntra vacía" + ColaPedidos.getLongitud() );
    }//GEN-LAST:event_btnConfirmar_pedidoActionPerformed

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
            java.util.logging.Logger.getLogger(EntregaPedidoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntregaPedidoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntregaPedidoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntregaPedidoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntregaPedidoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Backg;
    private javax.swing.JButton btnConfirmar_pedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlEncabezado;
    private javax.swing.JPanel pnlMetodo1;
    private javax.swing.JPanel pnlMetodo2;
    private javax.swing.JPanel pnlMetodo3;
    private javax.swing.JPanel pnlMetodo4;
    private javax.swing.JPanel pnlMetodos;
    // End of variables declaration//GEN-END:variables
}
