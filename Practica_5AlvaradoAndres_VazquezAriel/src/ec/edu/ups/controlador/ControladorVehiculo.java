/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.IVehiculoDAO;
import ec.edu.ups.modelo.Vehiculo;

/**
 *
 * @author HI andres
 */
public class ControladorVehiculo {
    
    private IVehiculoDAO vehiculoDAO;
    private Vehiculo vehiculo;

    public ControladorVehiculo(IVehiculoDAO vehiculoDAO) {
        this.vehiculoDAO = vehiculoDAO;
    }
    
    
    
}
