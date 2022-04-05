package co.com.ecci.edu.modelo;
/**
 * 
 * @author Andres Orozco
 * Objeto vehiculo contiene la informacion y caracteristicas de los vehiculos
 * que se encuentran disponibles para ser alquilados
 */
public class Vehiculo {

    private String tipoCarro;
    private int capacidad;
    private String marca;
    private String modelo;
    private String numeroPlaca;

    public Vehiculo(){
        
    }

    public Vehiculo(String tipoCarro, int capacidad, String marca, String modelo, String numeroPlaca) {
        this.tipoCarro = tipoCarro;
        this.capacidad = capacidad;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPlaca = numeroPlaca;
    }

    public String getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "tipoCarro: " + tipoCarro + ", capacidad: " + capacidad + 
                ", marca: " + marca + ", modelo: " + modelo + '}';
    }
    
}
