package PtoA;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;
import org.jfree.ui.RefineryUtilities;
import PantallaPrincipal.Menu;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import java.util.Random;
import org.jfree.ui.RefineryUtilities;

public class Mixto extends javax.swing.JDialog {

    String vec[], xi[], parte[], mod[], div[];
    int a, i;
    int tamañoFinal = 20;           
    double vecGra[]; // histograma
    DefaultTableModel datos;

    public Mixto() {
        initComponents();
        this.setLocationRelativeTo(null);
        a = 0;
        i = 0;
        this.setModal(true);
        lbl_infoN.setText("N = 20");
        this.hideMessage();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupMetodos = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jlblPuntoA = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jlblSemilla = new javax.swing.JLabel();
        txt_semilla = new javax.swing.JTextField();
        jtxtM = new javax.swing.JTextField();
        jlblM = new javax.swing.JLabel();
        jtxtC = new javax.swing.JTextField();
        jtxtA = new javax.swing.JTextField();
        jlblC = new javax.swing.JLabel();
        jlblA = new javax.swing.JLabel();
        jbtnGenerar = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jBtnSig = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jlblSemilla1 = new javax.swing.JLabel();
        jbtnLimpiar1 = new javax.swing.JButton();
        panel_info = new javax.swing.JPanel();
        lbl_info = new javax.swing.JLabel();
        lbl_infoN = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Metodos Congruenciales");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jlblPuntoA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlblPuntoA.setForeground(new java.awt.Color(0, 102, 153));
        jlblPuntoA.setText("Método Congruencial Mixto");

        jTabla.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "i", "Xi", "(a * Xi) + c", "Xi + 1", "ri"
            }
        ));
        jScrollPane2.setViewportView(jTabla);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Parámetros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N

        jlblSemilla.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlblSemilla.setText("Semilla =");

        txt_semilla.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_semilla.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_semillaFocusGained(evt);
            }
        });
        txt_semilla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_semillaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_semillaKeyTyped(evt);
            }
        });

        jtxtM.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jtxtM.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtMFocusGained(evt);
            }
        });
        jtxtM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtMKeyTyped(evt);
            }
        });

        jlblM.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlblM.setText("m =");

        jtxtC.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jtxtC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtCFocusGained(evt);
            }
        });
        jtxtC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCKeyTyped(evt);
            }
        });

        jtxtA.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jtxtA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtAFocusGained(evt);
            }
        });
        jtxtA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtAKeyTyped(evt);
            }
        });

        jlblC.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlblC.setText("c =");

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

        jBtnSig.setBackground(new java.awt.Color(242, 242, 242));
        jBtnSig.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jBtnSig.setText("Siguiente");
        jBtnSig.setEnabled(false);
        jBtnSig.setPreferredSize(new java.awt.Dimension(100, 35));
        jBtnSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSigActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlblSemilla)
                    .addComponent(jlblC)
                    .addComponent(jlblM)
                    .addComponent(jlblA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtxtC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(jtxtA, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_semilla, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtM))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jbtnGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnSig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblSemilla)
                            .addComponent(txt_semilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblC)
                            .addComponent(jtxtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblM)
                            .addComponent(jtxtM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbtnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnSig, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Intervalos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jlblSemilla1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlblSemilla1.setText("Cant.");

        jbtnLimpiar1.setBackground(new java.awt.Color(242, 242, 242));
        jbtnLimpiar1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jbtnLimpiar1.setText("Gráfico");
        jbtnLimpiar1.setEnabled(false);
        jbtnLimpiar1.setName("jbtnGrafico"); // NOI18N
        jbtnLimpiar1.setPreferredSize(new java.awt.Dimension(100, 35));
        jbtnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jlblSemilla1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblSemilla1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_info.setBackground(new java.awt.Color(255, 186, 186));

        lbl_info.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        lbl_info.setForeground(new java.awt.Color(206, 68, 68));
        lbl_info.setText("lbl_info");

        javax.swing.GroupLayout panel_infoLayout = new javax.swing.GroupLayout(panel_info);
        panel_info.setLayout(panel_infoLayout);
        panel_infoLayout.setHorizontalGroup(
            panel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_infoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_infoLayout.setVerticalGroup(
            panel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_infoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_info)
                .addContainerGap())
        );

        lbl_infoN.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbl_infoN.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_infoN.setText("lbl_info");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panel_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jButton1)
                                .addGap(39, 39, 39)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_infoN, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))))
                    .addComponent(jlblPuntoA))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblPuntoA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_infoN, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(11, 11, 11))
                            .addComponent(jButton2))))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jbtnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGenerarActionPerformed
    int n = 20;
    vec = new String[n];
    xi = new String[n];
    parte = new String[n];     // x0*a)+c
    mod = new String[n];       // xi+1
    div = new String[n];       // ri

    a = 0;
    try {
        // aca capturamos los datos que nos pasan por pantalla 
        double a = Double.valueOf(jtxtA.getText());
        double x0 = Double.valueOf(txt_semilla.getText());
        double m = Double.valueOf(jtxtM.getText());

        double x2;
        String aux = "";
        if (m > 9999) { // magnitud del modulo 
            m = 9999;
        }
        DecimalFormat truncado = new DecimalFormat("0.0000");       // obtener el formato hasta 4 decimales
        double c = Double.valueOf(jtxtC.getText());

        datos = new DefaultTableModel(new Object[]{"i", "Xi", "(Xi * a) + c", "Xi+1", "ri"}, 0);
        // Aca añadimos en un fila las columnas N , XI , XI*A , etc. Le damos esos nombres
        jTabla.setModel(datos);                                     // Aca le paso la columna armada
        for (int i = 0; i < vec.length; i++) {
            xi[i] = truncado.format(x0);                            // aca voy almacenando los valores en cada xi , en un principio en n1 la raiz , despues en n2 el xi+1 obtenido y asi.
            parte[i] = truncado.format((x0 * a) + c);               // aca voy a almacenar calculo (x0*a)+c
            mod[i] = truncado.format((x0 * a + c) % m);             // aca voy a almacenar xi+1
            div[i] = truncado.format(((x0 * a + c) % m) / (m - 1)); // aca voy a almacenar ri    

            x0 = ((a * x0) + c) % m;                // este paso es una vez ya pasado n1 cuando use la semilla , para n2 hago xi = xi+1
            x2 = x0;
            x2 = x2 / (m - 1);                      // -------------> Obtengo ri
            vec[i] = truncado.format(x2) + "\n";    // aca voy a almacenar ri
            aux += "" + truncado.format(x2) + "\n";
        }

        // jtxtAreaDatos.setText(aux);
        for (int i = 0; i < vec.length; i++) {      // esto lo hago para llenar los datos de xi , a*x +c , xi+1 , ri en cada fila
            Object[] fila = new Object[5];
            fila[0] = (i + 1);
            fila[1] = xi[i];
            fila[2] = parte[i];
            fila[3] = mod[i];
            fila[4] = div[i];
            datos.addRow(fila);                     // agrego la fila una vez completada
        }

    } catch (NumberFormatException e) {
        showMessage("No se ingresaron los datos");
    }
    jBtnSig.setEnabled(true);
    jbtnLimpiar1.setEnabled(true);
}//GEN-LAST:event_jbtnGenerarActionPerformed

    private void showMessage(String msj) {
        lbl_info.setText(msj);
        panel_info.setVisible(true);
    }

    private void hideMessage() {
        lbl_info.setText("");
        panel_info.setVisible(false);
    }

// aca hago null para que los campos queden vacios
    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        jtxtA.setText(null);
        jtxtC.setText(null);
        jtxtM.setText(null);
        txt_semilla.setText(null);
        int numDatos = datos.getRowCount();
        for (int i = 0; i < numDatos; i++) {
            datos.removeRow(0);
        }
        a = 0;
        vec = new String[20];
        
        // jtxtA.setText(null);
        // jtxtC.setText(null);
        //jtxtAreaDatos.setText(null);
        
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jbtnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiar1ActionPerformed
        
        this.setModal(false);
        double x2;
        vecGra = new double[20];
        try{

        double a = Double.valueOf(jtxtA.getText());
        double x0 = Double.valueOf(txt_semilla.getText());
        double m = Double.valueOf(jtxtM.getText());
        double c = Double.valueOf(jtxtC.getText());

        DecimalFormat truncado = new DecimalFormat("0.0000");
        for (int i = 0; i < 20; i++) {
            x0 = ((a * x0) + c) % m;
            x2 = x0;
            x2 = x2 / (m);

            vecGra[i] = x2; // ri
            System.out.println("ver VecGrafico que tiene:" + vecGra[i]);
        }

        int b = (int) Integer.parseInt(jTextField1.getText());

        Histograma histo = new Histograma("Histograma", vecGra, b);
        histo.pack();
        RefineryUtilities.centerFrameOnScreen(histo);
        histo.setVisible(true);
        }
         catch(NumberFormatException e){
        JOptionPane.showMessageDialog(rootPane, "No se ingresaron los datos", "Error Histograma", WIDTH);
    }
    catch(ClassCastException e){
        JOptionPane.showMessageDialog(rootPane, "No se ingresaron los datos", "Error Histograma", WIDTH);
    }
    }//GEN-LAST:event_jbtnLimpiar1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jBtnSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSigActionPerformed
        tamañoFinal++;
        vec = new String[tamañoFinal];
        xi = new String[tamañoFinal];
        parte = new String[tamañoFinal];    // x0*a)+c
        mod = new String[tamañoFinal];      // xi+1
        div = new String[tamañoFinal];      // ri
        a = 0;

        try {
            // aca capturamos los datos que nos pasan por pantalla 
            double a = Double.valueOf(jtxtA.getText());
            double x0 = Double.valueOf(txt_semilla.getText());
            double m = Double.valueOf(jtxtM.getText());
            double x2;
            String aux = "";
            if (m > 9999) {                 // magnitud del modulo 
                m = 9999;
            }
            DecimalFormat truncado = new DecimalFormat("0.0000");       // obtener el formato hasta 4 decimales

            double c = Double.valueOf(jtxtC.getText());

            datos = new DefaultTableModel(new Object[]{"i", "Xi", "(Xi * a) + c", "Xi + 1", "ri"}, 0);
            // Aca añadimos en un fila las columnas N , XI , XI*A , etc. Le damos esos nombres
            jTabla.setModel(datos); // Aca le paso la columna armada
            for (int i = 0; i < vec.length; i++) {
                xi[i] = truncado.format(x0);                            // aca voy almacenando los valores en cada xi , en un principio en n1 la raiz , despues en n2 el xi+1 obtenido y asi.
                parte[i] = truncado.format((x0 * a) + c);               // aca voy a almacenar calculo (x0*a)+c
                mod[i] = truncado.format((x0 * a + c) % m);             // aca voy a almacenar xi+1
                div[i] = truncado.format(((x0 * a + c) % m) / (m - 1)); // aca voy a almacenar ri    

                x0 = ((a * x0) + c) % m;                                // este paso es una vez ya pasado n1 cuando use la semilla , para n2 hago xi = xi+1
                x2 = x0;
                x2 = x2 / (m - 1);                                      // -------------> Obtengo ri
                vec[i] = truncado.format(x2) + "\n";                    // aca voy a almacenar ri
                aux += "" + truncado.format(x2) + "\n";
            }

            // jtxtAreaDatos.setText(aux);
            for (int i = 0; i < vec.length; i++) {                      // esto lo hago para llenar los datos de xi , a*x +c , xi+1 , ri en cada fila
                Object[] fila = new Object[5];
                fila[0] = (i + 1);
                fila[1] = xi[i];
                fila[2] = parte[i];
                fila[3] = mod[i];
                fila[4] = div[i];
                datos.addRow(fila);                                     // agrego la fila una vez completada

            }
            lbl_info.setForeground(Color.DARK_GRAY);
            panel_info.setBackground(Color.LIGHT_GRAY);
            showMessage("Se pasó al siguiente correctamente.");
            lbl_infoN.setText("N = " + tamañoFinal);
        } catch (NumberFormatException e) {
            showMessage("No se ingresaron los datos.");
        }

    }//GEN-LAST:event_jBtnSigActionPerformed

// Validacion de datos del texto A
    private void jtxtAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtAKeyTyped
        int k = (int) evt.getKeyChar();                     // k = al valor de la tecla presionada

        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {    // Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);       // Limpiar el caracter ingresado
            showMessage("No puede ingresar letras!!!");
        }

        if (k == 241 || k == 209) {                         // Si el caracter ingresado es una letra
            showMessage("No puede ingresar letras!!!");
        }

        if (k == 10) {  // si se presiona enter
            jtxtA.transferFocus();                          // transfiere el foco
        }
    }//GEN-LAST:event_jtxtAKeyTyped

// Validacion de datos del texto C
    private void jtxtCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCKeyTyped
        int k = (int) evt.getKeyChar();                     // k = al valor de la tecla presionada

        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {    // Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);       // Limpiar el caracter ingresado
            showMessage("No puede ingresar letras!!!");
        }

        if (k == 241 || k == 209) {                         // Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);       // Limpiar el caracter ingresado
            showMessage("No puede ingresar letras!!!");
        }

        if (k == 10) {                                      // si se presiona enter
            jtxtC.transferFocus();                          //transfiere el foco
        }
    }//GEN-LAST:event_jtxtCKeyTyped

    //Validacion de datos del texto M
    private void jtxtMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtMKeyTyped
        int k = (int) evt.getKeyChar();                     // k = al valor de la tecla presionada

        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {    // Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);       // Limpiar el caracter ingresado
            showMessage("No puede ingresar letras!!!");
        }

        if (k == 241 || k == 209) {                         // Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);       // Limpiar el caracter ingresado
            showMessage("No puede ingresar letras!!!");
        }

        if (k == 10) {                                      // si se presiona enter
            jtxtM.transferFocus();                          //transfiere el foco
        }
    }//GEN-LAST:event_jtxtMKeyTyped

    //Validacion de datos del raiz 
    private void txt_semillaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_semillaKeyTyped
        int k = (int) evt.getKeyChar();//k = al valor de la tecla presionada

        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {    // Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);       // Limpiar el caracter ingresado
            showMessage("No puede ingresar letras!!!");
        }

        if (k == 241 || k == 209) {                         // Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);       // Limpiar el caracter ingresado
            showMessage("No puede ingresar letras!!!");
        }

        if (k == 10) {                                      // si se presiona enter
            txt_semilla.transferFocus();                    //transfiere el foco
        }
    }//GEN-LAST:event_txt_semillaKeyTyped

    private void txt_semillaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_semillaFocusGained
        this.hideMessage();
    }//GEN-LAST:event_txt_semillaFocusGained

    private void txt_semillaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_semillaKeyPressed
        this.hideMessage();
    }//GEN-LAST:event_txt_semillaKeyPressed

    private void jtxtAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtAFocusGained
        this.hideMessage();
    }//GEN-LAST:event_jtxtAFocusGained

    private void jtxtCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtCFocusGained
        this.hideMessage();
    }//GEN-LAST:event_jtxtCFocusGained

    private void jtxtMFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtMFocusGained
        this.hideMessage();
    }//GEN-LAST:event_jtxtMFocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     this.dispose();
    Menu m = new Menu();
    m.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir del sistema?",
                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mixto().setVisible(true);
            }
        });
    }

    /**
     * (
     *
     * @param args the command line arguments
     */
    private void closeWindow() {
        this.dispose();
        Menu m = new Menu();
        m.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupMetodos;
    private javax.swing.JButton jBtnSig;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabla;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbtnGenerar;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JButton jbtnLimpiar1;
    private javax.swing.JLabel jlblA;
    private javax.swing.JLabel jlblC;
    private javax.swing.JLabel jlblM;
    private javax.swing.JLabel jlblPuntoA;
    private javax.swing.JLabel jlblSemilla;
    private javax.swing.JLabel jlblSemilla1;
    private javax.swing.JTextField jtxtA;
    private javax.swing.JTextField jtxtC;
    private javax.swing.JTextField jtxtM;
    private javax.swing.JLabel lbl_info;
    private javax.swing.JLabel lbl_infoN;
    private javax.swing.JPanel panel_info;
    private javax.swing.JTextField txt_semilla;
    // End of variables declaration//GEN-END:variables
}
