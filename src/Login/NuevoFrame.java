/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author rical
 */
public class NuevoFrame extends javax.swing.JFrame {
    SimpleDateFormat dt= new SimpleDateFormat("dd-MM-yyyy");

    String nombreTamano = "";
    String nombreTopping = "";
    double Total = 0.0;
    double subtotal = 0.0;
    double iva = 0.0;
    String date = "";
        
    double ivaSub = 0.0;
    final double IVA = 0.16;
    /**
     * Creates new form NuevoFrame
     */
    public NuevoFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rdbutSencillo = new javax.swing.JRadioButton();
        rdbutDoble = new javax.swing.JRadioButton();
        rdbutJumbo = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        cbxChispas = new javax.swing.JCheckBox();
        cbxCajeta = new javax.swing.JCheckBox();
        cbxGomitas = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labSubtotal = new javax.swing.JLabel();
        labIVA = new javax.swing.JLabel();
        labTotal = new javax.swing.JLabel();
        jtexSubtotal = new javax.swing.JTextField();
        jtexIVA = new javax.swing.JTextField();
        jtexTotal = new javax.swing.JTextField();
        btnSuma = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnFecha = new javax.swing.JButton();
        btnTicket = new javax.swing.JButton();
        dcCal = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tamaño"));

        btngroup.add(rdbutSencillo);
        rdbutSencillo.setText("Sencillo $20");

        btngroup.add(rdbutDoble);
        rdbutDoble.setText("Doble $30");

        btngroup.add(rdbutJumbo);
        rdbutJumbo.setText("Jumbo $45");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbutSencillo)
                    .addComponent(rdbutDoble)
                    .addComponent(rdbutJumbo))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rdbutSencillo)
                .addGap(17, 17, 17)
                .addComponent(rdbutDoble)
                .addGap(17, 17, 17)
                .addComponent(rdbutJumbo))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 150, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Topping"));

        cbxChispas.setText("Chispas $5");

        cbxCajeta.setText("Cajeta $10");

        cbxGomitas.setText("Gomitas $15");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxChispas)
                    .addComponent(cbxCajeta)
                    .addComponent(cbxGomitas))
                .addGap(0, 55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(cbxChispas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxCajeta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxGomitas)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 150, 120));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Helados Ricardo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 190, 30));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labSubtotal.setText("Subtotal");

        labIVA.setText("IVA");

        labTotal.setText("Total");

        jtexSubtotal.setEditable(false);

        jtexIVA.setEditable(false);

        jtexTotal.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labSubtotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtexSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(labIVA)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtexIVA))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(labTotal)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtexTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labSubtotal)
                    .addComponent(jtexSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labIVA)
                    .addComponent(jtexIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labTotal)
                    .addComponent(jtexTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 150, -1));

        btnSuma.setText("Suma");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        btnFecha.setText("Mostrar fecha");
        btnFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechaActionPerformed(evt);
            }
        });
        getContentPane().add(btnFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        btnTicket.setText("Ticket");
        btnTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketActionPerformed(evt);
            }
        });
        getContentPane().add(btnTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, -1));
        getContentPane().add(dcCal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        // TODO add your handling code here:
        
        
        
        if (rdbutSencillo.isSelected()){
        subtotal = subtotal + 20;
        nombreTamano = rdbutSencillo.getText();
        } 
        if (rdbutDoble.isSelected()){
        subtotal = subtotal + 30;
        nombreTamano = rdbutDoble.getText();
        } 
        if (rdbutJumbo.isSelected()){
        subtotal = subtotal + 45;
        nombreTamano = rdbutJumbo.getText();
        }
        
        if (cbxChispas.isSelected()){
        subtotal += 5;
        nombreTopping = nombreTopping + " " +cbxChispas.getText()+ "";
        
        }
        if (cbxCajeta.isSelected()){
        subtotal += 10;
        nombreTopping = nombreTopping + " " + cbxCajeta.getText()+ "";
        }
        if (cbxGomitas.isSelected()){
        subtotal += 15;
        nombreTopping = nombreTopping + " "+cbxGomitas.getText()+ "";
        }
        
        ivaSub = subtotal * IVA;
        DecimalFormat dec = new DecimalFormat("#.00");
        dec.format(ivaSub);
        Total = subtotal + ivaSub;
        
        jtexSubtotal.setText(Double.toString(subtotal));
        jtexIVA.setText(Double.toString(ivaSub));
        jtexTotal.setText(Double.toString(Total));
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,dt.format(dcCal.getDate()),"Mensaje",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnFechaActionPerformed

    private void btnTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketActionPerformed
        // TODO add your handling code here:
        Ticket t = new Ticket();
        
        date = dt.format(dcCal.getDate());
        t.setTamano(nombreTamano);
        t.setTopping(nombreTopping);
        t.setTotal(Total);
        t.setivasub(ivaSub);
        t.setDate(date);
        t.setVisible(true);
        
    }//GEN-LAST:event_btnTicketActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnFecha;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton btnTicket;
    private javax.swing.ButtonGroup btngroup;
    private javax.swing.JCheckBox cbxCajeta;
    private javax.swing.JCheckBox cbxChispas;
    private javax.swing.JCheckBox cbxGomitas;
    private com.toedter.calendar.JDateChooser dcCal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jtexIVA;
    private javax.swing.JTextField jtexSubtotal;
    private javax.swing.JTextField jtexTotal;
    private javax.swing.JLabel labIVA;
    private javax.swing.JLabel labSubtotal;
    private javax.swing.JLabel labTotal;
    private javax.swing.JRadioButton rdbutDoble;
    private javax.swing.JRadioButton rdbutJumbo;
    private javax.swing.JRadioButton rdbutSencillo;
    // End of variables declaration//GEN-END:variables
}
