/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Ticket;
import java.util.Collection;
import java.util.Map;

/**
 *
 * @author HI andres
 */
public class TicketDAO implements ITicketDAO {
    
    private Map<Integer, Ticket> tickets;

    @Override
    public void create(Ticket ticket) {
    }

    @Override
    public Ticket read(int numero) {
        return null;
    }

    @Override
    public void update(Ticket ticket) {
    }

    @Override
    public void delete(Ticket ticket) {
    }

    @Override
    public Collection<Ticket> findAll() {
        Collection<Ticket> tickets = this.tickets.values();
        return tickets;
    }


    
}
