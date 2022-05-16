
package Vista;


import Controlador.Archivo_ListaHabitaciones;

import Modelo.Lista_Habitaciones;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmLista_Habitaciones extends javax.swing.JFrame {
String cab[] = {"N HABITACION", "PISO", "TIPO", "DESCRIPCION", "PRECIO", "ESTADO"};
DefaultTableModel df = new DefaultTableModel(null, cab);
ArrayList<Lista_Habitaciones> arrayhab = new ArrayList<>();
Archivo_ListaHabitaciones a_habitacion= new Archivo_ListaHabitaciones();
Lista_Habitaciones objHab;  
String nhabitacion,piso,tipo,descripcion,estado;
int precio;
   
    public frmLista_Habitaciones() {
        initComponents();
        jtabla.setModel(df);
        leerArchivo();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txthabitacion = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnElegir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txthabitacion.setBorder(javax.swing.BorderFactory.createTitledBorder("N° Habitacion :"));
        getContentPane().add(txthabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 50));

        txtprecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio :"));
        getContentPane().add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 160, 50));

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 170, 50));

        btnElegir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnElegir.setText("ELEGIR");
        btnElegir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btnElegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegirActionPerformed(evt);
            }
        });
        getContentPane().add(btnElegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 170, 50));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 158, 620, 280));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/outer-space-stars-turqoise-wallpaper-preview.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
         objHab=null;
        for(Lista_Habitaciones i:arrayhab){
            if(txthabitacion.getText().equalsIgnoreCase(i.getNhabitacion())){
                objHab= i;
                
            }
        if (objHab!=null) {
            
            txtprecio.setText(String.valueOf(objHab.getPrecio()));
            
   
        }
        else
            JOptionPane.showMessageDialog(null, "El codigo no se encuentra registrado");
        }
                                             

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnElegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegirActionPerformed
       frmAlquiler.txtnhabitacion.setText(txthabitacion.getText());
       frmAlquiler.txtprec.setText(txtprecio.getText());
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
            java.util.logging.Logger.getLogger(frmLista_Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLista_Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLista_Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLista_Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLista_Habitaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnElegir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtabla;
    private javax.swing.JTextField txthabitacion;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
 private void leerArchivo() {
        try {
            a_habitacion.leer();
            for(Lista_Habitaciones d:a_habitacion.lista){
                Object [] fila = {d.getNhabitacion(), d.getPiso(), d.getTipo(), d.getDescripcion(), d.getPrecio(), d.getEstado()};
            df.addRow(fila);
            
            arrayhab.add(d);
            }
            
        } catch (Exception e) {
        }
    }

}
