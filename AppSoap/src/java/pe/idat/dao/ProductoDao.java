/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.idat.dao;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import pe.idat.model.Producto;

public class ProductoDao implements IProducto
{
    private static Map<Integer,Producto> tblProductos=new HashMap<>();
    static
    {
        try
        {
            SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
            
            Producto p1=new Producto(1,"Chocolates","Costa",10.20,format.parse("2022-04-10"),140);
            Producto p2=new Producto(2,"Bombones","Donofrio",12.40,format.parse("2022-05-21"),120);
            Producto p3=new Producto(3,"Galletas","Oreo",14.10,format.parse("2022-10-04"),210);
            Producto p4=new Producto(4,"Champagne","Rose",25.50,format.parse("2024-11-25"),190);
            
            tblProductos.put(p1.getProductoId(),p1);
            tblProductos.put(p2.getProductoId(),p2);
            tblProductos.put(p3.getProductoId(),p3);
            tblProductos.put(p4.getProductoId(),p4);
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public void insert(Producto producto) 
    {
        producto.setProductoId(tblProductos.size()+1);
        tblProductos.put(producto.getProductoId(),producto);
    }

    @Override
    public void update(Producto producto) {
        tblProductos.put(producto.getProductoId(),producto);
    }

    @Override
    public void delete(Integer productoId) {
        tblProductos.remove(productoId);
    }

    @Override
    public Producto findById(Integer productoId) {
        return tblProductos.get(productoId);
    }

    @Override
    public Collection<Producto> findAll() {
        return tblProductos.values();
    }
}
