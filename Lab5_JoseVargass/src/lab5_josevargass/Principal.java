/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_josevargass;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author josevargas
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_ag_esc = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_nombre_esc = new javax.swing.JTextField();
        tf_lugarbase = new javax.swing.JTextField();
        cb_tipo_esc = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jd_ver_esc = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_escuadrones = new javax.swing.JList<>();
        jd_ag_super = new javax.swing.JDialog();
        jd_ver_super = new javax.swing.JDialog();
        jd_ag_villa = new javax.swing.JDialog();
        jd_ver_villa = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        escuad = new javax.swing.JMenu();
        agregar_esc = new javax.swing.JMenuItem();
        ver_esc = new javax.swing.JMenuItem();
        supers = new javax.swing.JMenu();
        agregar_super = new javax.swing.JMenuItem();
        ver_super = new javax.swing.JMenuItem();
        villanos = new javax.swing.JMenu();
        agregar_villa = new javax.swing.JMenuItem();
        ver_villa = new javax.swing.JMenuItem();
        simulacion = new javax.swing.JMenu();
        empezar_simu = new javax.swing.JMenuItem();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Agregar Escuadrón");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Lugar de Base:");

        jLabel5.setText("Tipo:");

        cb_tipo_esc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Superhéroes", "Villanos" }));

        jButton1.setText("Agregar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nombre_esc, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_lugarbase, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_tipo_esc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_nombre_esc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_lugarbase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cb_tipo_esc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_ag_escLayout = new javax.swing.GroupLayout(jd_ag_esc.getContentPane());
        jd_ag_esc.getContentPane().setLayout(jd_ag_escLayout);
        jd_ag_escLayout.setHorizontalGroup(
            jd_ag_escLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_ag_escLayout.setVerticalGroup(
            jd_ag_escLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel6.setText("Escuadrones");

        jl_escuadrones.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jl_escuadrones);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_ver_escLayout = new javax.swing.GroupLayout(jd_ver_esc.getContentPane());
        jd_ver_esc.getContentPane().setLayout(jd_ver_escLayout);
        jd_ver_escLayout.setHorizontalGroup(
            jd_ver_escLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_ver_escLayout.setVerticalGroup(
            jd_ver_escLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_ag_superLayout = new javax.swing.GroupLayout(jd_ag_super.getContentPane());
        jd_ag_super.getContentPane().setLayout(jd_ag_superLayout);
        jd_ag_superLayout.setHorizontalGroup(
            jd_ag_superLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_ag_superLayout.setVerticalGroup(
            jd_ag_superLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_ver_superLayout = new javax.swing.GroupLayout(jd_ver_super.getContentPane());
        jd_ver_super.getContentPane().setLayout(jd_ver_superLayout);
        jd_ver_superLayout.setHorizontalGroup(
            jd_ver_superLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_ver_superLayout.setVerticalGroup(
            jd_ver_superLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_ag_villaLayout = new javax.swing.GroupLayout(jd_ag_villa.getContentPane());
        jd_ag_villa.getContentPane().setLayout(jd_ag_villaLayout);
        jd_ag_villaLayout.setHorizontalGroup(
            jd_ag_villaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_ag_villaLayout.setVerticalGroup(
            jd_ag_villaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_ver_villaLayout = new javax.swing.GroupLayout(jd_ver_villa.getContentPane());
        jd_ver_villa.getContentPane().setLayout(jd_ver_villaLayout);
        jd_ver_villaLayout.setHorizontalGroup(
            jd_ver_villaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_ver_villaLayout.setVerticalGroup(
            jd_ver_villaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 51, 0));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Avengers Simulator");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(211, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(196, 196, 196))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel2)
                .addContainerGap(343, Short.MAX_VALUE))
        );

        escuad.setText("Escuadrones");

        agregar_esc.setText("Agregar Escuadrón");
        agregar_esc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_escActionPerformed(evt);
            }
        });
        escuad.add(agregar_esc);

        ver_esc.setText("Ver Escuadrones");
        ver_esc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_escActionPerformed(evt);
            }
        });
        escuad.add(ver_esc);

        jMenuBar1.add(escuad);

        supers.setText("Superhéroes");

        agregar_super.setText("Agregar Superhéroes");
        agregar_super.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_superActionPerformed(evt);
            }
        });
        supers.add(agregar_super);

        ver_super.setText("Ver Superhéroes");
        ver_super.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_superActionPerformed(evt);
            }
        });
        supers.add(ver_super);

        jMenuBar1.add(supers);

        villanos.setText("Villanos");

        agregar_villa.setText("Agregar Villanos");
        agregar_villa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_villaActionPerformed(evt);
            }
        });
        villanos.add(agregar_villa);

        ver_villa.setText("Ver Villanos");
        villanos.add(ver_villa);

        jMenuBar1.add(villanos);

        simulacion.setText("Simulación");

        empezar_simu.setText("Empezar Simulación");
        empezar_simu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empezar_simuActionPerformed(evt);
            }
        });
        simulacion.add(empezar_simu);

        jMenuBar1.add(simulacion);

        setJMenuBar(jMenuBar1);

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

    private void agregar_escActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_escActionPerformed
        jd_ag_esc.setVisible(true);
        jd_ag_esc.setLocationRelativeTo(this);
    }//GEN-LAST:event_agregar_escActionPerformed

    private void agregar_superActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_superActionPerformed
        jd_ag_super.setVisible(true);
        jd_ag_super.setLocationRelativeTo(this);
    }//GEN-LAST:event_agregar_superActionPerformed

    private void ver_superActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_superActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ver_superActionPerformed

    private void agregar_villaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_villaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregar_villaActionPerformed

    private void ver_escActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_escActionPerformed
        jd_ver_esc.setVisible(true);
    }//GEN-LAST:event_ver_escActionPerformed

    private void empezar_simuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empezar_simuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empezar_simuActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        DefaultListModel modelo
                = (DefaultListModel) jl_escuadrones.getModel();

        modelo.addElement(new Escuadron(tf_nombre_esc.getText(),
                tf_lugarbase.getText(),
                (String) cb_tipo_esc.getSelectedItem()));
        JOptionPane.showMessageDialog(this, "Se agregó el escuadrón con éxito!");
        jd_ag_esc.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

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
    private javax.swing.JMenuItem agregar_esc;
    private javax.swing.JMenuItem agregar_super;
    private javax.swing.JMenuItem agregar_villa;
    private javax.swing.JComboBox<String> cb_tipo_esc;
    private javax.swing.JMenuItem empezar_simu;
    private javax.swing.JMenu escuad;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDialog jd_ag_esc;
    private javax.swing.JDialog jd_ag_super;
    private javax.swing.JDialog jd_ag_villa;
    private javax.swing.JDialog jd_ver_esc;
    private javax.swing.JDialog jd_ver_super;
    private javax.swing.JDialog jd_ver_villa;
    private javax.swing.JList<String> jl_escuadrones;
    private javax.swing.JMenu simulacion;
    private javax.swing.JMenu supers;
    private javax.swing.JTextField tf_lugarbase;
    private javax.swing.JTextField tf_nombre_esc;
    private javax.swing.JMenuItem ver_esc;
    private javax.swing.JMenuItem ver_super;
    private javax.swing.JMenuItem ver_villa;
    private javax.swing.JMenu villanos;
    // End of variables declaration//GEN-END:variables
}