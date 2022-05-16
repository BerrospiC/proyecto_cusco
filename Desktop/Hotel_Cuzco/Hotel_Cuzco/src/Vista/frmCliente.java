
package Vista;

import Controlador.Archivo_Cliente;
import Modelo.Cliente;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmCliente extends javax.swing.JFrame {
String cab[] = {"CODIGO", "NOMBRES", "A.PATERNO", "A.MATERNO", "T.DOCUMENTO", "DOCUMENTO","DIRECCION","TELEFONO","EMAIL"};
DefaultTableModel df = new DefaultTableModel(null, cab);
ArrayList<Cliente> arrayclie = new ArrayList<>();
Archivo_Cliente a_cliente= new Archivo_Cliente();
Cliente objClie;


String idcliente,nombre,apaterno,amaterno,t_documento,documento,direccion,telefono,email;

    public frmCliente() {
        initComponents();
        jtabla.setModel(df);
        leerArchivo();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtdocumento = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtamaterno = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapaterno = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabla = new javax.swing.JTable();
        cmbTDocumento = new javax.swing.JComboBox<>();
        txtcodigo = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        ELIMINAR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtdocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("DOCUMENTO :"));
        getContentPane().add(txtdocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 200, 50));

        txtdireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("DIRECCION :"));
        getContentPane().add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 210, 50));

        txtamaterno.setBorder(javax.swing.BorderFactory.createTitledBorder("A. MATERNO :"));
        getContentPane().add(txtamaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 200, 50));

        txtnombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE :"));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, 50));

        txtapaterno.setBorder(javax.swing.BorderFactory.createTitledBorder("A PATERNO :"));
        getContentPane().add(txtapaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 200, 50));

        txtemail.setBorder(javax.swing.BorderFactory.createTitledBorder("EMAIL :"));
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 210, 50));

        txttelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("TELEFONO :"));
        getContentPane().add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 210, 50));

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
        jtabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 570, 340));

        cmbTDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "PASAPORTE" }));
        getContentPane().add(cmbTDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 200, 40));

        txtcodigo.setBorder(javax.swing.BorderFactory.createTitledBorder("ID CLIENTE"));
        getContentPane().add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 50));

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 100, 39));

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 100, 39));

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 90, 39));

        ELIMINAR.setText("ELIMINAR");
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });
        getContentPane().add(ELIMINAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 90, 39));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fondo de pantalla de paraiso de agua 13.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        capturar();
        arrayclie.add(new Cliente(idcliente,nombre,apaterno,amaterno,t_documento,documento,direccion,telefono,email));
        try {
            a_cliente.insertar(new  Cliente(idcliente,nombre,apaterno,amaterno,t_documento,documento,direccion,telefono,email));
        } catch (IOException ex) {
            Logger.getLogger(frmCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        mostrar();
        limpiar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        objClie=null;
        for(Cliente i:arrayclie){
            if(txtcodigo.getText().equalsIgnoreCase(i.getIdcliente())){
                objClie= i;
                
            }
        if (objClie!=null) {
            txtnombre.setText(objClie.getNombre());
            txtapaterno.setText(objClie.getApaterno());
            txtamaterno.setText(objClie.getAmaterno());
            cmbTDocumento.setSelectedItem(objClie.getT_documento());
            txtdocumento.setText(objClie.getDocumento());
            txtdireccion.setText(objClie.getDireccion());
            txttelefono.setText(objClie.getTelefono());
            txtemail.setText(objClie.getEmail());
            
            
            
        }
        else
            JOptionPane.showMessageDialog(null, "El codigo no se encuentra registrado");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jtablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablaMouseClicked
         int selec=jtabla.getSelectedRow();
        String cp=jtabla.getValueAt(selec,0).toString();
        for (Cliente d : arrayclie) {

            if(cp.equalsIgnoreCase(d.getDocumento())){
                objClie=d;
            }

        }
        txtcodigo.setText(objClie.getIdcliente());
        txtnombre.setText(objClie.getNombre());
        txtapaterno.setText(objClie.getApaterno());
        txtamaterno.setText(objClie.getAmaterno());
        cmbTDocumento.setSelectedItem(objClie.getT_documento());
        txtdocumento.setText(objClie.getDocumento());
        txtdireccion.setText(objClie.getDireccion());
        txttelefono.setText(objClie.getTelefono());
        txtemail.setText(objClie.getEmail());
        
       
    }//GEN-LAST:event_jtablaMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
         if(objClie!=null){
            capturar();
            objClie.setIdcliente(idcliente);
            objClie.setNombre(nombre);
            objClie.setApaterno(apaterno);
            objClie.setAmaterno(amaterno);
            objClie.setT_documento(t_documento);
            objClie.setDocumento(documento);
            objClie.setDireccion(direccion);
            objClie.setTelefono(telefono);
            objClie.setEmail(email);
            
            
            mostrar();
            try {
                a_cliente.mantenimiento(a_cliente.lista);
            } catch (Exception e) {
            }
            
        }
        else
            JOptionPane.showMessageDialog(null,"No se puede actualizar ya que el codigo no existe");
                                              

    }//GEN-LAST:event_btnModificarActionPerformed

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
       if(objClie!=null){
        arrayclie.remove(objClie);
        a_cliente.lista.remove(objClie); 
        mostrar();
        
        try {
            a_cliente.mantenimiento(a_cliente.lista);
        } catch (Exception e) {
        } 
        }else{
            JOptionPane.showMessageDialog(null,"El código a eliminar no existe");}
    }//GEN-LAST:event_ELIMINARActionPerformed

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
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ELIMINAR;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cmbTDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtabla;
    private javax.swing.JTextField txtamaterno;
    private javax.swing.JTextField txtapaterno;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdocumento;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
public void capturar(){
    idcliente=txtcodigo.getText();
    nombre=txtnombre.getText();
    apaterno=txtapaterno.getText();
    amaterno=txtamaterno.getText();
    t_documento=cmbTDocumento.getSelectedItem().toString();
    documento=txtdocumento.getText();
    direccion=txtdireccion.getText();
    telefono=txttelefono.getText();
    email=txtemail.getText(); 
}
void limpiar(){
    txtcodigo.setText(null);
    txtnombre.setText(null);
    txtapaterno.setText(null);
    txtamaterno.setText(null);
    txtdocumento.setText(null);
    txtdireccion.setText(null);
    txttelefono.setText(null);
    txtemail.setText(null);
}
public void mostrar(){
    df.setRowCount(0);
        for (Cliente d : arrayclie) {

            Object[] fila = {d.getIdcliente(), d.getNombre(), d.getApaterno(), d.getAmaterno(), d.getT_documento(), d.getDocumento(), d.getDireccion(), 
                d.getTelefono(),d.getEmail()};
            df.addRow(fila);

        }
}
 private void leerArchivo() {
        try {
            a_cliente.leer();
            for(Cliente d:a_cliente.lista){
                Object [] fila = {d.getIdcliente(), d.getNombre(), d.getApaterno(), d.getAmaterno(), d.getT_documento(), d.getDocumento(), d.getDireccion(), 
                d.getTelefono(),d.getEmail()};
            df.addRow(fila);
            
            arrayclie.add(d);
            }
            
        } catch (Exception e) {
        }
    }

        
    

}
