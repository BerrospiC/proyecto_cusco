
package Modelo;


public class Empleado extends Persona{
    private String idempleado;
    private String cargo;
    private String estado;
    private int d_trabajados;

    public Empleado() {
    }

    public Empleado(String idempleado , String nombre, String apaterno, String amaterno, String t_documento, String documento, String direccion, String telefono, String email,String cargo, int d_trabajados,String estado) {
        super(nombre, apaterno, amaterno, t_documento, documento, direccion, telefono, email);
        this.idempleado = idempleado;
        this.cargo = cargo;
        this.estado = estado;
        this.d_trabajados = d_trabajados;
    }

    public String getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(String idempleado) {
        this.idempleado = idempleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getD_trabajados() {
        return d_trabajados;
    }

    public void setD_trabajados(int d_trabajados) {
        this.d_trabajados = d_trabajados;
    }

    @Override
    public double ingreso() {
        double in=0;
        if(cargo.equals("LIMPIEZA")){
            in=d_trabajados*50;
        }
        if(cargo.equals("COCINA")){
            in=d_trabajados*70;
        }
        
        if(cargo.equals("SEGURIDAD")){
            in=d_trabajados*100;
        }
        return in;
    }

    @Override
    public double descuento() {
        double ds=0;
        return ds=ingreso()*0.18;   
    }

    @Override
    public double pago() {
        double pg=0;
       return pg=ingreso()-descuento();
    }

}
