
package Modelo;


public abstract class Persona {
   
   private String nombre;
   private String apaterno;
   private String amaterno;
   private String t_documento;
   private String documento;
   private String direccion;
   private String telefono;
   private String email;

    public Persona() {
    }

    public Persona( String nombre, String apaterno, String amaterno, String t_documento,String documento, String direccion, String telefono, String email) {
   
        this.nombre = nombre;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.t_documento = t_documento;
        this.documento = documento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
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

    public void setApaterno(String aparterno) {
        this.apaterno = aparterno;
    }

    public String getAmaterno() {
        return amaterno;
    }

    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }

    public String getT_documento() {
        return t_documento;
    }

    public void setT_documento(String t_documento) {
        this.t_documento = t_documento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
   public abstract double ingreso();
   public abstract double descuento();
   public abstract double pago();
    
}
