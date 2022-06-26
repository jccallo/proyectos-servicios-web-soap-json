/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.idat.jorge.ccallo.ws;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pe.idat.jorge.ccallo.dao.IProductoDao;
import pe.idat.jorge.ccallo.dao.ProductoDao;
import pe.idat.jorge.ccallo.model.Producto;

/**
 *
 * @author Armando Morales
 */
@WebService(serviceName = "ProductoWS")
public class ProductoWS {
    
    private final IProductoDao productoDao = new ProductoDao();
    
    // listar Productos (Operacion listar) 
    @WebMethod(operationName = "productoListar") // ProductoWS/ProductoWS?wsdl
    public List<Producto> productoListar(@WebParam(name = "limite") Integer limite) {
        return productoDao.findAllByLimit(limite);
    }
    
    // Crear Producto (Operacion crear) 
    @WebMethod(operationName="productoCrear")
    public Producto productoCrear(Producto producto) {
        productoDao.insert(producto);
        return productoDao.findLastOne();
    }

    /**
     * This is a sample web service operation
     */
//    @WebMethod(operationName = "hello")
//    public String hello(@WebParam(name = "name") String txt) {
//        return "Hello " + txt + " !";
//    }
}
