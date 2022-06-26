/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.idat.jorge.ccallo.rest;

import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import pe.idat.jorge.ccallo.dao.IProductoDao;
import pe.idat.jorge.ccallo.dao.ProductoDao;
import pe.idat.jorge.ccallo.model.Producto;

/**
 * REST Web Service
 *
 * @author Armando Morales
 */
@Path("version1")
public class ProductoRest {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ProductoRest
     */
    public ProductoRest() {
    }

    /**
     * Retrieves representation of an instance of pe.idat.jorge.ccallo.rest.ProductoRest
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getText() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of ProductoRest
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_PLAIN)
    public void putText(String content) {
    }
    
    @Path("productos") //ruta URL -> /webresources/version1/productos?categoria={categoria}&limite={limite}
    @GET 
    @Produces(MediaType.APPLICATION_JSON) 
    public String productosByCategoria(@QueryParam("categoria") String categoria, @QueryParam("limite") Integer limite) {
        IProductoDao productoDao = new ProductoDao();
        List<Producto> lista = productoDao.findAllByCategoria(categoria, limite);
        String resultado = "";
        
        for (Producto producto : lista) {
            resultado += "{" + "\"productoId\": \"" + producto.getProductoId()+ "\"," + "\"nombre\": \"" + producto.getNombre() + "\"," + "\"marca\": \"" + producto.getMarca()+ "\"," + "\"precio\": \"" + producto.getPrecio()+ "\"," + "\"stock\": \"" + producto.getStock()+ "\"," + "\"categoriaId\": \"" + producto.getCategoriaId()+ "\"}";   
        }
        
        String response = "{" + "\"categoria\": \"" + categoria + "\"," + "\"limite\": " + limite + "," + "\"productos\": [" + resultado + "]" + "}";
        
        return response;
    }
    
    @Path("producto/eliminar/{productoId}") //ruta URL -> /webresources/version1/producto/eliminar/{productoId}
    @POST
    @Produces(MediaType.TEXT_PLAIN) 
    public String eliminarProducto(@PathParam("productoId") Integer productoId) {
        IProductoDao productoDao = new ProductoDao();
        Integer respuesta = productoDao.delete(productoId);
        String response = ""; 
        
        if (respuesta == 0) {
            response = "Oops! Producto No Eliminado"; 
        } else {
            response = "Producto eliminado satisfactoriamente";
        }
        
        return response;
    }
}
