 package PtoA;

import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Multiplicativo extends javax.swing.JDialog {
    String vec[], xi[], parte[], mod[], div[];
    int a, i, cant;
    DefaultTableModel datos;

    public Multiplicativo() {
        initComponents();
        this.setLocationRelativeTo(null);//Centra la pantalla
        a = 0;
        i = 0;
        this.setModal(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupMetodos = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jlblSemilla = new javax.swing.JLabel();
        jtxtSemilla = new javax.swing.JTextField();
        jtxtM = new javax.swing.JTextField();
        jlblM = new javax.swing.JLabel();
        jtxtA = new javax.swing.JTextField();
        jlblA = new javax.swing.JLabel();
        jbtnGenerar = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jlblPuntoA = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Metodos Congruenciales");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Parámetros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N

        jlblSemilla.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlblSemilla.setText("Semilla =");

        jtxtSemilla.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jtxtSemilla.setNextFocusableComponent(jtxtA);
        jtxtSemilla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtSemillaKeyTyped(evt);
            }
        });

        jtxtM.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jtxtM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtMKeyTyped(evt);
            }
        });

        jlblM.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlblM.setText("m =");

        jtxtA.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jtxtA.setNextFocusableComponent(jtxtM);
        jtxtA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtAKeyTyped(evt);
            }
        });

        jlblA.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlblA.setText("a =");

        jbtnGenerar.setBackground(new java.awt.Color(242, 242, 242));
        jbtnGenerar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jbtnGenerar.setText("Generar");
        jbtnGenerar.setPreferredSize(new java.awt.Dimension(100, 35));
        jbtnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGenerarActionPerformed(evt);
            }
        });

        jbtnLimpiar.setBackground(new java.awt.Color(242, 242, 242));
        jbtnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jbtnLimpiar.setText("Limpiar");
        jbtnLimpiar.setPreferredSize(new java.awt.Dimension(100, 35));
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlblA)
                    .addComponent(jlblSemilla)
                    .addComponent(jlblM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtA, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(jtxtSemilla, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtM, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbtnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblSemilla)
                            .addComponent(jtxtSemilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblM)
                            .addComponent(jtxtM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabla.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "i", "Xi", "(a * Xi) + c", "Xi + 1", "ri"
            }
        ));
        jScrollPane2.setViewportView(jTabla);

        jlblPuntoA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlblPuntoA.setForeground(new java.awt.Color(0, 102, 153));
        jlblPuntoA.setText("Método Congruencial Multiplicativo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlblPuntoA)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblPuntoA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 260, Short.MAX_VALUE))))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jbtnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGenerarActionPerformed
    cant = 21;
    vec = new String[20];
    xi = new String[20];
    parte = new String[20];
    mod = new String[20];
    div = new String[20];
    a = 0;
    try {
        double a = Double.valueOf(jtxtA.getText());
        double x0 = Double.valueOf(jtxtSemilla.getText());
        double m = Double.valueOf(jtxtM.getText());
        double x, par, md, d;
        double x2;
        String aux = "";
        if (m > 9999) {
            m = 9999;
        }
        DecimalFormat RedondearADos = new DecimalFormat("0.0000");

        datos = new DefaultTableModel(new Object[]{"i", "Xi", "(Xi * a) + c", "Xi+1", "ri"}, 0);
        jTabla.setModel(datos);
        for (int i = 0; i < vec.length; i++) {
            xi[i] = RedondearADos.format(x0);
            parte[i] = RedondearADos.format(x0 * a);
            mod[i] = RedondearADos.format((x0 * a) % m);
            div[i] = RedondearADos.format(((x0 * a) % m) / (m));
            x0 = (a * x0) % m;
            x2 = x0;
            if (x2 == 1) {
                x2 = 0.0000;
            } else {
                x2 = x2 / (m - 1);
            }
            vec[i] = RedondearADos.format(x2) + "\n";
            aux += "" + RedondearADos.format(x2) + "\n";
        }

        for (int i = 0; i < vec.length; i++) {
            Object[] fila = new Object[5];
            fila[0] = (i + 1);
            fila[1] = xi[i];
            fila[2] = parte[i];
            fila[3] = mod[i];
            fila[4] = div[i];
            datos.addRow(fila);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(rootPane, "No se ingresaron los datos", "Validando Datos", WIDTH);
    } 
}//GEN-LAST:event_jbtnGenerarActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        jtxtA.setText(null);
        jtxtM.setText(null);
        jtxtSemilla.setText(null);
        int numDatos = datos.getRowCount();
        for (int i = 0; i < numDatos; i++) {
            datos.removeRow(0);
        }
        a = 0;
        vec = new String[20];                                           // limpia el vector
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jtxtAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtAKeyTyped
        int k = (int) evt.getKeyChar();                                 // k = al valor de la tecla presionada

        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {                // Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);                   // Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Validando Datos",
                    JOptionPane.ERROR_MESSAGE);
        }

        if (k == 241 || k == 209) {                                     // Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);                   // Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Validando Datos",
                    JOptionPane.ERROR_MESSAGE);
        }

        if (k == 10) {                                                  // si se presiona enter
            jtxtA.transferFocus();                                      // transfiere el foco
        }
        //Limitar el numero de caracteres. Solo se pueden ingresar 5 caracteres
        /*if (txtId.getText().length() >= 5) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "Ha excedido el numero maximo de caracteres!!! (5)", "Validando Datos",
                JOptionPane.ERROR_MESSAGE);
        }*/

    }//GEN-LAST:event_jtxtAKeyTyped

    private void jtxtMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtMKeyTyped
        int k = (int) evt.getKeyChar();                                 // k = al valor de la tecla presionada

        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {                // Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);                   // Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Validando Datos",
                    JOptionPane.ERROR_MESSAGE);
        }

        if (k == 241 || k == 209) {                                     // Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);                   // Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Validando Datos",
                    JOptionPane.ERROR_MESSAGE);
        }

        if (k == 10) {                                                  // si se presiona enter
            jtxtM.transferFocus();                                      // transfiere el foco
        }
    }//GEN-LAST:event_jtxtMKeyTyped

    private void jtxtSemillaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtSemillaKeyTyped
        int k = (int) evt.getKeyChar();//k = al valor de la tecla presionada

        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {                // Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);                   // Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Validando Datos",
                    JOptionPane.ERROR_MESSAGE);
        }

        if (k == 241 || k == 209) {                                     // Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);                   // Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Validando Datos",
                    JOptionPane.ERROR_MESSAGE);
        }

        if (k == 10) {                                                  // si se presiona enter
            jtxtSemilla.transferFocus();                                //transfiere el foco
        }
    }//GEN-LAST:event_jtxtSemillaKeyTyped
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(PuntoB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PuntoB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PuntoB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PuntoB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Multiplicativo().setVisible(true);
            }
        });
    }
    /**
     * (
     *
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupMetodos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabla;
    private javax.swing.JButton jbtnGenerar;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JLabel jlblA;
    private javax.swing.JLabel jlblM;
    private javax.swing.JLabel jlblPuntoA;
    private javax.swing.JLabel jlblSemilla;
    private javax.swing.JTextField jtxtA;
    private javax.swing.JTextField jtxtM;
    private javax.swing.JTextField jtxtSemilla;
    // End of variables declaration//GEN-END:variables
}
