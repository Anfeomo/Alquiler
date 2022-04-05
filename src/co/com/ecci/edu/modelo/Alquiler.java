package co.com.ecci.edu.modelo;

import java.util.Date;
/**
 * 
 * @author Andres Orozco
 * Clase Alquiler permite guardar la infomacion que se requiere para solicitar un vehiculo que desea el s cliente
 */
public class Alquiler {

    private Date fechaInicioServicio;
    private Date fechaFinServicio;
    private int cantidadDias;
    private Vehiculo vehiculo;
    private Cliente cliente;
    private long valorAlquiler;

    public Alquiler() {
    }

    public Alquiler(Date fechaInicioServicio, Date fechaFinServicio, int cantidadDias, Vehiculo vehiculo, Cliente cliente, long valorAlquiler) {
        this.fechaInicioServicio = fechaInicioServicio;
        this.fechaFinServicio = fechaFinServicio;
        this.cantidadDias = cantidadDias;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.valorAlquiler = valorAlquiler;
    }

    public Date getFechaInicioServicio() {
        return fechaInicioServicio;
    }

    public void setFechaInicioServicio(Date fechaInicioServicio) {
        this.fechaInicioServicio = fechaInicioServicio;
    }

    public Date getFechaFinServicio() {
        return fechaFinServicio;
    }

    public void setFechaFinServicio(Date fechaFinServicio) {
        this.fechaFinServicio = fechaFinServicio;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public long getValorAlquiler() {
        return valorAlquiler;
    }

    public void setValorAlquiler(long valorAlquiler) {
        this.valorAlquiler = valorAlquiler;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "fechaInicioServicio=" + fechaInicioServicio + ", fechaFinServicio=" + fechaFinServicio + 
                ", cantidadDias=" + cantidadDias + ", vehiculo=" + vehiculo + 
                ", cliente=" + cliente + ", valorAlquiler=" + valorAlquiler + '}';
    }
    
}
