
package ventanas;
import static ventanas.Conexion_BD_Principal.con;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Ventana_Principal extends javax.swing.JFrame {
    
    
    
    FondoPanel fondo = new FondoPanel();
    public Ventana_Principal() {
        this.setContentPane(fondo);
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ingresar_productos = new javax.swing.JButton();
        ingresar_categoria = new javax.swing.JButton();
        ingresar_proveedor = new javax.swing.JButton();
        consulta_proveedores = new javax.swing.JButton();
        consulta_categorias = new javax.swing.JButton();
        consulta_productos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("BIENVENIDOS");

        ingresar_productos.setText("INGRESAR PRODUCTOS");
        ingresar_productos.setPreferredSize(new java.awt.Dimension(180, 32));
        ingresar_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresar_productosActionPerformed(evt);
            }
        });

        ingresar_categoria.setText("INGRESAR CATEGORIA");
        ingresar_categoria.setPreferredSize(new java.awt.Dimension(180, 32));
        ingresar_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresar_categoriaActionPerformed(evt);
            }
        });

        ingresar_proveedor.setText("INGRESAR PROVEEDOR");
        ingresar_proveedor.setPreferredSize(new java.awt.Dimension(180, 32));
        ingresar_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresar_proveedorActionPerformed(evt);
            }
        });

        consulta_proveedores.setText("CONSULTA DE PROVEEDORES");
        consulta_proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulta_proveedoresActionPerformed(evt);
            }
        });

        consulta_categorias.setText("CONSULTA DE CATEGORIAS");
        consulta_categorias.setPreferredSize(new java.awt.Dimension(201, 32));
        consulta_categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulta_categoriasActionPerformed(evt);
            }
        });

        consulta_productos.setText("CONSULTA DE PRODUCTOS");
        consulta_productos.setPreferredSize(new java.awt.Dimension(201, 32));
        consulta_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulta_productosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("JACKISS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ingresar_productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ingresar_categoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ingresar_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(consulta_proveedores)
                    .addComponent(consulta_productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consulta_categorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(consulta_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(consulta_categorias, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(consulta_proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ingresar_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ingresar_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(ingresar_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresar_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresar_proveedorActionPerformed
        Ingresar_Proveedor vent = new Ingresar_Proveedor();
        vent.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ingresar_proveedorActionPerformed

    private void ingresar_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresar_productosActionPerformed
        Ingresar_Productos pr1 = new Ingresar_Productos();
        pr1.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_ingresar_productosActionPerformed

    private void ingresar_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresar_categoriaActionPerformed
        Ingresar_Categoria cat = new Ingresar_Categoria();
        cat.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ingresar_categoriaActionPerformed

    private void consulta_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta_productosActionPerformed
        Mostrar_Productos mo = new Mostrar_Productos();
        mo.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_consulta_productosActionPerformed

    private void consulta_proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta_proveedoresActionPerformed
        Mostrar_Proveedores mo = new Mostrar_Proveedores();
        mo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_consulta_proveedoresActionPerformed

    private void consulta_categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta_categoriasActionPerformed
        Mostrar_Categorias mo = new Mostrar_Categorias();
        mo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_consulta_categoriasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Conexion_BD_Principal llamar = new Conexion_BD_Principal();
        llamar.conectar();
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
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consulta_categorias;
    private javax.swing.JButton consulta_productos;
    private javax.swing.JButton consulta_proveedores;
    private javax.swing.JButton ingresar_categoria;
    private javax.swing.JButton ingresar_productos;
    private javax.swing.JButton ingresar_proveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
class FondoPanel extends JPanel{
    private Image imagen;
    
    @Override
    public void paint(Graphics g){
        imagen = new ImageIcon(getClass().getResource("/imagenes/fondo1.jpg")).getImage();
        g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }
}
