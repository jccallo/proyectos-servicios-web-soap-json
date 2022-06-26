/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.idat.jorge.ccallo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pe.idat.jorge.ccallo.db.Conexion;
import pe.idat.jorge.ccallo.model.Producto;

/**
 *
 * @author Armando Morales
 */
public class ProductoDao implements IProductoDao {
    PreparedStatement ps;
    ResultSet rs;
    Conexion conexion = new Conexion();
    Connection acceso;

    @Override
    public List<Producto> findAllByCategoria(String categoria, Integer limite) {
        List<Producto> lista = new ArrayList<>();
        String sql = "SELECT producto.productoId, producto.nombre, producto.marca, producto.precio, producto.stock, categoria.categoriaId\n" +
                     "FROM producto\n" +
                     "INNER JOIN categoria ON producto.categoriaId = categoria.categoriaId\n" +
                     "WHERE categoria.descripcion = ? LIMIT ?";
        
        try {
            acceso = conexion.mysql(); 
            ps = acceso.prepareStatement(sql);
            ps.setString(1, categoria);
            ps.setInt(2, limite);
            rs = ps.executeQuery();
            
            while(rs.next())
            {
                Producto producto = new Producto(); 
                producto.setProductoId(rs.getInt(1)); 
                producto.setNombre(rs.getString(2)); 
                producto.setMarca(rs.getString(3));
                producto.setPrecio(rs.getDouble(4));
                producto.setStock(rs.getInt(5));
                producto.setCategoriaId(rs.getInt(6));
                lista.add(producto); 
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        
        return lista;
    }

    @Override
    public Integer delete(Integer productoId) {
        Integer respuesta = 0;
        String sql = "DELETE FROM producto WHERE productoId = ?";
        
        try
        {
            acceso = conexion.mysql(); 
            ps = acceso.prepareStatement(sql);
            ps.setInt(1, productoId);
            
            respuesta = ps.executeUpdate();
                        
            if(respuesta != 1) {
                System.out.println("Error en DELETE!");
            }
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
        
        return respuesta;
    }  
}
