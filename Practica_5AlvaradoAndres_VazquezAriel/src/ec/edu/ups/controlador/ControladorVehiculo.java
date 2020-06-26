/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.IVehiculoDAO;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Vehiculo;
import java.util.Collection;

/**
 *
 * @author HI andres
 */
public class ControladorVehiculo {
    
    private IVehiculoDAO vehiculoDAO;
    private ControladorCliente controladorCliente;
    private Cliente cliente;
    private Vehiculo vehiculo;

    public ControladorVehiculo(IVehiculoDAO vehiculoDAO, ControladorCliente controladorCliente) {
        this.vehiculoDAO = vehiculoDAO;
        this.controladorCliente = controladorCliente;
    }
    
    public void crear(String placa, String marca, String modelo, String cliente) {
        vehiculo = new Vehiculo(placa, marca, modelo, cliente);
        vehiculoDAO.create(vehiculo);
        this.cliente = controladorCliente.buscar(cliente);
        this.cliente.agregarVehiculo(vehiculo);
        controladorCliente.actualizar(this.cliente);
        
    }
    
    public Vehiculo buscar(String placa) {
        return vehiculoDAO.read(placa);
    }
    
    public Collection<Vehiculo> listar() {
        return vehiculoDAO.findAll();
    }
    
}
