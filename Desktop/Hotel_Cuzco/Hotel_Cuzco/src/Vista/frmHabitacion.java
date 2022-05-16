
package Vista;


import Controlador.Archivo_Habitacion;
import Modelo.Cliente;
import Modelo.Habitacion;
import static Vista.frmAlquiler.txtnhabitacion;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmHabitacion extends javax.swing.JFrame {
String cab[] = {"N HABITACION", "PISO", "TIPO", "DESCRIPCION", "PRECIO", "ESTADO"};
DefaultTableModel df = new DefaultTableModel(null, cab);
ArrayList<Habitacion> arrayhab = new ArrayList<>();
Archivo_Habitacion a_habitacion= new Archivo_Habitacion();
Habitacion objHab;  
String nhabitacion,piso,tipo,descripcion,estado;
int precio;
    public frmHabitacion() {
        initComponents();
        jtabla.setModel(df);
        leerArchivo();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txthabitacion = new javax.swing.JTextField();
        cmbPiso = new javax.swing.JComboBox<>();
        cmbTipo = new javax.swing.JComboBox<>();
        txtprecio = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        cmbEstado = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabla = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txthabitacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "N Habitacion :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        getContentPane().add(txthabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 50));

        cmbPiso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        cmbPiso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Piso :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        getContentPane().add(cmbPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 170, 50));

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individual", "Doble", "Matrimonial" }));
        cmbTipo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        getContentPane().add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 170, 50));

        txtprecio.setBorder(javax.swing.BorderFactory.createTitledBorder("PRECIO:"));
        txtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioActionPerformed(evt);
            }
        });
        getContentPane().add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 160, 50));

        txtdescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder("DESCRIPCION :"));
        getContentPane().add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 160, 50));

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DISPONIBLE", "OCUPADO", "MANTENIMIENTO" }));
        cmbEstado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        getContentPane().add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 160, 50));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 600, 244));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 110, 40));

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 110, 40));

        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 110, 40));

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fondo-pantalla-bicicleta-selva-amarilla-escritorio-desktop-1920-1080.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        capturar();
        arrayhab.add(new Habitacion(nhabitacion,piso,tipo,descripcion,precio,estado));
        try {
            a_habitacion.insertar(new  Habitacion(nhabitacion,piso,tipo,descripcion,precio,estado));
        } catch (IOException ex) {
            Logger.getLogger(frmCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        mostrar();
        limpiar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
         objHab=null;
        for(Habitacion i:arrayhab){
            if(txthabitacion.getText().equalsIgnoreCase(i.getNhabitacion())){
                objHab= i;
                
            }
        if (objHab!=null) {
            cmbPiso.setSelectedItem(objHab.getPiso());
            cmbTipo.setSelectedItem(objHab.getTipo());
            txtdescripcion.setText(objHab.getDescripcion());
            txtprecio.setText(String.valueOf(objHab.getPrecio()));
            cmbEstado.setSelectedItem(objHab.getTipo());
   
        }
        else
            JOptionPane.showMessageDialog(null, "El codigo no se encuentra registrado");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(objHab!=null){
            capturar();
            objHab.setNhabitacion(nhabitacion);
            objHab.setPiso(piso);
            objHab.setTipo(tipo);
            objHab.setDescripcion(descripcion);
            objHab.setPrecio(precio);
            objHab.setEstado(estado);
            
            
            
            mostrar();
            try {
                a_habitacion.mantenimiento(a_habitacion.lista);
            } catch (Exception e) {
            }
            
        }
        else
            JOptionPane.showMessageDialog(null,"No se puede actualizar ya que el codigo no existe");
                                         
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(objHab!=null){
        arrayhab.remove(objHab);
        a_habitacion.lista.remove(objHab); 
        mostrar();
        
        try {
            a_habitacion.mantenimiento(a_habitacion.lista);
        } catch (Exception e) {
        } 
        }else{
            JOptionPane.showMessageDialog(null,"El código a eliminar no existe");}
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(frmHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHabitacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbPiso;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtabla;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txthabitacion;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
public void capturar(){
    nhabitacion=txthabitacion.getText();
    piso=cmbPiso.getSelectedItem().toString();
    tipo=cmbTipo.getSelectedItem().toString();
    descripcion=txtdescripcion.getText();
    precio=Integer.parseInt(txtprecio.getText());
    estado=cmbEstado.getSelectedItem().toString();
}
void limpiar(){
    txthabitacion.setText(null);
    txtdescripcion.setText(null);
    txtprecio.setText(null);
    cmbEstado.setSelectedItem(cmbEstado);
}
public void mostrar(){
    df.setRowCount(0);
        for (Habitacion d : arrayhab) {

            Object[] fila = {d.getNhabitacion(), d.getPiso(), d.getTipo(), d.getDescripcion(), d.getPrecio(), d.getEstado()};
            df.addRow(fila);

        }
}
 private void leerArchivo() {
        try {
            a_habitacion.leer();
            for(Habitacion d:a_habitacion.lista){
                Object [] fila = {d.getNhabitacion(), d.getPiso(), d.getTipo(), d.getDescripcion(), d.getPrecio(), d.getEstado()};
            df.addRow(fila);
            
            arrayhab.add(d);
            }
            
        } catch (Exception e) {
        }
    }
}
