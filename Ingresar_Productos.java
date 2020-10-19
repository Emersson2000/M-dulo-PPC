package ventanas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static ventanas.Conexion_BD_Principal.con;

public class Ingresar_Productos extends javax.swing.JFrame {

    FondoPanel2 fondo = new FondoPanel2();

    public Ingresar_Productos() {
        this.setContentPane(fondo);
        initComponents();
        //Color JFrame
        this.getContentPane().setBackground(Color.lightGray);
        this.setLocationRelativeTo(null);

    }

    public void setInsertarProducto(Connection con) {

        String nom, pre, cant, id;
        String sql = "";
        nom = t_nom.getText();
        pre = t_precio.getText();
        cant = t_cantidad.getText();
        id = t_categoria.getText();
        sql = ("INSERT INTO producto(nombre, precio, cantidad, idCategoria) VALUES (?, ?, ?, ?)");
        try {
            PreparedStatement psd = con.prepareStatement(sql);
            psd.setString(1, nom);
            psd.setString(2, pre);
            psd.setString(3, cant);
            psd.setString(4, id);
            int n = psd.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "PRODUCTO INGRESADO!!");
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
        t_precio = new javax.swing.JTextField();
        t_cantidad = new javax.swing.JTextField();
        t_categoria = new javax.swing.JTextField();
        jButton_IngresarProducto = new javax.swing.JButton();
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

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));

        Titulo_Ventana.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        Titulo_Ventana.setForeground(new java.awt.Color(0, 255, 0));
        Titulo_Ventana.setText("INGRESAR PRODUCTO");

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Precio:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cantidad:");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Categoria:");

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

        jButton_IngresarProducto.setText("INGRESAR PRODUCTO");
        jButton_IngresarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IngresarProductoActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Titulo_Ventana, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 33, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
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
                            .addComponent(jLabel13))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_IngresarProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                    .addComponent(t_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(t_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                    .addComponent(jButton_IngresarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_nomActionPerformed

    private void t_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_categoriaActionPerformed

    private void jButton_IngresarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IngresarProductoActionPerformed
        setInsertarProducto(con);
    }//GEN-LAST:event_jButton_IngresarProductoActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        Ventana_Principal vent = new Ventana_Principal();
        vent.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

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
            java.util.logging.Logger.getLogger(Ingresar_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar_Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo_Ventana;
    private javax.swing.JButton jButton_IngresarProducto;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTextField t_cantidad;
    private javax.swing.JTextField t_categoria;
    private javax.swing.JTextField t_nom;
    private javax.swing.JTextField t_precio;
    // End of variables declaration//GEN-END:variables
}

class FondoPanel2 extends JPanel {

    private Image imagen;

    @Override
    public void paint(Graphics g) {
        imagen = new ImageIcon(getClass().getResource("/imagenes/fondo1.jpg")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
}
