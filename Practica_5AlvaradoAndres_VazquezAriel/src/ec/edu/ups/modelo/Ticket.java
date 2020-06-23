/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;

/**
 *
 * @author HI andres
 */
public class Ticket {

    private int numero;
    private Date fechaEntrada;
    private Date fechaSalida;
    private double total;
    private Vehiculo vehiculo;

    public Ticket(int numero, Date fechaEntrada, Date fechaSalida, double total) {
        this.numero = numero;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.total = total;
    }

    public Ticket() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.numero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ticket other = (Ticket) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

}
