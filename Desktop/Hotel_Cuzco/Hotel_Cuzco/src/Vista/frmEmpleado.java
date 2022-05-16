
package Vista;

import Controlador.Archivo_Empleado;
import Modelo.Cliente;
import Modelo.Empleado;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmEmpleado extends javax.swing.JFrame {
String cab[] = {"CODIGO", "NOMBRES", "A.PATERNO", "A.MATERNO", "T.DOCUMENTO", "DOCUMENTO","DIRECCION","TELEFONO","EMAIL","CARGO","D TRABAJADOS","ESTADO","S BASE", "DESCUENTO","SUELDO"};
 DefaultTableModel df = new DefaultTableModel(null, cab);
ArrayList<Empleado> arrayemp = new ArrayList<>();
Archivo_Empleado a_empleado = new Archivo_Empleado();
Empleado objEmp;
int dtrabajados;
String idempleado, nombre,apaterno,amaterno,t_documento,documento,direccion,telefono,email,cargo,estado;

    public frmEmpleado() {
        initComponents();
        jtabla.setModel(df);
        leerArchivo();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtnombre = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        txtapaterno = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtemail = new javax.swing.JTextField();
        ELIMINAR = new javax.swing.JButton();
        txttelefono = new javax.swing.JTextField();
        txtdocumento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabla = new javax.swing.JTable();
        cmbTDocumento = new javax.swing.JComboBox<>();
        txtdireccion = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();
        txtamaterno = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        cmbEstado = new javax.swing.JComboBox<>();
        txttrabajo = new javax.swing.JTextField();
        cmbCargo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtnombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE :"));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 180, 50));

        btnModificar.setBackground(new java.awt.Color(0, 153, 0));
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 111, 39));

        txtapaterno.setBorder(javax.swing.BorderFactory.createTitledBorder("A PATERNO :"));
        getContentPane().add(txtapaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 180, 50));

        btnBuscar.setBackground(new java.awt.Color(0, 153, 0));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 111, 39));

        txtemail.setBorder(javax.swing.BorderFactory.createTitledBorder("EMAIL :"));
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 180, 50));

        ELIMINAR.setBackground(new java.awt.Color(0, 153, 0));
        ELIMINAR.setText("ELIMINAR");
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });
        getContentPane().add(ELIMINAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 111, 39));

        txttelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("TELEFONO :"));
        getContentPane().add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 180, 50));

        txtdocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("DOCUMENTO :"));
        getContentPane().add(txtdocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 180, 50));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 510, 420));

        cmbTDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "PASAPORTE" }));
        getContentPane().add(cmbTDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 180, 50));

        txtdireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("DIRECCION :"));
        getContentPane().add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 180, 50));

        txtcodigo.setBorder(javax.swing.BorderFactory.createTitledBorder("ID EMPLEADO :"));
        getContentPane().add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 50));

        txtamaterno.setBorder(javax.swing.BorderFactory.createTitledBorder("A. MATERNO :"));
        getContentPane().add(txtamaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 180, 50));

        btnAgregar.setBackground(new java.awt.Color(0, 153, 0));
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 111, 39));

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVO", "INACTIVO" }));
        getContentPane().add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 180, 50));

        txttrabajo.setBorder(javax.swing.BorderFactory.createTitledBorder("D TRABAJADO :"));
        getContentPane().add(txttrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 180, 50));

        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LIMPIEZA", "SEGURIDAD", "COCINA" }));
        getContentPane().add(cmbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 180, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fondo de pantalla de paraiso de agua 12.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        capturar();
        arrayemp.add(new Empleado(idempleado,nombre,apaterno,amaterno,t_documento,documento,direccion,telefono,email,cargo,dtrabajados,estado));
         try {
            a_empleado.insertar(new  Empleado(idempleado,nombre,apaterno,amaterno,t_documento,documento,direccion,telefono,email,cargo,dtrabajados,estado));
        } catch (IOException ex) {
            Logger.getLogger(frmCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        mostrar();
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        objEmp=null;
        for(Empleado i:arrayemp){
            if(txtcodigo.getText().equalsIgnoreCase(i.getIdempleado())){
                objEmp= i;
                
            }
        if (objEmp!=null) {
            txtnombre.setText(objEmp.getNombre());
            txtapaterno.setText(objEmp.getApaterno());
            txtamaterno.setText(objEmp.getAmaterno());
            cmbTDocumento.setSelectedItem(objEmp.getT_documento());
            txtdocumento.setText(objEmp.getDocumento());
            txtdireccion.setText(objEmp.getDireccion());
            txttelefono.setText(objEmp.getTelefono());
            txtemail.setText(objEmp.getEmail());
            cmbCargo.setSelectedItem(objEmp.getCargo());
            txttrabajo.setText(String.valueOf(objEmp.getD_trabajados()));
            cmbEstado.setSelectedItem(objEmp.getCargo());
            
            
            
        }
        else
            JOptionPane.showMessageDialog(null, "El codigo no se encuentra registrado");
        }
                                           

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(objEmp!=null){
            capturar();
            objEmp.setIdempleado(idempleado);
            objEmp.setNombre(nombre);
            objEmp.setApaterno(apaterno);
            objEmp.setAmaterno(amaterno);
            objEmp.setT_documento(t_documento);
            objEmp.setDocumento(documento);
            objEmp.setDireccion(direccion);
            objEmp.setTelefono(telefono);
            objEmp.setEmail(email);
            objEmp.setCargo(cargo);
            objEmp.setD_trabajados(dtrabajados);
            objEmp.setEstado(estado);
            
            
            mostrar();
            try {
                a_empleado.mantenimiento(a_empleado.lista);
            } catch (Exception e) {
            }
            
        }
        else
            JOptionPane.showMessageDialog(null,"No se puede actualizar ya que el codigo no existe");
                                              
    }//GEN-LAST:event_btnModificarActionPerformed

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
        if(objEmp!=null){
        arrayemp.remove(objEmp);
        a_empleado.lista.remove(objEmp); 
        mostrar();
        
        try {
            a_empleado.mantenimiento(a_empleado.lista);
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
            java.util.logging.Logger.getLogger(frmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ELIMINAR;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JComboBox<String> cmbEstado;
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
    private javax.swing.JTextField txttrabajo;
    // End of variables declaration//GEN-END:variables
void capturar(){
    idempleado=txtcodigo.getText();
    nombre=txtnombre.getText();
    apaterno=txtapaterno.getText();
    amaterno=txtamaterno.getText();
    t_documento=cmbTDocumento.getSelectedItem().toString();
    documento=txtdocumento.getText();
    direccion=txtdireccion.getText();
    telefono=txttelefono.getText();
    email=txtemail.getText();
    cargo=cmbCargo.getSelectedItem().toString();
    dtrabajados=Integer.parseInt(txttrabajo.getText());
    estado=cmbTDocumento.getSelectedItem().toString();
    
}
public void mostrar(){
    df.setRowCount(0);
        for (Empleado d : arrayemp) {

            Object[] fila = {d.getIdempleado(), d.getNombre(), d.getApaterno(), d.getAmaterno(), d.getT_documento(), d.getDocumento(), d.getDireccion(), 
                d.getTelefono(),d.getEmail(),d.getCargo(),d.getD_trabajados(),d.getEstado(),d.ingreso(),d.descuento(),d.pago()};
            df.addRow(fila);

        }
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
    txttrabajo.setText(null);
}
 private void leerArchivo() {
        try {
            a_empleado.leer();
            for(Empleado d:a_empleado.lista){
                Object [] fila = {d.getIdempleado(), d.getNombre(), d.getApaterno(), d.getAmaterno(), d.getT_documento(), d.getDocumento(), d.getDireccion(), 
                d.getTelefono(),d.getEmail(),d.getCargo(),d.getD_trabajados(),d.getEstado(),d.ingreso(),d.descuento(),d.pago()};
            df.addRow(fila);
            
            arrayemp.add(d);
            }
            
        } catch (Exception e) {
        }
    }
 
}
