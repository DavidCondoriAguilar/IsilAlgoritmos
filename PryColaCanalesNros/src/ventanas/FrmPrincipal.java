
package ventanas;

import procesos.ColaVectorNros;
import javax.swing.JOptionPane;

public class FrmPrincipal extends javax.swing.JFrame
{
    ColaVectorNros colaDeCanales;
    int n;

    public FrmPrincipal()
    {
        initComponents();
        setLocationRelativeTo(this);
        
        n = 5;
        colaDeCanales = new ColaVectorNros(n);
    }
    
    public void mostrarContenidoUser()  // formato de salida para el usuario
    {
        int i;
        txaResultadoUser.setText("");

        if (colaDeCanales.getFrente() <= colaDeCanales.getFinal())
            for (i = colaDeCanales.getFrente(); (i <= colaDeCanales.getFinal() && i >= 0); i++)
                txaResultadoUser.append((int)colaDeCanales.getElemento(i) + "  ");
        else
        {
            for (i = colaDeCanales.getFrente(); i < n; i++)
                txaResultadoUser.append((int)colaDeCanales.getElemento(i) + "  ");

            for (i = 0; i <= colaDeCanales.getFinal(); i++)
                txaResultadoUser.append((int)colaDeCanales.getElemento(i) + "  ");
        }
    }

    public void mostrarContenido()  // formato de salida para nosotros
    {
        int i;

        txaResultado.setText("");
        lblFrente.setText("frente = " + colaDeCanales.getFrente());
        lblFinal.setText("final = " + colaDeCanales.getFinal());

        if (colaDeCanales.getFrente() <= colaDeCanales.getFinal())
        {
            for (i = 0; i < colaDeCanales.getFrente(); i++)
                txaResultado.append("      ");

            for (i = colaDeCanales.getFrente(); (i <= colaDeCanales.getFinal() && i >= 0); i++)
                txaResultado.append((int)colaDeCanales.getElemento(i) + "  ");
        }
        else
        {
            for (i = 0; i <= colaDeCanales.getFinal(); i++)
                txaResultado.append((int)colaDeCanales.getElemento(i) + "  ");

            for (i = colaDeCanales.getFinal() + 1; i < colaDeCanales.getFrente(); i++)
                txaResultado.append("      ");

            for (i = colaDeCanales.getFrente(); i < n; i++)
                txaResultado.append((int)colaDeCanales.getElemento(i) + "  ");
        }
        txtNro.setText("");
        txtNro.requestFocus();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaResultadoUser = new javax.swing.JTextArea();
        btnAdicionar = new javax.swing.JButton();
        btnAtender = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaResultado = new javax.swing.JTextArea();
        lblFrente = new javax.swing.JLabel();
        lblFinal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cola con canales de TV");

        jLabel1.setText("Número");

        txaResultadoUser.setColumns(20);
        txaResultadoUser.setRows(5);
        jScrollPane1.setViewportView(txaResultadoUser);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnAtender.setText("Atender");
        btnAtender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtenderActionPerformed(evt);
            }
        });

        txaResultado.setColumns(20);
        txaResultado.setRows(5);
        jScrollPane2.setViewportView(txaResultado);

        lblFrente.setText("frente = -1");

        lblFinal.setText("final = -1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAtender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFrente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFinal))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtender)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFrente)
                    .addComponent(lblFinal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        int aux;

        if ((colaDeCanales.getFrente()== 0 && colaDeCanales.getFinal() == n - 1) ||
            (colaDeCanales.getFrente() == colaDeCanales.getFinal() + 1))
            JOptionPane.showMessageDialog(this, "La Cola está llena");
        else
        {
            aux = Integer.parseInt(txtNro.getText());
            colaDeCanales.adicionar(aux);
            
            mostrarContenidoUser();
            mostrarContenido();
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnAtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtenderActionPerformed
        // TODO add your handling code here:
        if (colaDeCanales.getFrente() == -1)
            JOptionPane.showMessageDialog(this, "La Cola está vacía");
        else
        {
            colaDeCanales.atender();

            mostrarContenidoUser();
            mostrarContenido();
        }
    }//GEN-LAST:event_btnAtenderActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAtender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFinal;
    private javax.swing.JLabel lblFrente;
    private javax.swing.JTextArea txaResultado;
    private javax.swing.JTextArea txaResultadoUser;
    private javax.swing.JTextField txtNro;
    // End of variables declaration//GEN-END:variables
}
