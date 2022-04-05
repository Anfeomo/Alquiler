package co.com.ecci.edu.modelo;
/**
 * 
 * @author Andres Orozco
 * Objeto Cliente contiene la informacion requeria del usuario que desea alquilar un vehiculo
 */
public class Cliente {
private String nombre;
    private String apellido;
    private long identificacion;
    private int telefono;
    private String paseConduccion;
    
    
    
    public Cliente() {

    }

    public Cliente(String nombre, String apellido, long identificacion, int telefono, String paseConduccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.paseConduccion = paseConduccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getPaseConduccion() {
        return paseConduccion;
    }

    public void setPaseConduccion(String paseConduccion) {
        this.paseConduccion = paseConduccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre: " + nombre + ", apellido: " + apellido + 
                ", identificacion: " + identificacion + ", telefono: " + telefono + 
                ", paseConduccion: " + paseConduccion + '}';
    }
    
}
