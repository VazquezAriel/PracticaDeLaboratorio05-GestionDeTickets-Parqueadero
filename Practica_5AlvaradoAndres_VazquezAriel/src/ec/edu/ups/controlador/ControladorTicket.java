/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.ITicketDAO;
import ec.edu.ups.idao.IVehiculoDAO;
import ec.edu.ups.modelo.Ticket;
import ec.edu.ups.modelo.Vehiculo;
import java.util.Date;

/**
 *
 * @author HI andres
 */
public class ControladorTicket {
    
    private ITicketDAO ticketDAO;
    private ControladorVehiculo controladorVehiculo;
    private Ticket ticket;

    public ControladorTicket(ITicketDAO ticketDAO,ControladorVehiculo controladorVehiculo) {
        this.ticketDAO = ticketDAO;
        this.controladorVehiculo = controladorVehiculo;
    }
    
    public void crear(Date fechaEntrada, String placa) {
        Vehiculo vehiculo = controladorVehiculo.buscar(placa);
        ticket = new Ticket(fechaEntrada, vehiculo);
        ticketDAO.create(ticket);
    }
    
    public int obtenerSiguienteNumero() {
        int numero = ticketDAO.obtenerUltimoNumero();
        return ++numero;
    }
    
    
}
