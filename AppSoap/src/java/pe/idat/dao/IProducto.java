/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.idat.dao;

import java.util.Collection;
import pe.idat.model.Producto;

public interface IProducto 
{
    public abstract void insert(Producto producto);
    public abstract void update(Producto producto);
    public abstract void delete(Integer productoId);
    public abstract Producto findById(Integer productoId);
    public abstract Collection<Producto> findAll();
}
