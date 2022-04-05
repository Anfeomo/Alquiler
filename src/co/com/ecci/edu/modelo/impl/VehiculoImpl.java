package co.com.ecci.edu.modelo.impl;

import co.com.ecci.edu.modelo.Vehiculo;
import java.util.List;

public class VehiculoImpl {

    Vehiculo[] datosCargar = {
        new Vehiculo("Familiar", 4, "Audi", "A4", "oiu345"),
        new Vehiculo("SuperSport", 2, "Bentley", "Continenetal GT", "kjh6575"),
        new Vehiculo("tipoCarro", 0, "marca", "modelo", "nuemroPLanca"),
        new Vehiculo("tipoCarro", 0, "marca", "modelo", "nuemroPLanca"),
        new Vehiculo("tipoCarro", 0, "marca", "modelo", "nuemroPLanca"),
        new Vehiculo("tipoCarro", 0, "marca", "modelo", "nuemroPLanca"),
        new Vehiculo("tipoCarro", 0, "marca", "modelo", "nuemroPLanca"),
        new Vehiculo("tipoCarro", 0, "marca", "modelo", "nuemroPLanca"),
        new Vehiculo("tipoCarro", 0, "marca", "modelo", "nuemroPLanca"),
        new Vehiculo("tipoCarro", 0, "marca", "modelo", "nuemroPLanca")
    };
    private List<Vehiculo> listaVehiculoNuevo;

    public VehiculoImpl() {
        this.agregarVehiculos();
    }

    public void agregarVehiculos() {
        for (int i = 0; i < 10; i++) {
            listaVehiculoNuevo.add(i, datosCargar[i]);
        }
    }

    public List<Vehiculo> getListaVehiculoNuevo() {
        return listaVehiculoNuevo;
    }
    
}
