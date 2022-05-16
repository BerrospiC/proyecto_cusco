
package Modelo;


public class Lista_Habitaciones {
    private String nhabitacion;
    private String piso;
    private String tipo;
    private String descripcion;
    private int precio;
    private String estado;

    public Lista_Habitaciones() {
    }

    public Lista_Habitaciones(String nhabitacion, String piso, String tipo, String descripcion, int precio, String estado) {
        this.nhabitacion = nhabitacion;
        this.piso = piso;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = estado;
    }

    public String getNhabitacion() {
        return nhabitacion;
    }

    public void setNhabitacion(String nhabitacion) {
        this.nhabitacion = nhabitacion;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
