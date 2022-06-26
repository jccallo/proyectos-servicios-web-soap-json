/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.idat.ws;

import java.util.Collection;
import javax.jws.WebService;
import javax.jws.WebMethod;
import pe.idat.dao.ProductoDao;
import pe.idat.model.Producto;

/**
 *
 * @author Armando Morales
 */
@WebService(serviceName = "ProductoWS")
public class ProductoWS {

    /**
     * This is a sample web service operation
     */
//    @WebMethod(operationName = "hello")
//    public String hello(@WebParam(name = "name") String txt) {
//        return "Hello " + txt + " !";
//    }
    
    private ProductoDao productoDao=new ProductoDao();
    
    @WebMethod(operationName="listarProducto")
    public Collection<Producto> listar() {
        return productoDao.findAll();
    }
    
    @WebMethod(operationName="registrarProducto")
    public void registrar(Producto producto) {
        productoDao.insert(producto);
    }
    
    @WebMethod(operationName="editarProducto")
    public void editar(Producto producto) {
        productoDao.update(producto);
    }
    
    @WebMethod(operationName="borrarProducto")
    public void borrar(Integer productoId) {
        productoDao.delete(productoId);
    }
    
    @WebMethod(operationName="buscarProducto")
    public Producto buscar(Integer productoId) {
        return productoDao.findById(productoId);
    }
}
