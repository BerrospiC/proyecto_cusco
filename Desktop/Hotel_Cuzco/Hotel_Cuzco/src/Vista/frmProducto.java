
package Vista;


import Controlador.Archivo_Producto;
import Modelo.Producto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmProducto extends javax.swing.JFrame {
String cab[] = {"ID PRODUCTO", "DESCRIPCION","STOCK", "PRECIO"};
DefaultTableModel df = new DefaultTableModel(null, cab);
ArrayList<Producto> arrayprod = new ArrayList<>();
Archivo_Producto a_producto = new Archivo_Producto();
Producto objProd;
String idproducto,descripcion;
double precio;
int cantidad;
    
    public frmProducto() {
        initComponents();
        jtabla.setModel(df);
        leerArchivo();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtabla = new javax.swing.JTable();
        txtidproducto = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnAGREGAR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 570, 250));

        txtidproducto.setBorder(javax.swing.BorderFactory.createTitledBorder("ID PRODUCTO :"));
        getContentPane().add(txtidproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 40));

        txtdescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder("DESCRIPCION :"));
        getContentPane().add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 160, 40));

        txtcantidad.setBorder(javax.swing.BorderFactory.createTitledBorder("STOCK :"));
        getContentPane().add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 160, -1));

        txtprecio.setBorder(javax.swing.BorderFactory.createTitledBorder("PRECIO :"));
        getContentPane().add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 196, 160, 40));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 140, 50));

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 140, 50));

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 140, 50));

        btnAGREGAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAGREGAR.setText("AGREGAR");
        btnAGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAGREGARActionPerformed(evt);
            }
        });
        getContentPane().add(btnAGREGAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 140, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/35152.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAGREGARActionPerformed
        capturar();
        arrayprod.add(new Producto(idproducto,descripcion,cantidad,precio));
         try {
            a_producto.insertar(new  Producto(idproducto,descripcion,cantidad,precio));
        } catch (IOException ex) {
            Logger.getLogger(frmCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        mostrar();
    }//GEN-LAST:event_btnAGREGARActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        objProd=null;
        for(Producto i:arrayprod){
            if(txtdescripcion.getText().equalsIgnoreCase(i.getIdproducto())){
                objProd= i;
                
            }
        if (objProd!=null) {
            txtcantidad.setText(objProd.getDescripcion());
            txtprecio.setText(String.valueOf(objProd.getCantidad()));
            txtidproducto.setText(String.valueOf(objProd.getPrecio()));
            
            
            
        }
        else
            JOptionPane.showMessageDialog(null, "El codigo no se encuentra registrado");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
          if(objProd!=null){
            capturar();
            objProd.setIdproducto(idproducto);
            objProd.setDescripcion(descripcion);
            objProd.setCantidad(cantidad);
            objProd.setPrecio(precio);
            
            
            
            mostrar();
            try {
                a_producto.mantenimiento(a_producto.lista);
            } catch (Exception e) {
            }
            
        }
        else
            JOptionPane.showMessageDialog(null,"No se puede actualizar ya que el codigo no existe");
          
    }//GEN-LAST:event_btnModificarActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAGREGAR;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtabla;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtidproducto;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
void capturar(){
    idproducto=txtidproducto.getText();
    descripcion=txtdescripcion.getText();
    cantidad=Integer.parseInt(txtcantidad.getText());
    precio=Double.parseDouble(txtprecio.getText());
   
    
}
public void mostrar(){
    df.setRowCount(0);
        for (Producto d : arrayprod) {

            Object[] fila = {d.getIdproducto(), d.getDescripcion(), d.getCantidad(), d.getPrecio() };
            df.addRow(fila);

        }
}
void limpiar(){
    txtdescripcion.setText(null);
    txtcantidad.setText(null);
    txtprecio.setText(null);
    txtidproducto.setText(null);
    txtdescripcion.requestFocus();
}
 private void leerArchivo() {
        try {
            a_producto.leer();
            for(Producto d:a_producto.lista){
                Object [] fila = {d.getIdproducto(), d.getDescripcion(), d.getCantidad(), d.getPrecio() };
            df.addRow(fila);
            
            arrayprod.add(d);
            }
            
        } catch (Exception e) {
        }
    }
}
