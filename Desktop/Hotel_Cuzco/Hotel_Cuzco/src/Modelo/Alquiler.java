
package Modelo;


public class Alquiler implements Total{
    private String nombre;
    private String apaterno;
    private String amaterno;
    private String documento;
    private String nhabitacion;
    private double costoh;
    private int dias;
    private String producto;
    private double costop;
    private int cantidad;
    

    public Alquiler() {
    }

    public Alquiler(String nombre, String apaterno, String amaterno, String documento, String nhabitacion, double costoh, int dias, String producto, double costop, int cantidad) {
        this.nombre = nombre;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.documento = documento;
        this.nhabitacion = nhabitacion;
        this.costoh = costoh;
        this.dias = dias;
        this.producto = producto;
        this.costop = costop;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApaterno() {
        return apaterno;
    }

    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }

    public String getAmaterno() {
        return amaterno;
    }

    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNhabitacion() {
        return nhabitacion;
    }

    public void setNhabitacion(String nhabitacion) {
        this.nhabitacion = nhabitacion;
    }

    public double getCostoh() {
        return costoh;
    }

    public void setCostoh(double costoh) {
        this.costoh = costoh;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getCostop() {
        return costop;
    }

    public void setCostop(double costop) {
        this.costop = costop;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

   public double pagototal(){
       double pt=0;
       return pt=totalhabitacion()+totalproductos();
   }
   public double igv(){
       double igv=0;
       return igv=pagototal()*0.18;
   } 

    @Override
    public double totalhabitacion() {
        double th=0;
        return costoh*dias;
    }

    @Override
    public double totalproductos() {
        double tp=0;
        return costop*cantidad;
    }

    
}
