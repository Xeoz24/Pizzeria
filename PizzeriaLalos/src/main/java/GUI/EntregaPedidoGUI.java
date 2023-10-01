
package GUI;

import Logica.Pedidos.ColaPedidos;

import javax.swing.JOptionPane;

public class EntregaPedidoGUI extends javax.swing.JFrame {

    public EntregaPedidoGUI() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMetodo1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Backg = new javax.swing.JPanel();
        pnlEncabezado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlMetodos = new javax.swing.JPanel();
        mensajeStatus = new javax.swing.JLabel();
        btnConfirmar_pedido = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        javax.swing.GroupLayout pnlMetodo1Layout = new javax.swing.GroupLayout(pnlMetodo1);
        pnlMetodo1.setLayout(pnlMetodo1Layout);
        pnlMetodo1Layout.setHorizontalGroup(
            pnlMetodo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMetodo1Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        pnlMetodo1Layout.setVerticalGroup(
            pnlMetodo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMetodo1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        pnlMetodos.setBackground(new java.awt.Color(255, 255, 255));

        mensajeStatus.setBackground(new java.awt.Color(255, 255, 255));
        mensajeStatus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mensajeStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensajeStatus.setText("Pedido en curso...");

        javax.swing.GroupLayout pnlMetodosLayout = new javax.swing.GroupLayout(pnlMetodos);
        pnlMetodos.setLayout(pnlMetodosLayout);
        pnlMetodosLayout.setHorizontalGroup(
            pnlMetodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMetodosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mensajeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnlMetodosLayout.setVerticalGroup(
            pnlMetodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMetodosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mensajeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
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
        AdministradorGUI.setMensajeAdminstrador("El pedido de " + CarritoCompraGUI.getPedido().getUsuario().getNombres() + " ha sido entregado, La cola se encuntra vacía " + ColaPedidos.getLongitud() );
       
          
        JOptionPane.showMessageDialog(this, "Gracias por su compra " + CarritoCompraGUI.getPedido().getUsuario().getNombres(), "Pedido Exitoso", JOptionPane.INFORMATION_MESSAGE);
            
        
        this.dispose();
    }//GEN-LAST:event_btnConfirmar_pedidoActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Backg;
    private javax.swing.JButton btnConfirmar_pedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel mensajeStatus;
    private javax.swing.JPanel pnlEncabezado;
    private javax.swing.JPanel pnlMetodo1;
    private javax.swing.JPanel pnlMetodos;
    // End of variables declaration//GEN-END:variables
}
