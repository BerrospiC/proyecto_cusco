
package Modelo;


public class Cliente extends Persona{
    private String idcliente;

    public Cliente() {
    }

    public Cliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public Cliente(String idcliente, String nombre, String aparterno, String amaterno, String t_documento, String documento, String direccion, String telefono, String email) {
        super( nombre, aparterno, amaterno, t_documento, documento, direccion, telefono, email);
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
