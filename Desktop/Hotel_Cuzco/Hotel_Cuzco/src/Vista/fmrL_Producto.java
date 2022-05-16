
package Vista;

import Controlador.Archivo_LProductos;

import Modelo.Lista_Productos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class fmrL_Producto extends javax.swing.JFrame {
String cab[] = {"ID PRODUCTO", "DESCRIPCION","STOCK", "PRECIO"};
DefaultTableModel df = new DefaultTableModel(null, cab);
ArrayList<Lista_Productos> arrayprod = new ArrayList<>();
Archivo_LProductos a_producto = new Archivo_LProductos();
Lista_Productos objProd;
   
    public fmrL_Producto() {
        initComponents();
        jtabla.setModel(df);
        leerArchivo();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtproducto = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnElegir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtproducto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Producto :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        getContentPane().add(txtproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 50));

        txtprecio.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        txtprecio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Precio :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        getContentPane().add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 150, 50));

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 128, 40));

        btnElegir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnElegir.setText("ELEGIR");
        btnElegir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btnElegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegirActionPerformed(evt);
            }
        });
        getContentPane().add(btnElegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 276, 40));

        jtabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 178, 670, 350));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fondo de pantalla de paraiso de agua 12.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
           objProd=null;
        for(Lista_Productos i:arrayprod){
            if(txtproducto.getText().equalsIgnoreCase(i.getIdproducto())){
                objProd= i;
                
            }
        if (objProd!=null) {  
            txtprecio.setText(String.valueOf(objProd.getPrecio()));
            
            
            
            
        }
        else
            JOptionPane.showMessageDialog(null, "El codigo no se encuentra registrado");
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnElegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegirActionPerformed
        frmAlquiler.txtprod.setText(txtproducto.getText());
        frmAlquiler.txtprec2.setText(txtprecio.getText());
        dispose();
    }//GEN-LAST:event_btnElegirActionPerformed

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
            java.util.logging.Logger.getLogger(fmrL_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fmrL_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fmrL_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fmrL_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fmrL_Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnElegir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtabla;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtproducto;
    // End of variables declaration//GEN-END:variables
private void leerArchivo() {
        try {
            a_producto.leer();
            for(Lista_Productos d:a_producto.lista){
                Object [] fila = {d.getIdproducto(), d.getDescripcion(), d.getCantidad(), d.getPrecio() };
            df.addRow(fila);
            
            arrayprod.add(d);
            }
            
        } catch (Exception e) {
        }
    }
}
