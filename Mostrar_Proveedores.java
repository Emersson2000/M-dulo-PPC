
package ventanas;

import com.sun.istack.internal.logging.Logger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static ventanas.Conexion_BD_Principal.con;

public class Mostrar_Proveedores extends javax.swing.JFrame {
    DefaultTableModel model;

    public Mostrar_Proveedores() {
        
        initComponents();
        mostrarProveedores("");
        this.setLocationRelativeTo(null);
    }
    void mostrarProveedores(String valor) {
        String [] titulos = {"nombre","apellido","nombre_empresa","celular","id_categoria"};
        String [] re = new String [5]; 
        String sql = "SELECT *FROM proveedor where CONCAT(nombre,' ',nombre_empresa,' ',apellido) LIKE '%"+valor+"%'";
        model = new DefaultTableModel(null,titulos);
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
                re[0] = rs.getString("nombre");
                re[1] = rs.getString("apellido");
                re[2] = rs.getString("nombre_empresa");
                re[3] = rs.getString("celular");
                re[4] = rs.getString("id_categoria");
                model.addRow(re);
                T_tablaProductos.setModel(model);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        T_tablaProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        t_buscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        T_tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(T_tablaProductos);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("LISTA DE PROVEEDORES");

        Regresar.setText("REGRESAR");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("BUSCAR:");

        t_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t_buscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t_buscar))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Regresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        Ventana_Principal vent = new Ventana_Principal();
        vent.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegresarActionPerformed

    private void t_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_buscarKeyReleased
        mostrarProveedores(t_buscar.getText());
    }//GEN-LAST:event_t_buscarKeyReleased

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
            java.util.logging.Logger.getLogger(Mostrar_Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mostrar_Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mostrar_Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mostrar_Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mostrar_Proveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Regresar;
    private javax.swing.JTable T_tablaProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t_buscar;
    // End of variables declaration//GEN-END:variables
}
