package ventanas;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static ventanas.Conexion_BD_Principal.con;

public class Ingresar_Proveedor extends javax.swing.JFrame {
    FondoPanel3 fondo = new FondoPanel3();

    public Ingresar_Proveedor() {
        this.setContentPane(fondo);
        initComponents();
        //Color JFrame
        this.getContentPane().setBackground(Color.lightGray);
        this.setLocationRelativeTo(null);

    }
    public void setInsertarProveedor(Connection con) {
        String nom, ape, emp, id,celu;
        String sql = "";
        nom = t_nom.getText();
        ape = t_ape.getText();
        emp = t_emp.getText();
        celu = t_celu.getText();
        id = t_categoria.getText();
        sql = ("INSERT INTO proveedor(nombre, apellido, nombre_empresa,celular,id_categoria) VALUES (?, ?, ?, ?,?)");
        try {
            PreparedStatement psd = con.prepareStatement(sql);
            psd.setString(1, nom);
            psd.setString(2, ape);
            psd.setString(3, emp);
            psd.setString(4, celu);
            psd.setString(5, id);
            int x = psd.executeUpdate();
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "PROVEEDOR INGRESADO!!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        Titulo_Ventana = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t_nom = new javax.swing.JTextField();
        t_ape = new javax.swing.JTextField();
        t_emp = new javax.swing.JTextField();
        t_categoria = new javax.swing.JTextField();
        jButton_IngresarProveedor = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        t_celu = new javax.swing.JTextField();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));

        Titulo_Ventana.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        Titulo_Ventana.setForeground(new java.awt.Color(0, 255, 0));
        Titulo_Ventana.setText("INGRESAR PROVEEDOR");

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("NOMBRE:");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("APELLIDO:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("EMPRESA:");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CELULAR:");

        t_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_nomActionPerformed(evt);
            }
        });

        t_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_categoriaActionPerformed(evt);
            }
        });

        jButton_IngresarProveedor.setText("INGRESAR PROVEEDOR");
        jButton_IngresarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IngresarProveedorActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("CATEGORIAS:");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("1.Labiales");

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("2.Perfumes");

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("3.Cremas Corporales");

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("4.Jabones Tocador");

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("5.Proctetores Solar");

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("6.Base Maquillaje");

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("7.Desodorantes");

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("8.Perfumes Hombres");

        regresar.setText("REGRESAR");
        regresar.setPreferredSize(new java.awt.Dimension(156, 32));
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("CATEGORIA:");

        t_celu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_celuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel14)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Titulo_Ventana, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_ape, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_celu, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 24, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_IngresarProveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Titulo_Ventana)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(t_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t_ape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(t_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t_celu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(t_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_IngresarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_nomActionPerformed

    private void t_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_categoriaActionPerformed

    private void jButton_IngresarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IngresarProveedorActionPerformed
        setInsertarProveedor(con);
        
    }//GEN-LAST:event_jButton_IngresarProveedorActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        Ventana_Principal vent = new Ventana_Principal();
        vent.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    private void t_celuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_celuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_celuActionPerformed

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
            java.util.logging.Logger.getLogger(Ingresar_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar_Proveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo_Ventana;
    private javax.swing.JButton jButton_IngresarProveedor;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField t_ape;
    private javax.swing.JTextField t_categoria;
    private javax.swing.JTextField t_celu;
    private javax.swing.JTextField t_emp;
    private javax.swing.JTextField t_nom;
    // End of variables declaration//GEN-END:variables
}
class FondoPanel3 extends JPanel{
    private Image imagen;
    
    @Override
    public void paint(Graphics g){
        imagen = new ImageIcon(getClass().getResource("/imagenes/fondo1.jpg")).getImage();
        g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }
}
