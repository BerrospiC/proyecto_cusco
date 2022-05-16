/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Archivo_LClientes;
import Modelo.Cliente;
import Modelo.Lista_Clientes;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmL_Cliente extends javax.swing.JFrame {
String cab[] = {"CODIGO", "NOMBRES", "A.PATERNO", "A.MATERNO", "T.DOCUMENTO", "DOCUMENTO","DIRECCION","TELEFONO","EMAIL"};
DefaultTableModel df = new DefaultTableModel(null, cab);
ArrayList<Lista_Clientes> arrayclie = new ArrayList<>();
Archivo_LClientes a_cliente= new Archivo_LClientes();
Lista_Clientes objClie;
    
    public frmL_Cliente() {
        initComponents();
        jtabla1.setModel(df);
        leerArchivo();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtabla = new javax.swing.JTable();
        btnBuscar1 = new javax.swing.JButton();
        txtapaterno = new javax.swing.JTextField();
        btnElegir1 = new javax.swing.JButton();
        txtnombre = new javax.swing.JTextField();
        txtamaterno = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();
        txtdocumento = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtabla1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscar1.setText("BUSCAR");
        btnBuscar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 170, 40));

        txtapaterno.setBorder(javax.swing.BorderFactory.createTitledBorder("A. Paterno"));
        getContentPane().add(txtapaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 160, 50));

        btnElegir1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnElegir1.setText("ELEGIR");
        btnElegir1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btnElegir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegir1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnElegir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 170, 40));

        txtnombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre:"));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 160, 50));

        txtamaterno.setBorder(javax.swing.BorderFactory.createTitledBorder("A. Materno"));
        getContentPane().add(txtamaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 160, 50));

        txtcodigo.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo :"));
        getContentPane().add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 50));

        txtdocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Documento :"));
        getContentPane().add(txtdocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 160, 50));

        jtabla1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtabla1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 580, 330));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fondo-arco-iris-abstracto-chispas-fondo-resplandores_109064-263.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        objClie=null;
        for(Lista_Clientes i:arrayclie){
            if(txtcodigo.getText().equalsIgnoreCase(i.getIdcliente())){
                objClie= i;
                
            }
        if (objClie!=null) {
            txtnombre.setText(objClie.getNombre());
            txtapaterno.setText(objClie.getApaterno());
            txtamaterno.setText(objClie.getAmaterno());
            txtdocumento.setText(objClie.getDocumento());
            
            
            
            
        }
        else
            JOptionPane.showMessageDialog(null, "El codigo no se encuentra registrado");
        }

    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void btnElegir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegir1ActionPerformed
        frmAlquiler.txtclie.setText(txtnombre.getText());
        frmAlquiler.txtpat.setText(txtapaterno.getText());
        frmAlquiler.txtmat.setText(txtamaterno.getText());
        frmAlquiler.txtdoc.setText(txtdocumento.getText());
        dispose();
    }//GEN-LAST:event_btnElegir1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmL_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmL_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmL_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmL_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmL_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnElegir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtabla;
    private javax.swing.JTable jtabla1;
    private javax.swing.JTextField txtamaterno;
    private javax.swing.JTextField txtapaterno;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdocumento;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
private void leerArchivo() {
        try {
            a_cliente.leer();
            for(Lista_Clientes d:a_cliente.lista){
                Object [] fila = {d.getIdcliente(), d.getNombre(), d.getApaterno(), d.getAmaterno(), d.getT_documento(), d.getDocumento(), d.getDireccion(), 
                d.getTelefono(),d.getEmail()};
            df.addRow(fila);
            
            arrayclie.add(d);
            }
            
        } catch (Exception e) {
        }
    }
}
