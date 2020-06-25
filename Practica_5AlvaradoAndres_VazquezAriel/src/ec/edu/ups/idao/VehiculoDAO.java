/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Vehiculo;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 *
 * @author HI andres
 */
public class VehiculoDAO implements IVehiculoDAO {
    
    private Map<String, Vehiculo> vehiculos;

    @Override
    public void create(Vehiculo vehiculo) {
    }

    @Override
    public Vehiculo read(String placa) {
        return null;
    }

    @Override
    public void update(Vehiculo vehiculo) {
    }

    @Override
    public void delete(Vehiculo vehiculo) {
    }

    @Override
    public Collection<Vehiculo> findAll() {
        Collection<Vehiculo> vehiculos = this.vehiculos.values();
        return vehiculos;
    }

    
}
