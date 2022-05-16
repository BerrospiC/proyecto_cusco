
package Modelo;


public class Lista_Clientes extends Persona {
private String idcliente;

    public Lista_Clientes() {
    }

    public Lista_Clientes(String idcliente) {
        this.idcliente = idcliente;
    }

    public Lista_Clientes(String idcliente, String nombre, String apaterno, String amaterno, String t_documento, String documento, String direccion, String telefono, String email) {
        super(nombre, apaterno, amaterno, t_documento, documento, direccion, telefono, email);
        this.idcliente = idcliente;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }


    @Override
    public double ingreso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double descuento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double pago() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
