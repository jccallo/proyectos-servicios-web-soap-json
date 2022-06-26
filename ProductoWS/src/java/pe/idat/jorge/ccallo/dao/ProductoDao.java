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
    public List<Producto> findAllByLimit(Integer limite) {
        List<Producto> lista = new ArrayList<>();
        String sql = "SELECT * FROM producto LIMIT ?";
        
        try {
            acceso = conexion.mysql(); 
            ps = acceso.prepareStatement(sql);
            ps.setInt(1, limite);
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
    public void insert(Producto producto) {
        String sql = "INSERT INTO producto(nombre, marca, precio, stock, categoriaId) values(?,?,?,?,?)";
        
        try {
            acceso = conexion.mysql(); 
            ps = acceso.prepareStatement(sql);
            
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getMarca());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getStock());
            ps.setInt(5, producto.getCategoriaId());
            
            int rows = ps.executeUpdate();
            
            if(rows != 1) {
                System.out.println("Error en INSERT!");
            } 
        } 
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Producto findLastOne() {
        Producto producto = null;
        String sql = "SELECT * FROM producto WHERE productoId = (SELECT MAX(productoId) AS id FROM producto)";
        
        try {
            acceso = conexion.mysql(); 
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                producto = new Producto();
                producto.setProductoId(rs.getInt(1)); 
                producto.setNombre(rs.getString(2)); 
                producto.setMarca(rs.getString(3));
                producto.setPrecio(rs.getDouble(4));
                producto.setStock(rs.getInt(5));
                producto.setCategoriaId(rs.getInt(6));
            }
        } 
        catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return producto;
    }
}
