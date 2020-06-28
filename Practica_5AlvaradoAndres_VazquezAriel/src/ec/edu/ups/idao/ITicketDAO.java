/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Ticket;
import java.time.LocalDateTime;
import java.util.Collection;

/**
 *
 * @author HI andres
 */
public interface ITicketDAO {
    public void create(Ticket ticket );
    public Ticket read(int numero);
    public void update(Ticket ticket);
    public void delete(Ticket ticket);
    public Collection<Ticket> findAll(); 
    public int obtenerUltimoNumero();
    public LocalDateTime obtenerFechaACtual();
}
