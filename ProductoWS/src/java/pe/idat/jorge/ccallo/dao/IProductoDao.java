/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.idat.jorge.ccallo.dao;

import java.util.List;
import pe.idat.jorge.ccallo.model.Producto;

/**
 *
 * @author Armando Morales
 */
public interface IProductoDao {
    public abstract List<Producto> findAllByLimit(Integer limite); 
    public abstract void insert(Producto producto);    
    public abstract Producto findLastOne();
}
