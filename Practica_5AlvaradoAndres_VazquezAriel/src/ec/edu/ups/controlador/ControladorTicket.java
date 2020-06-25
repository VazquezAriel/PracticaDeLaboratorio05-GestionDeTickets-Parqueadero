/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.ITicketDAO;
import ec.edu.ups.modelo.Ticket;

/**
 *
 * @author HI andres
 */
public class ControladorTicket {
    
    private ITicketDAO ticketDAO;
    private Ticket ticket;

    public ControladorTicket(ITicketDAO ticketDAO) {
        this.ticketDAO = ticketDAO;
    }
    
    
    
}
